package com.example.dresser;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class RecyclerAdapter5 extends android.support.v7.widget.RecyclerView.Adapter<RecyclerAdapter5.ViewHolder> {
    private String[] titles = {"Jaipur", "Jaisalmer", "Udaipur","MT. ABU"};


    private String[] detail ={"Explore the unexplored regions of Jaipur with this day tour to the Monkey Temple or Galta Temple and utilize this opportunity to know the wildlife of this region. After getting picked up from your hotel in the morning, start the journey, firstly to the Hindu pilgrimage site in the town of Khania Balaji that is located 10 KMs away from Jaipur. Price : Double Sharing : INR 3499 Triple/Quad Sharing : INR 2999 (Per Person)",
            "The Desert camp is placed comfortably 40 km away from the city center, in the deep golden sand dunes of Jaisalmer and offers multiple amenities and activities to welcome their guests to let them enjoy a lavish stay. This camp also organizes camel safaris to take a view of sunset and sunrise and arranges Rajasthani traditional cultural values to let you immerse in a different world. Price : Double Sharing : INR 4499 Triple/Quad Sharing : INR 3999 (Per Person)",
            " Get ready for the tour of one of the most iconic cities of Rajasthan with your family or friends. Get yourself picked up from the hotel and embark on the sightseeing of Udaipur in a comfortable car that takes you around. Price : Double Sharing : INR 4499 Triple/Quad Sharing : INR 3999 (Per Person)",
            "Explore the Bhartiya Lok Kala Mandal and Shilp Gram the most important attractions in the city. While in Mount Abu the only hill station of Rajasthan visit the Delwara Temple, Nakki Lake, Tod Rock and Sunset point. Price : Double Sharing : INR 4499 Triple/Quad Sharing : INR 3999 (Per Person)"};

    private int[] images = {R.drawable.jaipur, R.drawable.jaisalmer, R.drawable.udaipur,R.drawable.mt};

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView itemImage;
        public TextView itemTitle;
        private CardView cardView;

        public ViewHolder(final View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);

            cardView=itemView.findViewById(R.id.card_view);

        };

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {


        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {

        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemImage.setImageResource(images[i]);

        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(v.getContext(), Detail.class);
                Bundle bundle=new Bundle();
                bundle.putInt("product_image",images[i]);
                bundle.putString("product_name",titles[i]);
                bundle.putString("product_detail",detail[i]);
                intent.putExtras(bundle);
                v.getContext().startActivity(intent);
            }
        });

    }


    @Override
    public int getItemCount() {
        return titles.length;
    }
}







