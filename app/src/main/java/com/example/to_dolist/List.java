package com.example.to_dolist;

import java.util.ArrayList;

public class List {

    private static ArrayList<String> nameList;
    private static ArrayList<String> descriptionList;


    public List() {
        this.nameList = new ArrayList<>();
        this.descriptionList =  new ArrayList<>();
    }

    public void add(String str){
        this.nameList.add(str);
        this.descriptionList.add("");
    }

    public void add(String str, String description){
        this.nameList.add(str);
        this.descriptionList.add(description);
    }

    public void remove(int index){
        this.nameList.remove(index);
        this.descriptionList.remove(index);
    }

    public String getName(int index){
        return this.nameList.get(index);
    }

    public void setName(int index, String str){
        this.nameList.set(index, str);
    }

    public String getDescription(int index){
        return this.descriptionList.get(index);
    }

    public void setDescription(int index, String str){
        this.descriptionList.set(index, str);
    }
    public int getSize(){
        return this.nameList.size();
    }

}
