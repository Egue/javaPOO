package com.edwin.controller;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import com.edwin.dao.EventoDao;
import com.edwin.domain.Evento;

public class VistaEvento extends JFrame implements ActionListener{

    private JButton consultar;
    private JButton agregar;

    private JTextArea area;

    public VistaEvento()
    {   
        super("Agenda");
        setSize(800 ,320 );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //componentes
        consultar = new JButton("Consultar");
        area = new JTextArea(10 , 30);

        consultar.addActionListener(this);

        //crear Panel
        JPanel panel = new JPanel();//estamos instanciando el objeto JPanel
        panel.add(consultar);
        //panel.add(area);

        Container container = getContentPane();
        container.add(panel, BorderLayout.NORTH);
        container.add(new JScrollPane(area), BorderLayout.CENTER); //contentPane.add(new JScrollPane(txtArea), BorderLayout.CENTER);


        setVisible(true);
    }

    //mostrar Datos que viene de la base de datos
    public void mostrarDatos(){
        EventoDao dao = new EventoDao();
        List<Evento> list = dao.findAll();
        for(Evento obj : list){
            area.append("Titulo: " + obj.getTitulo());
            area.append(" Fecha: " + obj.getFecha());
            area.append(" descripcion: " + obj.getDescripcion() );
            area.append(" Creado a las : " + obj.getCreado());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() == consultar)
         {
            mostrarDatos();
         }
    }
    
}
