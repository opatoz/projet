/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projets2;

/**
 *
 * @author Elève
 */
public abstract class Equipement { // abs pour rassembler les opérations commune à Machine et Poste
    private String RefEquipement;
    
    public void AfficherEquipement (){
    }
    public abstract float coutOperation(float dureeOperation);
    }
    public String getRefEquipement() {// faut les enlever ou pas 
        return RefEquipement;
    }

    public void setRefEquipement(String RefEquipement) {
        this.RefEquipement = RefEquipement;
    }
    
}
