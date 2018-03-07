package com.glen.gradle.repository;

import com.glen.gradle.model.TodoItem;
import org.junit.Assert;
import org.junit.Test;

public class TodoRepositoryTest {
    TodoRepository repository = new TodoRepository();

    @Test
    public void testSave(){
        TodoItem item = new TodoItem("glen1943");
        repository.putValue("name",item);
        Assert.assertNotNull(item.getName());
        //会报错
        Assert.assertNotNull(TodoRepository.getValue("andy"));

    }
}
