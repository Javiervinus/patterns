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
public class ChevroletSailBuilder extends  CarroBuilder{
    public void definirCarro(){
        c= new Carro();
        c.setModelo("Sail");
        c.setMarca("Chevrolet");
    }

    @Override
    public void insertarMotor() {
        c.setMotor(1.4);
    }

    @Override
    public void insertarAlmacenamiento() {
        c.setAlmacenamiento(1000);
    }

    @Override
    public void insertarCarroceria() {
        c.setCarroceria("1J23KO23");
    }
  
}
