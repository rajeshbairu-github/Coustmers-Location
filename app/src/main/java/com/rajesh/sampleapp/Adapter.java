package com.rajesh.sampleapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONException;
import org.json.JSONObject;

import java.net.ConnectException;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<UserData> data;
    Context context;

    public Adapter (Context context,List<UserData> data){
        this.context=context;
        this.data = data;
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rowItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_layout, parent, false);
        return new ViewHolder(rowItem);
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {

        UserData userData=data.get(position);

       holder.tv_name.setText(userData.getName());
       holder.tv_username.setText(userData.getUsername());
       holder.tv_email.setText(userData.getEmail());

        Address address= userData.getAddress();

        holder.tv_street.setText(address.getStreet());
        holder.tv_city.setText(address.getCity());
        holder.tv_zipcode.setText(address.getZipcode());


    }

    @Override
    public int getItemCount() {
        return this.data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView tv_name,tv_username,tv_email,tv_address,tv_street,tv_city,tv_zipcode;

        public ViewHolder(View view) {
            super(view);

            tv_name=view.findViewById(R.id.name);
            tv_username=view.findViewById(R.id.username);
            tv_email=view.findViewById(R.id.email);
            tv_address=view.findViewById(R.id.address);
            tv_street=view.findViewById(R.id.street);
            tv_city=view.findViewById(R.id.city);
            tv_zipcode=view.findViewById(R.id.zipcode);

        }


    }
}
