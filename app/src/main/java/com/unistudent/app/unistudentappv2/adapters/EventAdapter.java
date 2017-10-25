package com.unistudent.app.unistudentappv2.adapters;

/**
 * Created by user on 18/10/2017.
 */

import android.graphics.Bitmap;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.unistudent.app.unistudentappv2.R;

import java.util.List;

import com.unistudent.app.unistudentappv2.models.Event;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {
    private List<Event> eventList;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView ivImage;
        public TextView tvNama;
        public TextView tvTanggal;
        public CardView cvEventList;


        public ViewHolder(View v){
            super(v);
            ivImage = (ImageView) v.findViewById(R.id.image_event);
            tvNama = (TextView) v.findViewById(R.id.nama_event);
            tvTanggal = (TextView) v.findViewById(R.id.tanggal_event);
            cvEventList = (CardView) v.findViewById(R.id.card_view_event);
        }
    }

    public EventAdapter (List<Event> eventList){this.eventList = eventList;}

    public EventAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_card, parent, false);
        EventAdapter.ViewHolder vh = new EventAdapter.ViewHolder(v);
        return vh;
    }

    public void onBindViewHolder(EventAdapter.ViewHolder holder, int position){
        Event event = this.eventList.get(position);
        holder.tvNama.setText(event.getName());
        holder.tvTanggal.setText(event.getDate().toString());
        //holder.ivImage.setImage
        holder.cvEventList.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // eventListClicked
            }
        });
    }

    public int getItemCount(){return eventList.size();}
}