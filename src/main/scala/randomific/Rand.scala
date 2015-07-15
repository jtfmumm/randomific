package randomific

import scala.util.Random

object Rand {
  val rnd = new Random

  def randInt(low: Int, high: Int): Int = {
    assert(high >= low)
    low + rnd.nextInt((high - low) + 1)
  }

  def roll(sides: Int): Int = {
    assert(sides > 0)
    randInt(1, sides)
  }

  def nRolls(n: Int, sides: Int): Int = {
    assert(n > 0)
    (1 to n).foldLeft(0)((acc, x) => acc + roll(sides))
  }

  def rollFromZero(sides: Int): Int = {
    assert(sides > 0)
    randInt(0, sides - 1)
  }

  def flip(): Int = rollFromZero(2)

  def rolledByOdds(odds: Double): Boolean = {
    assert(odds >= 0 && odds <= 1)
    Math.random < odds
  }

  def pickItem[A](s: Seq[A]): A = {
    assert(s.nonEmpty)
    val pick = rollFromZero(s.size)
    s(pick)
  }
}
