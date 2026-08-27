import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RationalTest {
    Rational r1;
    Rational r2;

    @Test
    public void testRational() {
        Rational r = new Rational(); // 1. สั่งสร้างวัตถุใหม่

        // 2. ตรวจสอบค่าเริ่มต้นของ numerator และ denominator
        Assert.assertEquals(1, r.numerator);
        Assert.assertEquals(1, r.denominator);
    }

    @Test
    public void testRationalWithArgs() throws Rational.Illegal {
        Rational r = new Rational(2, 4);
        Assert.assertEquals(1, r.numerator);
        Assert.assertEquals(2, r.denominator);

        try {
            new Rational(1, 0);
            Assert.fail("Should throw Illegal exception");
        } catch (Rational.Illegal e) {
        }
    }

    @Test
    public void testSubtract() {
        r1.numerator = 5;
        r1.denominator = 2;
        r2.numerator = 4;
        r2.denominator = 2;
        r1.subtract(r2);
        Assert.assertEquals(1, r1.numerator);
        Assert.assertEquals(2, r1.denominator);
    }

    @Test
    public void testMultiply() {
        r1.numerator = 5;
        r1.denominator = 2;
        r2.numerator = 4;
        r2.denominator = 2;
        r1.multiply(r2);
        Assert.assertEquals(5, r1.numerator);
        Assert.assertEquals(1, r1.denominator);
    }

    @Test
    public void testDivide() {
        r1.numerator = 5;
        r1.denominator = 2;
        r2.numerator = 4;
        r2.denominator = 2;
        r1.divide(r2);
        Assert.assertEquals(5, r1.numerator);
        Assert.assertEquals(4, r1.denominator);
    }

    @Test
    public void testEquals() {
        r1.numerator = 3;
        r1.denominator = 6;
        r2.numerator = 1;
        r2.denominator = 2;
        Assert.assertEquals(r1, r2);
    }

    @Test
    public void testCompareTo() {
        Rational r1 = new Rational();
        r1.numerator = 1;
        r1.denominator = 2;

        Rational r2 = new Rational();
        r2.numerator = 3;
        r2.denominator = 4;

        Rational r3 = new Rational();
        r3.numerator = 2;
        r3.denominator = 4;

        Assert.assertEquals(-1, r1.compareTo(r2));
        Assert.assertEquals(1, r2.compareTo(r1));
        Assert.assertEquals(0, r1.compareTo(r3));
    }

    @Test
    public void testToString() {
        Rational r = new Rational();
        r.numerator = 3;
        r.denominator = 6;

        // หลังทอนเป็นอย่างต่ำ 3/6 จะกลายเป็น "1/2"
        Assert.assertEquals("1/2", r.toString());
    }
    /***
     * This method will be called every time before the other @Test method
     * is called.
     */
    @Before
    public void createRationals() {
        System.out.println("Initializing the two Rational numbers.");
        r1 = new Rational();
        r2 = new Rational();
    }

    /***
     * For this test case, we want to check the add() method
     * by calculating the summation of 1/2 and 1/4.
     * The expected result must be 3/4.
     */
    @Test
    public void testAdd() {
        r1.numerator = 1;
        r1.denominator = 2;
        r2.numerator = 1;
        r2.denominator = 4;
        r1.add(r2);
        Assert.assertEquals(3, r1.numerator);
        Assert.assertEquals(4, r1.denominator);
    }

    @Test
    public void testAdd2() {
        r1.numerator = 1;
        r1.denominator = 3;
        r2.numerator = 1;
        r2.denominator = 3;
        r1.add(r2);
        Assert.assertEquals(2, r1.numerator);
        Assert.assertEquals(3, r1.denominator);
    }

    /***
     * This method will be called every time after the other @Test method
     * is called.
     */
    @After
    public void clearUp() {
        System.out.println("Clear up the two Rational numbers.");
        r1 = null;
        r2 = null;
    }
}
