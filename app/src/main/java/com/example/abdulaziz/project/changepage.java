package com.example.abdulaziz.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class changepage extends AppCompatActivity
{

    RadioButton r1,r2,r3,r4,r5;
    EditText t_name,t_id,t_idcollge,t_phone,t_mail,t_massge,this_part,new_part ;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changepage);
//----------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------
        r1 = findViewById(R.id.r1);//computer
        r2 = findViewById(R.id.r2);//micanic
        r3 = findViewById(R.id.r3);//manger
        r4 = findViewById(R.id.r4);//elctronic
        r5 = findViewById(R.id.r5);//elctric
//----------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------
        t_name = findViewById(R.id.t_name);
        t_id =findViewById(R.id.t_id);
        t_idcollge = findViewById(R.id.t_idcollge);
        t_phone = findViewById(R.id.t_phone);
        t_mail = findViewById(R.id.t_mail);
        t_massge = findViewById(R.id.t_massge);
        this_part=findViewById(R.id.this_part);
        new_part=findViewById(R.id.new_part);

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
                String old_part = this_part.getText().toString();
                String new_part1 = new_part.getText().toString();


                if (this_part.getText().toString().equals("")&& t_id.getText().length()<=10)
                {
                    this_part.setError("???? ???????????? ?????????? ????????????");
                }
                else if (new_part.getText().toString().equals("")&& t_id.getText().length()<=10)
                {
                    new_part.setError("???? ???????????? ???????????? ???????? ???????? ?????????????? ????");
                }
               else if(t_name.getText().toString().equals(""))
                {
                    t_name.setError("???? ???????????? ????????");
                }
                else if (t_id.getText().toString().equals("")&& t_id.getText().length()<=10)
                {
                    t_id.setError("???? ???????????? ?????? ???????????? ???????? ????????");
                }
                else if (t_idcollge.getText().toString().equals("") && t_idcollge.getText().length()<=9)
                {
                    t_idcollge.setError("???? ???????????? ???????? ?????????????????? ?????? ????????");
                }
                else if (t_phone.getText().toString().equals(""))
                {
                    t_phone.setError("???? ???????????? ?????? ????????????");

                }
                else if (t_mail.getText().toString().equals(""))
                {
                    t_mail.setError("???? ???????????? ?????????? ????????????????????");
                }
                else if (t_massge.getText().toString().equals(""))
                {
                    t_massge.setError("???? ???????????? ??????????????");
                }
                else
                {
                    if (r1.isChecked())
                    {
                        String[] to = {"matar.na77@gmail.com"};
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_EMAIL, to);
                        intent.putExtra(Intent.EXTRA_SUBJECT, "?????????????? ???? ?????????? ?????????? ????????????");
                        intent.putExtra(Intent.EXTRA_TEXT, "??????????: " + name + "\n ?????? ????????????: " + id + "\n ?????????? ??????????????????" + idcollge + "\n ????????????: " + phone + "\n ???????????? ????????????????????: " + mail +"\n ???????????? ????????????: "+old_part+"\n ???????????? ???????????? ?????????????? ????: "+new_part1+"\n \n \n" + messge + "");
                        intent.setType("message/rfc822");
                        startActivity(Intent.createChooser(intent, "???? ???????? ???? ?????????????? ?????????? ???????????? ???????????????????? 'Gmail'"));
                    }
                    else if (r2.isChecked())
                    {
                        String[] to = {"matar.na77@gmail.com"};
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_EMAIL, to);
                        intent.putExtra(Intent.EXTRA_SUBJECT, "?????????????? ???? ?????????? ?????????? ????????????");
                        intent.putExtra(Intent.EXTRA_TEXT, "??????????: " + name + "\n ?????? ????????????: " + id + "\n ?????????? ??????????????????" + idcollge + "\n ????????????: " + phone + "\n ???????????? ????????????????????: " + mail +"\n ???????????? ????????????: "+old_part+"\n ???????????? ???????????? ?????????????? ????: "+new_part1+"\n \n \n" + messge + "");
                        intent.setType("message/rfc822");
                        startActivity(Intent.createChooser(intent, "???? ???????? ???? ?????????????? ?????????? ???????????? ???????????????????? 'Gmail'"));
                    }
                    else if (r3.isChecked())
                    {
                        String[] to = {"matar.na77@gmail.com"};
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_EMAIL, to);
                        intent.putExtra(Intent.EXTRA_SUBJECT, "?????????????? ???? ?????????? ?????????? ????????????");
                        intent.putExtra(Intent.EXTRA_TEXT, "??????????: " + name + "\n ?????? ????????????: " + id + "\n ?????????? ??????????????????" + idcollge + "\n ????????????: " + phone + "\n ???????????? ????????????????????: " + mail +"\n ???????????? ????????????: "+old_part+"\n ???????????? ???????????? ?????????????? ????: "+new_part1+"\n \n \n" + messge + "");
                        intent.setType("message/rfc822");
                        startActivity(Intent.createChooser(intent, "???? ???????? ???? ?????????????? ?????????? ???????????? ???????????????????? 'Gmail'"));
                    }
                    else if (r4.isChecked())
                    {
                        String[] to = {"matar.na77@gmail.com"};
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_EMAIL, to);
                        intent.putExtra(Intent.EXTRA_SUBJECT, "?????????????? ???? ?????????? ?????????? ????????????");
                        intent.putExtra(Intent.EXTRA_TEXT, "??????????: " + name + "\n ?????? ????????????: " + id + "\n ?????????? ??????????????????" + idcollge + "\n ????????????: " + phone + "\n ???????????? ????????????????????: " + mail +"\n ???????????? ????????????: "+old_part+"\n ???????????? ???????????? ?????????????? ????: "+new_part1+"\n \n \n" + messge + "");
                        intent.setType("message/rfc822");
                        startActivity(Intent.createChooser(intent, "???? ???????? ???? ?????????????? ?????????? ???????????? ???????????????????? 'Gmail'"));
                    }
                    else if (r5.isChecked())
                    {
                        String[] to = {"matar.na77@gmail.com"};
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_EMAIL, to);
                        intent.putExtra(Intent.EXTRA_SUBJECT, "?????????????? ???? ?????????? ?????????? ????????????");
                        intent.putExtra(Intent.EXTRA_TEXT, "??????????: " + name + "\n ?????? ????????????: " + id + "\n ?????????? ??????????????????" + idcollge + "\n ????????????: " + phone + "\n ???????????? ????????????????????: " + mail +"\n ???????????? ????????????: "+old_part+"\n ???????????? ???????????? ?????????????? ????: "+new_part1+"\n \n \n" + messge + "");
                        intent.setType("message/rfc822");
                        startActivity(Intent.createChooser(intent, "???? ???????? ???? ?????????????? ?????????? ???????????? ???????????????????? 'Gmail'"));
                    }
                    else
                    {
                        Toast.makeText(changepage.this,"???? ???????????? ?????????? ???????? ?????????? ????",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });

    }

}
