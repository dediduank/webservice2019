package com.ws.ti.c.ws.basic.c;

import java.util.ArrayList;

public class Book {
    
    public ArrayList<String> dataBuku(){
        ArrayList<String> mybook = new ArrayList<>();
        
        mybook.add("Buku Biologi");
        mybook.add("Buku Matematika");
        mybook.add("Buku Fisika");
        mybook.add("Buku Geografi");
        mybook.add("Buku Sosiologi");

        return mybook;
    }

}
