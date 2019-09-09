package edu.mga.madlibsf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendInfo(View v){
        EditText adjTE = (EditText) findViewById(R.id.adjTE);
        EditText nounTE = (EditText) findViewById(R.id.nounTE);
        EditText adverbTE = (EditText) findViewById(R.id.adverbTE);
        EditText verbTE = (EditText) findViewById(R.id.verbTE);
        EditText numberTE = (EditText) findViewById(R.id.numberTE);

        String adjStr = adjTE.getText().toString();
        String nounStr = nounTE.getText().toString();
        String adverbStr = adverbTE.getText().toString();
        String verbStr = verbTE.getText().toString();
        String numberStr = numberTE.getText().toString();

        Intent intent = new Intent(this, InfoActivity.class);

        intent.putExtra(InfoActivity.ADJ, adjStr);
        intent.putExtra(InfoActivity.NOUN,nounStr);
        intent.putExtra(InfoActivity.ADV,adverbStr);
        intent.putExtra(InfoActivity.VERB,verbStr);
        intent.putExtra(InfoActivity.NUMBER,numberStr);

        startActivity(intent);
    }


}