
object Main {
  def main(args: Array[String]): Unit = {

    val person = new Person("Adithya", 2014)

    println(s"Hello there ${person.getName}. Your age is ${person.getAge}")
    println(person.canSpeak())
  }
}