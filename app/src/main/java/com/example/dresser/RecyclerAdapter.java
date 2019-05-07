package com.example.dresser;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.view.LayoutInflater;
import android.widget.TextView;

class RecyclerAdapter extends android.support.v7.widget.RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private String[] titles = {"HIMACHAL PRADESH","PUNJAB","UTTAR PRADESH","RAJASTHAN","KERELA","KASHMIR","UTTRAKHAND"};


    private int[] images = { R.drawable.ladakh, R.drawable.golden, R.drawable.taj,R.drawable.rajasthan, R.drawable.kerela, R.drawable.kasol,R.drawable.uttrakhand};


    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView itemImage;
        public TextView itemTitle;


        public ViewHolder(final View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();


                    if(position==0)

                        v.getContext().startActivity(new Intent(v.getContext(), Redirector.class));
                    if(position==1)
                    {
                        v.getContext().startActivity(new Intent(v.getContext(), Redirector2.class));
                    }
                    if(position==2)
                    {
                        v.getContext().startActivity(new Intent(v.getContext(), Redirector3.class));
                    } if(position==3)
                    {
                        v.getContext().startActivity(new Intent(v.getContext(), Redirector4.class));
                    } if(position==4)
                    {
                        v.getContext().startActivity(new Intent(v.getContext(), Redirector5.class));
                    } if(position==5)
                    {
                        v.getContext().startActivity(new Intent(v.getContext(), Redirector6.class));
                    } if(position==6)
                    {
                        v.getContext().startActivity(new Intent(v.getContext(), Redirector7.class));
                    }
                    else
                    {
                        Snackbar.make(v, "Click detected on item " + position,
                                Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }
                }


            });
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
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}


