package com.example.tugas4;

public class Itemmodel {

    private String name;
    private String type;
    private int image;

    public Itemmodel(String name, String type, int image) {
        this.name = name;
        this.type = type;
        this.image=image;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getImage() {
        return image;
    }

}
