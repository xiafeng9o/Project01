package com.feng.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HelloWorld {


    private int a;



    private static final Person PERSON = new Person();

    public static void main(String[] args) {



        bijiao();

        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        try {
            FileInputStream fileInputStream = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void bijiao() {
        if(true){

        }else{

        }
    }

    public void methods(){
        System.out.println(a);

        for (int i = 0; i < 1; i++) {
            
            
        }

        ArrayList<String> list = new ArrayList<>();
        for (String s : list) {

        }

    }




}


