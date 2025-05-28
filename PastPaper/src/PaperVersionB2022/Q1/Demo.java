package PaperVersionB2022.Q1;

public class Demo {
    public static void main(String[] args) {

    	pet squirrel1 = new Squirrel("Run3");
        squirrel1.cuddle();
        squirrel1.feed();
        squirrel1.GetTotalpoints();

        pet squirrel2 = new Squirrel("Run5");
        squirrel2.cuddle();
        squirrel2.feed();
        squirrel2.GetTotalpoints();

        pet garfield = new Cat();
        garfield.clean();
        garfield.cuddle();
        garfield.feed();
        garfield.GetTotalpoints();

        pet parrot1 = new Parrot("walk");
        parrot1.feed();
        parrot1.GetTotalpoints();
    }
}
