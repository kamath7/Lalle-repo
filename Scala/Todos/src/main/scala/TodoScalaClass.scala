class TodoScalaClass {

  private var taskName: String = ""
  private var shortDescription: String = ""
  private var duration = 0L
  private var priority:String = ""

  def this(taskName: String, shortDescription: String, duration: Long, priority: String) = {
    this()
    this.taskName = taskName
    this.shortDescription = shortDescription
    this.duration = duration
    this.priority = priority
  }

  override def toString: String = s"Task ${this.taskName} -> ${this.shortDescription} | ${this.duration} | ${this.priority}  "
}
