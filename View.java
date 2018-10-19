public class View
{
    private final String sessionID;
    private final String productID;
    private final int price;

    public View(String sessionID, String productID, int price)
    {
        this.sessionID = sessionID;
        this.productID = productID;
        this.price = price;
    }

    public String getSessionID()
    {
        return this.sessionID;
    }

    public String getProduct()
    {
        return this.productID;
    }

    public int getPrice()
    {
        return this.price;
    }

}