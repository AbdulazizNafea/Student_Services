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


//---------------------------------------مشاكل البطاقة------------------------------------
//------------------------------------card_problems---------------------------------------
//---------------------------------------مشاكل البطاقة------------------------------------
//------------------------------------card_problems---------------------------------------


public class card_problems extends AppCompatActivity
{

    EditText t_name,t_id,t_idcollge,t_phone,t_mail,t_massge,text1,text2;
    Button btn1;
    RadioButton r1_1,r1_2,r2_1,r2_2,r3_1,r3_2,r4_1,r4_2;
    RadioGroup radio1 ,radio2,radio3,radio4;
    String r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_problems);

        //--------------------------------------------------------
        t_name = findViewById(R.id.t_name);
        t_id = findViewById(R.id.t_id);
        t_idcollge = findViewById(R.id.t_idcollge);
        t_phone = findViewById(R.id.t_phone);
        t_mail = findViewById(R.id.t_mail);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
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
        radio1 = findViewById(R.id.radio1);// هل انت متدرب زائر؟
        radio2 = findViewById(R.id.radio2);// هل أنت منقول من جهة أخرى ؟
        radio3 = findViewById(R.id.radio3);// هل تم تحديث الهوية الوطنية على رايات ؟
        radio4 = findViewById(R.id.radio4);// هل أنت متخرج من المعهد الصناعي ؟
//--------------------------------------------------------


        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (t_name.getText().toString().equals("") || t_name.getText().toString().length()<=7 ) {
                    t_name.setError("قم بكتابة اسمك");
                } else if (t_id.getText().toString().equals("")||t_id.getText().toString().length()<=10) {
                    t_id.setError("قم بكتابة رقم الهوية بشكل صحيح");
                } else if (t_idcollge.getText().toString().equals("") || t_idcollge.getText().toString().length()<=9) {
                    t_idcollge.setError("قم بكتابة رقمك الآكاديمي شكل صحيح");
                } else if (t_phone.getText().toString().equals("") || t_phone.getText().toString().length()<=10) {
                    t_phone.setError("قم بكتابة رقم الجوال");
                } else if (t_mail.getText().toString().equals("") || t_mail.getText().toString().length()<=3) {
                    t_mail.setError("قم بكتابة بريدك الإلكتروني");
                } else if (t_massge.getText().toString().equals("") || t_massge.getText().toString().length()<=10) {
                    t_massge.setError("قم بكتابة الأسباب");
                } else if (r1_1.isChecked() && text1.getText().toString().equals("") || text1.getText().toString().length()<=3) {
                    text1.setError("قم بكتابة اسم الجهة");
                } else if (r2_1.isChecked() && text2.getText().toString().equals("") || text2.getText().toString().length()<=3) {
                    text2.setError("قم بكتابة اسم الجهة");
                } else
                {
                   if_statment();
                }
            }
        });


//==================================================================================================
//--------------------------------------------------------------------------------------------------
//==================================================================================================
        //اظهار واخفاء الحقل المرتبط بالراديو t1_1 و t2_1


        radio1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (r1_1.isChecked()) {
                    text1.setVisibility(View.VISIBLE);

                } else if (r1_2.isChecked()) {
                    text1.setVisibility(View.GONE);
                    text1.setText("");

                }
            }
        });

        radio2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (r2_1.isChecked()) {
                    text2.setVisibility(View.VISIBLE);
                } else if (r2_2.isChecked()) {
                    text2.setVisibility(View.GONE);
                    text2.setText("");
                }
            }
        });

    }
//==================================================================================================
//--------------------------------------------------------------------------------------------------
//==================================================================================================




//==================================================================================================
//--------------------------------------------------------------------------------------------------
//==================================================================================================


    //دالة تعبئةالاجابات نعم أو لا .

    public void yes_no()
    {


        if (r1_1.isChecked())
        {
            r1 = "نعم";
           /* if (text1.getText().toString().equals(""))
            {
                text1.setError("قم بكتابة اسم الجهة");
            }*/
        }
        else if (r1_2.isChecked()) {
            r1 = "لا";
        }
        //----------------------------
        if (r2_1.isChecked())
        {
            r2 = "نعم";
           /* if (text2.getText().toString().equals(""))
            {
                text2.setError("قم بكتابة اسم الجهة");
            }*/
        }
        else if (r2_2.isChecked())
        {
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

//==================================================================================================
//--------------------------------------------------------------------------------------------------
//==================================================================================================

    // دالة التحقق من أن جميع الراديو جروب تمت الاجابة عليها ، اذا كان كل شي تمام تنقلك للجيميل

    public void if_statment()
    {
        String name = t_name.getText().toString();
        String id = t_id.getText().toString();
        String idcollge = t_idcollge.getText().toString();
        String phone = t_phone.getText().toString();
        String mail = t_mail.getText().toString();
        String messge = t_massge.getText().toString();
        String texst_1=text1.getText().toString();
        String texst_2=text2.getText().toString();

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
                            intent.putExtra(Intent.EXTRA_SUBJECT, "مشاكل في بطاقات الصراف");
                            intent.putExtra(Intent.EXTRA_TEXT, "الاسم: " + name + "\n رقم الهوية: " + id + "\n الرقم الاكاديمي: "+ idcollge + "\n الجوال: " + phone + "\n البريد الالكتروني: " + mail + "\n\n هل أنت متدرب زائر ؟ : " + r1 + "\n اسم الجهة :"+texst_1+"\n\n هل أنت منقول من جهة أخرى ؟ : " + r2 +"\n اسم الجهة :"+texst_2+ "\n\n هل تم تحديث الهوية على رايات  : " + r3 + "\n\n هل أنت متخرج من المعهد الصناعي ؟ : " + r4 + "\n \n وصف المشكلة :-\n " + messge + "");
                            intent.setType("message/rfc822");
                            startActivity(Intent.createChooser(intent, "من فضلك قم بإختيار تطبيق البريد الالكتروني 'Gmail'"));

                    }
                    else
                    {
                        Toast.makeText(card_problems.this, "هل أنت متخرج من المعهد الصناعي ؟", Toast.LENGTH_LONG).show();
                    }
                }

                else
                {
                    Toast.makeText(card_problems.this, "هل تم تحديث الهوية الوطنية على رايات ؟", Toast.LENGTH_LONG).show();
                }
            }

            else
            {
                Toast.makeText(card_problems.this, "هل أنت منقول من جهة أخرى ؟", Toast.LENGTH_LONG).show();
            }
        }

        else
        {
            Toast.makeText(card_problems.this, "هل انت متدرب زائر ؟", Toast.LENGTH_LONG).show();
        }


    }
}
