/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh.now.arifikhsanudin.siakad.netbeans.webservice.mahasiswa;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
/**
 *
 * @author arifikhsanudin
 */
@WebService(serviceName = "MahasiswaWebService")
public class MahasiswaWebService {
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
