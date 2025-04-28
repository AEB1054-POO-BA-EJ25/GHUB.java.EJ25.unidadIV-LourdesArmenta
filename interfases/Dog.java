package interfases;
public class Dog implements Pet{
    @Override
    public void makeSound(){
        System.out.println("gua ... gua");

    }
    @Override
    public void moved(){
        System.out.println("El dog se mueve");
    }


}