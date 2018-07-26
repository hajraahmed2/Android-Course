package com.example.lenovo.services;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String message="Android";

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(message,"the OnCreate() event");
        }

        public void startService(View view){

        startService(new Intent(getBaseContext(),MyService.class));

        }

        public void stopService(View view){

        stopService(new Intent(getBaseContext(),MyService.class));
         }


        public void submit(View view) {

        EditText tsal=(EditText)findViewById(R.id.sal);
        String i=tsal.getText().toString().trim();
        int salary = Integer.parseInt(i);

        EditText thallow=(EditText)findViewById(R.id.hallow);
        String j=thallow.getText().toString().trim();
        int homeallowance = Integer.parseInt(j);


        EditText ttallow=(EditText)findViewById(R.id.tallow);
        String k=ttallow.getText().toString().trim();
        int transportallowance = Integer.parseInt(k);


        EditText ttax=(EditText)findViewById(R.id.tax);
        String l=ttax.getText().toString().trim();
        int tax = Integer.parseInt(l);


        int finalsalary;

        finalsalary=(salary+homeallowance+transportallowance)-tax;

        ///displaying

        TextView finalsal=(TextView)findViewById(R.id.txtresult);
        finalsal.setText("salary is:"+finalsalary);
    }
}
