package com.example.dell.buitinviews;

/**
 * Created by DELL on 3/4/2018.
 */

public class List {
    private String name;
    private String item;

    public List(String name,String item){
        this.name=name;
        this.item=item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){ this.name=name;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
