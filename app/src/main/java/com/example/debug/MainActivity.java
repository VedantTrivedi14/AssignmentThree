package com.example.debug;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2;
    TextView result;
    Button  btnn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.E1);
        n2 = (EditText) findViewById(R.id.E2);
        result = (TextView) findViewById(R.id.tv);
        btnn = (Button) findViewById(R.id.btn);


        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//               debug using logcate and debuger option
                int num1 = Integer.parseInt(n1.getText().toString());
                Log.i("add","n1 Extecuted");
                int num2 = Integer.parseInt(n2.getText().toString());
                Log.i("add","n2 Extecuted");
                 int add= num1+num2;
//              result.setText(num1+num2);//num1 and num2 is int we have to convert it into String then it will work
                result.setText(""+add);
                Log.i("add","add Extecuted");
            }
        });
    }
}