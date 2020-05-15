package example

object Bottles {
  def main(args: Array[String]): Unit = {
    (99 to 1 by -1).zip((98 to 0 by - 1)).foreach { case (count, nextCount) =>
      val currentBottles = bottles(count)
      val nextBottles = bottles(nextCount)
      println(s"$count $currentBottles of beer on the wall, $count $currentBottles of beer.")
      count match {
        case 1 => println("Go to the store and buy some more, 99 bottles of beer on the wall.")
        case _ => println(s"Take one down and pass it around, $nextCount $nextBottles of beer on the wall")
      }
      println()
    }
  }

  def bottles(count: Int): String = count match {
    case 1 => "bottle"
    case _ => "bottles"
  }
}