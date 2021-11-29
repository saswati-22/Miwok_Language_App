package com.saswati.miwok_language_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
        ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("father","  әpә",R.drawable.family_father));
        words.add(new Word("mother","  әṭa",R.drawable.family_mother));
        words.add(new Word("son","  angsi",R.drawable.family_son));
        words.add(new Word("daughter","  tune",R.drawable.family_daughter));
        words.add(new Word("older brother","  taachi",R.drawable.family_older_brother));
        words.add(new Word("younger brother","  chalitti",R.drawable.family_younger_brother));
        words.add(new Word("older sister","  teṭe",R.drawable.family_older_sister));
        words.add(new Word("younger sister","  kolliti",R.drawable.family_younger_sister));
        words.add(new Word("grandmother","  ama",R.drawable.family_grandmother));
        words.add(new Word("grandfather","  paapa",R.drawable.family_grandfather));
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

        WordAdapter adaptor = new WordAdapter(this,words,R.color.category_family);

        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(adaptor);



    }
}