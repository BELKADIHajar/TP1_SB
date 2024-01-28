package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

//Cette partie represente de dev d'un web service
//@WebService(serviceName = "BanqueWS")
@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*10;
    }

    @WebMethod(operationName = "Depot")
    public double Depot(@WebParam(name = "montant") double mt,Compte cp){
        return cp.setSolde(cp.getSolde()+mt);
    }






    @WebMethod
    public  Compte getCompte(@WebParam(name="Code") int code){
        return new Compte(code,Math.random()*9888,new Date());
    }

    @WebMethod
    public List<Compte> ListComptes(){
       return List.of(
               new Compte(1,Math.random()*9888,new Date()),
               new Compte(2,Math.random()*9888,new Date()),
               new Compte(3,Math.random()*9888,new Date()),
               new Compte(4,Math.random()*9888,new Date())
       );
    }
}
