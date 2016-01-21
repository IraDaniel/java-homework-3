package com.company.task2;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Scanner;

/**
 * Created by Ira on 18.01.2016.
 */
public class Quiz {

    public void scanQuestion(){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose location: ru/en");
        String loc = in.nextLine();
        showAllQuestion(loc);
        PropertyManager utilProperty = new PropertyManager(new Locale(loc, loc.toUpperCase()),"util");


        System.out.println(utilProperty.getValue("util.key1"));
        System.out.println(utilProperty.getValue("util.key2"));

        while(in.hasNext()){
            String nextLine = in.nextLine();
            if(nextLine.equals("exit")){
                break;
            }
            PropertyManager answerProperty = new PropertyManager(new Locale(loc, loc.toUpperCase()), "answer");

            try{
                System.out.println(answerProperty.getValue("answer.key" + Integer.parseInt(nextLine)));
            }catch(MissingResourceException e){

            }catch(NumberFormatException e){

            }


        }

    }

    private void showAllQuestion(String location){
        PropertyManager propertyManager = new PropertyManager(new Locale(location, location.toUpperCase()),"prop");
        System.out.println("1:" + propertyManager.getValue("prop.key1"));
        System.out.println("2:" + propertyManager.getValue("prop.key2"));
    }

}
