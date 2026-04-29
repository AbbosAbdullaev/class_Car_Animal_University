public class Car {
    private String model;
    private String speed;
    private Float price;
    private String type;


    public Car(String model, String speed, Float price, String type) {
        this.model = model;
        this.speed = speed;
        this.price = price;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
 }
