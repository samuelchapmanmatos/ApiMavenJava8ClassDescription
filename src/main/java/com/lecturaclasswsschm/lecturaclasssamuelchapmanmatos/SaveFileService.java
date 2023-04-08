/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lecturaclasswsschm.lecturaclasssamuelchapmanmatos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Dell Ing. Samuel Chapman Matos
 */
public class SaveFileService {
    
    public String saveFileTxtPost(DataFile datafile) throws IOException{
        String response = "";
        DataFile datafile2 = new DataFile();
        datafile2 = datafile;
        try{
             File archivo = new File(datafile2.getRuta()+datafile2.getDatetime()+".txt");
             
        BufferedWriter bw;
        if(archivo.exists()){
            return response = "Archivo ya existe!";
        }else{
            // El fichero no existe y hay que crearlo            
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(datafile.getInformation());
            bw.close(); // Debe cerrarse la escritura del fichero
            return response = "Archivo creado exitosamente!";
        }
        }catch(IOException e){
           return response = e.getMessage();
        } 
        
    }
    
    public DataFile saveFileTxt() throws IOException{
        String response = "";
        DataFile datafile = new DataFile();
        try{
            datafile.setDatetime("Fecha07042023");
            datafile.setRuta("C:\\Users\\Dell\\Downloads\\");
            datafile.setInformation("Este es el texto de prueba para ver que debo enviar!");
            File archivo = new File(datafile.getRuta()+datafile.getDatetime()+".txt");
             
        BufferedWriter bw;
         // El fichero no existe y hay que crearlo            
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(datafile.getInformation());
            bw.close(); // Debe cerrarse la escritura del fichero
            response = "Archivo creado exitosamente!";
            return datafile;
        }catch(IOException e){
           response = e.getMessage();
           return datafile;
        } 
        
    }
}
