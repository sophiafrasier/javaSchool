public class School {
    private String name;
    private int sectionCount;
    private Section[] section = new Section [200];

    public School(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name=n;
    }

    public void addSection(Section s){
        this.section[sectionCount]=s;
        sectionCount++;
    }

    public Section[] getSections(){
        return section;
    }

    public String toString() {
        return "The school named " + name + " has " +
                 sectionCount +
                " sections";

    }

}

