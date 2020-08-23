/*
Title: InstalledAppList Library
Author: Kazuma Naka
Date: August 23, 2020
Code Version: 1.0.0
Availability: https://github.com/KazumaProject/InstalledAppList.git
*/

package com.pythontaro.library;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

import java.util.ArrayList;
import java.util.List;

public class InstalledAppList {

    private Context mContext;

    public InstalledAppList(Context context) {
        this.mContext = context;
    }

    public List<AppDetails> getInstalledApps(){
        PackageManager packageManager = mContext.getPackageManager();
        List<AppDetails> appDetailsList = new ArrayList<>();

        Intent intent = new Intent(Intent.ACTION_MAIN,null);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);

        List<ResolveInfo> availableActivities = packageManager.queryIntentActivities(intent,0);

        for (ResolveInfo resolveInfo : availableActivities){
            AppDetails app = new AppDetails();
            app.appLabel = (String) resolveInfo.loadLabel(packageManager);
            app.packageName = resolveInfo.activityInfo.packageName;
            app.appIcon = resolveInfo.activityInfo.loadIcon(packageManager);
            appDetailsList.add(app);
        }
        return appDetailsList;
    }
}
