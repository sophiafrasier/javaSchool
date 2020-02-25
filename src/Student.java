public class Student extends Person {
    private int grade;
    private int sectionCount;
    private Section[] sections= new Section[10];

    public Student(String name, int grade){
        super(name);
        this.grade=grade;
    }

    public int getGrade(){
        return this.grade;
    }

    public void setGrade(int g){
        this.grade=g;
    }

    public Section[] getSections(){
        return sections;
    }

    public void addSection(Section s){
        sections[sectionCount]=s;
        sectionCount++;
    }

    public String toString() {
        String c= this.name +
                " is in " + this.grade +
                "th grade and is enrolled in the following sections ";

        for(int i=0; i<this.sectionCount; i++ ){
            c += sections[i].getName();
            c += "("+ sections[i].getTeacher()+ ")";
        }
        return c;
    }
}
