/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.DAO;

import com.mycompany.projetointegradorfarmacia.model.Cliente;
import com.mycompany.projetointegradorfarmacia.model.RelatorioSintetico;
import com.mycompany.projetointegradorfarmacia.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Matheus
 */
public class SinteticoDAO {

public static ArrayList<RelatorioSintetico> filtroData(Date inicialDate, Date finalDate){
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        ArrayList<RelatorioSintetico> relatorioSinte = new ArrayList<RelatorioSintetico>();

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT venda.dtvenda, cliente.nome, venda.valorFinal\n" +
                                                    "FROM venda  \n" +
                                                    "INNER JOIN cliente  \n" +
                                                    "ON venda.idCliente = cliente.id \n" +
                                                    "WHERE venda.dtvenda between ? AND ?; ");//montar o select
            instrucaoSQL.setDate(0, new java.sql.Date(inicialDate.getTime()));
            instrucaoSQL.setDate(1, new java.sql.Date(finalDate.getTime()));
            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                RelatorioSintetico c = new RelatorioSintetico();
                c.setDtCompra(rs.getDate("dtvenda"));
                c.setNome(rs.getString("nome"));
                c.setValorFinal(rs.getDouble("valorFinal"));
                
                relatorioSinte.add(c);
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            relatorioSinte = null;
        } finally{
            //Libero os recursos da memória
            try {
                if(rs!=null)
                    rs.close();                
                if(instrucaoSQL!=null)
                    instrucaoSQL.close();
                
                GerenciadorConexao.fecharConexao();
                        
              } catch (SQLException ex) {
             }
        }
    return relatorioSinte;
}

//public static ArrayList<Venda> ValorFinal(String Valor) throws SQLException, ClassNotFoundException {
        //Connection conexao = null;
        //PreparedStatement instrucaoSQL = null;
        //ResultSet rs = null;

        //ArrayList<Venda> ValorFinal = new ArrayList<Venda>();

        //try {

            //conexao = GerenciadorConexao.abrirConexao();
            //instrucaoSQL = conexao.prepareStatement("SELECT * ;");//montar o select
            //instrucaoSQL.setString(0, ValorFinal);
            //rs = instrucaoSQL.executeQuery();
            
            //while(rs.next())
            //{
                //Venda v = new Venda();
                //v.setValorFinal(rs.getString("ValorFinal"));
                //ValorFinal.add(v);
            //}
            
        //} //catch (SQLException | ClassNotFoundException ex) {
            //System.out.println(ex.getMessage());
            //ValorFinal = null;
        //} finally{
            //Libero os recursos da memória
            //try {
                //if(rs!=null)
                  //  rs.close();                
                //if(instrucaoSQL!=null)
                  //  instrucaoSQL.close();
                
                //GerenciadorConexao.fecharConexao();
                        
             // } catch (SQLException ex) {
            // }
       // }
    //return ValorFinal;
//}

}
