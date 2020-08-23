/*
Title: RecyclerView Adapter
Author: Kazuma Naka
Date: August 23, 2020
Code Version: 1.0.0
Availability: https://github.com/KazumaProject/InstalledAppList.git
*/

package com.pythontaro.installedapplist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pythontaro.library.InstalledAppList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    private Context mContext;
    private LayoutInflater layoutInflater;
    private InstalledAppList installedAppList;

    public Adapter(Context context) {
        this.mContext = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = layoutInflater.inflate(R.layout.recycle_view_items,parent,false);
        return new ViewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        installedAppList = new InstalledAppList(mContext);
        holder.appIcon.setImageDrawable(installedAppList.getInstalledApps().get(position).appIcon);
        holder.appLabel.setText(installedAppList.getInstalledApps().get(position).appLabel);
        holder.appPackageName.setText(installedAppList.getInstalledApps().get(position).packageName);
    }

    @Override
    public int getItemCount() {
        installedAppList = new InstalledAppList(mContext);
        return installedAppList.getInstalledApps().size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView appIcon;
        TextView appLabel;
        TextView appPackageName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            appIcon = itemView.findViewById(R.id.app_icon);
            appLabel = itemView.findViewById(R.id.app_label);
            appPackageName = itemView.findViewById(R.id.app_package_name);
        }
    }
}
