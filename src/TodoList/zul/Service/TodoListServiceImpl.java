package TodoList.zul.Service;

import TodoList.zul.Entity.Todolist;
import TodoList.zul.Repository.TodoListRepository;
import TodoList.zul.Repository.TodoListRepositoryImpl;

public class TodoListServiceImpl implements TodoListService{

    TodoListRepository todoListRepository = new TodoListRepositoryImpl();

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showAll() {
    Todolist[] model = todoListRepository.getAll();
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;
            if (todo != null) {
                System.out.println(no + ". " + todo.getTodo());
            }
        }
    }

    @Override
    public void addTodo(String todo) {
        Todolist todolist = new Todolist(todo);
        todoListRepository.add(todolist);
        System.out.println("SUCCESS ADD TODO :" + todo);
    }

    @Override
    public void removeTodo(Integer num) {
        boolean todolist = todoListRepository.remove(num);
        if (todolist){
            System.out.println("SUCCESS MENGHAPUS TODO : " + num);
        } else {
            System.out.println("GAGAL MENGHAPUS TODO : " + num);
        }
    }
}
