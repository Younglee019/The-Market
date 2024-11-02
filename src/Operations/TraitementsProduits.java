/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import MainShop.MainClass;

/**
 *
 * @author Owner
 */
public class TraitementsProduits {
    Produits prod=new Produits();
    ArrayList<Produits> arv=new ArrayList<Produits>();
    Scanner sc=new Scanner(System.in);
    
    
    public void enregistrer() {
         do{
     System.out.print("Categorie : \n");
     prod.setCategorie(sc.nextLine());
         }while(prod.getCategorie()==null || prod.getCategorie().isEmpty());
         do{
     System.out.print("Nom : \n");
     prod.setNom(sc.nextLine());
         }while(prod.getNom()==null || prod.getNom().isEmpty());
    
         do{
     System.out.print("Date de livraison(aaaa-mm-jj) : \n");
     prod.setDateParution(LocalDate.parse(sc.nextLine()));
         }while(prod.getNom()==null || prod.getNom().isEmpty());
         
         
         //use the checkDigit() methode if the users insert a letter or other things that are not a number
         Mesure:         
         do{
            System.out.print("Mesure (en lbs) : \n");
            String a = sc.nextLine();
            while(!MainClass.checkforDigits(a)){
                System.out.print("Mesure (en lbs) : \n");
                a = sc.nextLine();                
            }
             prod.setMesure(Float.parseFloat(a));
         }while(prod.getMesure()<=0);
         
         //Prix Achat
         do{
     System.out.print("Prix Achat (en gourdes) : \n");
     String c =sc.nextLine();
     while(!MainClass.checkforDigits(c)){
                System.out.print("Prix Achat : \n");
                c = sc.nextLine();                
            }
     prod.setPrixAchat(Float.parseFloat(c));
         }while(prod.getPrixAchat()<=0);
         
         do{
     System.out.print("Prix de Vente (en gourdes) : \n");
     String b =sc.nextLine();
     while(!MainClass.checkforDigits(b)){
                System.out.print("Prix de vente : \n");
                b = sc.nextLine();                
            }
     prod.setPrixVente(Float.parseFloat(b));
         }while(prod.getPrixVente()<=0);
       
         do{
     System.out.print("Quantite : \n");
     String d =sc.nextLine();
     while(!MainClass.checkforDigits(d)){
                System.out.print("Quantite: \n");
                d = sc.nextLine();                
            }
     prod.setQuantite(Float.parseFloat(d));
         }while(prod.getQuantite()<=0);
      
      Random r=new Random();
      String id=prod.getCategorie().substring(0,1)
      + prod.getNom().substring(0,1)+"-"+r.nextInt(100, 1000);
     prod.setIdProduit(id.toUpperCase());
        // ajouter les produits dans la collection
      arv.add(new Produits(prod.getIdProduit(),prod.getMesure(), prod.getCategorie(),
      prod.getNom(),prod.getPrixAchat(), prod.getPrixVente(), prod.getQuantite(),
      prod.getDateParution(), prod.getNum()));
     }
    
    //configuration de la methode permettant d'afficher les produits
    public void afficher() {
      if(arv.isEmpty()){
          System.out.println("\n Aucun produit n'est encore enregistre !");
      }else{
       System.out.println("-------------------------------------------------");
        for(Produits prod:arv){
            System.out.println(prod.toString());
            System.out.println("-------------------------------------------------");
            System.out.println("/n");
        }
         System.out.println("Nombre de produits:"+arv.size()+"/n");
      
      }
    }

    //configuration de la methode permettant de supprimer les produits
    public void supprimer() {
    if (arv.isEmpty()){
         System.out.println("Aucun produit n'a ete enregistre !");
     }else{
         System.out.print("Entrer le code du produit a supprimer:");
         String nCode=sc.nextLine();
         short comp=0;
          System.out.println("-------------------------------------------------");
     
         for(Produits ov:arv){
             if(ov.getIdProduit().equalsIgnoreCase(nCode)){
                 System.out.println(ov.toString());
                  System.out.println("-------------------------------------------------");
                   String rep="n"; 
                   do{
                   System.out.print("Voulez-vous supprimer ce Produit(o/n)?:");
                   rep=sc.nextLine();
                   }while(!rep.equalsIgnoreCase("o") && !rep.equalsIgnoreCase("n"));
                   if(rep.equalsIgnoreCase("o")){
                       arv.remove(ov);
                       break;
                   }
        
                 comp++;
             }
         }
         if(comp==0){
         System.out.println("Il y a aucun produit ayant ce code"+nCode+"/n");
    
         }else{
         System.out.println("Nombre de produits:"+comp);
     
         }
     }
    }

    //Afficher les produits par ordre croissant
    public void croissant() {
     if(arv.isEmpty()){
          System.out.println("Aucun produit n'est encore enregistre !");
      }else{
       System.out.println("-------------------------------------------------");
       // ordre croissant
       Collections.sort(arv);
       for(Produits prod:arv){
            System.out.println(prod.toString());
            System.out.println("-------------------------------------------------");
        }
         System.out.println("Nombre de produit:"+arv.size()+"/n");
      
      }
    }

        //Afficher les produits par ordre decroissant
    public void decroissant() {
    if(arv.isEmpty()){
          System.out.println("Aucun produit n'est encore enregistre ! /n");
      }else{
       System.out.println("-------------------------------------------------");
       // ordre decroissant
       Collections.sort(arv);
       Collections.reverse(arv);
       for(Produits prod:arv){
            System.out.println(prod.toString());
            System.out.println("-------------------------------------------------");
        }
         System.out.println("Nombre de produits:"+arv.size()+"/n");
      
      }
    }

    public void rechercher() {
    if (arv.isEmpty()){
         System.out.println("Aucun produit n'a ete enregistre !");
         System.out.println("Enregistrement d'un produit!");
         enregistrer();
     }else{
         System.out.print("Entrer le nom du produit a rechercher:");
         String nCode=sc.nextLine();
         short comp=0;
          System.out.println("-------------------------------------------------");
     
         for(Produits pro:arv){
             if(prod.getNom().equalsIgnoreCase(nCode)){
                 System.out.println(pro.toString());
                  System.out.println("-------------------------------------------------");
     
                 comp++;
             }
         }
         if(comp==0){
         System.out.println("Il y a aucun produits dans la categorie "+nCode);
         enregistrer();
    
         }else{
         System.out.println("Nombre de produits:"+comp);
     
         }
     }
    }

    void rechercher1() {
        if (arv.isEmpty()){
         System.out.println("Aucun produit n'a ete enregistre ! \n");
         System.out.println("Enregistrement d'un produit!");
         enregistrer();
         
     }else{
         String nCode= Ventes.nomProduits;
         short comp=0;
          System.out.println("-------------------------------------------------");
     
         for(Produits pro:arv){
             if(prod.getNom().equalsIgnoreCase(nCode)){
                 System.out.println(pro.toString());
                  System.out.println("-------------------------------------------------");
     
                 comp++;
             }
         }
         if(comp==0){
         System.out.println("Il y a aucun produits dans la categorie "+nCode+"\n");
         enregistrer();
    
         }else{
         System.out.println("Nombre de produits:"+comp);
     
         }
     }
    }
}
