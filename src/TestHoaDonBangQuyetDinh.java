import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestHoaDonBangQuyetDinh {

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
}