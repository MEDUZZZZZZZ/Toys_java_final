package Core;
import java.util.Random;

public class Names {
    private static String[] car_names = {"Bmw", "Mersedes", "Kia", "Lada", "Honda", "Hyundai",
                                        "Tesla", "Bugatti", "Toyota", "Subaru", "Mitsubishi"};
    private static String[] doll_names = {"Bratz", "Barbie", "MonsterHigh", "Lol", "BabyBon", 
                                        "Naruto", "Marvel", "Fnaf", "Kek", "Saske", "Gutz"};
    private static String[] lego_names = {"Marvel", "DC", "LOTR", "City", "SW", "Ninjago"};
    private static String[] ps_names = {"Суперприз!", "Джекпот!", "Повезло!"};

                                 


    public static String getName(int num){
        Random cube = new Random();
        String res = "";
        switch(num){
            case 1:
                res = car_names[cube.nextInt(0,car_names.length)];
                break;
            case 2:
                res = doll_names[cube.nextInt(0,doll_names.length)];
                break;
            case 3:
                res = lego_names[cube.nextInt(0,lego_names.length)];
                break;
            case 4:
                res = ps_names[cube.nextInt(0,ps_names.length)];
                break;
        }
        return res;
    }
}
