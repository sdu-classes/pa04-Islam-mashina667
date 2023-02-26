public class Rabbit extends Animal implements Pet {
    private String name;

    public Rabbit(String name) {
        super(4);
        this.name = name;
    }

    public Rabbit() {
        this("Fluffy");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("The cat " + this.name + " is playing!");
    }

    @Override
    public void eat() {
        System.out.println("The cat " + this.name + " is eating!");
    }
}
