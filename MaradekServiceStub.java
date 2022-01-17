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
public class MaradekServiceStub implements MaradekService{
    @Override
    public int maradek(int szam,int mivel){
        int mar=szam%mivel;
    return mar;
    }//mely szamot osztjuk valamivel
    //és mennyi a maradék
}
