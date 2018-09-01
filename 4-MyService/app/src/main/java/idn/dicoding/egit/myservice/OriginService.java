package idn.dicoding.egit.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class OriginService extends Service {
    public static final String ORIGIN_SERVICE = "OriginService";

    public OriginService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(ORIGIN_SERVICE, "OriginService dijalankan");

        ProcessAsync mProcessAsync = new ProcessAsync(this, ORIGIN_SERVICE);
        mProcessAsync.execute();

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(ORIGIN_SERVICE, "onDestroy()");
    }
}
