package com.edwin.dao;
import com.edwin.conexion.Conexion;
import com.edwin.domain.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class EventoDao {
    
    public List<Evento> findAll()
    {
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Evento> resultado = new ArrayList<>();
        String sql = "SELECT * FROM eventos";

       try {
        conn = Conexion.getConexion();
        stm = conn.prepareStatement(sql);
        rs = stm.executeQuery();
        while(rs.next())
        {
            Evento obj = new Evento();
            obj.setId(  rs.getInt("id"));
            obj.setTitulo( rs.getString("titulo"));
            obj.setFecha( rs.getString("fecha"));
            obj.setDescripcion( rs.getString("descripcion"));
            obj.setCreado( rs.getString("creado"));

            resultado.add(obj);
        }

       } catch (SQLException e) {
            e.printStackTrace();
       }

        return resultado;
        
    }
}
