package ly.generalassemb.drewmahrt.shoppinglistver2;

/**
 * Created by drewmahrt on 10/21/16.
 */

public class ShoppingItem {
    String mName, mDescription, mPrice, mType;

    public ShoppingItem(String name, String description, String price, String type) {

        mName = name;
        mDescription = description;
        mPrice = price;
        mType = type;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String price) {
        mPrice = price;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }
}
