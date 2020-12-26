package hero

import factory.CharacterFactory

object Main{
 def main(args: Array[String]): Unit = {
  val hero1:Hero =  CharacterFactory.createCharacter()
  val hero:Hero=  CharacterFactory.createCharacter()
  new GameManager(hero:Hero, hero1:Hero).fight
 }





}

