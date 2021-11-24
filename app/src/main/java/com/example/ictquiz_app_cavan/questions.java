package com.example.ictquiz_app_cavan;

public class questions {

    private String questions,op1,op2,op3,op4,answer;
    private String userAnswer;

    public questions(String questions, String op1, String op2, String op3, String op4, String answer, String userAnswer) {
        this.questions = questions;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.answer = answer;
        this.userAnswer = userAnswer;
    }

    public String getQuestions() {
        return questions;
    }

    public String getOp1() {
        return op1;
    }

    public String getOp2() {
        return op2;
    }

    public String getOp3() {
        return op3;
    }

    public String getOp4() {
        return op4;
    }

    public String getAnswer() {
        return answer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }
}
