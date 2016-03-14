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
    public void testClassWithPrimitives() {
        ClassWithPrimitives cl = new ClassWithPrimitives();
        JSONObject myJson = new PojoConverter(cl).convertToJson();
        JSONObject correctJson = new JSONObject(cl);
        assertEquals(myJson.toString(), correctJson.toString());
    }

    public void testPrimitive() {
        assertFalse(false);
    }
}
