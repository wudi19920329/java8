package com.cma.java8.ch06;

import com.cma.java8.ch05.domain.Task;
import com.cma.java8.ch05.domain.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TaskRepository {

    private final static Map<String, Task> DB = new HashMap<>();

    static {
        DB.put("1", new Task("1", "hello java 1", new User("张三")));
        DB.put("2", new Task("2", "hello java 2", new User("李四")));
        DB.put("3", new Task("3", "hello java 3", new User("王五")));
        DB.put("4", new Task("4", "hello java 4", new User("刘七")));
        DB.put("5", new Task("5", "hello java 5", new User("赵八")));
    }

    public Task find(String id) {
        return Optional.ofNullable(DB.get(id)).orElseThrow(() -> new TaskNotFoundException(id));
    }

    public Optional<String> taskAssignedTo(String id) {
        return Optional.ofNullable(find(id)).flatMap(task -> task.getAssignedTo()).map(user -> user.getUsername());
    }

    public static void main(String[] args) {
        TaskRepository repository = new TaskRepository();
        System.out.println(repository.taskAssignedTo("3").get());
    }
}
