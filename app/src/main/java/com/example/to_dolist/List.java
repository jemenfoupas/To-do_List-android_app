package com.example.to_dolist;

import android.text.Editable;

import java.util.LinkedList;

public class List {

    private static LinkedList<String> taskList ;

    public void list(){
        this.taskList = new LinkedList();
    }

    public static String getList(){
        return taskList.getFirst();
    }

    public static void  addList(Editable text){
        taskList.add(text.toString());
    }

    public static Boolean  isEmpty(){
        return (taskList.size() == 0)? true: false;
    }
}
