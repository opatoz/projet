/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projets2;

import java.util.ArrayList;

/**
 *
 * @author Justin
 */
public class Gamme {
    private String refGamme;
    private ArrayList<Opération> operations;
    private ArrayList<Equipement> equipements;
    
    public Gamme (String refGamme, ArrayList<Opération> operations, ArrayList<Equipement> equipements ){
        this.refGamme = refGamme;
        this.operations = operations;
        this.equipements = equipements;        
    }
    // le constructeur et créeGamme font la mm chose donc on fait qd mm créeGamme ?
    
    public void modifierGamme (ArrayList<Opération> operations, ArrayList<Equipement> equipements ){
        this.operations = operations;
        this.equipements = equipements;
    }
    
    public void supprimerGamme(){
        this.refGamme = null;
        this.operations.clear(); // clear = methode qui vide une liste en gardant sa ref (pas besoin de crée nouvelle instance : this.ope = list vide)
        this.equipements.clear();
    }
    public void afficherGamme (){
        System.out.println ("Référence de la Gamme :"+refGamme);
        for (Equipement e : equipements){
            e.AfficherEquipement();
        }
         
    }
    public String getRefGamme() {
        return refGamme;
    }

    public ArrayList<Opération> getOperations() {
        return operations;
    }

    public ArrayList<Equipement> getEquipements() {
        return equipements;
    }

    public void setRefGamme(String refGamme) {
        this.refGamme = refGamme;
    }

    public void setOperations(ArrayList<Opération> operations) {
        this.operations = operations;
    }

    public void setEquipements(ArrayList<Equipement> equipements) {
        this.equipements = equipements;
    }
    
    
    
}
