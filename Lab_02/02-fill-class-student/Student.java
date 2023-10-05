class Student {

    String name;
    String surname;
    int id;
    int matriculationYear;
    
    void build(String name, String surname, int id, int matriculationYear) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.matriculationYear = matriculationYear;
    }        

    void printStudentInfo() {
        System.out.println("name: " + this.getName() + "\n" +
                            "surname: " + this.getSurname() + "\n" +
                            "id: " + this.getId() + "\n" +
                            "matriculationYear: " + this.getMatriculationYear());
        
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public int getMatriculationYear() {
        return matriculationYear;
    }

    
}
