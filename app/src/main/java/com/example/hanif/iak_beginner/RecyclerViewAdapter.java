package com.example.hanif.iak_beginner;

import android.content.Intent;
import android.media.Image;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HANIF on 03/02/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerviewViewHolder>{

    private List<NewsPojo> list;

    public RecyclerViewAdapter(List<NewsPojo> newList) {
        this.list = newList;
    }

    @Override
    public RecyclerviewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerviewViewHolder(
                LayoutInflater.from(parent.getContext())
                .inflate(
                        R.layout.row_list_recyclerview,parent,false)
        );
    }

    @Override
    public void onBindViewHolder(RecyclerviewViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    public void setData(List<NewsPojo> list){
        Log.d("Recylerview", "setData: "+list.get(1).getLink_gambar()+", "+list.get(1).getTitle());

        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyclerviewViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv_image;
        private TextView tv_title;

        public RecyclerviewViewHolder(View itemView) {
            super(itemView);
            iv_image = itemView.findViewById(R.id.iv_image);
            tv_title = itemView.findViewById(R.id.tv_tittle);
        }

        public void bind(final NewsPojo newsPojo) {
            tv_title.setText(newsPojo.getTitle());

            Picasso.with(itemView.getContext())
                    .load(newsPojo.getLink_gambar())
                    .into(iv_image);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(),DetailActivity.class);
                    intent.putExtra(DetailActivity.INTENT_DETAIL,newsPojo.getDetail());
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }

}
