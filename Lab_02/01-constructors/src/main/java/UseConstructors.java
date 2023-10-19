package it.unibo.constructors;

class UseConstructors {

    public static void main(final String[] args) {

        final Student marioRossi = new Student("Mario", "Rossi", 1014, 2013);
        marioRossi.printStudentInfo();

        final Student lucaBianchi = new Student("Luca", "Bianchi", 1018, 2010);
        lucaBianchi.printStudentInfo();

        final Student peppinoVitiello = new Student("Peppino", "Vitiello", 1019, 2012);
        peppinoVitiello.printStudentInfo();

        final Student LucaVerdi = new Student("Luca", "Verdi", 1020, 2013);
        LucaVerdi.printStudentInfo();

        Train treno300 = new Train(300, 100, 200);
        Train treno1200 = new Train(1200, 50, 1050);
        Train treno500 = new Train(500, 0, 500);
        Train trenoDefault = new Train();
        
        trenoDefault.printTrainInfo();
    }
}
