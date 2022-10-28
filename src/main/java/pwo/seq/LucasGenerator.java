/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.seq;


import java.math.BigDecimal;
/**
 * Klasa generatora ciągu Lucasa o wyrazach w zakresie od 0.
 * @author eliza
 */

public class LucasGenerator extends FibonacciGenerator {

    
    /**
     * Tworzenie instancji klasy (obiektu) <b>LucasGenerator</b>
     */
    
    public LucasGenerator() {
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

    /**
    * Powoduje, że metoda {@link #nextTerm()}
    * rozpoczyna od 0.
    */
    @Override
    public void reset() {
        super.reset();
        current = new BigDecimal(2);
        f_2 = new BigDecimal(2);
    }

     /**
    * Zwraca kolejny wyraz ciągu Lucasa.
    *
    * @return Wartość wyrazu ciągu Lucasa
    */
    @Override
    public BigDecimal nextTerm() {
        if (lastIndex == 0) {
            lastIndex++;
            return new BigDecimal(2);
        }
        return super.nextTerm();
    }
}
