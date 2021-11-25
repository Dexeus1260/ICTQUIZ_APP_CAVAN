package com.example.ictquiz_app_cavan;

import static android.R.color.white;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Quiz extends AppCompatActivity {

    ImageView back_btn;
    TextView topicName;
    View quiz;
    private TextView timer;

    private TextView questionNum;
    private TextView question;
    private AppCompatButton op1,op2,op3,op4;
    private AppCompatButton next;
//    private Timer quizTimer;
//    private int totalTimemins = 1;
//    private int second = 0;
    CountDownTimer Timer = null;


    private List<questions> questionsLists;
    private  int currentQuestionPosition = 0;

    private String selectedOption ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        quiz = findViewById(R.id.constraint);

        back_btn = findViewById(R.id.back_btn);
        topicName = findViewById(R.id.topicName);
        timer = findViewById(R.id.timer);

        questionNum = findViewById(R.id.questionNum);
        question = findViewById(R.id.questions);

        op1 = findViewById(R.id.op1);
        op2 = findViewById(R.id.op2);
        op3 = findViewById(R.id.op3);
        op4 = findViewById(R.id.op4);

        next = findViewById(R.id.next);

        final String topic = getIntent().getStringExtra("topic");

        if (topic.equals("java")){
            quiz.setBackgroundResource(R.drawable.bg5);
        }
        else if (topic.equals("php"))
        {
            quiz.setBackgroundResource(R.drawable.bg6);
        }
        else if (topic.equals("android"))
        {
            quiz.setBackgroundResource(R.drawable.bg8);
        }
        else
        {
            quiz.setBackgroundResource(R.drawable.bg7);
        }

        topicName.setText(topic);

        questionsLists = questionnaire.getQuestions(topic);

//        startTimer(timer);
        startTimer();

        questionNum.setText((currentQuestionPosition+1)+"/"+questionsLists.size());
        question.setText(questionsLists.get(0).getQuestions());
        op1.setText(questionsLists.get(0).getOp1());
        op2.setText(questionsLists.get(0).getOp2());
        op3.setText(questionsLists.get(0).getOp3());
        op4.setText(questionsLists.get(0).getOp4());



        op1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (selectedOption.isEmpty())
                {
                    selectedOption = op1.getText().toString();
                    op1.setBackgroundResource(R.drawable.wrong_bg);
                    op1.setTextColor(Color.parseColor("#FFFFFF"));
                    questionsLists.get(currentQuestionPosition).setUserAnswer(selectedOption);
                    revealAnswer();


                }
            }
        });

        op2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (selectedOption.isEmpty())
                {
                    selectedOption = op2.getText().toString();
                    op2.setBackgroundResource(R.drawable.wrong_bg);
                    op2.setTextColor(Color.parseColor("#FFFFFF"));
                    questionsLists.get(currentQuestionPosition).setUserAnswer(selectedOption);
                    revealAnswer();


                }
            }
        });

        op3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (selectedOption.isEmpty())
                {
                    selectedOption = op3.getText().toString();
                    op3.setBackgroundResource(R.drawable.wrong_bg);
                    op3.setTextColor(Color.parseColor("#FFFFFF"));
                    questionsLists.get(currentQuestionPosition).setUserAnswer(selectedOption);
                    revealAnswer();


                }
            }
        });

        op4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (selectedOption.isEmpty())
                {
                    selectedOption = op4.getText().toString();
                    op4.setBackgroundResource(R.drawable.wrong_bg);
                    op4.setTextColor(Color.parseColor("#FFFFFF"));
                    questionsLists.get(currentQuestionPosition).setUserAnswer(selectedOption);
                    revealAnswer();


                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOption.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Please select an option!",Toast.LENGTH_SHORT).show();
                }
                else{
                    changeQuestion();
                }
            }
        });


        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                quizTimer.purge();
//                quizTimer.cancel();
                cancelTimer();
                startActivity(new Intent(Quiz.this,dashboard.class));
                finish();
            }
        });

    }
    private  void changeQuestion()
    {
        currentQuestionPosition++;

        if((currentQuestionPosition+1)==questionsLists.size())
        {
            next.setText("Submit");
        }

        if(currentQuestionPosition<questionsLists.size())
        {
            selectedOption = "";

            op1.setBackgroundResource(R.drawable.round_bg);
            op1.setTextColor(Color.parseColor("#000000"));

            op2.setBackgroundResource(R.drawable.round_bg);
            op2.setTextColor(Color.parseColor("#000000"));

            op3.setBackgroundResource(R.drawable.round_bg);
            op3.setTextColor(Color.parseColor("#000000"));

            op4.setBackgroundResource(R.drawable.round_bg);
            op4.setTextColor(Color.parseColor("#000000"));

            questionNum.setText((currentQuestionPosition+1)+"/"+questionsLists.size());
            question.setText(questionsLists.get(currentQuestionPosition).getQuestions());
            op1.setText(questionsLists.get(currentQuestionPosition).getOp1());
            op2.setText(questionsLists.get(currentQuestionPosition).getOp2());
            op3.setText(questionsLists.get(currentQuestionPosition).getOp3());
            op4.setText(questionsLists.get(currentQuestionPosition).getOp4());


        }
        else{
            Intent mintent = new Intent(Quiz.this,result.class);
            Bundle extras = new Bundle();
            extras.putInt("right", getCorrectAns());
            extras.putInt("wrong", getIncorrectAns());
            mintent.putExtras(extras);
            startActivity(mintent);
            finish();

        }
    }


    private void startTimer()
    {
        Timer = new CountDownTimer(60000,1000) {
            @Override
            public void onTick(long milliUntilFinihed) {
                timer.setText(""+milliUntilFinihed/1000);
            }

            @Override
            public void onFinish() {
                   Timer.cancel();
                    Toast.makeText(Quiz.this,"Time Over", Toast.LENGTH_SHORT).show();
                    Intent mintent = new Intent(Quiz.this,result.class);
                    Bundle extras = new Bundle();
                    extras.putInt("right", getCorrectAns());
                    extras.putInt("wrong", getIncorrectAns());
                    mintent.putExtras(extras);
                    startActivity(mintent);
                    finish();
            }
        };
        Timer.start();
    }

    private void cancelTimer() {
        if(Timer!=null)
            Timer.cancel();
    }

    private  int getCorrectAns()
    {
        int correctAns = 0;

        for (int i=0;i<questionsLists.size();i++)
        {
            final String getUserAnswer = questionsLists.get(i).getUserAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if(getUserAnswer.equals(getAnswer))
            {
                correctAns++ ;
            }
//            Toast.makeText(this,""+correctAns, Toast.LENGTH_SHORT).show();
        }

        return correctAns;
    }

    private  int getIncorrectAns()
    {
        int incorrectAns = 0;

        for (int i=0;i<questionsLists.size();i++)
        {
            final String getuserAnswer = questionsLists.get(i).getUserAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if(!getuserAnswer.equals(getAnswer))
            {
                incorrectAns = incorrectAns + 1;
            }
//            Toast.makeText(this,""+incorrectAns, Toast.LENGTH_SHORT).show();
        }

        return incorrectAns;
    }


//    private int getSize(){
//        return questionsLists.size();
//    }

    @Override
    public void onBackPressed() {
//        quizTimer.purge();
//        quizTimer.cancel();
        cancelTimer();
        startActivity(new Intent(Quiz.this,dashboard.class));
        finish();
    }
    private void revealAnswer()
    {
        final String getAnswer = questionsLists.get(currentQuestionPosition).getAnswer();

        if (op1.getText().toString().equals(getAnswer))
        {
            op1.setBackgroundResource(R.drawable.correct_bg);
            op1.setTextColor(Color.parseColor("#FFFFFF"));

        }
        else if (op2.getText().toString().equals(getAnswer))
        {
            op2.setBackgroundResource(R.drawable.correct_bg);
            op2.setTextColor(Color.parseColor("#FFFFFF"));
        }
        else if (op3.getText().toString().equals(getAnswer))
        {
            op3.setBackgroundResource(R.drawable.correct_bg);
            op3.setTextColor(Color.parseColor("#FFFFFF"));
        }
        else if (op4.getText().toString().equals(getAnswer))
        {
            op4.setBackgroundResource(R.drawable.correct_bg);
            op4.setTextColor(Color.parseColor("#FFFFFF"));
        }
    }

//    private void startTimer(TextView timerTextView)
//    {
//        quizTimer = new Timer();
//        quizTimer.scheduleAtFixedRate(new TimerTask() {
//            @Override
//            public void run() {
//                if(second == 0 )
//                {
//                    totalTimemins--;
//                    second = 59;
//                }
//                else if(second == 0 && totalTimemins == 0)
//                {
//                    quizTimer.purge();
//                    quizTimer.cancel();
//
//                    Toast.makeText(Quiz.this,"Time Over", Toast.LENGTH_SHORT).show();
//
//                    Intent intent = new Intent(Quiz.this,result.class);
//                    intent.putExtra("correct",getCorrectAns());
//                    intent.putExtra("incorrect",getIncorrectAns());
//
//                    startActivity(intent);
//
//                    finish();
//
//                }
//                else{
//                    second--;
//                }
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                         String finalMinutes = String.valueOf(totalTimemins);
//                         String finalSeconds = String.valueOf(second);
//
//                        if(finalMinutes.length()==1)
//                        {
//                            finalMinutes = "0" + finalMinutes;
//
//                        }
//                        if (finalSeconds.length()==1)
//                        {
//                            finalSeconds = "0" + finalSeconds;
//                        }
//                        timerTextView.setText(finalMinutes+":"+finalSeconds);
//                    }
//                });
//            }
//        },1000,1000);
//    }

}