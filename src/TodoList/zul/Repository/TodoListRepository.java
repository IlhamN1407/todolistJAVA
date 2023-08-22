package TodoList.zul.Repository;

import TodoList.zul.Entity.Todolist;

public interface TodoListRepository {
    Todolist[] getAll();

    void add(Todolist todolist);

    boolean remove(Integer num);
}
