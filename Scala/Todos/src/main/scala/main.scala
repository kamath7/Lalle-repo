@main
def main(): Unit = {

  val sampleTodo: TodoClass = new TodoClass("Eat Dinner","Gobble up some food",100L,"Low")
  print(sampleTodo)

  val scalaSampleTodo:TodoScalaClass = new TodoScalaClass("Read something","Some random things to be read",100L,"Low")
  print(scalaSampleTodo)
}