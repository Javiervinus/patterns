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
public class ChevroletCamaro extends CarroBuilder {

    @Override
    public void definirCarro() {
        c= new Carro();
        c.setModelo("Camaro");
        c.setMarca("Chevrolet");
    }

    @Override
    public void insertarMotor() {
        c.setMotor(4.0);
    }

    @Override
    public void insertarAlmacenamiento() {
        c.setAlmacenamiento(1400);
    }

    @Override
    public void insertarCarroceria() {
        c.setCarroceria("GJDAN2424");
    }
    
    
}
