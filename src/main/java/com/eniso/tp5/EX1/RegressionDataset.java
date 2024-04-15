/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.EX1;

/**
 *
 * @author chams
 */
public class RegressionDataset extends Dataset{
private double[] targets;
private int numFeatures;

    public RegressionDataset(String path, boolean isTrain) {
        super(path, isTrain);
    }
    @Override
    public void chargementDonnes() {
      System.out.print("Implémentation du chargement des données de regresion.\n" );
    }

    @Override
    public void pretraitementDonnes() {
       System.out.print("Implémentation du prétraitement spécifique aux tâches de regresion.\n" );
    }
    
}
