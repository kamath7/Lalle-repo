class Person (private var name: String, private var age:Int) extends Speech {
  def getName:String = name
  def getAge:Int = age

  override def nameOfPerson: String = getName
}

trait Speech {
  def nameOfPerson: String
  def canSpeak():String = s"${nameOfPerson} is speaking"
}