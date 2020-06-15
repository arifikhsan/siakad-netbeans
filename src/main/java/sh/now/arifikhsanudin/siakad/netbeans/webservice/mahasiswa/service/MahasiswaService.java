package sh.now.arifikhsanudin.siakad.netbeans.webservice.mahasiswa.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import sh.now.arifikhsanudin.siakad.netbeans.webservice.mahasiswa.model.MahasiswaModel;

import java.util.ArrayList;

@WebService
public class MahasiswaService {
    MahasiswaModel mahasiswaModel = new MahasiswaModel(1, "a", "a", "a", "a");

    @WebMethod
    public ArrayList<MahasiswaModel> getAll() {
        ArrayList<MahasiswaModel> listMahasiswa = new ArrayList<MahasiswaModel>();
        listMahasiswa.add(mahasiswaModel);
        return listMahasiswa;
    }

    @WebMethod
    public MahasiswaModel getOne(Integer nim) {
        System.out.println(nim);
        return mahasiswaModel;
    }

    @WebMethod
    public void add(MahasiswaModel mahasiswaModel) {
        System.out.println(mahasiswaModel);
    }

    @WebMethod
    public void update(MahasiswaModel mahasiswaModel) {
        System.out.println(mahasiswaModel);
    }

    @WebMethod
    public void delete(Integer nim) {
        System.out.println(nim);
    }
}
