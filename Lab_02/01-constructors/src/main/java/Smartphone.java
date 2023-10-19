package it.unibo.constructors;

class Smartphone {

    static final boolean DEF_HAS_GPS = true;
    static final boolean DEF_HAS_3G = true;
    static final boolean DEF_HAS_NFC = true;
    static final int DEF_SD_SIZE = 8192;
    static final int DEF_RAM_SIZE = 1024;
    static final int DEF_N_CPU = 2;

    private int nCPU;
    private int ram;
    private int sdSize;
    private String brand;
    private String model;
    private boolean hasGPS;
    private boolean has3G;
    private boolean hasNFC;

    public Smartphone(String brand, String model) {
        this(brand, model, DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, DEF_HAS_GPS, DEF_HAS_3G, DEF_HAS_NFC);
    }

    public Smartphone(String brand, String model, boolean hasGPS, boolean has3g) {
        this(brand, model, DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, hasGPS, has3g, DEF_HAS_NFC);
    }

    public Smartphone(String brand, String model, int sdSize) {
        this(brand, model, DEF_N_CPU, DEF_RAM_SIZE, sdSize, DEF_HAS_GPS, DEF_HAS_3G, DEF_HAS_NFC);
    }

    public Smartphone(String brand, String model, boolean hasNFC) {
        this(brand, model, DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, DEF_HAS_GPS, DEF_HAS_3G, hasNFC);
    }

    public Smartphone(String brand, String model, int nCPU, int ram, int sdSize, boolean hasGPS, boolean has3g, boolean hasNFC) {
        this.nCPU = nCPU;
        this.ram = ram;
        this.sdSize = sdSize;
        this.brand = brand;
        this.model = model;
        this.hasGPS = hasGPS;
        has3G = has3g;
        this.hasNFC = hasNFC;
    }

    void printStringRep() {
        System.out.println("Smartphone info:");
        System.out.println("n CPU(s): " + this.nCPU);
        System.out.println("RAM amount: " + this.ram);
        System.out.println("SD size: " + this.sdSize);
        System.out.println("brand: " + this.brand);
        System.out.println("model: " + this.model);
        System.out.println("hasGPS: " + this.hasGPS);
        System.out.println("has3G: " + this.has3G);
        System.out.println("hasNFC: " + this.hasNFC + "\n");
    }
}
