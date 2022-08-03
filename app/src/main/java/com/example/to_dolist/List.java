package com.example.to_dolist;

import java.util.ArrayList;

public class List {

    private static ArrayList<String> list;

    public List() {
        list = new ArrayList<String>();
    }

    public void add(String str){
        this.list.add(str);
    }

    public void remove(int index){
        this.list.remove(index);
    }

    public String getString(int index){
        return this.list.get(index);
    }

    public void setString(int index, String str){
        this.list.set(index, str);
    }

    public int getSize(){
        return this.list.size();
    }

}
