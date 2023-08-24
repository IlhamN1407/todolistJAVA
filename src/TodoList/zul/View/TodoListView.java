package TodoList.zul.View;

import TodoList.zul.Service.TodoListService;
import TodoList.zul.util.ScannerUtil;

public class TodoListView {
    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    public void showTodolist(){
        while (true) {
            todoListService.showAll();

            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = ScannerUtil.input("Pilih");

            if (input.equals("1")) {
                addTodoList();
            } else if (input.equals("2")) {
                removeTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public void addTodoList(){
        System.out.println("ADD todolist : ");
        String todo = ScannerUtil.input("Add todo here(x to cancel)");
        if (todo.equals("x")){
            ScannerUtil.close();
        } else {
        todoListService.addTodo(todo);
        }
    }

    public void removeTodoList(){
        System.out.println("Remove todo list : ");
        var deltodo = ScannerUtil.input("Remove todo here (x to cancel)");
        if (deltodo.equals("x")){
            ScannerUtil.close();
        } else {
            todoListService.removeTodo(Integer.valueOf(deltodo));
        }

    }

}
