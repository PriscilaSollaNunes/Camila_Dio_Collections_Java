package list;


import java.util.*;

class notas2 {
    public static void main(String[] args) {

        System.out.println("Crie uma lista chamada notas2: ");

List<Double> notas2 = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        notas2.add(5.0);
        notas2.add(3.3);
        notas2.add(5.4);
        notas2.add(6.0);
        notas2.add(9.0);
        notas2.add(0.5);
        notas2.add(7.6);
        System.out.println(notas2.toString());

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.get(0));

        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.get(0));
        notas2.remove(0);
        System.out.println(notas2);

        

    }

}