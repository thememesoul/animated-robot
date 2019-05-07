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


public class RecyclerAdapter4 extends android.support.v7.widget.RecyclerView.Adapter<RecyclerAdapter4.ViewHolder> {
    private String[] titles = {"TAJ MAHAL", "LUCKNOW", "MATHURA", "VARANASI"};


    private String[] detail ={"Widely considered to be one of the most beautiful buildings in the world and certainly one of India’s most famous landmarks, the Taj Mahal is a living testament to the grandiose and the romantic. Lovingly built from white marble by Mughal Emperor Shah Jahan in memory of his favorite wife. Price : Double Sharing : INR 2499 Triple/Quad Sharing : INR 1999 (Per Person)",
            "Lucknow was the epicentre of the 1857 War of Independence, and much before that, it was the seat of a line of nawabs who gave the city its unique identity. Literature, cuisine, performing arts and tehzeeb put Lucknow a cut above the rest – and the world acknowledges it. Price : Double Sharing : INR 3499 Triple/Quad Sharing : INR 2999 (Per Person)",
            "A visit to this legendary city will be among the most moving trips you'll ever make.Varanasi is believed to be the greatest tirth (pilgrimage) between earth and heaven. For a Hindu, to visit Varanasi and bathe in the water of Ganga, is to be cleansed of the sins of thousands of past rebirths. Price : Double Sharing : INR 4499 Triple/Quad Sharing : INR 3999 (Per Person)",
            "Just an hour’s drive from Agra, on the banks of the river Yamuna, is situated the birthplace of Lord Krishna. The entire land is dotted with magnificent temples, dedicated to various aspects of his life. The twin cities of Mathura and Vrindavan, where he was born and where he grew up, still resound to the sound of his laughter, antics and his magical flute. Price : Double Sharing : INR 4499 Triple/Quad Sharing : INR 3999 (Per Person)"};

    private int[] images = {R.drawable.taj, R.drawable.lucknow, R.drawable.varanasi,R.drawable.mathura};

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







