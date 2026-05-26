fun main() {
    println(cityWeather("Ankara", 27, 31, 82))
    println(cityWeather("Tokyo", 32, 36, 10))
    println(cityWeather("Cape Town", 59, 64, 2))
    println(cityWeather("Guatemala City", 50, 55, 7))
}

fun cityWeather(city: String, low: Int, high: Int, rainChance: Int): String {
  return "City: $city\nLow temperature: $low, High temperature: $high\nChance of rain: $rainChance%\n"
}
