package lesson7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestsRun {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class testClass1 = TestClass1.class;
        Class testClass2 = TestClass2.class;
        Class testClass3 = TestClass3.class;

        start(testClass1);
        start(testClass2);
        start(testClass3);

    }


    public static void start(Class testClass) throws InvocationTargetException, IllegalAccessException {
        System.out.println("\nБерём в работу Class: " + testClass.getSimpleName()+ "\n");
        int countBeforeSuite = 0;
        int countAfterSuite = 0;
        Method[] methods = testClass.getDeclaredMethods();
        for (Method m : methods) {
            if (m.isAnnotationPresent(BeforeSuite.class)) {
                countBeforeSuite++;
                if(countBeforeSuite > 1) {
                    try {
                        throw new RuntimeException();
                    } catch (RuntimeException e) {
                        System.out.println("Методов с аннотацией @BeforeSuite больше одного");
                    }
                    return;
                }
            }
            if (m.isAnnotationPresent(AfterSuite.class)) {
                countAfterSuite++;
                if(countAfterSuite > 1) {
                    try {
                        throw new RuntimeException();
                    } catch (RuntimeException e) {
                        System.out.println("Методов с аннотацией @AfterSuite больше одного");
                    }
                    return;
                }
            }
        }
        for (Method m : methods) {
            if (m.isAnnotationPresent(BeforeSuite.class)) {
                m.invoke(null);
            }
        }
        for (int i = 10; i >= 1; i--) {
            System.out.println("BEGIN_Методы с приоритетом выполнения: " + i);
            for (Method m : methods) {
                if (m.isAnnotationPresent(Test.class)) {
                    if (i == m.getAnnotation(Test.class).priorityLevel()) {
                        m.invoke(null);
                    }
                }
            }
            System.out.println("END___Методы с приоритетом выполнения: " + i);
            System.out.println();
        }
        for (Method m : methods) {
            if (m.isAnnotationPresent(AfterSuite.class)) {
                m.invoke(null);
            }
        }
    }

}
