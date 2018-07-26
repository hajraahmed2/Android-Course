package com.example.lenovo.intent_tasks;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.AppComponentFactory;
import android.view.WindowInsets;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button reg ;
   Button calender,calc,gal,gmap,internt,cont,msg;


 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reg=(Button)findViewById(R.id.bt1);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent regintent=new Intent(MainActivity.this,register.class);

                startActivity(regintent);
            }
        });

     calender=(Button)findViewById(R.id.bt2);

     calender.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             Intent calenderintent =Intent.makeMainSelectorActivity(Intent.ACTION_MAIN,Intent.CATEGORY_APP_CALENDAR);

             startActivity(calenderintent);
         }
     });


     calc=(Button)findViewById(R.id.bt3);

     calc.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             Intent calcintent =Intent.makeMainSelectorActivity(Intent.ACTION_MAIN,Intent.CATEGORY_APP_CALCULATOR);

             startActivity(calcintent);
         }
     });


     gal=(Button)findViewById(R.id.bt4);

     gal.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             Intent galintent =Intent.makeMainSelectorActivity(Intent.ACTION_MAIN,Intent.CATEGORY_APP_GALLERY);

             startActivity(galintent);
         }
     });



     gmap=(Button)findViewById(R.id.bt5);

     gmap.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             Intent gmapintent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.maps.google.com"));

             startActivity(gmapintent);
         }
     });




     internt=(Button)findViewById(R.id.bt6);

        internt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent interintent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));

                startActivity(interintent);
            }
        });



     cont=(Button)findViewById(R.id.bt7);

     cont.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {

             Intent contintent;
             contintent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("tel:02134590950"));

             startActivity(contintent);
         }
     });

     msg=(Button)findViewById(R.id.bt8);

     msg.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent smsIntent = new Intent(android.content.Intent.ACTION_VIEW);
             smsIntent.setType("vnd.android-dir/mms-sms");
             smsIntent.putExtra("address","03022598866");
             smsIntent.putExtra("sms_body","Hi Hajra");
             startActivity(smsIntent);

         }
     });

    }
}
