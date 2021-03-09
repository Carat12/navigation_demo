package com.example.navigationcomp

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews
import androidx.core.os.bundleOf
import androidx.navigation.NavDeepLinkBuilder

class DeepLinkAppWidgetProvider: AppWidgetProvider() {

    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager?,
        appWidgetIds: IntArray?
    ) {
        val remoteView = RemoteViews(context.packageName, R.layout.deep_link_appwidget)

        //construct a pending intent
        val intent = NavDeepLinkBuilder(context)
            .setGraph(R.navigation.nav_graph)
            .setDestination(R.id.deep_link_dest)
            .setArguments(bundleOf("deepLinkArg" to "From Widget!"))
            .createPendingIntent()

        remoteView.setOnClickPendingIntent(R.id.btn_deep_link, intent)
        appWidgetManager?.updateAppWidget(appWidgetIds, remoteView)
    }
}