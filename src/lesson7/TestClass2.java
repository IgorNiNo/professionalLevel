package lesson7;

public class TestClass2 {

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
//
//    @AfterSuite
//    public static void AfterTest2() {
//        System.out.println("Завершает работу метод с аннотацией @AfterSuite");
//    }

    @Test()
    public static void test21() {
        System.out.println("Выполнен test21");
    }

    @Test(priorityLevel = 2)
    public static void test22() {
        System.out.println("Выполнен test22");
    }

    @Test(priorityLevel = 3)
    public static void test23() {
        System.out.println("Выполнен test23");
    }

    @Test(priorityLevel = 4)
    public static void test24() {
        System.out.println("Выполнен test24");
    }

    @Test(priorityLevel = 5)
    public static void test25() {
        System.out.println("Выполнен test25");
    }

    @Test(priorityLevel = 6)
    public static void test26() {
        System.out.println("Выполнен test26");
    }

    @Test(priorityLevel = 7)
    public static void test27() {
        System.out.println("Выполнен test27");
    }

    @Test(priorityLevel = 8)
    public static void test28() {
        System.out.println("Выполнен test28");
    }

    @Test(priorityLevel = 9)
    public static void test29() {
        System.out.println("Выполнен test29");
    }

    @Test(priorityLevel = 10)
    public static void test30() {
        System.out.println("Выполнен test30");
    }

    @Test()
    public static void test31() {
        System.out.println("Выполнен test31");
    }

    @Test(priorityLevel = 2)
    public static void test32() {
        System.out.println("Выполнен test32");
    }

    @Test(priorityLevel = 3)
    public static void test33() {
        System.out.println("Выполнен test33");
    }

    @Test(priorityLevel = 4)
    public static void test34() {
        System.out.println("Выполнен test34");
    }

    @Test(priorityLevel = 5)
    public static void test35() {
        System.out.println("Выполнен test35");
    }

    @Test(priorityLevel = 6)
    public static void test36() {
        System.out.println("Выполнен test36");
    }

    @Test(priorityLevel = 7)
    public static void test37() {
        System.out.println("Выполнен test37");
    }

    @Test(priorityLevel = 8)
    public static void test38() {
        System.out.println("Выполнен test38");
    }

    @Test(priorityLevel = 9)
    public static void test39() {
        System.out.println("Выполнен test39");
    }

    @Test(priorityLevel = 10)
    public static void test40() {
        System.out.println("Выполнен test40");
    }

}
