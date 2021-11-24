package com.example.ictquiz_app_cavan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        final TextView right = findViewById(R.id.right);
        final TextView wrong = findViewById(R.id.wrong);

        final AppCompatButton again = findViewById(R.id.newGame);

        final int getCorrect = getIntent().getIntExtra("correct",0);
        final int getWrong = getIntent().getIntExtra("incorrect",0);

//        Toast.makeText(this,String.valueOf(getCorrect), Toast.LENGTH_SHORT).show();
        right.setText( String.valueOf(getCorrect)+ " correct" );
        wrong.setText( String.valueOf(getWrong)+ " wrong" );

        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(result.this,dashboard.class);
                startActivity(intent);
                finish();

            }
        });


    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(result.this,dashboard.class));
        finish();
    }
}