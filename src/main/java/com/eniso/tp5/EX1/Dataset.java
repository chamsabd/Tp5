/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.EX1;

/**
 *
 * @author chams
 */
public abstract class Dataset {
    protected boolean isTrain;
    protected String path;

    public Dataset( String path,boolean isTrain) {
        this.isTrain = isTrain;
        this.path = path;
    }
    
    public abstract void  chargementDonnes();
      public abstract void  pretraitementDonnes();
}
