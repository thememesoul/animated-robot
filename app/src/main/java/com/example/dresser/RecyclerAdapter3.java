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


public class RecyclerAdapter3 extends android.support.v7.widget.RecyclerView.Adapter<RecyclerAdapter3.ViewHolder> {
    private String[] titles = {"Golden Temple", "Wagha Border", "Chandigarh/Mohali"};


    private String[] detail ={"Gain a deeper understanding of Punjabi culture and Sikh religious history during this two-day Amritsar and Golden Temple Tour from Delhi. Start your trip to Amritsar from Delhi by getting picked up from your house or from Connaught place in an air conditioned cab. Price : Double Sharing : INR 2499 Triple/Quad Sharing : INR 1999 (Per Person)",
            "Located at a distance of 22 km from Lahore and 28 km from Amritsar, Wagah Border marks the boundaries between Indian and Pakistani borders.very evening, just before the sunset, the soldiers from the Indian and Pakistan military meet at this border post to engage in a 30-minute display of military camaraderie and showmanship. Price : Double Sharing : INR 1999 Triple/Quad Sharing : INR 1499 (Per Person)",
            "Chandigarh, the capital of the northern Indian states of Punjab and Haryana, was designed by the Swiss-French modernist architect, Le Corbusier. The nearby Rock Garden is a park featuring sculptures made of stones, recycled ceramics and industrial relics. Price : Double Sharing : INR 2499 Triple/Quad Sharing : INR 2999 (Per Person)"};

    private int[] images = {R.drawable.golden, R.drawable.wagha, R.drawable.chandigarh};

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







