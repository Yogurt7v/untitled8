public class Human {
    private String name;
    private boolean male;
    private int age;
    private String father;
    private String mother;

    public Human(String name, boolean male, int Age){
        this.name = name;
        this.male = male;
        this.age = Age;


    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getFather() {
        return father;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getMother() {
        return mother;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public String pol(){
        if (male = true){
            return " Man ";
        } else {
            return  " Woman ";
        }
    }
}


