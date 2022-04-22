/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.botiga_sabates_montserrat_cifuentes;

import java.util.Scanner;

/**
 *
 * @Montserrat_Cifuentes
 */
public class Client implements Botiga{
    private boolean registreBotiga = false;
    private boolean iniciBotiga = false;
    private String nom;
    private String cognom1;
    private String cognom2;
    private String pasword;
    private boolean correctPasword = false;
    private String mail;
    private boolean correctMail = false;
  
    @Override
    public boolean registre() {
        System.out.println("Vols registrar-te a la botiga de Sabates i Bosses?");
        Scanner scaner = new Scanner(System.in);
        String resposta = scaner.nextLine().toLowerCase().trim();
        switch(resposta){
            case "si": registreBotiga = true;
                break;
            case "no":  System.out.println("Gràcies per visitar la nostra botiga de Sabates i Bosses");
                        registreBotiga = false;
                break;
            default:    System.out.println("Gràcies per visitar la nostra botiga de Sabates i Bosses");
                        registreBotiga = false;
                break;
            }
        return registreBotiga;
    }

    @Override
    public void registreClient() {
        Scanner scaner = new Scanner(System.in);
        registre();
        if (registreBotiga){
        System.out.println("Per a realitzar el registre, has de facilitar algunes dades personals.");
            System.out.println("NOM:");
            nom = scaner.nextLine();
            System.out.println("PRIMER COGNOM:");
            cognom1 = scaner.nextLine();
            System.out.println("SEGON COGNOM:");
            cognom2 = scaner.nextLine();
            System.out.println("CORREU ELECTRÒNIC:");
            mail = scaner.nextLine();
            System.out.println("NOVA CONTRASENYA:");
            pasword = scaner.nextLine();
            System.out.println("El registre s'ha efectuat de forma exitosa.");
            System.out.println("El seu usuari es: " + mail);
            System.out.println("La seva contrasenya es: " + pasword);     
        }                
    }

    @Override
    public boolean inici() {
        System.out.println("Vol iniciar sessió a la botiga de Sabates i Bosses?");
        Scanner scaner = new Scanner(System.in);
        String resposta = scaner.nextLine().toLowerCase().trim();
        switch(resposta){
            case "si": iniciBotiga = true;
                break;
            case "no":  System.out.println("Gràcies per visitar la nostra botiga de Sabates i Bosses");
                        iniciBotiga = false;
                break;
            default:    System.out.println("Gràcies per visitar la nostra botiga de Sabates i Bosses");
                        iniciBotiga = false;
                break;
            }
        return iniciBotiga;
    }

    @Override
    public void iniciSessio() {
        Scanner scaner = new Scanner(System.in);
        inici();
        String usuariIn = null;
        String paswordIn = null;
        for (int i = 0; i < 1; i++) {
           if (iniciBotiga){
                System.out.println("Ha d'introduir les dades de client: "); 
                System.out.println("Introduir USUARI: ");
                usuariIn = scaner.nextLine();
                System.out.println("Introduir CONTRASENYA: ");
                paswordIn = scaner.nextLine();  
            } 
            if(!usuariIn.equals(mail)&& !paswordIn.equals(pasword)){
                System.out.println("Les dades introduides son INCORRECTES.");
                i=0;         
            } 
        }    
    }

    @Override
    public boolean cistella() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean compra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void veureArticles() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void homeBotiga() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void tancarSessio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the cognom
     */
    public String getCognom1() {
        return cognom1;
    }

    /**
     * @param cognom the cognom to set
     */
    public void setCognom1(String cognom) {
        this.cognom1 = cognom;
    }

    public String getCognom2() {
        return cognom2;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public boolean isCorrectPasword() {
        return correctPasword;
    }

    public void setCorrectPasword(boolean correctPasword) {
        this.correctPasword = correctPasword;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isCorrectMail() {
        return correctMail;
    }

    public void setCorrectMail(boolean correctMail) {
        this.correctMail = correctMail;
    }
    
}
