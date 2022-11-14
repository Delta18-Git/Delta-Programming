package com.vinaayak.project;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.core.config.*;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import kong.unirest.*;
import kong.unirest.json.JSONObject;
import java.util.Scanner;

public class Backend
{

	/**
	 * @param from the currency to be converted from
	 * @param to the currency to be converted to
	 * @param input the amount entered to be converted
	 * @return BigDecimal the converted value in the required currency
	 * @throws UnirestException thrown when the request sent to the API responds with an error
	 * @throws IOException thrown when there is an I/O failure in reading the API key
	 */
	public BigDecimal convert(String from, String to, BigDecimal input) throws UnirestException, IOException
	{
		JSONObject js = getJSON(from, to);
		BigDecimal ratio = getRatio(js);
		BigDecimal answer = ratio.multiply(input);
		Unirest.shutDown();
		return answer;
	}

	/**
	 * @param res holds the passed JSON Object that contains the response of the API
	 * @return BigDecimal the ratio between the input and output currencies
	 */
	BigDecimal getRatio(JSONObject res)
	{
		JSONObject price = res.getJSONObject("price");
		JSONObject latest = price.getJSONObject("last");
		return latest.getBigDecimal("value");
	}

	/**
	 * @param from the currency to be converted from
	 * @param to the currency to be converted to
	 * @return JSONObject the JSON Object that contains the body of the response from the API
	 * @throws UnirestException thrown when the request sent to the API responds with an error
	 * @throws IOException thrown when there is an I/O failure in reading the API key
	 */
	JSONObject getJSON(String from, String to) throws UnirestException, IOException
	{
		Logger logger = LogManager.getLogger(Backend.class);
		Configurator.initialize(new DefaultConfiguration());
		Configurator.setRootLevel(Level.INFO);
		InputStream apiStream = getClass().getClassLoader().getResourceAsStream("api.txt");
		Scanner scanner = new Scanner(apiStream);
		String host = "https://joj-finance.p.rapidapi.com/ticker/";
		String rapidapihost = "joj-finance.p.rapidapi.com";
		String rapidapikey = scanner.useDelimiter("\\A").next();
		scanner.close();
		apiStream.close();
		String url = host + "?t=" + from + "-" + to;
		HttpResponse<JsonNode> response;
		try
		{
			response = Unirest.get(url)
				.header("X-RapidAPI-Key", rapidapikey)
				.header("X-RapidAPI-Host", rapidapihost)
				.asJson();
		}
		catch (UnirestException e)
		{
			logger.error("Failed to GET data. Connection string was: %s", url);
			throw new UnirestException(e);
		}
		return response.getBody().getObject();
	}
}
