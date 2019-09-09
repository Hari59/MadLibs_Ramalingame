package edu.mga.madlibsf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    public static final String ADJ = "adjective";
    public static final String NOUN = "noun";
    public static final String ADV = "adverb";
    public static final String VERB = "verb";
    public static final String NUMBER = "number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Intent intent = getIntent();
        String adjStr = intent.getStringExtra(ADJ);
        String nounStr = intent.getStringExtra(NOUN);
        String advStr = intent.getStringExtra(ADV);
        String verbStr = intent.getStringExtra(VERB);
        String numberStr = intent.getStringExtra(NUMBER);

        String strToDisplay = ("There once was a " + adjStr + " " + nounStr + " who loved the movie Shrek 2. He loved it so much, he bought " + numberStr +
                " copies of the movie. He watched each one while " + advStr + " " + verbStr + "ing. ");

        TextView str = (TextView) findViewById(R.id.display);

        str.setText(strToDisplay);

    }
}
