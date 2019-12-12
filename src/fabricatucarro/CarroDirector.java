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
public class CarroDirector {
    public CarroBuilder builder;
    
    public CarroDirector(CarroBuilder builder){
        this.builder=builder;
    }
    
    public void construirCarro(){
        builder.definirCarro();
        builder.insertarAlmacenamiento();
        builder.insertarMotor();
        builder.insertarCarroceria();
    }
    
    public Carro getCarro(){
        return builder.getCarro();
    }
}
