package com.example.ictquiz_app_cavan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

//        final TextView right = findViewById(R.id.right);
        final TextView result = findViewById(R.id.result);

        final AppCompatButton again = findViewById(R.id.newGame);
        final Button close = findViewById(R.id.close);

        Bundle extras = getIntent().getExtras();
        final int getCorrect = extras.getInt("right");
        final int getSIze = extras.getInt("size");

//        Toast.makeText(this,String.valueOf(getCorrect), Toast.LENGTH_SHORT).show();

        result.setText( String.valueOf(getCorrect)+" out of "+ String.valueOf(getSIze));

        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(result.this,dashboard.class);
                startActivity(intent);
                finish();

            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                System.exit(1);
            }
        });
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(result.this,dashboard.class));
        finish();
    }


}