package org.sandec.nambani.view.auth.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import org.sandec.nambani.R;
import org.sandec.nambani.helper.Konstanta;
import org.sandec.nambani.view.auth.register.RegisterActivity;
import org.sandec.nambani.view.home.HomeActivity;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText tvNomer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        initView();
    }


    public void masuk(View view) {
//        Intent intent = new Intent(LoginActivity.this,OTPActivity.class);
        if(TextUtils.isEmpty(tvNomer.getText().toString())){
            Toast.makeText(this, "Isi Dulu", Toast.LENGTH_SHORT).show();
        } else {
            SharedPreferences pref = getSharedPreferences(Konstanta.SETTING, MODE_PRIVATE);
            SharedPreferences.Editor editor = pref.edit();
            editor.putString(Konstanta.NO_TELP, tvNomer.getText().toString());
            editor.commit();

            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        }
    }

    public void daftar_disini(View view) {
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
        finish();
    }

    public void hubungi(View view) {
        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(intent);
    }


    private void initView() {
        tvNomer = (TextInputEditText) findViewById(R.id.tv_nomer);
    }
}
