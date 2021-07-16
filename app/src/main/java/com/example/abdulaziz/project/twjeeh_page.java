package com.example.abdulaziz.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class twjeeh_page extends AppCompatActivity
{
    EditText t_name,t_id,t_idcollge,t_phone,t_mail,t_massge,t_title;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twjeeh_page);

//----------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------
        t_name = findViewById(R.id.t_name);
        t_id =findViewById(R.id.t_id);
        t_idcollge = findViewById(R.id.t_idcollge);
        t_phone = findViewById(R.id.t_phone);
        t_mail = findViewById(R.id.t_mail);
        t_massge = findViewById(R.id.t_massge);
        t_title = findViewById(R.id.t_title);



//----------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String name = t_name.getText().toString();
                String id = t_id.getText().toString();
                String idcollge = t_idcollge.getText().toString();
                String phone = t_phone.getText().toString();
                String mail = t_mail.getText().toString();
                String messge = t_massge.getText().toString();
                String title = t_title.getText().toString();


                if(t_name.getText().toString().equals(""))
                {
                    t_name.setError("قم بكتابة اسمك");
                }
                else if (t_id.getText().toString().equals("")|| t_id.getText().length()<=10)
                {
                    t_id.setError("قم بكتابة رقم الهوية بشكل صحيح");
                }
                else if (t_idcollge.getText().toString().equals("") || t_idcollge.getText().length()<=9)
                {
                    t_idcollge.setError("قم بكتابة رقمك الآكاديمي شكل صحيح");
                }
                else if (t_phone.getText().toString().equals(""))
                {
                    t_phone.setError("قم بكتابة رقم الجوال");

                }
                else if (t_mail.getText().toString().equals(""))
                {
                    t_mail.setError("قم بكتابة بريدك الإلكتروني");
                }
                else if (t_massge.getText().toString().equals(""))
                {
                    t_massge.setError("قم بكتابة الأسباب");
                }
                else if (t_title.getText().toString().equals(""))
                {
                    t_title.setError("قم عنوان الرسالة");
                }
                else
                {
                    String[] to = {"matar.na77@gmail.com"};
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.putExtra(Intent.EXTRA_EMAIL, to);
                    intent.putExtra(Intent.EXTRA_SUBJECT, "استفسار عن : "+title);
                    intent.putExtra(Intent.EXTRA_TEXT, "الاسم: " + name + "\n رقم الهوية: " + id + "\n الرقم الاكاديمي: " + idcollge + "\n الجوال: " + phone + "\n البريد الالكتروني: " + mail + "\n \n \n " + messge + "");
                    intent.setType("message/rfc822");
                    startActivity(Intent.createChooser(intent, "من فضلك قم بإختيار تطبيق البريد الالكتروني 'Gmail'"));
                }

            }
        });



    }



}

