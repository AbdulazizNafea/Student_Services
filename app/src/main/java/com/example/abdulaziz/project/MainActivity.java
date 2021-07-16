package com.example.abdulaziz.project;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);



        //الخدمات الذاتية
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this ,servicepage.class);
                startActivity(intent);
            }
        });

        //رايات
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.tvtc.gov.sa/Arabic/Departments/FacultyCouncils/Rayat/Pages/Index.html"));
                startActivity(intent);
            }
        });

        //الكلية التقنية
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.tvtc.gov.sa/Arabic/trainingunits/collegesofTechnology/mct/Pages/default.aspx"));
                startActivity(intent);
            }
        });
        //البلاك بورد
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://lms.elearning.edu.sa/webapps/login/"));
                startActivity(intent);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(MainActivity.this ,aboutCollege_page.class);
                startActivity(intent);
            }
        });

        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://twitter.com/MCT_TVTC?ref_src=twsrc%5Etfw%7Ctwcamp%5Eembeddedtimeline%7Ctwterm%5Eprofile%3AMCT_TVTC&ref_url=http%3A%2F%2Fwww.tvtc.gov.sa%2FArabic%2FTrainingUnits%2FCollegesOfTechnology%2Fmct%2FPages%2Fdefault.aspx\n"));
                startActivity(intent);
            }
        });




    }


}
