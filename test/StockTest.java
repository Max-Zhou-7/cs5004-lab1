import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import stock.Stock;


public class StockTest {
  Stock a;
  Stock b;

  @Before
  public void setup(){
    a = new Stock();
    b = new Stock("Circle", "Yuan", 10);
  }

  @Test
  public void testGetSymbol() {

    assertEquals("abc", a.getSymbol());
    assertEquals("Circle", b.getSymbol());
  }

  @Test
  public void testGetName(){

    assertEquals("aaa", a.getName());
    assertEquals("Yuan", b.getName());
  }

  @Test
  public void testCostBasis(){

    assertEquals(1.0, a.getCostBasis(),0.01);
    assertEquals(10, b.getCostBasis(),0.01);
    b.setCostBasis(7.7);
    assertEquals(7.7, b.getCostBasis(),0.01);
  }

  @Test
  public void testCurrentPrice(){

    b.setCurrentPrice(20.0);
    assertEquals(0.0, a.getCurrentPrice(),0.01);
    assertEquals(20.0, b.getCurrentPrice(),0.01);
  }

  @Test
  public void testGetChangePercent(){
    Stock a = new Stock();
    a.setCurrentPrice(15.0);
    Stock b = new Stock("Circle", "Yuan", 10);
    assertEquals((a.getCurrentPrice() - a.getCostBasis())/a.getCostBasis(), a.getChangePercent(),0.01);
    assertEquals((b.getCurrentPrice() - b.getCostBasis())/b.getCostBasis(), b.getChangePercent(),0.01);
  }


}