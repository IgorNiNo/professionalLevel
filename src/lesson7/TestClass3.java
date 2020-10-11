package lesson7;

public class TestClass3 {

    @BeforeSuite
    public static void beforeTest1() {
        System.out.println("Первым запускается метод с аннотацией @BeforeSuite");
        System.out.println("Затем выполняются методы с аннотацией @Test согласно приоритета\n");
    }

    @AfterSuite
    public static void AfterTest1() {
        System.out.println("Завершает работу метод с аннотацией @AfterSuite");
    }

//    @BeforeSuite
//    public static void beforeTest2() {
//        System.out.println("Первым запускается метод с аннотацией @BeforeSuite");
//        System.out.println("Затем выполняются методы с аннотацией @Test согласно приоритета\n");
//    }

    @AfterSuite
    public static void AfterTest2() {
        System.out.println("Завершает работу метод с аннотацией @AfterSuite");
    }

    @Test()
    public static void test41() {
        System.out.println("Выполнен test41");
    }

    @Test(priorityLevel = 2)
    public static void test42() {
        System.out.println("Выполнен test42");
    }

    @Test(priorityLevel = 3)
    public static void test43() {
        System.out.println("Выполнен test43");
    }

    @Test(priorityLevel = 4)
    public static void test44() {
        System.out.println("Выполнен test44");
    }

    @Test(priorityLevel = 5)
    public static void test45() {
        System.out.println("Выполнен test45");
    }

    @Test(priorityLevel = 6)
    public static void test46() {
        System.out.println("Выполнен test46");
    }

    @Test(priorityLevel = 7)
    public static void test47() {
        System.out.println("Выполнен test47");
    }

    @Test(priorityLevel = 8)
    public static void test48() {
        System.out.println("Выполнен test48");
    }

    @Test(priorityLevel = 9)
    public static void test49() {
        System.out.println("Выполнен test49");
    }

    @Test(priorityLevel = 10)
    public static void test50() {
        System.out.println("Выполнен test50");
    }

    @Test()
    public static void test51() {
        System.out.println("Выполнен test51");
    }

    @Test(priorityLevel = 2)
    public static void test52() {
        System.out.println("Выполнен test52");
    }

    @Test(priorityLevel = 3)
    public static void test53() {
        System.out.println("Выполнен test53");
    }

    @Test(priorityLevel = 4)
    public static void test54() {
        System.out.println("Выполнен test54");
    }

    @Test(priorityLevel = 5)
    public static void test55() {
        System.out.println("Выполнен test55");
    }

    @Test(priorityLevel = 6)
    public static void test56() {
        System.out.println("Выполнен test56");
    }

    @Test(priorityLevel = 7)
    public static void test57() {
        System.out.println("Выполнен test57");
    }

    @Test(priorityLevel = 8)
    public static void test58() {
        System.out.println("Выполнен test58");
    }

    @Test(priorityLevel = 9)
    public static void test59() {
        System.out.println("Выполнен test59");
    }

    @Test(priorityLevel = 10)
    public static void test60() {
        System.out.println("Выполнен test60");
    }

}
