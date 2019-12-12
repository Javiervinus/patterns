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
public class FabricaTuCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarroDirector c1= new CarroDirector(new ChevroletSailBuilder());
        c1.construirComputador();
        Carro carroSail = c1.getCarro();
        CarroDirector c2= new CarroDirector(new ChevroletSparkBuilder());
        c2.construirComputador();
        Carro carroSpark = c2.getCarro();
        System.out.println(carroSail);
        System.out.println(carroSpark);
    }
    
}
