package com.saswati.miwok_language_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinnә oyaase'nә"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michәksәs?"));
        words.add(new Word("I’m feeling good.", "kuchi achit"));
        words.add(new Word("Are you coming?", "әәnәs'aa?"));
        words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        words.add(new Word("I’m coming.", "әәnәm"));
        words.add(new Word("Let’s go.", "yoowutis"));
        words.add(new Word("Come here.", "әnni'nem"));
//        LinearLayout rootView=(LinearLayout)findViewById(R.id.rootView);
//        int i=0;
//        for(i=0;i<10;i++)
//        {
//            TextView WordView=new TextView(this);
//            WordView.setText(words.get(i));
//            rootView.addView(WordView);
//        }

        //Creating an ArrayAdapter to accept the ArrayList items
        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
//        GridView gridView=(GridView) findViewById(R.id.grid);
//        gridView.setAdapter(itemsAdapter);

        WordAdapter adaptor = new WordAdapter(this,words,R.color.category_phrases);

        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(adaptor);


    }
}