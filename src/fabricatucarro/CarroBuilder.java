/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricatucarro;

/**
 *
 * @author davidmendozaloor
 */
public abstract class CarroBuilder {
    protected Carro c;
    
    public Carro getCarro(){
        return  c;
    }
    
    public abstract void definirCarro();
    public abstract void insertarMotor();
    public abstract void insertarAlmacenamiento();
    public abstract void insertarCarroceria();
    
}
