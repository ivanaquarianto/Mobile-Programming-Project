package com.example.ezyfoodyproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewHolder> {
    Context context;
    ArrayList<ShowProduct> stockList;

    public ViewAdapter(Context context, ArrayList<ShowProduct> stockList){
        this.context = context;
        this.stockList = stockList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType){
        View view = LayoutInflater.from(context).inflate(R.layout.drinks_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        ShowProduct showProduct = stockList.get(position);
        holder.drinksPictures.setImageResource(showProduct.getPicture());
        holder.drinksName.setText(showProduct.getName());
        holder.drinksPrice.setText(showProduct.getPriceToString());
    }

    @Override
    public  int getItemCount(){
        return  stockList.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{
        private ImageView drinksPictures;
        private TextView drinksName;
        private TextView drinksPrice;

        public ViewHolder (@NonNull View itemView){
            super(itemView);
            drinksPictures = itemView.findViewById(R.id.drinksPicture);
            drinksName = itemView.findViewById(R.id.drinksName);
            drinksPrice = itemView.findViewById(R.id.drinksPrice);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view){
            int position = getAdapterPosition();
            ShowProduct showProduct = stockList.get(position);

            String info = "" + showProduct.getName() + "Is Added To Order\nRp."+ showProduct.getPriceToString();
            Toast.makeText(context,info,Toast.LENGTH_LONG).show();
        }

    }


}
