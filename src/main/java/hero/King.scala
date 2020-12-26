package hero

import help_method.Generate


class King extends Hero {
  override var hp: Int = Generate(5,15).generate:Int
  override var power: Int = Generate(5,15).generate:Int

  override def kick(character: Hero): Unit = {
    if(hp==0) King.super.die
    character.hp = character.hp -1

  }


  object King {

    object die

  }

}
