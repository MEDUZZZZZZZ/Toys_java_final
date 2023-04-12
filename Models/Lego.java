package Models;

public class Lego extends Toys{
    public static int lego_pr = 10;


    public Lego(String name){
        super(name, "конструктор", lego_pr);
    }
}
