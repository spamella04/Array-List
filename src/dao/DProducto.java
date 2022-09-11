/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Producto;

/**
 *
 * @author Synthia Pamella
 */
public class DProducto {
    
   private ArrayList<Producto> listaProducto = new ArrayList<>();

     public DProducto() {
    }

    public DProducto(ArrayList<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }
    
      public ArrayList<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ArrayList<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }
    
    //Metodo para agregar un nuevo producto
    public int agregarProducto(int id, String nombre, double precio, double existencia){
        
        int b =0;
        Producto product = new Producto(id,nombre,precio,existencia);
        listaProducto.add(product);
        b = 1;
        return b;
    }
        
    public DefaultTableModel getListProducto(){
        
        DefaultTableModel dtm = new DefaultTableModel();
        String encabezado [] = {"ID", "NOMBRE", "PRECIO","EXISTENCIA"};
                
        
        //Asignando encabezados a la tabla
        dtm.setColumnIdentifiers(encabezado);
        
        for (Producto prod: listaProducto){
            
            String registro [] = new String[4];
            registro[0] = ""+ prod.getId();
            registro[1] = prod.getNombre();
            registro[2] = ""+prod.getPercio();
            registro[3] = ""+prod.getExistencia();
            //Agregando registro de nuevo producto
            dtm.addRow(registro);    
            
        }
        return dtm;
    }

  
    
}

