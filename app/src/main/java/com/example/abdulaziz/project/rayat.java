package com.example.abdulaziz.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/*import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;*/

public class rayat extends AppCompatActivity
 {
  //  WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
      // Button bt1,bt2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rayat);

        /*
        browser=findViewById(R.id.brwser);

        browser.setWebViewClient(new MyBroswe());
        browser.getSettings().setLoadsImagesAutomatically(true);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        browser.loadUrl("https://www.tvtc.gov.sa/Arabic/Departments/FacultyCouncils/Rayat/Pages/Index.html");

        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                browser.goBack();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                browser.goForward();
            }
        });
*/

    }

   /* private class MyBroswe extends WebViewClient
    {
        public boolean ShouldOvrRide(WebView view,String url)
        {
            view.loadUrl(url);
            return true;
        }
    }
    */

 }
