package com.vinaayak.project;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.core.config.*;
import java.math.BigDecimal;
import kong.unirest.*;
import kong.unirest.json.JSONObject;

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
	public BigDecimal convert(String from, String to, double amt) throws JSGetException
	{
		BigDecimal input = BigDecimal.valueOf(amt);
		JSONObject js = getJSON(from, to);
		BigDecimal ratio = getRatio(js);
		BigDecimal answer = ratio.multiply(input);
		Unirest.shutDown();
		return answer;
	}
	BigDecimal getRatio(JSONObject res)
	{
		Logger logger = LogManager.getLogger(Backend.class);
		Configurator.initialize(new DefaultConfiguration());
		Configurator.setRootLevel(Level.INFO);
		try
		{
			JSONObject price = res.getJSONObject("price");
			JSONObject latest = price.getJSONObject("last");
			return latest.getBigDecimal("value");
		}
		catch (UnsupportedOperationException e)
		{
			logger.error("Incorrect currencies input for conversion.");
			return BigDecimal.valueOf(0);
		}
	}
	JSONObject getJSON(String from, String to) throws JSGetException
	{
		Logger logger = LogManager.getLogger(Backend.class);
		Configurator.initialize(new DefaultConfiguration());
		Configurator.setRootLevel(Level.INFO);
		String host = "https://joj-finance.p.rapidapi.com/ticker/";
		String rapidapihost = "joj-finance.p.rapidapi.com";
		String rapidapikey = "c7fca2b9bfmsh62fddd0bda2ea7ep16c137jsn1047201f0c7b";
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
			e.printStackTrace();
			throw new JSGetException(e);
		}
		return response.getBody().getObject();
	}
}
