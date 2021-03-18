import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PaymentListTest {
    private PaymentList PL = new PaymentList(3);
    private Object O1,O2,O3,O4;
    private Payment P1,P2;
    // a method to test the method of super class of PaymentList (Object List)
    @Test
    void testPaymentListTotal(){
        PL.add(O1);
        int i = PL.getTotal();
        assertEquals(1,PL.getTotal());

    }

    @Test
    void testPaymentListFull(){
        PL.add(O1);
        PL.add(O2);
        PL.add(O3);
        PL.add(O4);
        assertEquals(true, PL.isFull());

    }

    @Test
    void testPaymentCalculateTotal(){
        Payment P1 = new Payment("january", 20);
        Payment P2 = new Payment("february", 60);

        PL.add(P1);
        PL.add(P2);
        assertEquals(80,PL.calculateTotalPaid());

    }




}
