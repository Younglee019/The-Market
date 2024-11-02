/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operations;

import MainShop.MainClass;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import Operations.Clients;
import Operations.TraitementsClients;
import Operations.TraitementsProduits;
/**
 ** @author ING Lee
 */
public class TraitementsVentes {

    Ventes ven=new Ventes();
    ArrayList<Ventes> arv=new ArrayList<Ventes>();  
    TraitementsProduits tpr=new TraitementsProduits(); 
    Scanner sc=new Scanner(System.in);
    
    public void enregistrer() {
         int n, i;
         String code; // the code the user enters 
         
         do{
             System.out.println("Entrer le code du client qui effectue la vente");
             code = sc.nextLine();
             
             if (!TraitementsClients.Contains(code)){
                TraitementsClients.enregistrer();
                TraitementsClients.afficher();
             }
             ven.setIdClients(code);
//             if(TraitementsClients.arv.isEmpty()){
//                 System.out.println("Aucun client n'a encore ete enregistre \n");
//             } else {
//                TraitementsClients.rechercher1();
//                
//             }
                   
         }while(ven.getIdClients().isEmpty());

         System.out.println("Client enregistre avec succes \n");

        do{
     System.out.print("Entrer la valeur de n:");
     n=sc.nextInt();
         }while(n<=0); 
         
        for(i=1;i<=n;i++){
        do{
     System.out.print("Nom Produits: \n");
     ven.setNomProduits(sc.nextLine());
         }while(ven.getNomProduits().isEmpty());
        tpr.rechercher1();
        tpr.afficher();
    
         do{
     System.out.print("Date de la vente(aaaa-mm-jj) : \n");
     ven.setDateVente(LocalDate.parse(sc.nextLine()));
         }while(ven.getNomProduits().isEmpty());
         
         do{
     System.out.print("ID du client :");
     ven.setIdClients(sc.nextLine());
         }while(ven.getIdClients().isEmpty());
         
         do{
     System.out.print("Quantite produits :");
     String d =sc.nextLine();
     while(!MainClass.checkforDigits(d)){
                System.out.print("Mauvais choix.! \n Quantite: \n");
                d = sc.nextLine();                
            }
     ven.setQuantiteProd(Integer.parseInt(d));
        }while(ven.getQuantiteProd()<=0);
         
         
         
         
         int a;
         do{         
     System.out.print("Mode de Paiement :");
     System.out.println("1.- Credit :");
     System.out.println("2.- Cash :");
     System.out.println("3.- Cheque :");
     System.out.println("4.- Carte de credit :");
     System.out.println("5.- Carte de debit :");
         a = sc.nextInt();
         }while(a<0 && a>6);
     
        ModePaiement:
         
        if(a==1){
            System.out.println("Vous achetez a credi. Entrez le montant du");
            ven.setModPaiement("Credit");
            ven.setDette(sc.nextFloat());
        } else if(a ==2){
            System.out.println("Vous payez cash");
            ven.setModPaiement("Cash");
        }else if(a==3){
            System.out.println("Vous payez par cheque");
            ven.setModPaiement("Cheque");
        }else if(a==4){
           System.out.println("Vous payez avec une carte de credit");
           ven.setModPaiement("Credit Card");
        }else if(a==5){
            System.out.println("Vous payez avec une carte de debit");
            ven.setModPaiement("debit card");
        }
         
      Random r=new Random();
      String id=ven.getNomProduits().substring(0,1)+"-"+r.nextInt(100, 1000);
     ven.setIdVente(id.toUpperCase());
        // ajouter les ventes dans la collection
      arv.add(new Ventes(ven.getIdVente(),ven.getNomProduits(), ven.getIdClients(), ven.getModPaiement(), ven.getDette(),
      ven.getQuantiteProd(),ven.getDateVente(), ven.getTotal()));
     }
     }

    public void rechercher() {
    if (arv.isEmpty()){
         System.out.println("Aucune ventes n'a ete enregistre !");
     }else{
         System.out.print("Entrer le code de la vente a rechercher:");
         String nCode=sc.nextLine();
         short comp=0;
          System.out.println("-------------------------------------------------");
     
         for(Ventes ov:arv){
             if(ov.getIdVente().equalsIgnoreCase(nCode)){
                 System.out.println(ov.toString());
                  System.out.println("-------------------------------------------------");
     
                 comp++;
             }
         }
         if(comp==0){
         System.out.println("Il y a aucune vente dans la categorie "+nCode);
    
         }else{
         System.out.println("Nombre de vente:"+comp);
     
         }
     }
    }
    
    public void afficher() {
      if(arv.isEmpty()){
          System.out.println("Aucun venuit n'est encore enregistre !");
      }else{
       System.out.println("-------------------------------------------------");
        for(Ventes ven:arv){
            System.out.println(ven.toString());
            System.out.println("-------------------------------------------------");
        }
         System.out.println("Nombre de venuit:"+arv.size());
      
      }
    }

    public void supprimer() {
    if (arv.isEmpty()){
         System.out.println("Aucun venrage n'a ete enregistre !");
     }else{
         System.out.print("Entrer le code du venuit a supprimer:");
         String nCode=sc.nextLine();
         short comp=0;
          System.out.println("-------------------------------------------------");
     
         for(Ventes ov:arv){
             if(ov.getIdVente().equalsIgnoreCase(nCode)){
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
         System.out.println("Il y a aucun venuit ayant ce code"+nCode);
    
         }else{
         System.out.println("Nombre de venuits:"+comp);
     
         }
     }
    }

    public void afficherType() {
     if (arv.isEmpty()){
         System.out.println("Aucun Vente n'a ete enregistre !");
     }else{
         System.out.print("Entrer le type de ventes a afficher:");
         String nCateg=sc.nextLine();
         short comp=0;
          System.out.println("-------------------------------------------------");
      
         for(Ventes ov:arv){
             if(ov.getModPaiement().equalsIgnoreCase(nCateg)){
                 System.out.println(ov.toString());
              System.out.println("-------------------------------------------------");
     
                 comp++;
             }
         }
         if(comp==0){
         System.out.println("Il y a aucune vente dans la categorie "+nCateg);
    
         }else{
         System.out.println("Nombre de vente:"+comp);
     
         }
     }
    }

}
