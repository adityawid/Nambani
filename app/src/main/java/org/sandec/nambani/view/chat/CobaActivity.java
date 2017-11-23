package org.sandec.nambani.view.chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CobaActivity extends AppCompatActivity {
TextView tvCoba;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(org.sandec.nambani.R.layout.activity_coba);
        tvCoba = (TextView)findViewById(org.sandec.nambani.R.id.tv_coba);

        tvCoba.append("satu \n");
        tvCoba.append("dua");
        tvCoba.append("tiga");
        tvCoba.append("empat");
        tvCoba.append("lima");
        tvCoba.append("enam");
    }
}
