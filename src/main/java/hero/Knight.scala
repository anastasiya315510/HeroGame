package hero

import help_method.Generate

class Knight extends Hero {
  override var hp: Int = Generate(2,12).generate:Int
  override var power: Int = Generate(2,12).generate:Int

  override def kick(character: Hero): Unit = {
    if(hp==0) Knight.super.die
    character.hp=character.hp-1

  }

  override def isAlive(): Boolean = true

  object Knight {


  }

}
