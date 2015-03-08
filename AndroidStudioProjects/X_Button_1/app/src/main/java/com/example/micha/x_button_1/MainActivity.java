package com.example.micha.x_button_1;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

import java.io.IOException;

/*public class Urler extends AsyncTask <HttpGet, Void, Void>   //???
{
    HttpClient httpClient;
    TextView textView;

    @Override
    protected Void doInBackground(HttpGet... params) {
        try
        {
            HttpGet httpGet1 = new HttpGet("http://www.canihazip/s");
            HttpResponse response = httpClient.execute(httpGet1);
            HttpEntity entity = response.getEntity();
            String str = entity.toString();
            textView.setText(str);
        }
        catch (ClientProtocolException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
        }
        return null;
    }
}*/

public class MainActivity extends ActionBarActivity {

    private int timesClicked = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonOnClickHandler(View v)
    {
        Button myButton = (Button) v;
        myButton.setText("Button Kliknięty!");
        this.timesClicked++;

        if(this.timesClicked == 2)
        {
           /* int textViewId = R.id.textView;
            TextView myTextView = (TextView) findViewById(textViewId);
            myTextView.setText("Brawo za klik na button!");

            HttpClient httpClient = new DefaultHttpClient();
            HttpGet httpGet = new HttpGet("http://www.canihazip/s");
*/


            //Urler urler = new Urler();
            //urler.textView = (TextView) findViewById(R.id.textView);
            //urler.doInBackground();
        }
    }
    public void buttonOnClickHandler2(View v)
    {
        int textViewId = R.id.textView;
        TextView myTextView = (TextView) findViewById(textViewId);
        Urler u = new Urler(myTextView);
        u.execute(myTextView);
    }
}
