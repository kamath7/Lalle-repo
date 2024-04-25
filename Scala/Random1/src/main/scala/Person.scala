class Person (private var name: String, private var age:Int, private var car: Car) extends Speech {
  def getName:String = name
  def getAge:Int = age
  def getCar:String = s" ${this.name} has ${car.brandName} - ${car.modelName}"

  override def nameOfPerson: String = getName
}

trait Speech {
  def nameOfPerson: String
  def canSpeak():String = s"${nameOfPerson} is speaking"
}

case class Car(brandName: String,  modelName: String)