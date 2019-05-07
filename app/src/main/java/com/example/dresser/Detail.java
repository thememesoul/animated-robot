package com.example.dresser;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    TextView e1,e2;
    ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Bundle bundle=this.getIntent().getExtras();
        int productImage=bundle.getInt("product_image");
        String productName=bundle.getString("product_name");
        String productDetail=bundle.getString("product_detail");


        e1 = findViewById(R.id.productName);
        e2 = findViewById(R.id.productDetail);

        imageView =findViewById(R.id.imageView);

       e1.setText(productName);
       e2.setText(productDetail);
       imageView.setImageResource(productImage);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:9460012866"));
                startActivity(callIntent);
            }
        });

    }
}
