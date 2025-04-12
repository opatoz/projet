/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projets2;

/**
 *
 * @author Elève
 */
import java.time.LocalDate;
import java.time.LocalTime;

public class Evenement {
    private String date;
    private String heure;
    private String machine; // on pourrait mettre machine comme type pour que se soit plus "réelle" mais on dervait refaire des methodes pour recup machine avec sa ref, etc alors qu'en vrai on a besoin que du nom dc laisse String
    private char typeEv; //A ou D
    private String operateur; // pareil on a besoin que du nom de l'ope donc String comme type
    private String cause;  
    
    public Evenement (String date,String heure,String machine,char typeEv,String operateur,String cause){
        this.date = date;
        this.heure = heure;
        this.machine = machine;
        this.operateur = operateur;
        this.typeEv = typeEv;
        this.cause = cause;
    }
}
    
