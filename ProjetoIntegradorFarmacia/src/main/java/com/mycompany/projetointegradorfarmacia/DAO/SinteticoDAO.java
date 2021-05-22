/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetointegradorfarmacia.DAO;


import com.mycompany.projetointegradorfarmacia.model.Sintetico;
import com.mycompany.projetointegradorfarmacia.utils.GerenciadorConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;


/**
 *  Classe responsável pela conexão da parte de relatório sintético com o banco de dados
 * @author Matheus
 * @see RelatórioSinteticoController
 */
public class SinteticoDAO {

/**
 * Método utilizado para selecionar todas as vendas cadastradas no banco de dados dentro de um período
 * de tempo específico selecionado pelo usuário.
 * @param inicialDate Date
 * @param finalDate Date
 * @return ArrayList da classe Relatório Sintético
 */
    public static ArrayList<Sintetico> filtroData(Date inicialDate, Date finalDate){
        Connection conexao = null;
        PreparedStatement instrucaoSQL = null;
        ResultSet rs = null;

        ArrayList<Sintetico> relatorioSinte = new ArrayList<Sintetico>();

        try {

            conexao = GerenciadorConexao.abrirConexao();
            instrucaoSQL = conexao.prepareStatement("SELECT venda.id, venda.dtvenda, cliente.nome, venda.valorFinal\n" +
                                                    "FROM venda  \n" +
                                                    "INNER JOIN cliente  \n" +
                                                    "ON venda.idCliente = cliente.id \n" +
                                                    "WHERE venda.dtvenda BETWEEN ? AND ?;");//montar o select
            instrucaoSQL.setDate(1, new java.sql.Date(inicialDate.getTime()));
            instrucaoSQL.setDate(2, new java.sql.Date(finalDate.getTime()));
            rs = instrucaoSQL.executeQuery();
            
            while(rs.next())
            {
                Sintetico c = new Sintetico();
                c.setIdVenda(rs.getInt("id"));
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
