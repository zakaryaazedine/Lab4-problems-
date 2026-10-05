package recordemo;

import java.util.Locale;

public record WeatherData(double temperatureCelsius, String conditions) {

   // Instance method to convert Celsius to Fahrenheit
   public double temperatureFahrenheit() {
       return (double) temperatureCelsius * 9/5 +32;
       //
   }

   // Instance method to get a formatted summary string
   public String getSummary() {
       return String.format(Locale.US, "Current weather: %.1f°C (%.1f°F) and %s", temperatureCelsius, temperatureFahrenheit(), conditions);
       //
   }

   // Static factory method to create a WeatherData record from Fahrenheit
   public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
       double cel = (tempFahrenheit-32)*5/9;
       WeatherData w = new WeatherData(cel, conditions);
       return w;
      //
   }

   public static void main(String[] args) {
       WeatherData w = new WeatherData(25.0, "Sunny");
       System.out.println("Today's weather : "+ w.getSummary());
       WeatherData v = new WeatherData(10.0, "Cloudy");
       System.out.println("Yesterday's weather : "+ v.getSummary());
   }
}
