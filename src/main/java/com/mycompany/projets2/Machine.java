/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projets2;

/**
 *
 * @author Justin
 */
public class Machine extends Equipement {
    private String refmachine;
    private String dmachine;
    private float x;
    private float y;
    private float coût;
    private float durée; // pas besoin de durée si ????
    private String etat; // "operationnel", "en arrêt", etc.
    private String type;
    
    public Machine (String refmachine, String dmachine, float x, float y, float cout,String etat, String type){
        super(refmachine,dmachine);
        this.x = x;
        this.y = y;
        this.coût = cout;
        this.etat = etat;
        this.type = type;    
    }
    
    public float duree (Produit p){
            //écrire operation 
            return durée;
    }
    @Override
    public float coutOperation(float dureeOperation){
        return dureeOperation * coût;
    }
  
    @Override
    public void afficherEquipement() { // j'avais mis afficherMachine au début mais marcher pas car faut implement toute les methode de la classe Eq si on peut veut Machine soit pas une classe ab
        System.out.println("Référence Machine: " + refmachine);
        System.out.println("Désignation: " + dmachine);
        System.out.println("Type: " + type);
        System.out.println("Coût horaire: " + coût);
        System.out.println("Position: (" + x + ", " + y + ")");
        System.out.println("Durée d'opération (produit spécifique) : " + durée);
    }
    
    public String getRefmachine(){
        return refmachine;
    }

    public String getDmachine() {
        return dmachine;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getCoût() {
        return coût;
    }

    public float getDurée() {
        return durée;
    }

    public String getType() {
        return type;
    }

    public void setRefmachine(String refmachine) {
        this.refmachine = refmachine;
    }

    public void setDmachine(String dmachine) {
        this.dmachine = dmachine;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setCoût(float coût) {
        this.coût = coût;
    }

    public void setDurée(float durée) {
        this.durée = durée;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
