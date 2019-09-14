package com.droidpe.init.conocehuaycan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.droidpe.init.conocehuaycan.R;
import com.droidpe.init.conocehuaycan.model.Lugar;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

public class LugarAdapter extends RecyclerView.Adapter<LugarAdapter.MyViewHolder> {

    private List<Lugar> lugar;

    public LugarAdapter(List<Lugar> mData) {
        lugar = mData;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView giroNegocio;
        TextView nombreLugar;
        RatingBar estrellas;
        public MyViewHolder(View  view) {
            super(view);
            giroNegocio = view.findViewById(R.id.txt_giro_negocio);
            nombreLugar = view.findViewById(R.id.txt_nombre_lugar);
            estrellas = view.findViewById(R.id.rb_count);
        }
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_restaurantes, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String giroComercial = lugar.get(position).getGiroComercial();
        holder.giroNegocio.setText(giroComercial);

        String nombreLugar = lugar.get(position).getNombre();
        holder.nombreLugar.setText(nombreLugar);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getItemCount() {
        return lugar.size();
    }

}
