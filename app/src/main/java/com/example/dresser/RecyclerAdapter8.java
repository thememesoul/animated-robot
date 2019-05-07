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


public class RecyclerAdapter8 extends android.support.v7.widget.RecyclerView.Adapter<RecyclerAdapter8.ViewHolder> {
    private String[] titles = {"TUNGNATH","NANDADEVI", "RISHIKESH", "MUSSOORIE"};


    private String[] detail ={"Tungnath is the one of the highest Shiva temple located at second highest altitude in the world which lies in India. Tungnath is the highest of the five Panch Kedar temples located in the mountain range of Tunganath in Rudraprayag district, in the Indian state of Uttarakhand. Price : Double Sharing : INR 4499 Triple/Quad Sharing : INR 3999 (Per Person)",
            "Nanda Devi is the second highest mountain in India, and the highest located entirely within the country. It is the 23rd-highest peak in the world. It was considered the highest mountain in the world before computations in 1808 proved Dhaulagiri to be higher. Price : Double Sharing : INR 5499 Triple/Quad Sharing : INR 4999 (Per Person)",
            "Rishikesh is a city in India’s northern state of Uttarakhand, in the Himalayan foothills beside the Ganges River. The river is considered holy, and the city is renowned as a center for studying yoga and meditation. Temples and ashrams (centers for spiritual studies) line the eastern bank around Swarg Ashram, a traffic-free, alcohol-free and vegetarian enclave upstream from Rishikesh town. Price : Double Sharing : INR 4499 Triple/Quad Sharing : INR 3999 (Per Person)",
            "Mussoorie is a hill station and a municipal board in the Dehradun District of the Indian state of Uttarakhand. It is about 35 kilometres from the state capital of Dehradun and 290 km north of the national capital of New Delhi. The hill station is in the foothills of the Garhwal Himalayan range. The adjoining town of Landour, which includes a military cantonment, is considered part of 'greater Mussoorie', as are the townships of Barlowganj and Jharipani. Price : Double Sharing : INR 4499 Triple/Quad Sharing : INR 3999 (Per Person)"};

    private int[] images = {R.drawable.tungnath, R.drawable.nanda, R.drawable.rishikesh,R.drawable.mussoorie};

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


