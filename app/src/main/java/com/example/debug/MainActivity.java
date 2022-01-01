package com.example.debug;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText etN1, etN2;
    TextView txtResult;
    Button btnAdd;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etN1 = findViewById(R.id.etN1);
        etN2 = findViewById(R.id.etN2);
        txtResult = findViewById(R.id.txtResult);
        btnAdd = findViewById(R.id.btnAdd);


        btnAdd.setOnClickListener(v -> {

//               debug using logcate and debuger option
            int num1 = Integer.parseInt(etN1.getText().toString());
            Log.i("add", "n1 Extecuted");
            int num2 = Integer.parseInt(etN2.getText().toString());
            Log.i("add", "n2 Extecuted");
            int add = num1 + num2;
//          result.setText(num1+num2);//num1 and num2 is int we have to convert it into String then it will work
            txtResult.setText("" + add);
            Log.i("add", "add Extecuted");
        });
    }
}