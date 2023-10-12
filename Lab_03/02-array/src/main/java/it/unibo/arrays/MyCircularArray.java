package it.unibo.arrays;

class MyCircularArray {

    int[] array;
    int lastAddedIndex;

    MyCircularArray() {
        this.array = new int[10];
        this.lastAddedIndex = 0;
    }

    MyCircularArray(int size) {
        this.array = new int[size];
        this.lastAddedIndex = 0;
    }

    void add(final int elem) {
        int i=0;
        for(; i< array.length && array[i]!=0; i++);
        if(i!=array.length){
            array[i]=elem;
            lastAddedIndex=i;
        }else if(lastAddedIndex!=array.length-1){
            lastAddedIndex++;
            array[lastAddedIndex]=elem;
        }else{
            array[0]=elem;
            lastAddedIndex=0;
        }
    }

    void reset() {
        this.array = new int[this.array.length];
    }

    void printArray() {
        System.out.print("[");
        for (int i = 0; i < this.array.length - 1; i++) {
            System.out.print(this.array[i] + ",");
        }
        System.out.print(this.array[this.array.length - 1] + "]");
    }

    public static void main(final String[] args) {        
        // 1) Creare un array circolare di dieci elementi
        MyCircularArray myCircularArray = new MyCircularArray();

        // 2) Aggiungere gli elementi da 1 a 10 e stampare il contenuto
        // dell'array circolare
        for (int i = 1; i <= 10; i++) {
            myCircularArray.add(i);
        }
        myCircularArray.printArray();

        // 3) Aggiungere gli elementi da 11 a 15 e stampare il contenuto
        // dell'array circolare
        for (int i = 11; i <= 15; i++) {
            myCircularArray.add(i);
        }
        myCircularArray.printArray();

        // 4) Invocare il metodo reset
        myCircularArray.reset();

        // 5) Stampare il contenuto dell'array circolare
        myCircularArray.printArray();

        // 6) Aggiungere altri elementi a piacere e stampare il contenuto
        // dell'array circolare
        for (int i = 1; i <= 5; i++) {
            myCircularArray.add(i);
        }
        myCircularArray.printArray();
    }
}
