package service;

import repository.TodoRepository;
import vo.Todo;

import java.util.List;
import java.util.Map;

public class TodoServiceImpl implements TodoService{
    private final TodoRepository todoRepository;
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void addTodo(String date, String time, String task) {
        System.out.println("[TodoServiceImpl.addTodo]");
    }

    @Override
    public List<Todo> getTodosByDate(String date) {
        System.out.println("[TodoServiceImpl.getTodosByDate]");
        return List.of();
    }

    @Override
    public Map<String, List<Todo>> getAllTodos() {
        System.out.println("[TodoServiceImpl.getAllTodos]");
        return Map.of();
    }

    @Override
    public void updateTodo(String date, int index, String time, String task) {
        System.out.println("[TodoServiceImpl.updateTodo]");
    }

    @Override
    public void deleteTodo(String date, int index) {
        System.out.println("[TodoServiceImpl.deleteTodo]");
    }

    @Override
    public void completeTodo(String date, int index) {
        System.out.println("[TodoServiceImpl.completeTodo]");
    }
}
