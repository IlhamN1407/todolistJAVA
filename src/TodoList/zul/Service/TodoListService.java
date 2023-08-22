package TodoList.zul.Service;

import TodoList.zul.Entity.Todolist;

public interface TodoListService {

    void showAll();

    void addTodo(String todolist);

    void removeTodo(Integer num);
}
