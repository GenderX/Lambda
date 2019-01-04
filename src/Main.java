import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {


    @Test
    public void mapTest() {
       // List<Double> cost = Arrays.asList(10.0, 20.0,30.0);
     //   cost.stream().map(x -> x + 1).forEach(x -> System.out.println(x));
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        list.stream().map(x->x+1).forEach(x-> System.out.print(x+","));
        System.out.println("-----------------------------------------------------");
        Integer integer = list.stream().reduce((sum, x) -> sum + x).get();
        System.out.println(integer);

    }

    public static void main(String[] args) {
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka",
                "David Ferrer", "Roger Federer",
                "Andy Murray", "Tomas Berdych",
                "Juan Martin Del Potro"};
        //   List<String> players =  Arrays.asList(atp);

        //  players.forEach((player) -> System.out.print(player + "; "));
        //  players.forEach((player) -> System.out.println(player));
        //    players.forEach(System.out::println);
        //  new Thread(() -> System.out.println("Hello world1 !")).start();
        //   Arrays.sort(players, (String s1, String s2) -> (s1.compareTo(s2)));
       /* List<Person> javaProgrammers = new ArrayList<Person>() {
            {
                add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
                add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
                add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
                add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
                add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
                add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
                add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
                add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
                add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
                add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
            }
        };*/


        //初始化list集合
        List<String> list = new ArrayList<String>();
        list.add("测试数据1");
        list.add("测试数据2");
        list.add("测试数据3");
        list.add("测试数据12");

        //使用λ表达式遍历集合
//        list.forEach(s -> System.out.println(s));
//
//        //结合Predicate使用和过滤条件筛选元素
//        Predicate<String> contain1 = n -> n.contains("1");
//        Predicate<String> contain2 = n -> n.contains("2");
//        System.out.println("----------------------------");
//        //根据条件遍历集合
//        list.stream().filter(contain1).forEach(n -> System.out.println(n));


        // 类型声明

  /*      Main main = new Main();

        MathOperation addition = (int a, int b) -> a + b;
        int operate = main.operate(5, 5, addition);
        System.out.println(operate);*/


    }
   /* interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }*/
}


