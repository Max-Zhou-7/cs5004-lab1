import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import stock.Stock;

/**
 * Beginning of the stock test class with stocks defined.
 */
public class StockTest {
  Stock a;
  Stock b;

  /**
   * set up the stocks which will be tested later.
    */
  @Before
public void setup() {
    a = new Stock();
    b = new Stock("Circle", "Yuan", 10);
  }

  /**
   * test get symbol.
   */
  @Test
public void testGetSymbol() {

    assertEquals("abc", a.getSymbol());
    assertEquals("Circle", b.getSymbol());
  }

  /**
   * test get name.
   */
  @Test
public void testGetName() {

    assertEquals("aaa", a.getName());
    assertEquals("Yuan", b.getName());
  }

  /**
   * test set and get cost basis.
   */
  @Test
public void testCostBasis() {

    assertEquals(1.0, a.getCostBasis(),0.01);
    assertEquals(10, b.getCostBasis(),0.01);
    b.setCostBasis(7.7);
    assertEquals(7.7, b.getCostBasis(),0.01);
  }

  /**
   * test set and get current price.
   */
  @Test
public void testCurrentPrice() {

    b.setCurrentPrice(20.0);
    assertEquals(0.0, a.getCurrentPrice(),0.01);
    assertEquals(20.0, b.getCurrentPrice(),0.01);
  }

  /**
   * test get change percent.
   */
  @Test
public void testGetChangePercent() {
    Stock a = new Stock();
    a.setCurrentPrice(15.0);
    Stock b = new Stock("Circle", "Yuan", 10);
    assertEquals((a.getCurrentPrice() - a.getCostBasis()) / a.getCostBasis(),
                          a.getChangePercent(),0.01);
    assertEquals((b.getCurrentPrice() - b.getCostBasis()) / b.getCostBasis(),
                          b.getChangePercent(),0.01);
  }


}