package com.glen.gradle.repository;

import com.glen.gradle.model.TodoItem;

import java.util.HashMap;
import java.util.Map;

public class TodoRepository {

    public static Map<String,TodoItem> caches = new HashMap<>();

    public  static void putValue(String name,TodoItem item){
        if(caches.containsKey(name)){
            caches.remove(name);
        }
        caches.put(name,item);
    }

    public static TodoItem getValue(String name){
        return caches.get(name);

    }

}
