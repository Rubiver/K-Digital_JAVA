package Day09.quiz;

public class Dog extends Animal{
    public Dog(String name, int age)
    {
        super(name,age);
    }
    public Dog() {
        super();
    }
    @Override
    public void animalCry() {
        System.out.println("멍멍");
    }

    public void fetch()
    {
        System.out.println(this.getName()+" : 공 물어오기");
    }
}
