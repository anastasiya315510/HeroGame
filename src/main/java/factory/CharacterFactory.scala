package factory

import help_method.Generate
import hero.{Elf, Hero, Hobbit, King, Knight}

object CharacterFactory {
  val heroes = new Hobbit() :: new Elf():: new King():: new Knight() :: Nil
  def createCharacter():Hero={
  var i:Int = Generate(0, 3).generate
     heroes(i)
  }

}
