package com.company;

import com.company.task1.CrazyLogger;
import com.company.task2.Quiz;
import com.company.task3.FileReader;
import com.company.task3.ParsePage;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

      //  Quiz answerQuestion = new Quiz();
      //  answerQuestion.scanQuestion();


        ParsePage parsePage = new ParsePage("Java.SE.03.Information handling_task_attachment.html");
        parsePage.isLinksSorted();









    }
}
