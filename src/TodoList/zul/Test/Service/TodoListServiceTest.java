package TodoList.zul.Test.Service;

import TodoList.zul.Entity.Todolist;
import TodoList.zul.Repository.TodoListRepository;
import TodoList.zul.Repository.TodoListRepositoryImpl;
import TodoList.zul.Service.TodoListService;
import TodoList.zul.Service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {
        removeTodolist();
    }

    public static void showTodolist(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new Todolist("test");

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        todoListService.showAll();
    }

    public static void addTodolist(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        todoListRepository.data[0] = new Todolist("test");
        todoListService.showAll();
        todoListService.addTodo("Tambah data");
        todoListService.showAll();
    }

    public static void removeTodolist(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListRepository.data[0] = new Todolist("satu");
        todoListRepository.data[1] = new Todolist("satu1");
        todoListRepository.data[2] = new Todolist("satu2");

        todoListService.showAll();

        todoListService.removeTodo(2);
        todoListService.showAll();
    }

}
