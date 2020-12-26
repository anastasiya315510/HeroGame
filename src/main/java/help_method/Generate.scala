package help_method

case class Generate(min:Int, max:Int){
  def generate:Int= {
    val r = new scala.util.Random
    val r1 = min + r.nextInt((max - min) + 1)
    r1
  }
}