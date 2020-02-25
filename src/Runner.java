public class Runner {
    public static void main(String[] args){
        School mySchool= new School("Berkeley High");

        Section math= new Section("Math");
        Section bio= new Section("Biology");
        Section compSci= new Section("Computer Science");

        Teacher albinson= new Teacher("Albinson", "Computer Science");
        Teacher mueller= new Teacher("Mueller", "Biology");
        Teacher mah= new Teacher("Mah", "Math");

        Student me= new Student("Me", 12);
        Student abby= new Student("Abby", 12);
        Student natalie= new Student("Natalie", 10);
        Student jeremy= new Student("Jeremy", 11);
        Student erica= new Student("Erica", 9);
        Student sloane= new Student("Sloane", 11);

        mySchool.addSection(math);
        mySchool.addSection(bio);
        mySchool.addSection(compSci);

        math.setTeacher(mah);
        bio.setTeacher(mueller);
        compSci.setTeacher(albinson);

        albinson.addSection(compSci);
        mueller.addSection(bio);
        mah.addSection(math);

        math.addStudents(me);
        math.addStudents(abby);

        bio.addStudents(natalie);
        bio.addStudents(jeremy);

        compSci.addStudents(erica);
        compSci.addStudents(sloane);

        me.addSection(math);
        abby.addSection(math);
        natalie.addSection(bio);
        jeremy.addSection(bio);
        erica.addSection(compSci);
        sloane.addSection(compSci);

        System.out.println(mySchool.toString());
        System.out.println(math.toString());
        System.out.println(bio.toString());
        System.out.println(compSci.toString());
        System.out.println(albinson.toString());
        System.out.println(mueller.toString());
        System.out.println(mah.toString());
        System.out.println(me.toString());
        System.out.println(abby.toString());
        System.out.println(natalie.toString());
        System.out.println(jeremy.toString());
        System.out.println(erica.toString());
        System.out.println(sloane.toString());
    }
}
