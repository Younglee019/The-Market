/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operations;

import java.time.LocalDate;
import Operations.Produits;

/**
 *
 * @author ING GOUIN
 */
public class Ventes implements Comparable<Ventes> {
    private String idVente;
    static public String nomProduits;
    private String idClients;
    private String modPaiement;
    static public int quantiteProd;
    private LocalDate dateVente;
    static public float dette;
    private float total;
    
    public Ventes(){
        
    }
    
     public Ventes(String idVente, String nomProduits, String idClients, String modPaiement, float dette, int quantiteProd,LocalDate dateVente, float total){
        this.idVente=idVente;
        this.nomProduits=nomProduits;
        this.idClients=idClients;
        this.dette=dette;
        this.quantiteProd=quantiteProd;
        this.modPaiement=modPaiement;
        this.dateVente=dateVente;
        this.total=total;
    }
     
     public float getTotal(){
         return this.total;
     }
     
     public void setTotal(float total){
         this.total=total;
     }
     
     
     
     public String getIdVente(){
         return this.idVente;
     }
     
     public void setIdVente(String idVente){
         this.idVente=idVente;
     }
     
     public String getNomProduits(){
         return this.nomProduits;
     }
     
     public void setNomProduits(String nomProduits){
         this.nomProduits=nomProduits;
     }
     
     public String getIdClients(){
         return this.idClients;
     }
     
     public void setIdClients(String idClients){
         this.idClients=idClients;
     }
     
     public String getModPaiement(){
         return this.modPaiement;
     }
     
     public void setModPaiement(String modPaiement){
         this.modPaiement=modPaiement;
     }
     
     public float getDette(){
         return this.dette;
     }
     
    public void setDette(float dette) {
        this.dette=dette;
    }
     
     public int getQuantiteProd(){
         return this.quantiteProd;
     }
     
     public void setQuantiteProd(int quantiteProd){
         this.quantiteProd=quantiteProd;
     }
     
     public LocalDate getDateVente(){
         return this.dateVente;
     }
     
     public void setDateVente(LocalDate dateVente){
         this.dateVente=dateVente;
     }
     
     public String toString(){
       return  "ID vente          :"+idVente+"\n"+ 
               "ID Client         :"+idClients+"\n"+ 
               "ID produits       :"+nomProduits+"\n"+ 
               "Nom produits      :"+nomProduits+"\n"+
               "Mode Paiement     :"+modPaiement+"\n"+
               "Balance           :"+dette+"\n"+ 
               "Quantite produits :"+quantiteProd+"\n"+
               "Date de la vente  :"+dateVente;
     }

    @Override
    public int compareTo(Ventes o) {
     int x=this.nomProduits.compareToIgnoreCase(o.nomProduits);
     return x;
    }

 
}
