package com.example.congtru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button t, h;
EditText a,b,kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        h=findViewById(R.id.h);
        t=findViewById(R.id.t);
        a=findViewById(R.id.a);
        b=findViewById(R.id.b);
        kq=findViewById(R.id.kq);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer sa= Integer.parseInt(a.getText()+"");
                Integer sb = Integer.parseInt(b.getText()+"");
                kq.setText(""+(sa+sb));
        }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer sa= Integer.parseInt(a.getText()+"");
                Integer sb = Integer.parseInt(b.getText()+"");
                kq.setText(""+(sa-sb));
            }
        });

    }
}