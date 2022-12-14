/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.app;

import pwo.utils.SequenceTools;

/**
 * Klasa powodująca obliczenie danego ciągu oraz wypisanie wyniku w CLI
 * @author eliza
 */
public class SeqToOutApp extends SeqToFileApp {

    /**
     * Metoda przyjmująca argumenty
     * @param args
     * @return
     */
    @Override
    protected boolean getArgs(String[] args) {

        if (super.getArgs(args)) {
            return true;
        }

        return seqType != null && from >= 0 && to >= 0;
    }
     /**
     * Wyliczenie określonych wyrazów danego ciągu
     * @return
     */

    @Override
    protected boolean wirteSeq() {

        System.out.println(SequenceTools.getTermsAsColumn(
                seqType.getGenerator(), from, to));

        return true;
    }

     /**
     * Metoda powodująca start wyliczania danego ciągu
     * @param args
     */
    @Override
    public void run(String[] args) {

        System.out.println("Sequence to terminal CLI app");

        if (!getArgs(args)) {
            System.out.println("!Illegal arguments\n" + "Legal usage: seqName from to");
            return;
        }

        wirteSeq();

    }
}
