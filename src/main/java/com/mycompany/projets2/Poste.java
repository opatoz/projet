/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projets2;

/**
 *
 * @author Justin
 */
import java.util.ArrayList;
       
public class Poste extends Equipement{
    private String refposte;
    private String dposte;
    private ArrayList<Machine> machines;
    
    
public Poste(String refPoste, String dPoste, ArrayList<Machine> machines) {
        super(refPoste,dPoste);
        this.machines = machines;
    }
    @Override
    public float coutOperation(float dureeOperation){
        float coutTotal = 0.0f;
        for (Machine machine : machines) {
            coutTotal += machine.coutOperation(dureeOperation);
        }
        return coutTotal;
    }
    
    @Override
    public void afficherEquipement(){
        System.out.println("Reférence Poste:"+refposte);
        System.out.println("Designation:"+dposte);
        for (Machine m : machines){
            m.afficherEquipement();
        }
    }
    public int getRefposte() {
        return refposte;
    }

    public void setRefposte(int refposte) {
        this.refposte = refposte;
    }

    public String getDposte() {
        return dposte;
    }

    public void setDposte(String dposte) {
        this.dposte = dposte;
    }

    public ArrayList<Machine> getMachines() {
        return machines;
    }

    public void setMachines(ArrayList<Machine> machines) {
        this.machines = machines;
    }
    
    
    
}
