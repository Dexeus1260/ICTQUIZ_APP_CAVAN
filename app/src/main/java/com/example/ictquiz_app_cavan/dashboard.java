package com.example.ictquiz_app_cavan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class dashboard extends AppCompatActivity {

        CardView java;
        CardView php;
        CardView android;
        CardView html;
        String topic;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.dashboard);

            java = findViewById(R.id.java_card);
            php = findViewById(R.id.php_card);
            android = findViewById(R.id.android_card);
            html = findViewById(R.id.html_card);

            java.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    topic = "java";

                    Intent intent = new Intent(dashboard.this,Quiz.class);
                    intent.putExtra("topic",topic);
                    startActivity(intent);

//                  Toast.makeText(getApplicationContext(),"JAVA selected", Toast.LENGTH_SHORT).show();
                }
            });
            php.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    topic = "php";
                    Intent intent = new Intent(dashboard.this,Quiz.class);
                    intent.putExtra("topic",topic);
                    startActivity(intent);
//                  Toast.makeText(getApplicationContext(),"PHP selected", Toast.LENGTH_SHORT).show();
                }
            });
            android.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    topic = "android";
                    Intent intent = new Intent(dashboard.this,Quiz.class);
                    intent.putExtra("topic",topic);
                    startActivity(intent);
//                  Toast.makeText(getApplicationContext(),"ANDROID selected", Toast.LENGTH_SHORT).show();
                }
            });
            html.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    topic = "html";
                    Intent intent = new Intent(dashboard.this,Quiz.class);
                    intent.putExtra("topic",topic);
                    startActivity(intent);
//                  Toast.makeText(getApplicationContext(),"HTML selected", Toast.LENGTH_SHORT).show();
                }
            });





        }
    @Override
    public void onBackPressed() {
        finish();
        startActivity(getIntent());
    }

}
