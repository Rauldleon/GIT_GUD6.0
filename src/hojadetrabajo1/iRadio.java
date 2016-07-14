/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo1;



/**
 *
 * @author Didier
 */
public interface iRadio {
    public void OnOff();
    public boolean isOn();
    public void setStation();
    public String getFrecuency();
    public void changeFrecuency();
    public void changeStation(int Position);
    public double getStation();   
    public void Forward();
    public void Backward();
    public void setMemory(int Position);
    public double getMemory(int Position);
    public String ToString();
}
