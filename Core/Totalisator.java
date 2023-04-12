package Core;
import java.util.Random;
import java.util.ArrayDeque;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import Models.*;

public class Totalisator {

    public Totalisator(){
    }

    public ArrayDeque<Toys> newQueue(){
        ArrayDeque<Toys> qu = new ArrayDeque<Toys>();
        return qu;
    }


    public Toys toyChooser(){
        Toys new_toy = null;
        Random cube = new Random();
        int max = 100;
        int facet = cube.nextInt(0, max + 1);
        if (facet == Playstation.ps_pr) {
            new_toy = new Playstation(Names.getName(4));
        }
        else if (facet <= Playstation.ps_pr + Doll.doll_pr){
            new_toy = new Doll(Names.getName(2));
        }
        else if (facet <= (max - Lego.lego_pr)){
            new_toy = new Car(Names.getName(1));
        }
        else {
            new_toy = new Lego(Names.getName(3));
        }
        return new_toy;
    }

    public int toysAvalible(){
        if (Toys.get_amount() > 0){
            return 1;
        }
        else{
            return 0;
        }
    }


    public String addintoQueue(ArrayDeque<Toys> queue){
        int perm = toysAvalible();
        String out = "";
        switch(perm){
            case 1:
                Toys rookie = toyChooser();
                queue.addLast(rookie);
                out = String.format("Поздравляем, ваш приз: %s!", rookie.get_variation());
                break;
            case 0:
                out = "Игрушек не осталось извините";
                break;
        }
        return out;
    }


    public String toyDispenser(ArrayDeque<Toys> toys_que){
        try {
            Toys prize = toys_que.removeFirst();
            String out = "Игрушка отправлена в вашу корзину";
            FileWriter writer = new FileWriter("prizes.txt", true);
            writer.append(prize.get_info());
            writer.flush();
            writer.close();
            return out;
        }
        catch(NoSuchElementException ex2){
            return "В массиве не осталось игрушек, попробуй в следующий раз добавить что-нибудь :)";
        }
        catch(IOException ex){
            return ex.getMessage();
        }
    }


    public void clear_file(){
        try {
            FileWriter writer = new FileWriter("prizes.txt", false);
            writer.flush();
            writer.close();
        }
        catch(IOException ex){
           System.out.println(ex.getMessage());
        }
    }   
}
