/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essaytester;

/**
 * Essay and Document tester/client code
 * @author rodec8600
 */
public class EssayTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Essay english = new Essay();

        //make some english essays and see if they're actually essays
        //also print pages and word amount
        for (int i = 1000; i < 3500; i += 500) {
            english.setWords(i);
            System.out.println("Words:\t" + english.getWords());
            System.out.println("Is an essay:\t" + english.validLength());
            System.out.println("Pages:\t" + english.calculatePages());
            System.out.println("************");
        }
        
    }

}
