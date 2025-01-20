package stock;


import java.text.DecimalFormat;

/**
 * Beginnig of class with private param defined.
 */
public class Stock {
  private String symbol;
  private String name;
  private double costBasis;
  private double currentPrice;

  /**
   * Default constructor.
   */

  public Stock() {
    this.symbol = "abc";
    this.name = "aaa";
    this.costBasis = 1.0;
  }

  /**
   * New constructor.
   * @param symbol symbol
   * @param name  company name
   * @param costBasis cost basis
   */

  public Stock(String symbol, String name, double costBasis) {
    this.symbol = symbol;
    this.name = name;
    this.costBasis = costBasis;
  }


  /**
   * Symbol Getter.
   * @return symbol.
   */
  public String getSymbol() {
    return this.symbol;
  }

  /**
   * Name Getter.
   * @return name.
   */
  public String getName() {
    return this.name;
  }

  /**
   * cost basis Getter.
   * @return costBasis.
   */
  public double getCostBasis() {
    return this.costBasis;
  }

  /**
   * Current Price Getter.
   * @return currentPrice.
   */
  public double getCurrentPrice() {
    return currentPrice;
  }

  /**
   * cost Basis Setter.
   * @param newBasis as new cost basis.
   */
  public void setCostBasis(double newBasis) {
    this.costBasis = newBasis;
  }

  /**
   * currentPrice setter.
   * @param newCurrentPrice as new.
   */
  public void setCurrentPrice(double newCurrentPrice) {
    currentPrice = newCurrentPrice;
  }

  /**
   * Change Percent Getter.
   * @return fractional change.
   */
  public double getChangePercent() {
    return (getCurrentPrice() - getCostBasis()) / getCostBasis();
  }

  /**
   * Override string.
   * @return newString.
   */
  public String toString() {
    DecimalFormat moneyformat = new DecimalFormat("$ 0.00");
    DecimalFormat percentformat = new DecimalFormat("0.00%");
    return this.name + " Current Price: " + moneyformat.format(getCurrentPrice()) + "\n"
            + " Gain/Loss: " + percentformat.format(getChangePercent());
  }

}