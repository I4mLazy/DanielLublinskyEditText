package com.example.daniellublinskyedittext;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Button;
import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    TextView one;
    TextView two;
    TextView three;
    TextView four;
    TextView five;
    TextView six;
    EditText a;
    EditText b;
    EditText c;
    ImageView I;
    ImageView II;
    ImageView III;
    Button odin;
    Button dva;
    Button tri;
    Button chitiri;
    int rannum1;
    int rannum2;
    int sum;
    Random rand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        I = findViewById(R.id.I);
        II = findViewById(R.id.II);
        III = findViewById(R.id.III);
        odin = findViewById(R.id.odin);
        dva = findViewById(R.id.dva);
        tri = findViewById(R.id.tri);
        chitiri = findViewById(R.id.chitiri);

        rannum1 = rand.nextInt(89) + 10;
        rannum2 = rand.nextInt(89) + 10;

        one.setText(rannum1+"");
        four.setText(rannum2+"");
    }





}