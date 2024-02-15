package com.example.moneyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public float result ;

    private  RadioButton RB1;
    private  RadioButton RB2;
    private  EditText ET;
    private  TextView TV;

    private Button btn;
    private Float money;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.RB1 = findViewById(R.id.radioButton);
        this.RB2 = findViewById(R.id.radioButton2);
        this.ET  = (EditText) findViewById(R.id.editTextText);
        this.TV  = (TextView)  findViewById(R.id.textView2);
        this.btn = (Button) findViewById(R.id.button);
        float money = Float.valueOf(ET.getText().toString());


//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                convertor(v);
//            }
//        });
    }

    public void convertor(){
        if(RB1.isChecked()==true){
            result = (float) (money * 0.29);
            TV.setText("Le résultat est :"+result+"");

        }else if(RB2.isChecked()) {
            result = (float) (money*3.39);
            TV.setText("Le résultat est :"+result);
        }else{
            TV.setText("You need to Check");
        }
    }
}