package pl.nadoba.jvm.reflection.json.converter;

import java.util.LinkedList;
import java.util.List;

public class ClassWithLists {

    public List<Integer> listInt = new LinkedList<Integer>() {{
        add(5);
        add(123);
        add(1);
        add(2);
    }};

    private double[] arrayDouble = new double[]{1,2,3,4};

    // getters added in order to enable org.json library to generate JSON automatically from this class
    public List<Integer> getListInt() {
        return listInt;
    }

    public double[] getArrayDouble() {
        return arrayDouble;
    }
}
