package FunWithClasses;

/**
 *
 * @author priansh.shah
 */
public class Cat {
    private String breed;
    private int age;
    private boolean hypoallergenic;
    public Cat() {
        this(null, 0, false);
    }
    public Cat(String b, int a, boolean h){
        this.breed = b;
        this.age = a;
        this.hypoallergenic = h;
    }
    public Cat(Cat c) {
        this.breed = c.breed;
        this.age = c.age;
        this.hypoallergenic = c.hypoallergenic;
    }
    public Cat(String b) {
        this(b,0,true);
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
    public boolean getHypoallergenic() {
        return hypoallergenic;
    }
    public void grow(){
        age++;
    }
    public void geneModify(String n) {
        breed=n;
    }
    public void injectDisease() {
        hypoallergenic = true;
    }
    public void removeDisease() {
        hypoallergenic = false;
    }
    public void printDetails(){
        System.out.println("Breed:"  + this.getBreed());
        System.out.println("Age:" + this.getAge());
        System.out.println("Is Hypoallergenic: " + this.getHypoallergenic());
        System.out.println();
    }
    @Override
    public String toString(){
        String text = "Breed: " + getBreed() + "\nAge: " + getAge() + "\nIs Hypoallergenic: " + getHypoallergenic();
        return text;
    }
}
