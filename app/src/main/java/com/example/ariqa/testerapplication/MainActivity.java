package com.example.ariqa.testerapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private int number;
    private TextView counterView;
    private Button plus;
    private Button minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterView = (TextView) findViewById(R.id.counterNumber);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);

        number = Integer.parseInt(String.valueOf(counterView.getText()));

        Log.v(LOG_TAG, "Current Number : " + number);
        Toast.makeText(this, "Current Number : " + number, Toast.LENGTH_LONG).show();

    }

    public void increment (View view) {
        try {
            number++;
            counterView.setText(""+number);
        } catch (Exception e) {
            Log.e(LOG_TAG, "Error : ", e);
        }
    }

    public void decrement (View view) {
        try {
            number--;
            counterView.setText(""+number);
        } catch (Exception e) {
            Log.e(LOG_TAG, "Error : ", e);
        }
    }

    public void reset (View view) {
        try {
            number = 0;
            counterView.setText(""+number);
        } catch (Exception e) {
            Log.e(LOG_TAG, "Error : ", e);
        }
    }
}
