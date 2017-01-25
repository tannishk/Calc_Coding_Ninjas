package com.example.sudhir.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//import
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button add,sub,mul,div,equ;
    TextView textView;
    String a="";
    String b = "";
    int ch=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        textView = (TextView) findViewById(R.id.textView);
        add = (Button) findViewById(R.id.badd);
        sub = (Button) findViewById(R.id.bmin);
        mul = (Button) findViewById(R.id.bmul);
        div = (Button) findViewById(R.id.bdivide);
        equ = (Button) findViewById(R.id.bequal);
        //textView.setText();
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        add.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        equ.setOnClickListener(this);
        sub.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id==b0.getId())
        {
            a=a+"0";
            textView.setText(a);
        }
        else if(id==b1.getId())
        {
            a=a+"1";
            textView.setText(a);
        }
        else if(id==b2.getId())
        {
            a=a+"2";
            textView.setText(a);
        }
        else if(id==b3.getId())
        {
            a=a+"3";
            textView.setText(a);
        }
        else if(id==b4.getId())
        {
            a=a+"4";
            textView.setText(a);
        }
        else if(id==b5.getId())
        {
            a=a+"5";
            textView.setText(a);
        }
        else if(id==b6.getId())
        {
            a=a+"6";
            textView.setText(a);
        }
        else if(id==b7.getId())
        {
            a=a+"7";
            textView.setText(a);
        }
        else if(id==b8.getId())
        {
            a=a+"8";
            textView.setText(a);
        }
        else if(id==b9.getId())
        {
            a=a+"9";
            textView.setText(a);
        }
        else if(id==add.getId())
        {
             b=a;
            a="";
            ch=1;
        }
        else if(id==sub.getId())
        {
            b=a;
            a="";
            ch=2;
        }
        else if(id==mul.getId())
        {
            b=a;
            a="";
            ch=3;
        }
        else if(id==div.getId())
        {
            b=a;
            a="";
            ch=4;
        }
        else if(id==equ.getId())
        {
            int c=0;
            if(ch==1)
            {
                c = Integer.parseInt(b)+Integer.parseInt(a);
            }
            else if(ch==2)
            {
                c = Integer.parseInt(b)-Integer.parseInt(a);
            }
            else if(ch==3)
            {
                c = Integer.parseInt(b)*Integer.parseInt(a);
            }
            else if(ch==4)
            {
                c = Integer.parseInt(b)/Integer.parseInt(a);
            }
            textView.setText(c+"");
        }
    }
}
