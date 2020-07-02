/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Jenis_Barang {

    private Integer id_Jenis_Barang;
    private String nama_Jenis_Barang;

    public void setId_JenisBarang(Integer id_Jenis_Barang) {
        this.id_Jenis_Barang = id_Jenis_Barang;
    }

    public Integer getId_JenisBarang() {
        return id_Jenis_Barang;
    }

    public void setNama_JenisBarang(String nama_Jenis_Barang) {
        this.nama_Jenis_Barang = nama_Jenis_Barang;
    }

    public String getNama_JenisBarang() {
        return nama_Jenis_Barang;
    }
}
