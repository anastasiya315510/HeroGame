package hero

class Elf extends Hero {


  override def kick(character: Hero): Unit = {
    if(character.hp>hp){
      character.hp = character.hp-1;
      Elf.super.die()
    } else {
      character.die()
    }
  }


  override var hp: Int = 10
  override var power: Int = 10

  object Elf {}

}
