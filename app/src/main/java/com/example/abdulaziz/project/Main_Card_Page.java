package com.example.abdulaziz.project;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_Card_Page extends AppCompatActivity
{

    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__card__page);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);


        //مشاكل البطاقة
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Main_Card_Page.this ,card_problems.class);
                startActivity(intent);
            }
        });

        //طلب اصدار بطاقة
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Main_Card_Page.this ,card_issuance.class);
                startActivity(intent);
            }
        });

        //اعادة تعيين كلمة السر
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Main_Card_Page.this ,card_rest_password.class);
                startActivity(intent);
            }
        });
        //استعلام عن المكافاة
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Main_Card_Page.this ,card_reward.class);
                startActivity(intent);

            }
        });

        //عن البطاقة
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://lms.elearning.edu.sa/webapps/login/"));
                startActivity(intent);

            }
        });
    }
}
