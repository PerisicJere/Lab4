/**
 * @author Jere Perisic
 * 
 */
public class lab4 {

    public static void main(String args[]){
        /**
         * Testing Aidans BTPrinting method
         */
        BTPrinting btPrinting = new BTPrinting();
        System.out.println("Aidan - BTPrinting:");
        btPrinting.testMethods();
        System.out.println();
        /**
         * Testing Ali's searchBT method
         */
        searchBT searchBT = new searchBT();
        System.out.println("Ali - SearchBT:");
        searchBT.testMethods();
        System.out.println();
        /**
         * Testing Nikan's aggregateBT method
         *
         */
        aggregateBT aggregateBT = new aggregateBT();
        System.out.println("Nikan - AggregateBT:");
        aggregateBT.testMethods();
    }
}
