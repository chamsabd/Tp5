/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.EX1;

/**
 *
 * @author chams
 */
public class SupportVectorMachine extends BaseModel {
    protected int iterations;
    protected double learningRate;
    public SupportVectorMachine(String name, int version, String description) {
        super(name, version, description);
    }
 

    @Override
    public void train(Dataset dataset){
      System.out.print(": Entraîne le modèle SVM  en utilisant l’ensemble de données fourni");
  }

    @Override
    public double predict(Dataset dataset) {
     System.out.print(" Prédit un résultat de SVM basé sur une instance donnée");
    return 0;
}
    
}
