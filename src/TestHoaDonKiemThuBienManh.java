import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestHoaDonKiemThuBienManh{
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