package hero

class Hobbit extends Hero {

  override def kick(character: Hero): Unit = {
    toCry()
  }
  def toCry()={
    println("I am crying")
    Hobbit.super.die
  }

  override var hp: Int = 3
  override var power: Int = 0


  object Hobbit {}

}
