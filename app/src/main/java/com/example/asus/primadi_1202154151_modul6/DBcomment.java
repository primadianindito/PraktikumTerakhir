package com.example.asus.primadi_1202154151_modul6;

public class DBcomment {
    public String uid;

    public String author;

    public String text;



    public DBcomment() {

        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)

    }



    public DBcomment(String uid, String author, String text) {

        this.uid = uid;

        this.author = author;

        this.text = text;

    }
}

