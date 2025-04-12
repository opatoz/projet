/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projets2;

/**
 *
 * @author Elève
 */
import java.io.*;
import java.util.*;

public class LectureFichier {
    
    public static Map<String, ArrayList<Evenement>> LireFichier (String nomFichier) {
    Map<String, ArrayList<Evenement>> map = new HashMap<>();
    
    try (BufferedReader lire = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            
            while ((ligne = lire.readLine()) != null) {
                if (ligne.trim().isEmpty()) continue; // sauter lignes vides

                String[] tokens = ligne.split("\\s+");
                if (tokens.length < 6) continue; // ignorer lignes malformées

                String date = tokens[0];
                String heure = tokens[1];
                String machine = tokens[2];
                char evenement = tokens[3].charAt(0);
                String operateur = tokens[4];
                String cause = tokens[5];
                
                Evenement ev = new Evenement(date, heure, machine, evenement, operateur, cause);
                
                if (!map.containsKey(machine)) { // si la machine était pas encore dans le map
                    map.put(machine, new ArrayList<>()); // on ajoute une liste vide (dont la clé est la machine) qui contiendra les ev lié à la machine
                }
                map.get(machine).add(ev); // puis on ajoute l'ev crée à cette liste 
                // avec lambda : map.computeIfAbsent(machine, k -> new ArrayList<>()).add(event);
            } 
        }
        catch (IOException e) {
        System.err.println("Erreur de lecture du fichier : " + e.getMessage());
        }

        return map;
    }
}
    
