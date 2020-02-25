public class Teacher extends Person {
    private Section[] sections= new Section[10];
    private String subject;
    private int sectionCount;

    public Teacher(String name, String subject){
        super(name);
        this.subject=subject;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String n){
        this.subject=n;
    }

    public Section[] getSections(){
        return sections;
    }

    public void addSection(Section s){
        sections[sectionCount]=s;
        sectionCount++;
    }

    public String teacherName(String name){
        return this.name;
    }

    public String toString() {
        String b= name +
                " teaches the following sections: ";

        for(int i=0; i<this.sectionCount; i++ ){
            b += sections[i].getName();
            b += "(" + this.sectionCount + ")";
        }
        return b;

    }
}


