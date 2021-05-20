/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.DAO;

import com.mycompany.projetointegradorfarmacia.model.Cliente;
import com.mycompany.projetointegradorfarmacia.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class SinteticoDAO {

public static ArrayList<Cliente> NomeCliente(String pNome) throws SQLException, ClassNotFoundException {
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        ArrayList<Cliente> NomeCliente = new ArrayList<Cliente>();

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT * ;");//montar o select
            instrucaoSQL.setString(0, "%" + pNome + '%');
            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                Cliente c = new Cliente();
                c.setNomeCliente(rs.getString("cliente"));
                NomeCliente.add(c);
            }
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            NomeCliente = null;
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
    return NomeCliente;
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
