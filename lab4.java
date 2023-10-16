public class lab4 {
    public static void main(String args[]){
        BTPrinting btPrinting = new BTPrinting();
        System.out.println("Aidan - BTPrinting:");
        btPrinting.testMethods();
        System.out.println();

        searchBT searchBT = new searchBT();
        System.out.println("Ali - SearchBT:");
        searchBT.testMethods();
        System.out.println();

        aggregateBT aggregateBT = new aggregateBT();
        System.out.println("Nikan - AggregateBT:");
        aggregateBT.testMethods();
    }
}
