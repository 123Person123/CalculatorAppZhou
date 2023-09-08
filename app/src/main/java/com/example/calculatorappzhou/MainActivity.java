package com.example.calculatorappzhou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String numInput = "";
    String displayedInput = "0";

    public void numSelected(View v){
        if(v.getId() == R.id.b0){
            if(!displayedInput.equals("0")){
                numInput += "0";
                displayedInput += "0";
            }
        }
        if(v.getId() == R.id.b1){
            if(displayedInput.equals("0")){
                numInput = "1";
                displayedInput = "1";
            }
            else{
                numInput += "1";
                displayedInput += "1";
            }
        }
    }


}