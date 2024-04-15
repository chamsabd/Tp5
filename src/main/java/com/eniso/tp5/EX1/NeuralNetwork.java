/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.EX1;

/**
 *
 * @author chams
 */
public class NeuralNetwork extends BaseModel {
private int[] layers;
private String activationFunction;
    public NeuralNetwork(String name, int version, String description) {
        super(name, version, description);
    }

    public NeuralNetwork(String name ,int[] layers, String activationFunction) {
        super(name, 1, "");
        this.layers = layers;
        this.activationFunction = activationFunction;
    }


    @Override
    public void train(Dataset dataset) {
     System.out.print(": Entraîne le modèle NeuralNetwork en utilisant l’ensemble de données fourni");
   }

    @Override
    public double predict(Dataset dataset) {
         System.out.print(" Prédit un résultat de NeuralNetwork basé sur une instance donnée");
    return 0;  }
    
}
