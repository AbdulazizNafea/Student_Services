package com.example.abdulaziz.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class servicepage extends AppCompatActivity
{

    Button bt1,bt2,bt3,bt4,bt6,bt7,b5,bt9,bt8;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicepage);

//-----------------------------------------------------------
//-----------------------------------------------------------

        b5=findViewById(R.id.b5);

        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        bt4=findViewById(R.id.bt4);
        bt6=findViewById(R.id.bt6);
        bt7=findViewById(R.id.bt7);
        bt8=findViewById(R.id.bt8);
        bt9=findViewById(R.id.bt9);



        bt1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(servicepage.this ,myclasspage.class);
                startActivity(intent);
            }
        });


        bt2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(servicepage.this ,Main_Card_Page.class);
                startActivity(intent);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(servicepage.this ,twjeeh_page.class);
                startActivity(intent);
            }
        });



        bt4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(servicepage.this ,shqpage.class);
                startActivity(intent);
            }
        });

        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(servicepage.this ,deletepage.class);
                startActivity(intent);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(servicepage.this ,changepage.class);
                startActivity(intent);
            }
        });

        bt8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(servicepage.this ,blackbord_page.class);
                startActivity(intent);
            }
        });



    }
}
