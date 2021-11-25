package com.example.ictquiz_app_cavan;

import java.util.ArrayList;
import java.util.List;

public class questionnaire {
    private  static List<questions> htmlQ()
    {
        final  List<questions> questionsLists = new ArrayList<>();

        final  questions question1 = new questions("What does HTML stand for?","Hyperlinks and Text Markup Language","Hyper Text Markup Language","Home Tool Markup Language","How to Make Longganisa","Hyper Text Markup Language","");
        final  questions question2 = new questions("Who is making the Web standards?","Microsoft","Google","The World Wide Web Consortium","Mozilla","The World Wide Web Consortium","");
        final  questions question3 = new questions("What is the correct sequence of HTML tags for starting a webpage?","Head, Title, HTML","Title, Head, HTML","HTML, Head, Title","None of the above","HTML, Head, Title","");
        final  questions question4 = new questions("Choose the correct HTML tag for the largest heading.","Head","Heading","H5","H1","H1","");
        final  questions question5 = new questions("What is the correct HTML tag for inserting a line break?","Break","Lb","Br","Hr","Br","");
        final  questions question6 = new questions("Choose the correct HTML element to define the emphasized text.","<i>","<em>","<italic>","<strong>","<em>","");
        final  questions question7 = new questions("How can you make a list that lists the items with numbers?","ML","OL","UL","WT","OL","");
        final  questions question8 = new questions("Which of these elements are all <table> elements?","<thead><body><tr>","<table><tr><td>","<table><head><tfoot>","<table><tr><tt>","<table><tr><td>","");
        final  questions question9 = new questions("How can you make a bulleted list?","P","Li","Ul","Ol","Ul","");
        final  questions question10 = new questions("Which HTML attribute specifies an alternate text for an image, if the image cannot be displayed?","Src","Title","Alt","Longdesc","Alt","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        return  questionsLists;
    }
    private  static List<questions> androidQ()
    {
        final  List<questions> questionsLists = new ArrayList<>();

        final  questions question1 = new questions("Which company developed android?","Apple","Android Inc.","Nokia","Google","Google","");
        final  questions question2 = new questions("Web browser available in android is based on?","Chrome","Firefox","Open-source Webkit","Opera","Chrome","");
        final  questions question3 = new questions("Android is based on which kernel?","Linux kernel","Windows kernel","MAC kernel","Hybrid Kernel","Linux kernel","");
        final  questions question4 = new questions("Android is based on which language?","C","C++","VC++","java","java","");
        final  questions question5 = new questions("What is android?","Desktop Operating System","Programming Language","Mobile Operating System","Database","Mobile Operating System","");
        final  questions question6 = new questions("Android doesn't support which format.","MP4","MPEG","AVI","MIDI","MIDI","");
        final  questions question7 = new questions("Android supports which features.","Multitasking","Bluetooth","Video calling","All of the above","All of the above","");
        final  questions question8 = new questions("If you want to increase the whitespace between widgets, you will need to use the ____________ property","Android:padding","Android:digits","Android:capitalize","Android:autoText","Android:padding","");
        final  questions question9 = new questions("For __________ , code used by Android is not a open source","Device driver","video driver","WiFi driver","Bluetooth driver","Device driver","");
        final  questions question10 = new questions("Android provides a few standard themes, listed in__________","R.style","X.style","manifest.XML","application","R.style","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        return  questionsLists;
    }

    private  static List<questions> phpQ()
    {
        final  List<questions> questionsLists = new ArrayList<>();

        final  questions question1 = new questions("Which of the following is used to declare a constant?","const","constant","define","#pragma","define","");
        final  questions question2 = new questions("Which of the following is the way to create comments in PHP?","// commented code to end of line","/* commented code here */","# commented code to end of line","all of the above","// commented code to end of line","");
        final  questions question3 = new questions("What does PHP stand for?","Preprocessed Hypertext Page","Hypertext Markup Language","Hypertext Preprocessor","Hypertext Transfer Protocol","Hypertext Preprocessor","");
        final  questions question4 = new questions("What will be the value of $var?","0","0.5","1","2","0","");
        final  questions question5 = new questions("Which of the following is NOT a valid PHP comparison operator?","!=",">=","<=>","<>","<=>","");
        final  questions question6 = new questions("Which of the following is NOT a magic predefined constant?","__LINE__","__FILE__","__DATE__","__CLASS__","__DATE__","");
        final  questions question7 = new questions("What is the strpos() function used for?","Find the last character of a string","Both b and c","Search for character within a string","Locate position of a string’s first character","Locate position of a string’s first character","");
        final  questions question8 = new questions("____________ function in PHP Returns a list of response headers sent (or ready to send)","header()","headers_list()","header_sent()","header_send()","header()","");
        final  questions question9 = new questions("What is array_keys() used for?","Compares array keys, and returns the matches","Checks if the specified key exists in the array","Returns all the keys of an array","Both b and c above","Returns all the keys of an array","");
        final  questions question10 = new questions("How do I create PHP arrays in a HTML <form>?","< input name= MyArray[]/>","< input =\"MyArray[]\" />","< input name=\"MyArray[]\" />","< input MyArray[] />","< input =\"MyArray[]\" />","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        return  questionsLists;
    }
    private  static List<questions> javaQ()
    {
        final  List<questions> questionsLists = new ArrayList<>();

        final  questions question1 = new questions("What is a member of a class?","An attribute","A method","Attribute or method","A sub-class","Attribute or method","");
        final  questions question2 = new questions("What is the default value of the data type long in Java ?","0","1","0l","2","0l","");
        final  questions question3 = new questions("What is the default value of the data type double in Java ?","1","0","0.0","0.00","0.00","");
        final  questions question4 = new questions("Which data type value is returned by all transcendental math functions ?","int","float","double","long","double","");
        final  questions question5 = new questions("Which of the following coding types is used for the data type characters in Java ?","ISO-LATIN-1","UNICODE","ASCII","one of the above","UNICODE","");
        final  questions question6 = new questions("Which of the following values, a boolean variable can contain ?","True and False","0 and 1","Any integer value","None of the above","True and False","");
        final  questions question7 = new questions("Which of the following is a correct declaration of variable in Java ?","int num","int num;","int-num","int-num;","int num;","");
        final  questions question8 = new questions("Which of the following is a correct variable initialization in Java ?","Int num = 10","Int-num = 10;","Int num = 10;","Int-num = 10","Int num = 10;","");
        final  questions question9 = new questions("What is the default value of the data type byte in Java ?","0","null","1","none of the above","0","");
        final  questions question10 = new questions("What is the default value of the data type int in Java ?","0","1","0i","None of the above","0","");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);
        return  questionsLists;
    }
    public static List<questions> getQuestions(String topic)
    {
        switch (topic)
        {
            case "java":
                return javaQ();

            case "php":
                return phpQ();

            case "android":
                return androidQ();

            default:
                return htmlQ();
        }
    }
}
