package InterfaceEX;

class Rectangle implements Countable,Drawable{

    @Override
    public void draw() {
        System.out.println("drawing a rectangle");
    }

    @Override
    public void printInfo() {
        System.out.println("Rectangle info.");
    }
}
