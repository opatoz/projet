/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projets2;

/**
 *
 * @author Elève
 */
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Main {
    



    public static void main(String[] args) {
        // Création des objets Equipement
        Machine machine1 = new Machine("M001", "Machine 1", 10.5f, 20.5f, 50.0f, "operationnel", "TypeA");
        Machine machine2 = new Machine("M002", "Machine 2", 12.0f, 21.0f, 60.0f, "en arrêt", "TypeB");

        // Création d'un opérateur
        ArrayList<String> competences = new ArrayList<>();
        competences.add("TypeA");
        competences.add("TypeB");
        Operateur operateur1 = new Operateur("John", "Doe", "O001", competences, true);

        // Création des opérations
        Opération operation1 = new Opération("Op001", "Opération 1", machine1, 2.5f);
        Opération operation2 = new Opération("Op002", "Opération 2", machine2, 3.0f);

        // Création de la gamme
        ArrayList<Opération> operations = new ArrayList<>();
        operations.add(operation1);
        operations.add(operation2);
        ArrayList<Equipement> equipements = new ArrayList<>();
        equipements.add(machine1);
        equipements.add(machine2);
        Gamme gamme1 = new Gamme("G001", operations, equipements);

        // Création des produits
        Produit produit1 = new Produit("P001", "Produit A");
        Produit produit2 = new Produit("P002", "Produit B");

        // Création d'un poste avec plusieurs machines
        ArrayList<Machine> machinesPoste = new ArrayList<>();
        machinesPoste.add(machine1);
        machinesPoste.add(machine2);
        Poste poste1 = new Poste("P001", "Poste de production 1", machinesPoste);

        // Test des méthodes d'affichage
        System.out.println("\nTest de l'affichage des objets :");
        machine1.afficherEquipement();
        machine2.afficherEquipement();
        operateur1.afficherOperateur();
        operation1.afficherOperation();
        operation2.afficherOperation();
        gamme1.afficherGamme();
        produit1.afficherProduit();
        produit2.afficherProduit();
        poste1.afficherEquipement();

        // Test du calcul des coûts
        System.out.println("\nCoût d'une opération sur la Machine 1 : " + machine1.coutOperation(2.0f) + " euros");
        System.out.println("Coût d'une opération sur la Machine 2 : " + machine2.coutOperation(2.5f));
        System.out.println("Coût total de la Gamme 1 : " + gamme1.coutGamme() + " euros");
        System.out.println("Durée totale de la Gamme 1 : " + gamme1.dureeGamme() + " heures");

        // Test de la gestion des événements
        ArrayList<Evenement> evenements = new ArrayList<>();
        Evenement ev1 = new Evenement("2025-04-24", "08:00", "Machine 1", 'A', "Operateur A", "Problème mécanique");
        Evenement ev2 = new Evenement("2025-04-24", "10:00", "Machine 1", 'D', "Operateur B", "Réparation terminée");
        evenements.add(ev1);
        evenements.add(ev2);

        // Création d'un objet Fiabilité avec les événements
        Map<String, Long> tempsArret = new HashMap<>();
        Map<String, Evenement> arretsEnCours = new HashMap<>();
        
        // Calculer le temps d'arrêt
        long dureeArret = fiabilité.calculerDuree(ev1.getDate(), ev1.getHeure(), ev2.getDate(), ev2.getHeure());
        
        // Ajouter les événements dans la map
        arretsEnCours.put(ev1.getMachine(), ev1);
        tempsArret.put(ev1.getMachine(), dureeArret);

        // Créer l'objet Fiabilité
        Fiabilité fiabilite = new Fiabilité(tempsArret, arretsEnCours);
        
        // Analyse des événements de maintenance
        fiabilite.analyser(evenements);

        // Affichage du classement des machines les plus fiables
        fiabilite.afficherClassement(fiabilite.TrieMachine());

        // Affichage de la durée de l'arrêt
        System.out.println("Durée de l'arrêt de la Machine 1 : " + dureeArret + " minutes");
    }
}
