public class Nodo {
    public int value;
    public Nodo left;
    public Nodo rght;

    public Nodo(int value){
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public Nodo getLeft() {
        return left;
    }
    public Nodo getRght() {
        return rght;
    }
    public void setLeft(Nodo left) {
        this.left = left;
    }
    public void setRght(Nodo rght) {
        this.rght = rght;
    }
    public void setValue(int value) {
        this.value = value;
    }

}
