class TestStudent {

    public static void main(String[] args) {
        Student strudent1 = new Student();
        Student strudent2 = new Student();
        Student strudent3 = new Student();
        strudent1.build("Alex", "Balducci", 1015, 2019);
        strudent2.build("Angel", "Bianchi", 1016, 20188);
        strudent3.build("Andrea", "Bracci", 1017, 2017);
        strudent1.printStudentInfo();
        strudent2.printStudentInfo();
        strudent3.printStudentInfo();
    }
}
