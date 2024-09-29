package InterfaceEX;

interface Drawable {
    void draw();

    default void erase(){
        System.out.println("Erasing the drawing.");
    }

    default void printInfo(){
        System.out.println("Drawable info");
    }
}
