import org.junit.*;
import static org.junit.Assert.*;
public class test {
   @Test 
   public void testValidTriangle() {
    TriangleCheck t = new TriangleCheck();
    assertTrue(t.isTriangle(3, 4, 5));
   } 
   @Test 
   public void testInvalidTriangle() {
    TriangleCheck t = new TriangleCheck();
    assertFalse(t.isTriangle(1, 1, 3));
   } 
   @Test 
   public void testEquilateralTriangle() {
    TriangleCheck t = new TriangleCheck();
    assertTrue(t.isTriangle(3, 3, 3));
   } 
   @Test 
   public void testZeroSideLength() {
    TriangleCheck t = new TriangleCheck();
    assertFalse(t.isTriangle(0, 3, 3));
   } 
   @Test 
   public void testNegativeSideLength() {
    TriangleCheck t = new TriangleCheck();
    assertFalse(t.isTriangle(-3, 2, 3));
   } 

   
}
