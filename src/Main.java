public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Flower myFlower = new Flower("Rose", "Rød", 30);
        myFlower.displayState();
        myFlower.bloom(5);
        myFlower.changeColor("Pink");
        myFlower.displayState();
    }
}
