package com.example.shamless_resview;

public class DataModel {
    private String name, description;
    private int image;
    public DataModel(String name,String description,int image ) {
        this.name = name;
        this.description=description;
        this.image=image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
