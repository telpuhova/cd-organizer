package models;

import java.util.ArrayList;


public class CD {
    String title;
    String year;
    public static ArrayList<CD> instances = new ArrayList<CD>();

    public String getTitle() {
        return title;
    }
    public String getYear() {
        return year;
    }

    public CD(String title, String year) {
        this.title = title;
        this.year = year;
        instances.add(this);
    }

    public static ArrayList<CD> getAll(){
        return instances;
    }

}
