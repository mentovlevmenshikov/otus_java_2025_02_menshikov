package ru.otus;

import com.google.common.collect.ImmutableList;

public class HelloOtus {

    public void callGuava() {
        System.out.println("Create immutable list by guava");
        ImmutableList<String> immutableList = ImmutableList.of("one", "two", "three");
        System.out.println(immutableList);
    }
}
