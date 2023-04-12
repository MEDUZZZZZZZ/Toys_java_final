package Core;
import java.util.ArrayDeque;
import java.util.Scanner;
import Models.*;


public class Controller {
    public void run_button(){
        Totalisator game = new Totalisator();
        ArrayDeque<Toys> queue = game.newQueue();
        View.show_out(1);
        int tmp = 0;
        boolean flag = true;
        game.clear_file();
        while (flag) {
            tmp = chooseMode();
            switch (tmp) {
                case 1:
                    View.showSomething(game.addintoQueue(queue));
                    break;
                case 2:
                    View.showSomething(game.toyDispenser(queue));
                    break;
                case 3:
                    System.out.print("Ты вышел");
                    flag = false;
                    break;
            }
        }
    }



    public int chooseMode(){
        Scanner scanner = new Scanner(System.in);
        View.show_out(2);
        int btn = scanner.nextInt();
        if (btn > 0 && btn < 4){
            return btn;
        }
        else{
            return chooseMode();

        } 
    }
}

