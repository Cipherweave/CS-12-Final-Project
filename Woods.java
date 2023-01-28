public class Woods {
    private String name;
    String WoodType = "";
    float WoodWeight = 0;
    float WoodSpaceOccupied = 0;
    float WoodValue = 0;
    public Woods(String type, float weight, float space, float value) {
        WoodType = type;
        WoodWeight = weight;
        WoodSpaceOccupied = space;
        WoodValue = value;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setWoodType(String type) {
        this.WoodType = type;
    }
    public void setWoodWeight(float weight) {
        this.WoodWeight = weight;
    }
    public void setWoodSpaceOccupied(float space) {
        this.WoodSpaceOccupied = space;
    }
    public void setWoodValue(float value) {
        this.WoodValue = value;
    }
    public float getWoodWeight(){
        return this.WoodWeight;
    }
    public float getWoodSpaceOccupied(){
        return this.WoodSpaceOccupied;
    }
    public float getWoodValue(){
        return this.WoodValue;
    }

  
}
