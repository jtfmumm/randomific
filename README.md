# randomific

Randomization utility functions.

## API
  * randInt(low: Int, high: Int): Int
 
  * roll(sides: Int): Int
 
  * nRolls(n: Int, sides: Int): Int
 

  * rollFromZero(sides: Int): Int  
    * Returns an Int from 0 to (sides - 1)   
  
  * flip(): Int 
    * Returns 0 or 1
   
  * rolledByOdds(odds: Double): Boolean  
    * Takes a Double from 0 to 1.  Rolls against the odds. 
    
  * pickItem\[A\](s: Seq[A]): A
 
  * kRandIntsBetween(k: Int, low: Int, high: Int): Seq[Int] 
    * Returns k unique Ints from low and high  
    
  * pickKItems\[A\](k: Int, s: Seq[A]): Seq[A] 
    * Picks k unique items from s  
