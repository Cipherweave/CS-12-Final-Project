
// Item superclass
public class Item {
    // name of the item
    private String name;

    // item type
    String itemType = "";

    // item weight
    float itemWeight = 0;

    // item space occupied
    float itemSpaceOccupied = 0;

    // item value
    float itemValue = 0;

    // constructor
    public Item(String type, float weight, float space, float value) {
        itemType = type;
        itemWeight = weight;
        itemSpaceOccupied = space;
        itemValue = value;
    }

    // setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // getter method for name
    public String getName() {
        return name;
    }

    // setter method for item type
    public void setItemType(String type) {
        this.itemType = type;
    }

    // getter method for item type
    public String getItemType() {
        return itemType;
    }

     // setter method for item weight
    public void setItemWeight(float weight) {
        this.itemWeight = weight;
    }

    // setter method for item space occupied
    public void setItemSpaceOccupied(float space) {
        this.itemSpaceOccupied = space;
    }

    // setter method for item value
    public void setItemValue(float value) {
        this.itemValue = value;
    }

    // getter method for item weight
    public float getItemWeight(){
        return this.itemWeight;
    }

     // getter method for item space occupied
    public float getItemSpaceOccupied(){
        return this.itemSpaceOccupied;
    }

    // getter method for item value
    public float getItemValue(){
        return this.itemValue;
    }
}