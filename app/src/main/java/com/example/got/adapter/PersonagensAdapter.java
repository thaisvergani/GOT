package com.example.got.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.got.R;
import com.example.got.model.Livro;
import com.example.got.model.Personagem;

import java.util.List;

public class PersonagensAdapter extends RecyclerView.Adapter<PersonagensAdapter.PersonagemViewHolder> {

    private List<Personagem> personagens;
    private int rowLayout;
    private Context context;


    public static class PersonagemViewHolder extends RecyclerView.ViewHolder {
        /*
        LinearLayout moviesLayout;
        TextView movieTitle;
        TextView data;
        TextView movieDescription;
        TextView rating;
        */
        LinearLayout livrosLayout;
        TextView personagemName;
        TextView culture;
        TextView titles;
        TextView born;

        public PersonagemViewHolder(View v) {
            super(v);
            livrosLayout = (LinearLayout) v.findViewById(R.id.movies_layout);
            personagemName = (TextView) v.findViewById(R.id.title);
            culture = (TextView) v.findViewById(R.id.subtitle);
            titles = (TextView) v.findViewById(R.id.description);
            born = (TextView) v.findViewById(R.id.rating);
        }
    }

    public PersonagensAdapter(List<Personagem> personagens, int rowLayout, Context context) {
        this.personagens = personagens;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public PersonagemViewHolder onCreateViewHolder(ViewGroup parent,
                                              int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new PersonagemViewHolder(view);
    }


    @Override
    public void onBindViewHolder(PersonagemViewHolder holder, final int position) {
        holder.personagemName.setText(personagens.get(position).getName());
        holder.culture.setText(personagens.get(position).getCulture());
        holder.titles.setText((CharSequence) personagens.get(position).getTitles());
        holder.born.setText(personagens.get(position).getBorn().toString());
    }

    @Override
    public int getItemCount() {
        return personagens.size();
    }
}

