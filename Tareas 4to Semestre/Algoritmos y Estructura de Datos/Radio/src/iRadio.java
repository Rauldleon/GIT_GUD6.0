/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raul_
 */
public interface iRadio {
    public void On_Off();
    public boolean isOn();
    public String changeFrecuencia();
    public void setFrecuencia();
    public float getEstacion(float am_fm);
    public void Forward();
    public void Backwards();
    public void setMemory(int Posicion);
    public String toString();           
}
