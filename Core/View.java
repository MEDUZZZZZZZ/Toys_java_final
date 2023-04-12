package Core;

public class View {
    

    public static void show_out(int opt){
        String message = "";
        switch(opt){
            case 1:
                message = "Добро пожаловать в слот машину игрушек!";
                break;  
            case 2:
                message = "Выберите действие:\n1 - Разыграть игрушку\n2 - Выдать игрушку\n3 - Закрыть приложение";
                break;
        }
        System.out.println(message);
    }


    public static void showSomething(String inp){
        System.out.println(inp);
    }

}
