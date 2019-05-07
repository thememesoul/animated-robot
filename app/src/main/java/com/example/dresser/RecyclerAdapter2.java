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


public class RecyclerAdapter2 extends android.support.v7.widget.RecyclerView.Adapter<RecyclerAdapter2.ViewHolder> {
    private String[] titles = {"McLeodGanj", "Manikaran", "Spiti Valley"};


    private String[] detail ={"Embark on for this Triund and Mcleoganj trek which is for 3 days and 2 nights to enjoy the rejuvenating sights of the Himalayas in a closer shot. Price : Double Sharing : INR 6499 Triple/Quad Sharing : INR 5999 (Per Person)",
            "Embark on this delightful trekking to Kheerganga that enables you to explore the real beauty of Kheerganga. Camp for the night basking in the serenity of the surrounding mountains and gorges. Price : Double Sharing : INR 4499 Triple/Quad Sharing : INR 3999 (Per Person)",
            "Marked with the beauty of lush green hills and valleys, Kasol is a paradise of earth. The town attracts thousands of tourists from all over the world to undertake multiple treks, taste local cuisine and enjoy some calmness. Price : Double Sharing : INR 4499 Triple/Quad Sharing : INR 3999 (Per Person)"};

    private int[] images = {R.drawable.mcleod, R.drawable.kasol, R.drawable.spiti};

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







