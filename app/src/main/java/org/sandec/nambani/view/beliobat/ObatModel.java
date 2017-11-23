package org.sandec.nambani.view.beliobat;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by keyalive on 21/11/2017.
 */

public class ObatModel   {
    @SerializedName("id_obat")
    @Expose
    private String idObat;
    @SerializedName("nama_obat")
    @Expose
    private String namaObat;
    @SerializedName("harga_obat")
    @Expose
    private String hargaObat;
    @SerializedName("deskripsi_obat")
    @Expose
    private String deskripsiObat;
    @SerializedName("gambar_obat")
    @Expose
    private String gambarObat;
    @SerializedName("TES")
    @Expose
    private String tES;

    @SerializedName("stok")
    @Expose
    private String stok;

    public ObatModel(String idObat, String namaObat, String hargaObat, String deskripsiObat, String gambarObat, String tES, String stok) {
        this.idObat = idObat;
        this.namaObat = namaObat;
        this.hargaObat = hargaObat;
        this.deskripsiObat = deskripsiObat;
        this.gambarObat = gambarObat;
        this.tES = tES;
        this.stok = stok;
    }

    public String gettES() {
        return tES;
    }

    public void settES(String tES) {
        this.tES = tES;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
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

    public String getHargaObat() {
        return hargaObat;
    }

    public void setHargaObat(String hargaObat) {
        this.hargaObat = hargaObat;
    }

    public String getDeskripsiObat() {
        return deskripsiObat;
    }

    public void setDeskripsiObat(String deskripsiObat) {
        this.deskripsiObat = deskripsiObat;
    }

    public String getGambarObat() {
        return gambarObat;
    }

    public void setGambarObat(String gambarObat) {
        this.gambarObat = gambarObat;
    }

    public String getTES() {
        return tES;
    }

    public void setTES(String tES) {
        this.tES = tES;
    }
}
