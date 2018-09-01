package idn.dicoding.egit.myservice;

import android.annotation.SuppressLint;
import android.app.Service;
import android.os.AsyncTask;
import android.util.Log;


public class ProcessAsync extends AsyncTask<Void, Void, Void> {

    @SuppressLint("StaticFieldLeak")
    private Service mService;
    private String ORIGIN_SERVICE = null;


    ProcessAsync(Service s, String origin_service){
        mService = s;
        this.ORIGIN_SERVICE = origin_service;
    }

    @Override
    protected Void doInBackground(Void... params) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Log.d(ORIGIN_SERVICE, "StopService");
        mService.stopSelf();
    }
}
