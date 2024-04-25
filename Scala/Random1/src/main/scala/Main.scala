
object Main {

  def main(args: Array[String]): Unit = {

    val person = new Person("Adithya", 2014, Car("Porsche","Carrera 911"))

    println(s"Hello there ${person.getName}. Your age is ${person.getAge}")
    println(person.canSpeak())
    println(person.getCar)

  }
}