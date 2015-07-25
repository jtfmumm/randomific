# randomific

Randomization utility functions.

## API
  randInt(low: Int, high: Int): Int
 
  roll(sides: Int): Int
 
  nRolls(n: Int, sides: Int): Int
 
  rollFromZero(sides: Int): Int
 
  flip(): Int

  rolledByOdds(odds: Double): Boolean
 
  pickItem[A](s: Seq[A]): A
 
  kRandIntsBetween(k: Int, low: Int, high: Int): Seq[Int]
 
  pickKItems[A](k: Int, s: Seq[A]): Seq[A]
