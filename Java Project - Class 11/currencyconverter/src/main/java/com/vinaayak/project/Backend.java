package com.vinaayak.project;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.core.config.*;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import kong.unirest.*;
import kong.unirest.json.JSONObject;
import java.util.Scanner;

class JSGetException extends Exception
{
	public JSGetException(UnirestException exception)
	{
		super(exception);
	}
	public JSGetException(String s)
	{
		super(s);
	}
}

public class Backend
{
	public BigDecimal convert(String from, String to, BigDecimal input) throws JSGetException, IOException
	{
		JSONObject js = getJSON(from, to);
		BigDecimal ratio = getRatio(js);
		BigDecimal answer = ratio.multiply(input);
		Unirest.shutDown();
		return answer;
	}
	BigDecimal getRatio(JSONObject res)
	{
		JSONObject price = res.getJSONObject("price");
		JSONObject latest = price.getJSONObject("last");
		return latest.getBigDecimal("value");
	}
	JSONObject getJSON(String from, String to) throws JSGetException, IOException
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
			throw new JSGetException(e);
		}
		return response.getBody().getObject();
	}
}
