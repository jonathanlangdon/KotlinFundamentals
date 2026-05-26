fun main() {
    println(compareScreenTime(timeSpentToday = 300, timeSpentYesterday = 250)) // true
    println(compareScreenTime(timeSpentToday = 300, timeSpentYesterday = 300)) // false
    println(compareScreenTime(timeSpentToday = 200, timeSpentYesterday = 220)) // false
}

fun compareScreenTime(timeSpentToday: Int, timeSpentYesterday:Int): Boolean {
  return timeSpentToday > timeSpentYesterday
}
