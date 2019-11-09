package day09_assert;

public class Assert {
    public static void assertEquals(Object o1, Object o2) {
        assert (o1.equals(o2)) : "相等測試失敗, " + o1.getClass();
        System.out.println("相等測試通過");
    }
    
    public static void assertNotNull(Object o1) {
        assert (o1 != null) : "Not Null 測試失敗";
        System.out.println("Not Null 測試通過");
    }
}
