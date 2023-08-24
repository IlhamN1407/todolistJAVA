package TodoList.zul.Test.Service;

import TodoList.zul.Repository.TodoListRepository;
import TodoList.zul.Repository.TodoListRepositoryImpl;
import TodoList.zul.Service.TodoListService;
import TodoList.zul.Service.TodoListServiceImpl;
import TodoList.zul.View.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args) {
        testTodolist();
    }

    public static void testTodolist(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodo("Todo1");
        todoListService.addTodo("Todo2");
        todoListService.addTodo("Todo3");
        todoListService.addTodo("Todo4");

        todoListView.showTodolist();
    }
}
