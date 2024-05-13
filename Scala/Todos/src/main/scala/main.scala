import scala.collection.mutable

@main
def main(): Unit = {


  val sampleTodo: TodoClass = new TodoClass("Eat Dinner","Gobble up some food",100L,"Low")
//  print(sampleTodo)

  val scalaSampleTodo:TodoScalaClass = new TodoScalaClass("Read something","Some random things to be read",100L,"Low")
//  print(scalaSampleTodo)

  val scalaSimplerTodo = TodoCreator("Chat with Seere","Silly chats with Domesh Seere",100L,"HIGH")
//  print(scalaSimplerTodo)


  //Using Java classes
  val daysTodayList = new TodoListJava()
  daysTodayList.addTodo(new TodoClass("Eat Dinner","Gobble up some food",100L,"Low"))
  daysTodayList.addTodo(new TodoClass("Eat Lunch", "Gobble up some food", 100L, "Low"))
  daysTodayList.addTodo(new TodoClass("Eat Breakfast", "Gobble up some food", 100L, "Low"))
  println(daysTodayList)

  //The Scala Way

  val scalaTodos =  TodoListScala
  scalaTodos.addTodo(TodoCreator("Chat with Seere","Silly chats with Domesh Seere",100L,"HIGH"))
  scalaTodos.addTodo(TodoCreator("Chat with Natesh", "Silly chats with Nanga Natesh", 100L, "HIGH"))
  scalaTodos.addTodo(TodoCreator("Chat with Ntina","Silly chats with Protina Ntina",100L,"HIGH"))

  print(scalaTodos)
}

object TodoListScala {
  private val todos: mutable.Buffer[TodoCreator] = mutable.Buffer.empty[TodoCreator]

  def addTodo(todo: TodoCreator): Unit = {
    todos += todo
  }

  override def toString: String = todos.mkString("\n")
}