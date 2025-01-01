/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.sql.PreparedStatement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ProdutosDAO {
    
    Connection conn;
    PreparedStatement st;
    ResultSet rs; 
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public void cadastrarProduto (ProdutosDTO produto){
    try{ 
   
       
    
        st=conn.prepareStatement("INSERT INTO produtos VALUES(?,?,?,?)");
        st.setInt(1,produto.getId());
        st.setString(2,produto.getNome());
        st.setInt(3, produto.getValor()); 
        st.setString(4,produto.getStatus());
      
       
   
       }catch(SQLException ex) {
            System.out.println("Erro ao conectar: " + ex.getMessage());
           
        
        
        
        
    } 
    }
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        
        return listagem;
    }
    
    
    
        
}

