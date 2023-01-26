public class Woods {
    private String name;
    String WoodType = "";
    String WoodWeight = "";
    String WoodSpaceOccupied = "";
    String WoodValue = "";


    public Woods(String type, String weight, String space, String value) {
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
    public void setWoodWeight(String weight) {
        this.WoodWeight = weight;
    }
    public void setWoodSpaceOccupied(String space) {
        this.WoodSpaceOccupied = space;
    }
    public void setWoodValue(String value) {
        this.WoodValue = value;
    }
}
