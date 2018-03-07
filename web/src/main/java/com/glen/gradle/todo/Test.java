package com.glen.gradle.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

    public static void main(String[] args){
        System.out.println("hello world");
        Logger logger = LoggerFactory.getLogger(Test.class);
        logger.info("test logger");
    }

}
