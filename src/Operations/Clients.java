/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operations;

/**
 *
 * @author Frank Peterlee Edouard
 */
import MainShop.MainClass;
import Operations.Produits;
import Operations.TraitementsProduits;
import Operations.TraitementsVentes;
import Operations.Ventes;
import java.util.regex.*;


public class Clients implements Comparable<Clients>{

    private String idClient;
    private String nomClient;
    private String prenom;
    private String email;
    private String sexe;
    private String adresse;
    private int telephone;
    private boolean valid;
    private String donnee2;
    private int donnee1;

    
    public Clients(){
        
    }
    
     public Clients(String idClient,String nomClient,String prenom, String email,String sexe,String adresse, int telephone, boolean valid, String donnee2, int donnee1){
        this.idClient=idClient;
        this.nomClient=nomClient;
        this.prenom=prenom;
        this.email=email;
        this.sexe=sexe;
        this.adresse=adresse;
        this.telephone = telephone;
        this.valid=valid;
        this.donnee2=donnee2;
        this.donnee1=donnee1;
    }
     
     public String getIdClient(){
         return this.idClient;
     }
     
     public void setIdClient(String idClient){
         this.idClient=idClient;
     }
     
     public String getNomClient(){
         return this.nomClient;
     }
     
     public void setNomClient(String nomClient){
         this.nomClient=nomClient;
     }
     
     public String getPrenom(){
         return this.prenom;
     }
     
     public void setPrenom(String prenom){
         this.prenom=prenom;
     }
     
     public String getEmail(){
         return this.email;
     }
     
     public void setEmail(String email){
         this.email=email;
     }
     
     public String getSexe(){
         return this.sexe;
     }
     
     public void setSexe(String sexe){
         this.sexe=sexe;
     }
     
     public int getTelephone(){
         return this.telephone;
     }
     
     public void setTelephone(int telephone){
         this.telephone=telephone;
     }
     
     public String getAdresse(){
         return this.adresse;
     }
     
     public void setAdresse(String adresse){
         this.adresse=adresse;
     }
     
     public boolean getValid(){
         return this.valid;
     }
     
     public void setValid(boolean valid){
         this.valid=valid;
     }
     
     public String getDonnee2(){
         return this.donnee2;
     }
     
     public void setDonnee2(String donnee2){
         this.donnee2=donnee2;
     }
     
     public int getDonnee1(){
         return this.donnee1;
     }
     
     public void setDonnee1(int donnee1){
         this.donnee1=donnee1;
     }
     
     
     
     public String toString(){
       return  "Identifiant du client:"+idClient+"\n"+
               "Nom                  :"+nomClient+"\n"+
               "Prenom               :"+prenom+"\n"+
               "Email                :"+email+"\n"+
               "Sexe                 :"+sexe+"\n"+
               "Telephone            :+(509)"+telephone+"\n"+
               "Adresse              :"+adresse+"\n"+
               "Dettes               :"+Ventes.dette+"\n";
     }

    @Override
    public int compareTo(Clients o) {
     int x=this.prenom.compareToIgnoreCase(o.prenom);
     return x;
    }
}
