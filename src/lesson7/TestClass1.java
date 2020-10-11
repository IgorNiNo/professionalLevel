package lesson7;

public class TestClass1 {

    @BeforeSuite
    public static void beforeTest1() {
        System.out.println("Первым запускается метод с аннотацией @BeforeSuite");
        System.out.println("Затем выполняются методы с аннотацией @Test согласно приоритета\n");
    }

    @AfterSuite
    public static void AfterTest1() {
        System.out.println("Завершает работу метод с аннотацией @AfterSuite");
    }

    @BeforeSuite
    public static void beforeTest2() {
        System.out.println("Первым запускается метод с аннотацией @BeforeSuite");
        System.out.println("Затем выполняются методы с аннотацией @Test согласно приоритета\n");
    }

//    @AfterSuite
//    public static void AfterTest2() {
//        System.out.println("Завершает работу метод с аннотацией @AfterSuite");
//    }

    @Test()
    public static void test1() {
        System.out.println("Выполнен test1");
    }

    @Test(priorityLevel = 2)
    public static void test2() {
        System.out.println("Выполнен test2");
    }

    @Test(priorityLevel = 3)
    public static void test3() {
        System.out.println("Выполнен test3");
    }

    @Test(priorityLevel = 4)
    public static void test4() {
        System.out.println("Выполнен test4");
    }

    @Test(priorityLevel = 5)
    public static void test5() {
        System.out.println("Выполнен test5");
    }

    @Test(priorityLevel = 6)
    public static void test6() {
        System.out.println("Выполнен test6");
    }

    @Test(priorityLevel = 7)
    public static void test7() {
        System.out.println("Выполнен test7");
    }

    @Test(priorityLevel = 8)
    public static void test8() {
        System.out.println("Выполнен test8");
    }

    @Test(priorityLevel = 9)
    public static void test9() {
        System.out.println("Выполнен test9");
    }

    @Test(priorityLevel = 10)
    public static void test10() {
        System.out.println("Выполнен test10");
    }

    @Test()
    public static void test11() {
        System.out.println("Выполнен test11");
    }

    @Test(priorityLevel = 2)
    public static void test12() {
        System.out.println("Выполнен test12");
    }

    @Test(priorityLevel = 3)
    public static void test13() {
        System.out.println("Выполнен test13");
    }

    @Test(priorityLevel = 4)
    public static void test14() {
        System.out.println("Выполнен test14");
    }

    @Test(priorityLevel = 5)
    public static void test15() {
        System.out.println("Выполнен test15");
    }

    @Test(priorityLevel = 6)
    public static void test16() {
        System.out.println("Выполнен test16");
    }

    @Test(priorityLevel = 7)
    public static void test17() {
        System.out.println("Выполнен test17");
    }

    @Test(priorityLevel = 8)
    public static void test18() {
        System.out.println("Выполнен test18");
    }

    @Test(priorityLevel = 9)
    public static void test19() {
        System.out.println("Выполнен test19");
    }

    @Test(priorityLevel = 10)
    public static void test20() {
        System.out.println("Выполнен test20");
    }

}
