package models.Transport;

public abstract class Transport {
    private String transportNumber;
    private String type;

    public void setType(String type) {this.type = type;}

    public String getTransportNumber() {return transportNumber;}

    public String getType() {return type;}

    public void setTransportNumber(String transportNumber) {this.transportNumber = transportNumber;}
}
