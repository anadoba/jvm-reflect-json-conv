package pl.nadoba.jvm.reflection.json.converter;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.json.JSONObject;

public class AppTest
        extends TestCase {

    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Actual testing
     */
    private void helperForTesting(Object obj) {
        JSONObject myJson = new PojoConverter(obj).convertToJson();
        JSONObject correctJson = new JSONObject(obj);
        System.out.println("JSON created 'by hand': \t" + myJson);
        System.out.println("JSON created by library: \t" + correctJson);
        assertEquals(myJson.toString(), correctJson.toString());
    }

    public void testClassWithPrimitives() {
        helperForTesting(new ClassWithPrimitives());
    }

    public void testClassWithCollections() {
        helperForTesting(new ClassWithLists());
    }

}
