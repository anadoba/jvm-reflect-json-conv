package pl.nadoba.jvm.reflection.json.converter;

import org.json.JSONObject;

public class App {
    public static void main(String[] args) throws IllegalAccessException {
        ClassWithLists example = new ClassWithLists();
        JSONObject myJson = new PojoConverter(example).convertToJson();
        JSONObject libraryJson = new JSONObject(example);

        System.out.println("JSON created 'by hand': \t" + myJson);
        System.out.println("JSON created by library: \t" + libraryJson);
    }

}
