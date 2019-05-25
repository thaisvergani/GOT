package com.example.got.adapter;

import android.content.Context;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.got.R;
import com.example.got.model.Livro;

import java.util.List;

public class LivrosAdapter extends RecyclerView.Adapter<LivrosAdapter.LivroViewHolder> {

    private List<Livro> livros;
    private int rowLayout;
    private Context context;


    public static class LivroViewHolder extends RecyclerView.ViewHolder {
        /*
        LinearLayout moviesLayout;
        TextView movieTitle;
        TextView data;
        TextView movieDescription;
        TextView rating;
        */
        LinearLayout livrosLayout;
        TextView livroName;
        TextView isbn;
        TextView authors;
        TextView released;

        public LivroViewHolder(View v) {
            super(v);
            livrosLayout = (LinearLayout) v.findViewById(R.id.movies_layout);
            livroName = (TextView) v.findViewById(R.id.title);
            isbn = (TextView) v.findViewById(R.id.subtitle);
            authors = (TextView) v.findViewById(R.id.description);
            released = (TextView) v.findViewById(R.id.rating);
        }
    }

    public LivrosAdapter(List<Livro> livros, int rowLayout, Context context) {
        this.livros = livros;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public LivroViewHolder onCreateViewHolder(ViewGroup parent,
                                              int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new LivroViewHolder(view);
    }


    @Override
    public void onBindViewHolder(LivroViewHolder holder, final int position) {
        holder.livroName.setText(livros.get(position).getName());
        holder.isbn.setText(livros.get(position).getIsbn());
        holder.authors.setText((CharSequence) livros.get(position).getAuthors());
        holder.released.setText(livros.get(position).getReleased().toString());
    }

    @Override
    public int getItemCount() {
        return livros.size();
    }
}
