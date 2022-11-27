package com.example.a2440032801_uts;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private ListData[] listData;

    public ListAdapter(ListData[] listData) {
        this.listData = listData;
    }

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemList = inflater.inflate(R.layout.item_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemList);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        final ListData list = listData[position];
        holder.itemTxtView.setText(listData[position].getName());
        holder.itemImgView.setImageResource(listData[position].getImageId());
        
        holder.itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Name: " + list.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        
        holder.callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Calling: " + list.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView itemImgView;
        public TextView itemTxtView;
        public RelativeLayout itemLayout;
        public Button callBtn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemImgView = itemView.findViewById(R.id.itemImgView);
            this.itemTxtView = itemView.findViewById(R.id.itemTextView);
            this.callBtn = itemView.findViewById(R.id.callBtn);
            itemLayout = itemView.findViewById(R.id.itemLayout);
        }
    }
}
