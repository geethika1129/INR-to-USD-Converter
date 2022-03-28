package com.example.inrtousd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText doll;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        doll = findViewById(R.id.doll);
        output = findViewById(R.id.output);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                String s= doll.getText().toString();
                int kk=Integer.parseInt(s);
                double rup = kk / 76.15 ;
                output.setText("Amount in dollars is $ " + Math.round(rup * 100.0) / 100.0);
            }
        });
    }


}