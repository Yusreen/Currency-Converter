package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    //variables
    double amountInDollars;
    EditText sum;
    double amountInPounds;

 public void convert (View view){
     sum = (EditText) findViewById(R.id.sum);
     amountInDollars = Double.valueOf(sum.getText().toString());
     amountInPounds = amountInDollars *0.83;
     Context context = getApplicationContext();
     CharSequence text = String.valueOf(amountInPounds);
     CharSequence text2 = "£ "+String.valueOf(amountInPounds);
     int duration = Toast.LENGTH_SHORT;

     Toast toast = Toast.makeText(context, text2, duration);
     toast.show();





 }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
