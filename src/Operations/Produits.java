package Operations;

import java.time.LocalDate;

public class Produits implements Comparable<Produits>{
    //declaration des variables
    public String idProduit;
    public float mesure;
    private String categorie;
    public String nom;
    private float prixAchat;
    private float prixVente;
    public float quantite;
    private LocalDate dateParution;
    public String donnee1;
    public float donnee2;
    private String num;
    
    public Produits(){
        
    }
    
     public Produits(String idProduit, float mesure, String categorie, String nom, float prixAchat, float prixVente, float quantite,LocalDate dateParution, String num){
        this.idProduit=idProduit;
        this.mesure=mesure;
        this.categorie=categorie;
        this.nom=nom;
        this.prixAchat=prixAchat;
        this.prixVente=prixVente;
        this.quantite=quantite;
        this.dateParution=dateParution;
        this.num=num;
    }
     
     //verification des getters et des setters
     public String getIdProduit(){
         return this.idProduit;
     }
     
     public void setIdProduit(String idProduit){
         this.idProduit=idProduit;
     }
     
     public String getNum(){
         return this.num;
     }
     
     public void setNum(String num){
         this.num=num;
     }
     
     public float getMesure(){
         return this.mesure;
     }
     
     public void setMesure(float mesure){
         this.mesure=mesure;
     }
     
     public String getCategorie(){
         return this.categorie;
     }
     
     public void setCategorie(String categorie){
         this.categorie=categorie;
     }
     
     public String getNom(){
         return this.nom;
     }
     
     public void setNom(String nom){
         this.nom=nom;
     }
     
     public float getPrixAchat(){
         return this.prixAchat;
     }
     
     public void setPrixAchat(float prixAchat){
         this.prixAchat=prixAchat;
     }
     
     public float getPrixVente(){
         return this.prixVente;
     }
     
     public void setPrixVente(float prixVente){
         this.prixVente=prixVente;
     }
     
     public float getQuantite(){
         return this.quantite;
     }
     
     public void setQuantite(float quantite){
         this.quantite=quantite;
     }
     
     public LocalDate getDateParution(){
         return this.dateParution;
     }
     
     public void setDateParution(LocalDate dateParution){
         this.dateParution=dateParution;
     }
     
     public String getDonnee1(){
         return this.donnee1;
     }
     
     public void setDonnee1(String donnee1){
         this.donnee1=donnee1;
     }
     
     public float getDonnee2(){
         return this.donnee2;
     }
     
     public void setDonnee2(float Donnee2){
         this.donnee2=donnee2;
     }
     
     //Affichage de la fiche du Produits
     public String toString(){
       return  "ID produits         :"+idProduit+"\n"+
               "Nom                 :"+nom+"\n"+
               "Categorie           :"+categorie+"\n"+
               "Mesure              :"+mesure+"\n"+
               "Quantite initiale   :"+quantite+"\n"+
               "Quantite restants   :"+(quantite - Ventes.quantiteProd)+"\n"+
               "Quantite vendue     :"+Ventes.quantiteProd+"\n"+
               "Prix Achat          :"+prixAchat+"\n"+               
               "Prix Vente          :"+prixVente+"\n"+
               "Date parution       :"+dateParution;
     }

    @Override
    public int compareTo(Produits o) {
     int x=this.nom.compareToIgnoreCase(o.nom);
     return x;
    }
}
