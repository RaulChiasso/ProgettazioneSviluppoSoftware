package it.unibo.constructors;

class UseConstructorsEvolved {

    public static void main(final String[] args) {
        Train trenoDefault = new Train();

        Train treno220 = new Train(20, 200);
        Train treno200 = new Train(35, 165);
    }
}
