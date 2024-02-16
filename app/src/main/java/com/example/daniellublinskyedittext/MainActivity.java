package com.example.daniellublinskyedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

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
    int sum = 0;
    int count = 0;
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


    public void checkodin(View view)
    {
        String ans = a.getText().toString();

        if(count == 0)
        {
            count ++;
            if(rannum1 + rannum2== Integer.parseInt(ans))
            {
                I.setVisibility(view.VISIBLE);
                I.setImageResource(R.drawable.greentick);
                sum++;
            }
            else
            {
                I.setVisibility(view.VISIBLE);
                I.setImageResource(R.drawable.redx);
            }
            rannum1 = rannum1 + rannum2;
            rannum2 = rand.nextInt(89) + 10;

            two.setText(rannum1+"");
            five.setText(rannum2+"");
        }

    }

    public void checkdva(View view)
    {
        String ans = b.getText().toString();

        if(count == 1)
        {
            count ++;
            if(rannum1 + rannum2== Integer.parseInt(ans))
            {
                II.setVisibility(view.VISIBLE);
                II.setImageResource(R.drawable.greentick);
                sum++;
            }
            else
            {
                II.setVisibility(view.VISIBLE);
                II.setImageResource(R.drawable.redx);
            }
            rannum1 = rannum1 + rannum2;
            rannum2 = rand.nextInt(89) + 10;

            three.setText(rannum1+"");
            six.setText(rannum2+"");
        }

    }

    public void checktri(View view)
    {
        String ans = c.getText().toString();

        if(count == 2)
        {
            count ++;
            if(rannum1 + rannum2== Integer.parseInt(ans))
            {
                III.setVisibility(view.VISIBLE);
                III.setImageResource(R.drawable.greentick);
                sum++;
            }
            else
            {
                III.setVisibility(view.VISIBLE);
                III.setImageResource(R.drawable.redx);
            }
        }
        int score = sum/3 * 100;
        Toast.makeText(MainActivity.this, (sum+ "/3, " +score+ "%"), Toast.LENGTH_LONG).show();
        chitiri.setVisibility(view.VISIBLE);
    }

    public void newgame(View view)
    {
        sum = 0;
        count = 0;
        I.setVisibility(view.INVISIBLE);
        II.setVisibility(view.INVISIBLE);
        III.setVisibility(view.INVISIBLE);
        rannum1 = rand.nextInt(89) + 10;
        rannum2 = rand.nextInt(89) + 10;

        one.setText(rannum1+"");
        four.setText(rannum2+"");
        two.setText("");
        three.setText("");
        five.setText("");
        six.setText("");
        a.setText(null);
        b.setText(null);
        c.setText(null);

    }
}