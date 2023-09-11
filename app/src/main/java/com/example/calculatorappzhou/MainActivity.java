package com.example.calculatorappzhou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String numInput = "";

    //Put this in other functions
    TextView display = findViewById(R.id.textView3);
    String displayInput = display.getText().toString();

    String displayedInput = "0";

    String old = displayedInput.substring(displayedInput.length()-2,displayedInput.length()-1);
    String curr = displayedInput.substring(displayedInput.length()-1);

    public void numSelected(View v){
        if(v.getId() == R.id.b0){
            if(!displayedInput.equals("0")){
                numInput += "0";
                displayedInput += "0";
            }
//            if(old.equals("*")||old.equals("/")||old.equals("+")||old.equals("-")){
//
//            }
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

        if(v.getId() == R.id.b2){
            if(displayedInput.equals("0")){
                numInput = "2";
                displayedInput = "2";
            }
            else{
                numInput += "2";
                displayedInput += "2";
            }
        }

        if(v.getId() == R.id.b3){
            if(displayedInput.equals("0")){
                numInput = "3";
                displayedInput = "3";
            }
            else{
                numInput += "3";
                displayedInput += "3";
            }
        }

        if(v.getId() == R.id.b4){
            if(displayedInput.equals("0")){
                numInput = "4";
                displayedInput = "4";
            }
            else{
                numInput += "4";
                displayedInput += "4";
            }
        }

        if(v.getId() == R.id.b5){
            if(displayedInput.equals("0")){
                numInput = "5";
                displayedInput = "5";
            }
            else{
                numInput += "5";
                displayedInput += "5";
            }
        }

        if(v.getId() == R.id.b6){
            if(displayedInput.equals("0")){
                numInput = "6";
                displayedInput = "6";
            }
            else{
                numInput += "6";
                displayedInput += "6";
            }
        }

        if(v.getId() == R.id.b7){
            if(displayedInput.equals("0")){
                numInput = "7";
                displayedInput = "7";
            }
            else{
                numInput += "7";
                displayedInput += "7";
            }
        }

        if(v.getId() == R.id.b8){
            if(displayedInput.equals("0")){
                numInput = "8";
                displayedInput = "8";
            }
            else{
                numInput += "8";
                displayedInput += "8";
            }
        }

        if(v.getId() == R.id.b5){
            if(displayedInput.equals("0")){
                numInput = "9";
                displayedInput = "9";
            }
            else{
                numInput += "9";
                displayedInput += "9";
            }
        }
    }



    public void operations(View v){
        if(v.getId() == R.id.b0){
            if(!displayedInput.equals("0")){
                numInput += "0";
                displayedInput += "0";
            }
//            if(old.equals("*")||old.equals("/")||old.equals("+")||old.equals("-")){
//
//            }
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

        if(v.getId() == R.id.b2){
            if(displayedInput.equals("0")){
                numInput = "2";
                displayedInput = "2";
            }
            else{
                numInput += "2";
                displayedInput += "2";
            }
        }

        if(v.getId() == R.id.b3){
            if(displayedInput.equals("0")){
                numInput = "3";
                displayedInput = "3";
            }
            else{
                numInput += "3";
                displayedInput += "3";
            }
        }

        if(v.getId() == R.id.b4){
            if(displayedInput.equals("0")){
                numInput = "4";
                displayedInput = "4";
            }
            else{
                numInput += "4";
                displayedInput += "4";
            }
        }

        if(v.getId() == R.id.b5){
            if(displayedInput.equals("0")){
                numInput = "5";
                displayedInput = "5";
            }
            else{
                numInput += "5";
                displayedInput += "5";
            }
        }

        if(v.getId() == R.id.b6){
            if(displayedInput.equals("0")){
                numInput = "6";
                displayedInput = "6";
            }
            else{
                numInput += "6";
                displayedInput += "6";
            }
        }

        if(v.getId() == R.id.b7){
            if(displayedInput.equals("0")){
                numInput = "7";
                displayedInput = "7";
            }
            else{
                numInput += "7";
                displayedInput += "7";
            }
        }

        if(v.getId() == R.id.b8){
            if(displayedInput.equals("0")){
                numInput = "8";
                displayedInput = "8";
            }
            else{
                numInput += "8";
                displayedInput += "8";
            }
        }

        if(v.getId() == R.id.b5){
            if(displayedInput.equals("0")){
                numInput = "9";
                displayedInput = "9";
            }
            else{
                numInput += "9";
                displayedInput += "9";
            }
        }
    }




}