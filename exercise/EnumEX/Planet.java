package EnumEX;

public enum Planet {
    EARTH("Earth",123),
    MERCURY("Mercury",222);


    private final String name;
    private final double distanceFromSun;

    Planet(String name, double distanceFromSun){
        this.name = name;
        this.distanceFromSun = distanceFromSun;
    }

    public String getName(){
        return name;
    }

    public double getDistanceFromSun(){
        return distanceFromSun;
    }

}
