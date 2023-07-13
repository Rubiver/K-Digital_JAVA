package Day09.quiz;

public class Cat extends Animal{
    public Cat(String name, int age)
    {
        super(name, age);
    }
    public Cat()
    {
        super();
    }
    @Override
    public void animalCry() {
        System.out.println("야옹");
    }
    
    public void scratch()
    {
        System.out.println(this.getName()+" : 스크래치");
    }
}
