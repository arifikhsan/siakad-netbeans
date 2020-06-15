package sh.now.arifikhsanudin.siakad.netbeans.webservice.mahasiswa.model;

public class MahasiswaModel {
    private Integer nim;
    private String nama;
    private String jurusan;
    private String email;
    private String alamat;

    public MahasiswaModel(Integer nim, String nama, String jurusan, String email, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.email = email;
        this.alamat = alamat;
    }

    public Integer getNim() {
        return nim;
    }

    public void setNim(Integer nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
