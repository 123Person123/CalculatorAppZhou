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


    double saved = 0;
    String operation = "";
    String savedOperation = "";

    public void numSelected(View v){
        if(v.getId() == R.id.b_0){
            TextView display = findViewById(R.id.display_box);
            String displayInput = display.getText().toString();
            if(!savedOperation.equals("")){
                display.setText("0");
                savedOperation = "";
            }
            else{
                if(displayInput.equals("0")){
                    display.setText("0");
                }
                else{
                    String newText = displayInput.concat("0");
                    display.setText(newText);
                }
            }
        }

        if(v.getId() == R.id.b_1){
            TextView display = findViewById(R.id.display_box);
            String displayInput = display.getText().toString();
            if(!savedOperation.equals("")){
                display.setText("1");
                savedOperation = "";
            }
            else{
                if(displayInput.equals("0")){
                    display.setText("1");
                }
                else{
                    String newText = displayInput.concat("1");
                    display.setText(newText);
                }
            }
        }

        if(v.getId() == R.id.b_2){
            TextView display = findViewById(R.id.display_box);
            String displayInput = display.getText().toString();
            if(!savedOperation.equals("")){
                display.setText("2");
                savedOperation = "";
            }
            else{
                if(displayInput.equals("0")){
                    display.setText("2");
                }
                else{
                    String newText = displayInput.concat("2");
                    display.setText(newText);
                }
            }
        }

        if(v.getId() == R.id.b_3){
            TextView display = findViewById(R.id.display_box);
            String displayInput = display.getText().toString();
            if(!savedOperation.equals("")){
                display.setText("3");
                savedOperation = "";
            }
            else{
                if(displayInput.equals("0")){
                    display.setText("3");
                }
                else{
                    String newText = displayInput.concat("3");
                    display.setText(newText);
                }
            }
        }

        if(v.getId() == R.id.b_4){
            TextView display = findViewById(R.id.display_box);
            String displayInput = display.getText().toString();
            if(!savedOperation.equals("")){
                display.setText("4");
                savedOperation = "";
            }
            else{
                if(displayInput.equals("0")){
                    display.setText("4");
                }
                else{
                    String newText = displayInput.concat("4");
                    display.setText(newText);
                }
            }
        }

        if(v.getId() == R.id.b_5){
            TextView display = findViewById(R.id.display_box);
            String displayInput = display.getText().toString();
            if(!savedOperation.equals("")){
                display.setText("5");
                savedOperation = "";
            }
            else{
                if(displayInput.equals("0")){
                    display.setText("5");
                }
                else{
                    String newText = displayInput.concat("5");
                    display.setText(newText);
                }
            }
        }

        if(v.getId() == R.id.b_6){
            TextView display = findViewById(R.id.display_box);
            String displayInput = display.getText().toString();
            if(!savedOperation.equals("")){
                display.setText("6");
                savedOperation = "";
            }
            else{
                if(displayInput.equals("0")){
                    display.setText("6");
                }
                else{
                    String newText = displayInput.concat("6");
                    display.setText(newText);
                }
            }
        }

        if(v.getId() == R.id.b_7){
            TextView display = findViewById(R.id.display_box);
            String displayInput = display.getText().toString();
            if(!savedOperation.equals("")){
                display.setText("7");
                savedOperation = "";
            }
            else{
                if(displayInput.equals("0")){
                    display.setText("7");
                }
                else{
                    String newText = displayInput.concat("7");
                    display.setText(newText);
                }
            }
        }

        if(v.getId() == R.id.b_8){
            TextView display = findViewById(R.id.display_box);
            String displayInput = display.getText().toString();
            if(!savedOperation.equals("")){
                display.setText("8");
                savedOperation = "";
            }
            else{
                if(displayInput.equals("0")){
                    display.setText("8");
                }
                else{
                    String newText = displayInput.concat("8");
                    display.setText(newText);
                }
            }
        }

        if(v.getId() == R.id.b_9){
            TextView display = findViewById(R.id.display_box);
            String displayInput = display.getText().toString();
            if(!savedOperation.equals("")){
                display.setText("9");
                savedOperation = "";
            }
            else{
                if(displayInput.equals("0")){
                    display.setText("9");
                }
                else{
                    String newText = displayInput.concat("9");
                    display.setText(newText);
                }
            }

        }


    }



    public void operations(View v){
        if(v.getId() == R.id.b_plus){
            TextView display = findViewById(R.id.display_box);
            String current = display.getText().toString();
            saved = Double.parseDouble(current);
            operation = "Add";
            savedOperation = "Add";
        }
        if(v.getId() == R.id.b_minus){
            TextView display = findViewById(R.id.display_box);
            String current = display.getText().toString();
            saved = Double.parseDouble(current);
            operation = "Subtract";
            savedOperation = "Subtract";
        }
        if(v.getId() == R.id.b_multiply){
            TextView display = findViewById(R.id.display_box);
            String current = display.getText().toString();
            saved = Double.parseDouble(current);
            operation = "Multiply";
            savedOperation = "Multiply";
        }
        if(v.getId() == R.id.b_divide){
            TextView display = findViewById(R.id.display_box);
            String current = display.getText().toString();
            saved = Double.parseDouble(current);
            operation = "Divide";
            savedOperation = "Divide";
        }

    }

    public void calculate(View v){
        if(v.getId() == R.id.b_equals){
            TextView display = findViewById(R.id.display_box);
            String current = display.getText().toString();
            Double currentValue = Double.parseDouble(current);
            if(operation.equals("Add")){
                double result = saved + currentValue;
                display.setText(String.valueOf(result));
            }
            else if(operation.equals("Subtract")){
                double result = saved - currentValue;
                display.setText(String.valueOf(result));
            }
            else if(operation.equals("Multiply")){
                double result = saved * currentValue;
                display.setText(String.valueOf(result));
            }
            else if(operation.equals("Divide")){
                double result = saved / currentValue;
                display.setText(String.valueOf(result));
            }
            operation = "";
            savedOperation = "";
        }
    }

    public void clear(View v){
        if(v.getId() == R.id.b_clear){
            TextView display = findViewById(R.id.display_box);
            display.setText("0");
            saved = 0;
            operation = "";
            savedOperation = "";
        }
    }





}