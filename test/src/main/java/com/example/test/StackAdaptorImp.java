package com.example.test;

import java.util.ArrayList;
import java.util.List;

/*
    Created By Navid Salehvaziri at 9/24/2018
*/
public class StackAdaptorImp<T> implements StackAdaptor<T>{
    private List<T> list;
    private int size;

    public StackAdaptorImp(int size) {
        this.list=new ArrayList<>();
        this.size=size;
    }

    @Override
    public T pop() {
        if(list.size()==0){
            System.out.println("this is empty stack");
            return null;
        }
        return list.remove(list.size()-1);
    }

    @Override
    public T peack() {
        if(list.size()==0){
            System.out.println("this is empty stack");
            return null;
        }
        return list.get(list.size()-1);
    }

    @Override
    public void push(T t) {
        if(list.size()>=size){
            System.out.println("");
        }
        list.add(t);
    }
}


