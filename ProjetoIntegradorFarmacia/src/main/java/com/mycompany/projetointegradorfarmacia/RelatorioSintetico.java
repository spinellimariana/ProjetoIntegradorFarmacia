/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia;

/**
 *
 * @author Matheus
 */
public class RelatorioSintetico{
    
    private String cbDeData;
    private String cbAData;
    private String cbDasHoras;
    private String cbAsHoras;
    
    
    public RelatorioSintetico(){
}
 
    public String getcbDeData(){
        return cbDeData;
    }
    
    public void setcbDedata(String cbDeData){
        this.cbDeData = cbDeData;
    }
    
    public String getcbAData(){
        return cbAData;
    }
    
    public void setcbAdata(String cbAData){
        this.cbAData = cbAData;
    }
    
    public String getcbDasHoras(){
        return cbDasHoras;
    }
    
    public void setcbDasHoras(String cbDasHoras){
        this.cbDasHoras = cbDasHoras;
    }
    
    public String getcbAsHoras(){
        return cbAsHoras;
    }
    
    public void setcbAsHoras(String cbAsHoras){
        this.cbAsHoras = cbAsHoras;
    }
}
