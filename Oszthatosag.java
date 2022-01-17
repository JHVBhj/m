/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farm.osztomaven;

/**
 *
 * @author x
 */
public class Oszthatosag {
    private MaradekService maradekService;

    public Oszthatosag(MaradekService maradekService) {
        this.maradekService = maradekService;
    }
    public boolean oszthatoE(int mi, int mivel) {
    int m=maradekService.maradek(mi,mivel);
    if (m==0) {
        return true;
    }
    else
    {
        return false;
    }
    }
}
