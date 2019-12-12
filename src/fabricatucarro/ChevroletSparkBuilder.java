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
public class ChevroletSparkBuilder extends  CarroBuilder{

    @Override
    public void definirCarro() {
        c= new Carro();
        c.setModelo("Spark");
        c.setMarca("Chevrolet");
    }

    @Override
    public void insertarMotor() {
         c.setMotor(1.2);
    }

    @Override
    public void insertarAlmacenamiento() {
        c.setAlmacenamiento(500);
    }

    @Override
    public void insertarCarroceria() {
        c.setCarroceria("JWE9EWF8");
    }
    
}
