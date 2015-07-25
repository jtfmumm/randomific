# randomific

Randomization utility functions.

## API
  randInt(low: Int, high: Int): Int
 
  roll(sides: Int): Int
 
  nRolls(n: Int, sides: Int): Int
 
//Returns an Int from 0 to (sides - 1)  
  rollFromZero(sides: Int): Int  
 
//Returns 0 or 1  
  flip(): Int 

//Takes a Double from 0 to 1.  Rolls against the odds.  
  rolledByOdds(odds: Double): Boolean  
 
  pickItem[A](s: Seq[A]): A
 
//Returns k unique Ints from low and high  
  kRandIntsBetween(k: Int, low: Int, high: Int): Seq[Int] 
 
//Picks k unique items from s  
  pickKItems[A](k: Int, s: Seq[A]): Seq[A] 
