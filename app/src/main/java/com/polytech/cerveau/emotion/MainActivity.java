package com.polytech.cerveau.emotion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener {

    private final String TAG = "Main_Activity!";
    private EditText et_name;
    private TextView tv_feedback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button recordData = findViewById(R.id.start);
        recordData.setOnClickListener(this);

        et_name = findViewById(R.id.nameField);
        tv_feedback = findViewById(R.id.tv_name_feedback);

    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.start) {


                Intent myIntent = new Intent(MainActivity.this,
                        ActivityRealTimeEEGClassifier.class);
                startActivity(myIntent);


        }

    }
}
