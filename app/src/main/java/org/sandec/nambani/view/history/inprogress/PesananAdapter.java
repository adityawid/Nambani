package org.sandec.nambani.view.history.inprogress;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.sandec.nambani.R;

import java.util.ArrayList;

/**
 * Created by keyalive on 21/11/2017.
 */

public class PesananAdapter extends  RecyclerView.Adapter<PesananAdapter.MyViewHolder> {
    private ArrayList<PesananModel> listData;
    private Context context;

    public PesananAdapter(ArrayList<PesananModel> listData, Context context) {
        this.listData = listData;
        this.context = context;
    }

    //Mengubungkan dengan layout itemnya
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_pesanan_item_list, parent, false);
        return new MyViewHolder(itemView);
    }

    //Buat meset item RecyclerView
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.tvNamaWisata.setText(listData.get(position).getJumlahPesanan()+" pcs "+listData.get(position).getNamaObat());
        holder.tvAlamatWisata.setText("Rp "+listData.get(position).getJumlahBayar());

        ///untuk kirim data
//        final Bundle datakiriman = new Bundle();
//        datakiriman.putString(Konstanta.DATA_ID,listData.get(position).getIdObat());
//        datakiriman.putString(Konstanta.DATA_NAMA,listData.get(position).getNamaObat());
//        datakiriman.putString(Konstanta.DATA_GAMBAR,listData.get(position).getGambarObat());
//        datakiriman.putString(Konstanta.DATA_DESKRIPSI,listData.get(position).getDeskripsiObat());
//        datakiriman.putString(Konstanta.DATA_HARGA,listData.get(position).getHargaObat());
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent pindah = new Intent(context, DetailObatActivity.class);
//                pindah.putExtras(datakiriman);
//                context.startActivity(pindah);
//            }
//        });
    }

    //Jumlah Item
    @Override
    public int getItemCount() {
        return listData.size();
    }

    //Inisialisasi Widger pada item
    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvNamaWisata, tvAlamatWisata;
        public MyViewHolder(View itemView) {
            super(itemView);
            tvAlamatWisata = (TextView) itemView.findViewById(R.id.tv_item_alamat);
            tvNamaWisata = (TextView) itemView.findViewById(R.id.tv_item_nama);
        }
    }
}
