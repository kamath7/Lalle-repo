case class TodoCreator(taskName:String, shortDescription:String, duration:Long, priority:String){
  override def toString: String = s"Task ${this.taskName} -> ${this.shortDescription} | ${this.duration} | ${this.priority}  "
}

