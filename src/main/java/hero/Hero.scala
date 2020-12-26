package hero

abstract class Hero {
   var hp:Int
   var power:Int
   def kick(character: Hero):Unit
   def isAlive(): Boolean = {
    if(hp>0) true
    else false
  }
   def die():Unit={
    hp=0
  }

}
