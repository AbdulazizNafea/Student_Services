package com.example.abdulaziz.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

//---------------------------------------استعلام عن المكافأة------------------------------------
//---------------------------------------card_reward------------------------------------
//---------------------------------------استعلام عن المكافأة------------------------------------
//---------------------------------------card_reward------------------------------------


public class card_reward extends AppCompatActivity
 {
     EditText t_name,t_id,t_idcollge,t_phone,t_mail,t_massge ;
     Button btn1;
     RadioButton r1_1,r1_2,r2_1,r2_2,r3_1,r3_2,r4_1,r4_2;
     RadioGroup radio1 ,radio2,radio3,radio4;
     String r1,r2,r3,r4;

     @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_reward);

//--------------------------------------------------------
        t_name = findViewById(R.id.t_name);
        t_id =findViewById(R.id.t_id);
        t_idcollge = findViewById(R.id.t_idcollge);
        t_phone = findViewById(R.id.t_phone);
        t_mail = findViewById(R.id.t_mail);
        t_massge = findViewById(R.id.t_massge);
//--------------------------------------------------------  _1=yes ,, _2=no
        r1_1 = findViewById(R.id.r1_1);
        r1_2 = findViewById(R.id.r1_2);
        r2_1 = findViewById(R.id.r2_1);
        r2_2 = findViewById(R.id.r2_2);
        r3_1 = findViewById(R.id.r3_1);
        r3_2 = findViewById(R.id.r3_2);
        r4_1 = findViewById(R.id.r4_1);
        r4_2 = findViewById(R.id.r4_2);
//--------------------------------------------------------
    //    radio1 = findViewById(R.id.radio1);// هل معدلك اقل من 2 ؟/radio2 = findViewById(R.id.radio2);// هل تجاوزت المدة النظامية 8 فصول ؟
    //    radio3 = findViewById(R.id.radio3);// هل تم الانسحاب أو التأجيل ؟
    //    radio4 = findViewById(R.id.radio4);// هل تم الحصول على الجدول التدريبي قبل بداية الترم ؟
//--------------------------------------------------------

        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {


                if(t_name.getText().toString().equals(""))
                {
                    t_name.setError("قم بكتابة اسمك");
                }
                else if (t_id.getText().toString().equals(""))
                {
                    t_id.setError("قم بكتابة رقم الهوية بشكل صحيح");
                }
                else if (t_idcollge.getText().toString().equals(""))
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
                else
                {
                    if_statment();
                }
            }
        });


    }

    public void yes_no()
    {

            if (r1_1.isChecked()) {
                r1 = "نعم";
            }
            else if (r1_2.isChecked()) {
                r1 = "لا";
            }
            //----------------------------
            if (r2_1.isChecked()) {
                r2 = "نعم";
            } else if (r2_2.isChecked()) {
                r2 = "لا";
            }
            //------------------------------
            if (r3_1.isChecked()) {
                r3 = "نعم";
            } else if (r3_2.isChecked()) {
                r3 = "لا";
            }
            //-----------------------------
            if (r4_1.isChecked()) {
                r4 = "نعم";
            } else if (r4_2.isChecked()) {
                r4 = "لا";
            }
            //-----------------------------

        }


    public void if_statment()
    {
        String name = t_name.getText().toString();
        String id = t_id.getText().toString();
        String idcollge = t_idcollge.getText().toString();
        String phone = t_phone.getText().toString();
        String mail = t_mail.getText().toString();
        String messge = t_massge.getText().toString();


        if (r1_1.isChecked()||r1_2.isChecked())
        {
            if (r2_1.isChecked()||r2_2.isChecked())
            {
                if (r3_1.isChecked()||r3_2.isChecked())
                {
                    if (r4_1.isChecked()||r4_2.isChecked())
                    {
                        yes_no();
                        String[] to = {"matar.na77@gmail.com"};
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_EMAIL, to);
                        intent.putExtra(Intent.EXTRA_SUBJECT, "استعلام عن المكافأة");
                        intent.putExtra(Intent.EXTRA_TEXT, "الاسم: " + name + "\n رقم الهوية: " + id + "\n الرقم الاكاديمي: "
                                + idcollge + "\n الجوال: " + phone + "\n البريد الالكتروني: " + mail + "\n\n هل معدلك اقل من  2؟ : " +r1+  "\n\n هل تجاوزت المدة النظامية 8 فصول ؟ : "
                                +r2+  "\n\n هل تم الانسحاب أو التأجيل ؟ : " +r3+  "\n\n هل تم الحصول على الجدول التدريبي قبل بداية الترم ؟ : " +r4+ "\n \n وصف المشكلة :-\n " + messge + "");
                        intent.setType("message/rfc822");
                        startActivity(Intent.createChooser(intent, "من فضلك قم بإختيار تطبيق البريد الالكتروني 'Gmail'"));
                    }
                    else
                    {
                        Toast.makeText(card_reward.this, "هل تم الحصول على الجدول التدريبي قبل بداية الترم ؟", Toast.LENGTH_LONG).show();

                    }
                }

                else
                {
                    Toast.makeText(card_reward.this, "هل تم الانسحاب أو التأجيل ؟", Toast.LENGTH_LONG).show();

                }
            }

            else
            {
                Toast.makeText(card_reward.this, "هل تجاوزت المدة النظامية 8 فصول ؟", Toast.LENGTH_LONG).show();

            }
        }

        else
        {
            Toast.makeText(card_reward.this, "هل معدلك اقل من 2 ؟", Toast.LENGTH_LONG).show();

        }


    }
 }
