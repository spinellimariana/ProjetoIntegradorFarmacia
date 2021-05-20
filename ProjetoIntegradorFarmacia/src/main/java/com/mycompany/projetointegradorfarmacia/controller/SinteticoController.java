/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.controller;

import com.mycompany.projetointegradorfarmacia.DAO.ClienteDAO;
import com.mycompany.projetointegradorfarmacia.DAO.SinteticoDAO;
import com.mycompany.projetointegradorfarmacia.model.Cliente;
import com.mycompany.projetointegradorfarmacia.model.RelatorioSintetico;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vinic
 */
public class SinteticoController {
     public static ArrayList<String[]> filtroData(Date inicialDate, Date finalDate) throws ParseException {
         
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String strDateInicial = dateFormat.format(inicialDate);  
        Date date1=new SimpleDateFormat("yyyy-mm-dd").parse(strDateInicial);  
        
        String strDateFinal = dateFormat.format(finalDate);
        Date date2=new SimpleDateFormat("yyyy-mm-dd").parse(strDateFinal);  
         
        ArrayList<RelatorioSintetico> filtro = SinteticoDAO.filtroData(date1, date2);
        ArrayList<String[]> listaFiltro = new ArrayList<>();

        for (RelatorioSintetico item : filtro) {
            listaFiltro.add(new String[]{String.valueOf(item.getDtCompra()), item.getNome(), String.valueOf(item.getValorFinal())});

        }

        return listaFiltro;
    }
    
}
