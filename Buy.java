public class Buy
{
    private final String sessionID;
    private final String productID;
    private final int price;
    private final int quantity;

    public Buy(String sessionNumber, String productNumber, int price, int quantity)
    {
        this.sessionID = sessionNumber;
        this.productID = productNumber;
        this.price = price;
        this.quantity = quantity;
    }

    public String getSessionID()
    {
        return this.sessionID;
    }

    public String getProductID()
    {
        return this.productID;
    }

    public int getPrice()
    {
        return this.price;
    }

    public int getQuantity()
    {
        return this.quantity;
    }

    public int getTotalCost()
    {
        return this.quantity * this.price;
    }


}
