package it.unibo.constructors;

public class UseSmartphone {
    
    public static void main(final String[] args) {

        Smartphone htcOne = new Smartphone("HTC", "One", 1024);
        Smartphone samsungGN3 = new Smartphone("Samsung", "Galaxy Note 3", 4, 2048, 8192, true, true, true);
        Smartphone iPhone5 = new Smartphone("Apple", "iPhone 5", false);
        Smartphone GoogleNexus4 = new Smartphone("Google", "Nexus 4 5", true, true);
        
        htcOne.printStringRep();
        samsungGN3.printStringRep();
        iPhone5.printStringRep();
        GoogleNexus4.printStringRep();

    }
}
