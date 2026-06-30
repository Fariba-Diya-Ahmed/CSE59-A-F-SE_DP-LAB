class UniversityMember {
    public void attendLecture(){
        System.out.println("Attending a lecture.");
    }
}


interface Researcher {
    void conductLabResearch();
}

class Professor extends UniversityMember implements Researcher{
    public void conductLabResearch(){
        System.out.println("ProfessorConducting lab research.");
    }
}

class GRA extends UniversityMember implements Researcher{
    public void conductLabResearch(){
        System.out.println("GRA Conducting lab research.");
    }
}

class UndergraduateStudent extends UniversityMember {}

public class Main5 {

    public static void main(String[] args) {

        UndergraduateStudent s = new UndergraduateStudent();
        s.attendLecture();

        Professor p = new Professor();
        p.attendLecture();
        p.conductLabResearch();

        GRA gra = new GRA();

        gra.attendLecture();
        gra.conductLabResearch();
    }
}
