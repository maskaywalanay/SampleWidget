package illegaller.aida.dev.art.hswidget;
import android.appwidget.*;
import android.content.*;
import android.app.*;
import android.widget.*;

public class ContohWidgetHomeScreen extends AppWidgetProvider
{

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds)
    {
        // TODO: Implement this method
        for(int appwidgetId : appWidgetIds){
            
            Intent intent = new Intent(context,MainActivity.class);
            
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
            
            RemoteViews views = new RemoteViews (context.getPackageName(), R.layout.widget_home_screen);
            views.setOnClickPendingIntent(R.id.widget_button,pendingIntent);
            
            appWidgetManager.updateAppWidget(appwidgetId, views);
        }
        
        
    }
    
    
    
}
