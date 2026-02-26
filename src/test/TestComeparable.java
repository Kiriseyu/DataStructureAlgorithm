package test;

import algorithm.sort.ComeparableGetMax;

public class TestComeparable {

    public static void main(String[] args) {
        ComeparableGetMax s1 =  new ComeparableGetMax();
        s1.setUsername("admin");
        s1.setAge(22);
        ComeparableGetMax s2 =  new ComeparableGetMax();
        s2.setUsername("nimda");
        s2.setAge(11);

        Comparable max = getMax(s1,s2);
        System.out.println(max);
    }

    public static Comparable getMax(Comparable c1, Comparable c2) {
        int cmp = c1.compareTo(c2);
        //if cmp > 0,c1 > c2;
        //if cmp == 0,c1 == c2;
        //if cmp < 0,c1 < c2;
        if(cmp > 0){
            return c1;
        }else{
            return c2;
        }
    }
}
