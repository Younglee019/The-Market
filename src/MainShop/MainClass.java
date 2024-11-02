/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainShop;

import Operations.TraitementsClients;
import Operations.TraitementsProduits;
import Operations.TraitementsVentes;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Owner
 */
public class MainClass {

    public static void main(String[] args) {
        int  b ,c ,d ,e;         
        TraitementsProduits tpr=new TraitementsProduits();        
        TraitementsClients tpc=new TraitementsClients();
        TraitementsVentes tvt=new TraitementsVentes();
        Scanner sc=new Scanner(System.in);
        Menu:
        do{
            //Menu principal du programme
            System.out.println("Bienvenue a vous. Choisissez le chiffre correspondant a votre choix");
            System.out.println("1.- Produits");            
            System.out.println("2.- Clients");
            System.out.println("3.- Ventes");            
            System.out.println("4.- Quiter \n");
            String x = sc.nextLine();
                        while(!MainClass.checkforDigits(x)){ 
                            System.out.println("L'element saisi n'est pas un entier");
                            x = sc.nextLine();                
                        }
                     b = Integer.parseInt(x);

                     //c est un entier alors faisons le choix qui est dans le menu
                     while(b<0 || b>=5){
                         System.out.println("L'entier saisi n'est pas dans le menu");
                         b = sc.nextInt();
                     }
        switch(b){
            case 1:
                System.out.println("Vous avez choisi -Produits-. ");
                System.out.println("Que voulez vous faire avec dans le menu Produits?");
                    do{
                //Menu Produits
                System.out.println("1. Enregistrer Produit");
                System.out.println("2. Afficher Produit");
                System.out.println("3. Supprimer Produit");
                System.out.println("4. Croissant");
                System.out.println("5. Decroissant");
                System.out.println("6. Quitter \n");
                System.out.print("Option choisie=>");
                String y = sc.nextLine();
                        while(!MainClass.checkforDigits(y)){ 
                            System.out.println("L'element saisi n'est pas un entier");
                            y = sc.nextLine();                
                        }
                     c = Integer.parseInt(y);

                     //c est un entier alors faisons le choix qui est dans le menu
                     while(c<0 || c>=7){
                         System.out.println("L'entier saisi n'est pas dans le menu");
                         c = sc.nextInt();
                     }
                    switch(c){
                        case 1:
                            tpr.enregistrer();
                        break;
                        case 2:
                            tpr.afficher();
                        break;
                        case 3:
                            tpr.supprimer();
                        break;
                        case 4:
                            tpr.croissant();
                        break;
                        case 5:
                            tpr.decroissant();
                        break;
                        default:
                            System.out.println("Il faut choisir une option du menu");
                        break;
                        case 6:
                            continue Menu;
                        
                    }
                    }while(c<=6);
                
            break;
            case 2:
                System.out.println("Vous avez choisi -Clients-. ");
                System.out.println("");
                System.out.println("Que voulez vous faire avec dans le menu Clients?");
                
                do{
                    //Menu Clients
                    System.out.println("1. Enregistrer Client");
                    System.out.println("2. Afficher Client");
                    System.out.println("3. Afficher Les clients par dette");
                    System.out.println("4. Afficher les produits achetes par un client");
                    System.out.println("5. Modifier telephone");
                    System.out.println("6. Modifier adresse");
                    System.out.println("7. Modifier adresse et telephone");
                    System.out.println("8. Quitter \n");
                    System.out.print("Option choisie=>");
                    String v = sc.nextLine();
                        while(!MainClass.checkforDigits(v)){ 
                            System.out.println("L'element saisi n'est pas un entier");
                            v = sc.nextLine();                
                        }
                     d = Integer.parseInt(v);

                     //c est un entier alors faisons le choix qui est dans le menu
                     while(d<0 || d>=9){
                         System.out.println("L'entier saisi n'est pas dans le menu");
                         d = sc.nextInt();
                     }
                switch(d){
                    case 1:
                        tpc.enregistrer();
                    break;
                    case 2:
                        tpc.afficher();
                    break;
                    case 3:
                        tpc.afficherParDette();
                    break;
                    case 4:
                        tpc.afficherProduitsClients();
                    break;
                    case 5:
                        tpc.modifierTelephone();
                    break;
                    case 6:
                        tpc.modifierAdresse();
                    break;
                    case 7:
                        tpc.modifier();
                    break;
                    default:
                        System.out.println("Il faut choisir une option du menu");
                    break;                
                    case 8:
                        continue Menu;
                 }   
                }while(d<=8);
                
            break;
            case 3:
                System.out.println("Vous avez choisi -Ventes-. ");
                System.out.println("Que voulez vous faire avec dans le menu Ventes?");
                do{
                    //Menu Ventes
                    System.out.println("1. Enregistrer");
                    System.out.println("2. Afficher");
                    System.out.println("3. Afficher par categorie");
                    System.out.println("4. Rechercher");
                    System.out.println("5. Modifier");
                    System.out.println("6. Supprimer");
                    System.out.println("7. Croissant");
                    System.out.println("8. Decroissant");
                    System.out.println("9. Quitter\n");
                    System.out.print("Option choisie=>");
                    String w = sc.nextLine();
                        while(!MainClass.checkforDigits(w)){ 
                            System.out.println("L'element saisi n'est pas un entier");
                            w = sc.nextLine();                
                        }
                     e = Integer.parseInt(w);

                     //c est un entier alors faisons le choix qui est dans le menu
                     while(e<0 || e>=10){
                         System.out.println("L'entier saisi n'est pas dans le menu");
                         e = sc.nextInt();
                     }
                switch(e){
           
                    case 1:
                        tvt.enregistrer();
                    break;
                    case 2:
                        tvt.afficher();
                    break;
                    case 3:
                        tvt.supprimer();
                    break;
                    case 4:
                        tvt.afficherType();
                    break;
                    case 5:
                        tvt.rechercher();
                    break;                    
                    default:
                        System.out.println("Il faut choisir une option du menu");
                    break;
                    case 6:
                        continue Menu;
                }
                }while(e<=6);
            break;
            case 4:
                 System.exit(0);
            break;
            default:
                System.out.println("Vous avez choisi un element qui n'est pas dans le menu. ");              
            break;
            
            }   

        }while(b<=4);
        
        
        
    }

    //verifier si une chaine de caractere ne contient que des elements digitales
    public static boolean checkforDigits(String s){
            if(s==null || s.isBlank()){
                return false;
            }
            for(int x=0;x<s.length();x++){
                if(!Character.isDigit(s.charAt(x))){
                    return false;
                }
            }
            return true;
        }
    
    //verifier l'expression de l'email

        public static boolean validateEmail(String email){
        if(email==null || email.isEmpty()){
            return false;
        }
        
        String emailRegex = "[\\w-]{1,20}@\\w{2,20}\\.\\w{2,3}$";
        Pattern pattern = Pattern.compile(emailRegex);
        if(pattern.matcher(email).matches()){
            return true;
        } else{
            System.out.println("format incorrect: xxxxxx@xxxxxx.xxx \n");
            return false;
        }
    }
}

