class Flower {
    String name;
    String color;
    int petalCount;

    Flower(String name, String color, int petalCount) {
        this.name = name;
        this.color = color;
        this.petalCount = petalCount;
    }

    void bloom(int addedPetals) {
        this.petalCount += addedPetals;
        System.out.println(this.name + " er blomstret! Nu har den " + this.petalCount + " blade.");
    }

    void changeColor(String newColor) {
        this.color = newColor;
        System.out.println(this.name + " Har nu ændret farve til " + newColor + ".");
    }

    void displayState() {
        System.out.println("Blomst: " + this.name + ", Farve: " + this.color + ", Antal blade: " + this.petalCount);
    }
}
