package com.example.got.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.got.R;
import com.example.got.model.Casa;
import com.example.got.model.Personagem;

import java.util.List;


public class CasasAdapter extends RecyclerView.Adapter<CasasAdapter.CasaViewHolder> {

    private List<Casa> casas;
    private int rowLayout;
    private Context context;


    public static class CasaViewHolder extends RecyclerView.ViewHolder {
        /*
        LinearLayout moviesLayout;
        TextView movieTitle;
        TextView data;
        TextView movieDescription;
        TextView rating;
        */
        LinearLayout casasLayout;
        TextView casaName;
        TextView region;
        TextView overlord;
        TextView founded;

        public CasaViewHolder(View v) {
            super(v);
            casasLayout = (LinearLayout) v.findViewById(R.id.movies_layout);
            casaName = (TextView) v.findViewById(R.id.title);
            region = (TextView) v.findViewById(R.id.subtitle);
            overlord = (TextView) v.findViewById(R.id.description);
            founded = (TextView) v.findViewById(R.id.rating);
        }
    }

    public CasasAdapter(List<Casa> casas, int rowLayout, Context context) {
        this.casas = casas;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public CasaViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new CasaViewHolder(view);
    }


    @Override
    public void onBindViewHolder(CasaViewHolder holder, final int position) {
        holder.casaName.setText(casas.get(position).getName());
        holder.region.setText(casas.get(position).getRegion());
        holder.overlord.setText((CharSequence) casas.get(position).getOverlord());
        holder.founded.setText(casas.get(position).getFounded().toString());
    }

    @Override
    public int getItemCount() {
        return casas.size();
    }
}
