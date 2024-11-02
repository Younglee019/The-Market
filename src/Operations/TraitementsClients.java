/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operations;

import Operations.Clients;
import MainShop.MainClass;
import Operations.Produits;
import Operations.TraitementsProduits;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author Owner
 */
public class TraitementsClients {
    static Clients clt=new Clients();
    static ArrayList<Clients> arv=new ArrayList<Clients>();
    static Scanner sc=new Scanner(System.in);
    //Regular expression for email
    String regex = "^(.+)@(.+)$";
    Pattern pattern = Pattern.compile(regex);
    
     public static void enregistrer() {
        do{
     System.out.print("Nom : \n");
     clt.setNomClient(sc.nextLine());
         }while(clt.getNomClient().isEmpty());
     do{
     System.out.print("Prenom : \n");
     clt.setPrenom(sc.nextLine());
         }while(clt.getPrenom().isEmpty());
     
         do{
             //setValid est une booleenne qui recoit le ValidateEmail de la classe principale
     System.out.print("Email :\n");
        clt.setEmail(sc.nextLine()); //setEmail lit línformation et le renvoie a getEmail
        clt.setValid(MainClass.validateEmail(clt.getEmail()));
         }while(clt.getValid()==false);
         
         do{
     System.out.print("Adresse :\n");
     clt.setAdresse(sc.nextLine());
         }while(clt.getAdresse().isEmpty());
         
         
         //Gestion du menu sexe
         Sexe:
         do{
     System.out.print("Sexe : \n");
     System.out.print("1.- Masculin \n");
     System.out.print("2.- Feminin \n");
     
     String v = sc.nextLine();
            while(!MainClass.checkforDigits(v)){ 
                System.out.println("L'element saisi n'est pas un entier");
                v = sc.nextLine();                
            }
        clt.setDonnee1(Integer.parseInt(v));

         //c est un entier alors faisons le choix qui est dans le menu
         while(clt.getDonnee1()<0 || clt.getDonnee1()>2){
             System.out.println("L'entier saisi est incorrect");
             clt.setDonnee1(sc.nextInt());
         }
            switch(clt.getDonnee1()){
                case 1:
                    clt.setSexe("Masculin");
                    System.out.println("Vous etes du genre Masculin \n");
                    break;
                case 2:
                    clt.setSexe("Feminin");
                    System.out.println("Vous etes du genre Feminin \n");
                    break;
                default:
                    System.out.println("L'Element saisi incorrect \n"); 
                    break;
                }
         }while(clt.getDonnee1()>2);
         
         do{
     System.out.print("Telephone : (format: 12345678)\n");
        String w = sc.nextLine();
               while(!MainClass.checkforDigits(w)){ 
                   System.out.println("Un numero valide se compose que des entiers");
                   w = sc.nextLine();                
               }
           clt.setTelephone(Integer.parseInt(w));

            //c est un entier alors faisons le choix qui est dans le menu
            while(clt.getTelephone()<9999999 || clt.getTelephone()>999999999){
                System.out.println("L'entier saisi est incorrect");
                System.out.println("Telephone:");
                clt.setTelephone(sc.nextInt());
            }     
     
         }while(clt.getTelephone()==0);
     
      
      
      Random r=new Random();
      String id=clt.getNomClient().substring(0,1)
      + clt.getPrenom().substring(0,1)+"-"+r.nextInt(100, 1000);
     clt.setIdClient(id.toUpperCase());
        // ajouter les clientss dans la collection
      arv.add(new Clients(clt.getIdClient(),clt.getNomClient(),
      clt.getPrenom(),clt.getEmail(),clt.getSexe(), clt.getAdresse(), clt.getTelephone(), clt.getValid(), clt.getDonnee2(), clt.getDonnee1()));
     }
    
    public static void afficher() {
      if(arv.isEmpty()){
          System.out.println("Aucun clients n'est encore enregistre !");
      }else{
       System.out.println("-------------------------------------------------");
        for(Clients clt:arv){
            System.out.println(clt.toString());
            System.out.println("-------------------------------------------------");
        }
         System.out.println("Nombre d'clients:"+arv.size());
      
      }
    }

    public static void afficherParCategorie() {
     if (arv.isEmpty()){
         System.out.println("Client n'a ete enregistre !");
     }else{
         System.out.print("Entrer l'ID du client a afficher:");
         String nCateg=sc.nextLine();
         short comp=0;
          System.out.println("-------------------------------------------------");
      
         for(Clients pro:arv){
             if(pro.getNomClient().equalsIgnoreCase(nCateg)){
                 System.out.println(pro.toString());
              System.out.println("-------------------------------------------------");
     
                 comp++;
             }
         }
         if(comp==0){
         System.out.println("Il y a aucun clients dans la categorie "+nCateg);
    
         }else{
         System.out.println("Nombre d'clients:"+comp);
     
         }
     }
    }

    public static void rechercher() {
    if (arv.isEmpty()){
         System.out.println("Aucun client n'a ete enregistre !");
     }else{
         System.out.print("Entrer le code du client a rechercher:");
         String nCode=sc.nextLine();
         short comp=0;
          System.out.println("-------------------------------------------------");
     
         for(Clients pro:arv){
             if(pro.getIdClient().equalsIgnoreCase(nCode)){
                 System.out.println(pro.toString());
                  System.out.println("-------------------------------------------------");
     
                 comp++;
             }
         }
         if(comp==0){
         System.out.println("Il y a aucun client dans la categorie "+nCode);
    
         }else{
         System.out.println("Nombre d'clients:"+comp);
     
         }
     }
    }
    
     public static void rechercher1() {
    if (arv != null){
         String nCode=sc.nextLine();
         short comp=0;
          System.out.println("-------------------------------------------------");
     
         for(Clients pro:arv){
             if(pro.getIdClient().equalsIgnoreCase(nCode)){
                 System.out.println(pro.toString());
                  System.out.println("-------------------------------------------------");
     
                 comp++;
             }
         }
         if(comp==0){
         System.out.println("Il y a aucun client dans la categorie "+nCode);
    
         }else{
         System.out.println("Nombre d'clients:"+comp);
     
         }
     }
    }
     // This method compares each id client to the given code
     public static boolean Contains(String code){
         for (Clients cl : arv){
             if (cl.getIdClient().equalsIgnoreCase(code))
                 return true;
         }
         return false;
     }
     // End of the methode

    public void modifier() {
 if (arv.isEmpty()){
         System.out.println("Aucun clients n'a ete enregistre !");
     }else{
         System.out.print("Entrer le code du client a modifier:");
         String nCode=sc.nextLine();
         short comp=0;
          System.out.println("-------------------------------------------------");
     
         for(Clients pro:arv){
             if(pro.getIdClient().equalsIgnoreCase(nCode)){
                 System.out.println(pro.toString());
                  System.out.println("-------------------------------------------------");
                     System.out.print("Entrer le nouveau numero:");
                     int nTelephone=sc.nextInt();
                     pro.setTelephone(nTelephone);
                 comp++;
             }
         }
         for(Clients pro:arv){
             if(pro.getIdClient().equalsIgnoreCase(nCode)){
                 System.out.println(pro.toString());
                  System.out.println("-------------------------------------------------");
                     
                     System.out.print("Entrer la nouvelle adresse:");
                     String nEmail=sc.nextLine();
                     pro.setEmail(nEmail);
                 comp++;
             }
         }
         
         
         if(comp==0){
         System.out.println("Il y a aucun client avec ce code "+nCode);
    
         }else{
         System.out.println("Nombre de clients:"+comp);
     
         }
     }
    }

     
    
    public void rechercherParDette() {
      if (arv.isEmpty()){
         System.out.println("Aucun client n'a ete enregistre !");
     }else{
         System.out.print("Entrer le code du client a rechercher:");
         String nCode=sc.nextLine();
         short comp=0;
          System.out.println("-------------------------------------------------");
     
         for(Clients pro:arv){
             if(pro.getIdClient().equalsIgnoreCase(nCode)){
                 System.out.println(pro.toString());
                  System.out.println("-------------------------------------------------");
     
                 comp++;
             }
         }
         if(comp==0){
         System.out.println("Il y a aucun client dans la categorie "+nCode);
    
         }else{
         System.out.println("Nombre d'clients:"+comp);
     
         }
     }
    }

    public void afficherParDette() {
        if (arv.isEmpty()){
         System.out.println("Client n'a ete enregistre !");
     }else{
         System.out.print("Entrer l'ID du client a afficher:");
         String nCateg=sc.nextLine();
         short comp=0;
          System.out.println("-------------------------------------------------");
      
         for(Clients pro:arv){
             if(pro.getNomClient().equalsIgnoreCase(nCateg)){
                 System.out.println(pro.toString());
              System.out.println("-------------------------------------------------");
     
                 comp++;
             }
         }
         if(comp==0){
         System.out.println("Il y a aucun clients dans la categorie "+nCateg);
    
         }else{
         System.out.println("Nombre d'clients:"+comp);
     
         }
     }
    }

    public void afficherProduitsClients() {
        if (arv.isEmpty()){
         System.out.println("Client n'a ete enregistre !");
     }else{
         System.out.print("Entrer l'ID du client a afficher:");
         String nCateg=sc.nextLine();
         short comp=0;
          System.out.println("-------------------------------------------------");
      
         for(Clients pro:arv){
             if(pro.getNomClient().equalsIgnoreCase(nCateg)){
                 System.out.println(pro.toString());
              System.out.println("-------------------------------------------------");
     
                 comp++;
             }
         }
         if(comp==0){
         System.out.println("Il y a aucun clients dans la categorie "+nCateg);
    
         }else{
         System.out.println("Nombre d'clients:"+comp);
     
         }
     }}

    public void modifierTelephone() {
        if (arv.isEmpty()){
                System.out.println("Aucun clients n'a ete enregistre !");
            }else{
                System.out.print("Entrer l'ID du client a modifier l'adresse:");
                String nCode=sc.nextLine();
                short comp=0;
                 System.out.println("-------------------------------------------------");

                for(Clients ov:arv){
                    if(ov.getIdClient().equalsIgnoreCase(nCode)){
                        System.out.println(ov.toString());
                         System.out.println("-------------------------------------------------");
                            System.out.print("Entrer le nouveau numero:");
                            int nNumero=sc.nextInt();
                            ov.setTelephone(nNumero);
                        comp++;
                    }
                }
                if(comp==0){
                System.out.println("Il y a aucun client dans la categorie "+nCode);

                }else{
                System.out.println("Nombre de clients:"+comp);

                }
            }
    }

    public void modifierAdresse() {
        if (arv.isEmpty()){
                System.out.println("Aucun clients n'a ete enregistre !");
            }else{
                System.out.print("Entrer l'ID du client a modifier l'email:");
                String nCode=sc.nextLine();
                short comp=0;
                 System.out.println("-------------------------------------------------");

                for(Clients ov:arv){
                    if(ov.getIdClient().equalsIgnoreCase(nCode)){
                        System.out.println(ov.toString());
                         System.out.println("-------------------------------------------------");
                            System.out.print("Entrer la nouvelle adresse mail:");
                            String nAdresse=sc.nextLine();
                            ov.setAdresse(nAdresse);
                        comp++;
                    }
                }
                if(comp==0){
                System.out.println("Il y a aucun client dans la categorie "+nCode);

                }else{
                System.out.println("Nombre de clients:"+comp);

                }
            }
    }
}
