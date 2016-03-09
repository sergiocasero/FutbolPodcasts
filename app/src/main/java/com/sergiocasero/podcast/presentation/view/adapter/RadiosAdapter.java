package com.sergiocasero.podcast.presentation.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sergiocasero.podcast.R;
import com.sergiocasero.podcast.domain.model.Radio;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by sergiocasero on 1/3/16.
 */
public class RadiosAdapter extends RecyclerView.Adapter<RadiosAdapter.RadioViewHolder> {

    private List<Radio> items;

    public RadiosAdapter() {
        items = new ArrayList<>();
    }

    public void setItems(List<Radio> items) {
        this.items = items;
        notifyDataSetChanged();
    }

    @Override
    public RadioViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.radio, parent, false);
        return new RadioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RadioViewHolder holder, int position) {
        holder.bind(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class RadioViewHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.name)
        TextView name;

        @Bind(R.id.logo)
        ImageView logo;

        @Bind(R.id.url)
        TextView url;

        View itemView;

        public RadioViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            ButterKnife.bind(this, itemView);
        }

        public void bind(Radio radio) {
            name.setText(radio.getName());
            url.setText(radio.getUrl());

            Picasso.with(itemView.getContext())
                    .load(radio.getLogo())
                    .into(logo);
        }
    }
}
