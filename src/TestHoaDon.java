import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestHoaDon {

    // Kiem thu theo bang quyet dinh
    @Test
    void test1() {
        assertEquals(HoaDon.phanTramGiamGia(8.5,100000), -1);
    }

    @Test
    void test2() {
        assertEquals(HoaDon.phanTramGiamGia(-5,100000), -1);
    }

    @Test
    void test3() {
        assertEquals(HoaDon.phanTramGiamGia(125,100000), -1);
    }

    @Test
    void test4() {
        assertEquals(HoaDon.phanTramGiamGia(20,-10), -1);
    }

    @Test
    void test5() {
        assertEquals(HoaDon.phanTramGiamGia(6,200000), 100);
    }

    @Test
    void test6() {
        assertEquals(HoaDon.phanTramGiamGia(6,1500000), 100);
    }

    @Test
    void test7() {
        assertEquals(HoaDon.phanTramGiamGia(6,5500000), 100);
    }

    @Test
    void test8() {
        assertEquals(HoaDon.phanTramGiamGia(20,200000), 0);
    }

    @Test
    void test9() {
        assertEquals(HoaDon.phanTramGiamGia(20,1500000), 5);
    }

    @Test
    void test10() {
        assertEquals(HoaDon.phanTramGiamGia(20,5500000), 10);
    }

    // Kiem thu gia tri bien manh
    @Test
    void test11() {
        assertEquals(HoaDon.phanTramGiamGia(5,0), 100);
    }

    @Test
    void test12() {
        assertEquals(HoaDon.phanTramGiamGia(5,1000000), 100);
    }

    @Test
    void test13() {
        assertEquals(HoaDon.phanTramGiamGia(5,1), 100);
    }

    @Test
    void test14() {
        assertEquals(HoaDon.phanTramGiamGia(5,999999), 100);
    }

    @Test
    void test15() {
        assertEquals(HoaDon.phanTramGiamGia(5,-1), -1);
    }

    @Test
    void test16() {
        assertEquals(HoaDon.phanTramGiamGia(5,1000001), 100);
    }

    @Test
    void test17() {
        assertEquals(HoaDon.phanTramGiamGia(0,500000), 100);
    }

    @Test
    void test18() {
        assertEquals(HoaDon.phanTramGiamGia(7,500000), 0);
    }

    @Test
    void test19() {
        assertEquals(HoaDon.phanTramGiamGia(1,500000), 100);
    }

    @Test
    void test20() {
        assertEquals(HoaDon.phanTramGiamGia(6,500000), 100);
    }
    @Test
    void test21() {
        assertEquals(HoaDon.phanTramGiamGia(-1,500000), -1);
    }
    @Test
    void test22() {
        assertEquals(HoaDon.phanTramGiamGia(8,500000), 0);
    }

    @Test
    void test23() {
        assertEquals(HoaDon.phanTramGiamGia(5,500000), 100);
    }
}