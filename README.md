# Installed-App-List
[![API](https://img.shields.io/badge/API-19%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=19)

This is a method that returns installed app's package names, labels and icons on Android devices. This would be suitable with list view, grid view and recycler view.

## Overview

<p align = "center">
  <img src="https://user-images.githubusercontent.com/59742125/91056577-28f2c080-e5f4-11ea-8234-62b808f76115.gif"/>
</p>

## Setup
```gradle
implementation 'com.pythontaro.installed-app-list:installed-app-list:1.0.0'
```

## Usage

```java
@Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        InstalledAppList installedAppList = new InstalledAppList(mContext);
        holder.appIcon.setImageDrawable(installedAppList.getInstalledApps().get(position).appIcon);
        holder.appLabel.setText(installedAppList.getInstalledApps().get(position).appLabel);
        holder.appPackageName.setText(installedAppList.getInstalledApps().get(position).packageName);
    }
```
In sample, using this method in Adapter class that extends RecyclerView.Adapter<Adapter.ViewHolder>.
Source code available in sample directory.

## License
Apache License 2.0
