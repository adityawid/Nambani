package org.sandec.nambani.view.history.inprogress;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by Febriyan A. Fatma on 11/23/2017.
 */

public class ListPesananModel {
    @SerializedName("pesanan")
    @Expose
    private ArrayList<PesananModel> pesanan = null;

    public ArrayList<PesananModel> getPesanan() {
        return pesanan;
    }

    public void setPesanan(ArrayList<PesananModel> pesanan) {
        this.pesanan = pesanan;
    }
}
