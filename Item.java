public class Item {
    private String name;
    String itemType = "";
    float itemWeight = 0;
    float itemSpaceOccupied = 0;
    float itemValue = 0;
    
    public Item(String type, float weight, float space, float value) {
        itemType = type;
        itemWeight = weight;
        itemSpaceOccupied = space;
        itemValue = value;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setItemType(String type) {
        this.itemType = type;
    }
    public void setItemWeight(float weight) {
        this.itemWeight = weight;
    }
    public void setItemSpaceOccupied(float space) {
        this.itemSpaceOccupied = space;
    }
    public void setItemValue(float value) {
        this.itemValue = value;
    }
    public float getItemWeight(){
        return this.itemWeight;
    }
    public float getItemSpaceOccupied(){
        return this.itemSpaceOccupied;
    }
    public float getItemValue(){
        return this.itemValue;
    }
}