package org.sandec.nambani.view.history.inprogress;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Febriyan A. Fatma on 11/23/2017.
 */

public class PesananModel {
    @SerializedName("id_pesanan")
    @Expose
    private String idPesanan;
    @SerializedName("id_user")
    @Expose
    private String idUser;
    @SerializedName("nama_user")
    @Expose
    private String namaUser;
    @SerializedName("id_obat")
    @Expose
    private String idObat;
    @SerializedName("nama_obat")
    @Expose
    private String namaObat;
    @SerializedName("jumlah_pesanan")
    @Expose
    private String jumlahPesanan;
    @SerializedName("jumlah_bayar")
    @Expose
    private String jumlahBayar;
    @SerializedName("status")
    @Expose
    private String status;

    public String getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(String idPesanan) {
        this.idPesanan = idPesanan;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public String getIdObat() {
        return idObat;
    }

    public void setIdObat(String idObat) {
        this.idObat = idObat;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public String getJumlahPesanan() {
        return jumlahPesanan;
    }

    public void setJumlahPesanan(String jumlahPesanan) {
        this.jumlahPesanan = jumlahPesanan;
    }

    public String getJumlahBayar() {
        return jumlahBayar;
    }

    public void setJumlahBayar(String jumlahBayar) {
        this.jumlahBayar = jumlahBayar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
