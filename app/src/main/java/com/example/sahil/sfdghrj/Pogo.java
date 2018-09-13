package com.example.sahil.sfdghrj;

public class Pogo {
    String name;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    String title;
    String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pogo(String name, String title, String id, int image) {
        this.name = name;
        this.title = title;
        this.id = id;
        this.image = image;
    }

    int image;
}
