package com.example.abdulaziz.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class card_issuance extends AppCompatActivity
{

    EditText t_name,t_id,t_idcollge,t_phone,t_mail,t_massge ;
    Button btn1;
    RadioButton r1_1,r1_2,r1_3;
    String r1,r2,r3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_issuance);
//----------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------
        t_name = findViewById(R.id.t_name);
        t_id =findViewById(R.id.t_id);
        t_idcollge = findViewById(R.id.t_idcollge);
        t_phone = findViewById(R.id.t_phone);
        t_mail = findViewById(R.id.t_mail);
        t_massge = findViewById(R.id.t_massge);
        r1_1 = findViewById(R.id.r1_1);
        r1_2 = findViewById(R.id.r1_2);
        r1_3 = findViewById(R.id.r1_3);

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

                if (t_name.getText().toString().equals("") || t_name.getText().toString().length()<=7 )
                {
                    t_name.setError("قم بكتابة اسمك");
                }
                else if (t_id.getText().toString().equals("")||t_id.getText().toString().length()<=9)
                {
                    t_id.setError("قم بكتابة رقم الهوية بشكل صحيح");
                }
                else if (t_idcollge.getText().toString().equals("") || t_idcollge.getText().toString().length()<=7)
                {
                    t_idcollge.setError("قم بكتابة رقمك الآكاديمي شكل صحيح");
                }
                else if (t_phone.getText().toString().equals("") || t_phone.getText().toString().length()<=9)
                {
                    t_phone.setError("قم بكتابة رقم الجوال");
                }
                else if (t_mail.getText().toString().equals("") || t_mail.getText().toString().length()<=3)
                {
                    t_mail.setError("قم بكتابة بريدك الإلكتروني");
                }
                else if (t_massge.getText().toString().equals("") || t_massge.getText().toString().length()<=10)
                {
                    t_massge.setError("قم بكتابة الأسباب");
                }
                else
                {
                    if (r1_1.isChecked() || r1_2.isChecked() || r1_3.isChecked())
                    {
                        radio_button();
                        String[] to = {"matar.na77@gmail.com"};
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_EMAIL, to);
                        intent.putExtra(Intent.EXTRA_SUBJECT, "طلب اصدار بطاقة صراف");
                        intent.putExtra(Intent.EXTRA_TEXT, "الاسم: " + name + "\n رقم الهوية: " + id + "\n الرقم الاكاديمي: " + idcollge + "\n الجوال: " + phone + "\n البريد الالكتروني: " + mail + "\n\n نوع المشكلة :-  \n"+r1+"\n \n وصف الممشكلة :-\n " + messge + "");
                        intent.setType("message/rfc822");
                        startActivity(Intent.createChooser(intent, "من فضلك قم بإختيار تطبيق البريد الالكتروني 'Gmail'"));
                    }
                    else
                    {
                        Toast.makeText(card_issuance.this, "حدد المشكلة التي تواجهك", Toast.LENGTH_LONG).show();

                    }
                }
            }
        });
    }

    public void radio_button()
    {
        if (r1_1.isChecked())
        {
            r1 = "تم سحب البطاقة";
        }
        else if (r1_2.isChecked())
        {
            r1 = "البطاقة منتهية";
        }
        else if (r1_3.isChecked())
        {
            r1 = "البطاقة مفقودة";
        }
    }
}
