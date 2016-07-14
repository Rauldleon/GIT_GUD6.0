/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo1;
import java.text.DecimalFormat;
/**
 *
 * @author Didier
 */
public class Radio implements iRadio {
    String frecuencia;
    boolean encendido; 
    double estacion; 
    double[] botones;
    String[] frecuencias;
    
    public Radio(){
        encendido = false;
        frecuencia ="AM";
        estacion = 530;    
        botones=new double[12];
        frecuencias=new String[12];
    }
    
    @Override
    public void OnOff() {
        encendido = !encendido;
    }

    @Override
    public boolean isOn() {
        return encendido;
    }

    @Override
    public String getFrecuency() {
        return frecuencia;
    }

    @Override
    public void changeFrecuency() {        
        if ("FM".equals(frecuencia))
            frecuencia = "AM";
        else
            frecuencia = "FM";
    }

    /**
     *
     */
    @Override
    public void setStation(){
        if ("FM".equals(frecuencia))
            estacion = 87.9;
        else
            estacion = 530;
    
    }
    @Override
    public void changeStation(int Position){
        estacion=botones[Position];
        frecuencia=frecuencias[Position];
    }
    @Override
    public double getStation() {
        return estacion;
    }

    @Override
    public void Forward() {
        if ("AM".equals(frecuencia))
        {
            if (estacion < 1610)               
                estacion = estacion + 10;
            else
                estacion = 530;
        }            
        else
        {
            if (estacion < 107.9){ 
                DecimalFormat decimales = new DecimalFormat("0.0");
                estacion = Double.parseDouble(decimales.format(estacion + 0.2));
            }
            else
                estacion = 87.9;        
        }
            
    }

    @Override
    public void Backward() {
        if ("AM".equals(frecuencia))
        {
            if (estacion > 530)               
                estacion = estacion - 10;
            else
                estacion = 1610;
        }            
        else
        {
            if (estacion > 87.9){               
                DecimalFormat decimales = new DecimalFormat("0.0");
                estacion = Double.parseDouble(decimales.format(estacion - 0.2));
            }
            else
                estacion = 107.9;        
        }
    }

    /**
     *
     * @param Position
     */
    @Override
    public void setMemory(int Position) {
        if (Position >= 0 && Position <12)            
            botones[Position] = estacion;
            frecuencias[Position] = frecuencia;
    }
    public double getMemory(int Position) {      
           return botones[Position];
    }

    @Override
    public String ToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Encendido:");
        sb.append(encendido);
        sb.append("Frecuencia:");
        sb.append(frecuencia);
        sb.append("Estacion:");
        sb.append(estacion);
        
        return sb.toString();

    }
    
}
