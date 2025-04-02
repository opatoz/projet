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
       
public class Poste extends Equipement {
    private int refposte;
    private String dposte;
    private ArrayList<Machine> machines;

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
