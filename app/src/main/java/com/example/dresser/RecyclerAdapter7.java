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


public class RecyclerAdapter7 extends android.support.v7.widget.RecyclerView.Adapter<RecyclerAdapter7.ViewHolder> {
    private String[] titles = {"SRINAGAR", "GULMARG", "LEH"};


    private String[] detail ={"Srinagar is undoubtedly one of the most beautiful and famous places to visit in Kashmir as well as in India. From boating to trekking, bird watching to water skiing, Srinagar place has it all. Locally this place is known as the mirror to the mountains, Srinagar is a first stopover for every traveler and there are a long list of places to visit in Srinagar. Price : Double Sharing : INR 5499 Triple/Quad Sharing : INR 4999 (Per Person)",
            "Famously known as the ‘Meadow of Flowers’, Gulmarg is a treat to the eyes with its spread of vibrant flowers against snow capped mountains as backgrounds. This region of Kashmir is also known as the adventurer’s paradise because of its vast options of skiing in the snow while enjoying the views around. Price : Double Sharing : INR 4499 Triple/Quad Sharing : INR 3999 (Per Person)",
            "Leh is one of the best and safe places to visit in Kashmir in summers. The lofty mountains, the alpine lakes, and the quaint settings enable Leh one of the best places to visit. This place is every biker’s dreamland. Clad in the beauty and love of nature, Leh offers breathtaking views, leaving no visitor disappointed. Price : Double Sharing : INR 4499 Triple/Quad Sharing : INR 3999 (Per Person)"};

    private int[] images = {R.drawable.srinagar, R.drawable.gulmarg, R.drawable.leh};

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


