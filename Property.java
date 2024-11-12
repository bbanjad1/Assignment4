package assignment4;

public class Property {
    private String propertyName;
    private String city;
    private double rentAmount;
    private String owner;
    private Plot plot;

    // Constructors
    public Property() {
        this.propertyName = "";
        this.city = "";
        this.rentAmount = 0;
        this.owner = "";
        this.plot = new Plot();
    }

    public Property(String propertyName, String city, double rentAmount, String owner) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.plot = new Plot();
    }

    public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.plot = new Plot(x, y, width, depth);
    }

    public Property(Property otherProperty) {
        this.propertyName = otherProperty.propertyName;
        this.city = otherProperty.city;
        this.rentAmount = otherProperty.rentAmount;
        this.owner = otherProperty.owner;
        this.plot = new Plot(otherProperty.plot);
    }

    // Getters and Setters
    public String getPropertyName() { return propertyName; }
    public void setPropertyName(String propertyName) { this.propertyName = propertyName; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public double getRentAmount() { return rentAmount; }
    public void setRentAmount(double rentAmount) { this.rentAmount = rentAmount; }

    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }

    public Plot getPlot() { return plot; }
    public void setPlot(Plot plot) { this.plot = plot; }

    // toString method
    @Override
    public String toString() {
        return propertyName + "," + city + "," + owner + "," + rentAmount;
    }
}
