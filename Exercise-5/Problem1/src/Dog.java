//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Dog {

    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

//    Getter for the dogs name
    public String getName(){
        return name;
    }
//    Setter for the dogs name
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAgeInPersonInYears(){
        return age * 7;
    }

    @Override
    public String toString(){
        return "Dog [name=" + name + ", age = " + age + "]";
    }
}

