package com.saswati.miwok_language_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView numbers;
    TextView family;
    TextView colors;
    TextView phrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbers=(TextView)findViewById(R.id.numbers);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numberIntent=new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(numberIntent);
            }
        });

        family=(TextView)findViewById(R.id.family);

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent familyIntent=new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        colors=(TextView)findViewById(R.id.colors);

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorsIntent=new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        phrases=(TextView)findViewById(R.id.phrases);

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesIntent=new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });

    }

}