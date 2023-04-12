package Models;

public abstract class Toys {
    private static int all_id = 1;
    public static int amount = 20;
    protected int toy_id, priority;
    protected String name, variation;


    protected Toys(String name, String variation, int priority){
        this.toy_id = Toys.all_id;
        Toys.amount--;
        Toys.all_id++;
        this.name = name;
        this.priority = priority;
        this.variation = variation;
    }
    

    public void set_priority(int priority){
        this.priority = priority;
    }

    
    public String get_variation(){
        return this.variation;
    }


    public static int get_amount(){
        return Toys.amount; 
    }

    
    public void set_name(String name){
        this.name = name;
    }


    public String get_info(){
        return String.format("Я Игрушка № %d : %s '%s'\n", this.toy_id, this.variation, this.name);
    }
}
