package com.example.nhdangdh.singletonpatterndemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by nhdangdh on 7/14/2017.
 */

public class GetNameActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__getname);

        Button btnGetName = (Button) findViewById(R.id.btnGetName);

        final EditText edtName = (EditText) findViewById(R.id.edtName);

        btnGetName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Singleton.getInstance().setName(edtName.getText().toString());

                Intent intent = new Intent(GetNameActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
