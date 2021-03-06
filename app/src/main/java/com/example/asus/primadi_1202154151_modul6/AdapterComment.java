package com.example.asus.primadi_1202154151_modul6;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AdapterComment extends  RecyclerView.Adapter<AdapterComment.CommentHolder>{
    Context con;
    List<DBcomment> list;
    //Constructor adapter
    public AdapterComment(Context con, List<DBcomment> list) {
        this.con = con;
        this.list = list;
    }
    @Override
    public CommentHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            //mengembalikan CommentHolder dengan parameter LayoutInflater dari layout rec_comment, ViewGroup, ViewType false
            return new CommentHolder(LayoutInflater.from(con).inflate(R.layout.item_comment, parent, false));
    }
    //Mengikat nilai dari list dengan view
    @Override
    public void onBindViewHolder(CommentHolder holder, int position) {
            //get position dari list pada DBcomment class
            DBcomment cur = list.get(position);
            //holder yang didapat dengan getter dari DBcomment
            holder.user.setText(cur.getUserKomentar());
            holder.komentar.setText(cur.getIsiKomentar());
    }


    @Override
    public int getItemCount() {
        //mengembalikan ukuran list
        return list.size();
    }
    //Subclass sebagai viewholder
    class CommentHolder extends RecyclerView.ViewHolder{
        //deklarasi variable TextView
        TextView user, komentar;
        public CommentHolder(View itemView) {
            super(itemView);
            //itemView dengan findView
            user = itemView.findViewById(R.id.comment_author);
            komentar = itemView.findViewById(R.id.comment_form);
        }
    }
}
