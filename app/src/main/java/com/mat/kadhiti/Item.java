package com.mat.kadhiti;

/**
 * Created by mat on 10/27/17.
 */

public class Item {
    private int id;
    private int category;
    private String name;
    private int taille;
    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (id != item.id) return false;
        if (category != item.category) return false;
        if (taille != item.taille) return false;
        if (userId != item.userId) return false;
        return name.equals(item.name);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + category;
        result = 31 * result + name.hashCode();
        result = 31 * result + taille;
        result = 31 * result + userId;
        return result;
    }


}
