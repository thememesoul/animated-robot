package com.example.dresser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class About extends AppCompatActivity {
    Button call,msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        call=findViewById(R.id.callBtn);
        msg=findViewById(R.id.msgBtn);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:9460012866"));
                startActivity(callIntent);

            }
        });

        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent message = new Intent(Intent.ACTION_SENDTO,Uri.parse("sms:9460012866"));
                startActivity(message);

            }
        });
    }
}

