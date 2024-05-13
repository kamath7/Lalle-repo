import java.util.ArrayList;
import java.util.List;

public class TodoListJava {

    private List<TodoClass> todos = new ArrayList<>();

    public void addTodo(TodoClass todo){
        todos.add(todo);
    }

    @Override
    public String toString() {
        return "TodoListJava{" +
                "todos=" + todos +
                '}';
    }
}
