package com.vinaayak.project;

import java.io.IOException;
import java.math.BigDecimal;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.*;
import javafx.util.converter.BigDecimalStringConverter;

public class App extends Application {

	@FXML
	private ComboBox<String> from;

	@FXML
	private ComboBox<String> to;

	@FXML
	private Label result;

	@FXML
	private TextField amt;

	@FXML
	private StackPane root;

	@FXML
	private GridPane gridpane1;

	@FXML
	private AnchorPane anchor;

	Backend convertInterface = new Backend();



    @Override
	public void start(Stage stage) throws IOException
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("/GUI.fxml"));
		TitledPane titlepane = loader.<TitledPane>load();
		stage.setScene(new Scene(titlepane, 800, 450));
		stage.setTitle("Currency Converter");
		stage.show();
    }

	public void initialize()
	{
		ObservableList<String> options = FXCollections.observableArrayList();
		options.addAll("AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTN", "BWP", "BYN", "BZD", "CAD", "CDF", "CHF", "CLF", "CLP", "CNH", "CNY", "COP", "CRC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ETB", "EUR", "FJD", "GBP", "GEL", "GHS", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "INR", "IQD", "IRR", "ISK", "JMD", "JPY", "KES", "KGS", "KHR", "KMF", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MOP", "MRU", "MUR", "MVP", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "QMR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SLL", "SOS", "SRD", "SVC", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VES", "VND", "XAF", "XCD", "XOF", "XPF", "YER", "ZAR", "ZMW");
		to.setItems(options);
		from.setItems(options);
		from.setVisibleRowCount(5);
		to.setVisibleRowCount(5);
		amt.setTextFormatter(new TextFormatter<>(new BigDecimalStringConverter()));
		amt.textProperty().addListener((observable, oldValue, newValue) -> {
			try {
				amt.getTextFormatter().getValueConverter().fromString(newValue);
				// no exception above means valid
				if (new BigDecimal(newValue).compareTo(BigDecimal.ZERO) < 0)
					throw new NumberFormatException();
				amt.setBorder(null);
			} catch (NumberFormatException e) {
				amt.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, new CornerRadii(3), new BorderWidths(2), new Insets(-2))));
			}
		});
	}

	@FXML
	void calculate(Event e)
	{
		BigDecimal amount;
		BigDecimal converted = BigDecimal.ZERO;
		try {
			amount = new BigDecimal(amt.getText()).abs();

		} catch (NumberFormatException exp) {
			amount = BigDecimal.ZERO;
		}
		try {
			converted = convertInterface.convert(from.getValue(), to.getValue(), amount);
		} catch (JSGetException | IOException e1) {
			e1.printStackTrace();
		}
		String convertedString = converted.toString();
		result.setText(convertedString);
	}

    public static void main(String[] args)
	{
		Application.launch(args);
    }

}
