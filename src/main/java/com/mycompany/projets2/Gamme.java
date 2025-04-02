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
