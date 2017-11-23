package org.sandec.nambani.view.chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.sandec.nambani.R;
import org.sandec.nambani.view.chat.adapter.Dokter;
import org.sandec.nambani.view.chat.adapter.DokterAdapter;

import java.util.ArrayList;

public class DokterKlinikita extends AppCompatActivity {
    RecyclerView rvDok;
    ArrayList<Dokter> dokterList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dokter_klinikita);
        rvDok = (RecyclerView)findViewById(R.id.rv_dokter_klinikita);
        getSupportActionBar().setTitle("Pilih dokter nya");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvDok.setLayoutManager(linearLayoutManager);

        String[] namadokter = {"Dr. Hamim", "Dr. Iyan", "Dr. Roni", "Dr. Edwin", "Dr. Fakhri", "Dr. Aldi","Dr. Rizal","Dr. Amien","Sholeh"};
        int[] gambardokter = {R.drawable.ic_login_facebook,
                R.drawable.ic_more_help,
                R.drawable.ic_more_syaratketentuan,
                R.drawable.ic_more_profil,
                R.drawable.ic_more_pengaturan,
                R.drawable.ic_more_logout,
                R.drawable.facebook,
                R.drawable.google,
                R.drawable.akun};
        String[] harga = {"10.000", "20.000", "15.000", "50.000", "10.000", "10.000", "Free", "10.000", "10.000"};

        for (int i = 0; i < namadokter.length; i++) {
            Dokter dokter = new Dokter(gambardokter[i], namadokter[i], "Umum", harga[i]);
            dokterList.add(dokter);

        }
        DokterAdapter dokterAdapter = new DokterAdapter(this, dokterList);

        rvDok.setAdapter(dokterAdapter);
    }
}


