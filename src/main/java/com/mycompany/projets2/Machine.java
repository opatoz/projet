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
    private int refmachine;
    private String dmachine;
    private float x;
    private float y;
    private float coût;
    private float durée;
    private String type;

    public int getRefmachine() {
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

    public void setRefmachine(int refmachine) {
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
