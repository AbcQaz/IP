package com.example.micha.x_button_1;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;


import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * Created by Michał on 2015-03-07.
 */
public class Urler extends AsyncTask<TextView, Void, String>   //???
{
    public HttpClient httpClient;
    public TextView textView;

    @Override
    protected String doInBackground(TextView... params)
    {
        try
        {
            HttpGet httpGet1 = new HttpGet("http://www.canihazip.com/s");
            HttpResponse response = httpClient.execute(httpGet1);
            HttpEntity entity = response.getEntity();
            String str = EntityUtils.toString(entity);
            Log.i("a", str);

            return str;
        }
        catch (ClientProtocolException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s)
    {
        this.textView.setText(s);
    }

    Urler(TextView textView)
    {
        this.httpClient = new DefaultHttpClient();
        this.textView = textView;
    }
}