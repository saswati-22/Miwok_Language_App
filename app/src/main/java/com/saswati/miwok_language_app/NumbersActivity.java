package com.saswati.miwok_language_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);
            ArrayList<Word> words=new ArrayList<Word>();
            words.add(new Word("one","  lutti",R.drawable.number_one));
        words.add(new Word("two","  otiiko",R.drawable.number_two));
        words.add(new Word("three","  tolookosu",R.drawable.number_three));
        words.add(new Word("four","  oyyisa",R.drawable.number_four));
        words.add(new Word("five","  massokka",R.drawable.number_five));
        words.add(new Word("six","  temmokka",R.drawable.number_six));
        words.add(new Word("seven","  kenekaku",R.drawable.number_seven));
        words.add(new Word("eight","  kawinta",R.drawable.number_eight));
        words.add(new Word("nine","  wo'e",R.drawable.number_nine));
        words.add(new Word("ten","  na'aacha",R.drawable.number_ten));
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

        WordAdapter adaptor = new WordAdapter(this,words,R.color.category_numbers);

        ListView listView=(ListView)findViewById(R.id.list);

        listView.setAdapter(adaptor);


    }
}