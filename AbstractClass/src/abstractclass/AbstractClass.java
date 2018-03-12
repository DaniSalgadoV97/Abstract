/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author Estudiantes
 */
public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        System.out.println(myCat.emitirSonido());
        System.out.println(myDog.emitirSonido());
        System.out.println(myCat.emitirSonido("lindura"));
        
        // TODO code application logic here
    }
    
}
