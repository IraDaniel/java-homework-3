package com.company.task3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ira on 19.01.2016.
 */
public class ParsePage {
    private String fileBuffer;
    private String fileName;

    public ParsePage(String fileName) {
        this.fileName = fileName;
        readFile();
    }

    private void readFile(){
        FileReader fileReader = new FileReader(); // прочитали файл в строку
        fileBuffer = fileReader.readFile(fileName);
    }

    public boolean isLinksSorted(){

        StringBuilder stringBuilder = new StringBuilder();
        // ([–р]ис\u002E \d+\s?и?\s?\d+
        //[–р]ис\u002E\s?\d\d?\s?и?\s?\d?\d?
        String pattern01 = "([\\u0420|\\u0440]\\u0438\\u0441\\u002E\\s?\\d\\d?+\\s?\\u0438?\\s?\\d?\\d?)";
        //([–р]ис\u002E
        String pattern02 = "[\\u0420|\\u0440]\\u0438\\u0441\\u002E ";

        Pattern p = Pattern.compile(pattern01);
        Matcher matcher = p.matcher(fileBuffer);

        while(matcher.find()){
            String tmp = matcher.group();
            stringBuilder.append(tmp);
            System.out.println(tmp);

        }
        Pattern pattern = Pattern.compile(pattern02);
        String[] strings = pattern.split(stringBuilder);
        int start = Integer.parseInt(strings[1]);
        for(int i = 2; i < strings.length; i++){
            if(start > i){
                System.out.println("The links are not sorted");
                return false;
            }
            else{
                start = i;
                continue;
            }
        }
        return true;

    }

  /*  public List<String> getSentences(){
        ArrayList<String> sentences =  new ArrayList<>();
       // String pattern01 = "([\\u002E|<div>][\\u0410-\\u042f].+\\u002E)";
        String pattern01 = "(<+[div|p]+>.+[\\u002E|?|\"|;|!])";
        String pattern02 = "<+[div|p]+>";
        Pattern p = Pattern.compile(pattern01);
        Pattern p2 = Pattern.compile(pattern02);
        Matcher matcher = p.matcher(fileBuffer);

        while(matcher.find()){
            String tmp = matcher.group();
        //    p2.split(tmp);
            System.out.println(tmp);

        }


        return sentences;
    }
*/


}
