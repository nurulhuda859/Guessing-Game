package me.nhas.guesinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.*;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Integer;


public class MainActivity extends AppCompatActivity {

    int number = (int) (Math.random() * 10 + 1);

    public void guess (View view) {
        EditText guessText = (EditText) findViewById(R.id.guessEditText);


        Log.i("info", guessText.getText().toString());
        Log.i("num", Integer.toString(number));

        int guessInt = Integer.parseInt(guessText.getText().toString());


        if (guessInt == number ) {
            Toast.makeText(this, "Matched", Toast.LENGTH_SHORT).show();
            number = (int) (Math.random() * 10 + 1);
            guessText.setText("");
        }
        else if (guessInt > number) {
            guessText.setText("");
            Toast.makeText(this, "Try lower", Toast.LENGTH_SHORT).show();
        }
        else if (guessInt < number) {
            guessText.setText("");

            Toast.makeText(this, "Try higher", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Not Matched", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
