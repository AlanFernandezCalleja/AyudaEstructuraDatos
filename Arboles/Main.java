public class Main {

    public static void main(String[] args) {
        run("Programa de Arboles Binarios");

        Nodo root= new Nodo(1);

        Nodo leftChild = new Nodo(2);
        Nodo rightChild = new Nodo(3);
        root.setLeft(leftChild);
        root.setRght(rightChild);

        Nodo leftLeftChild = new Nodo(4);
        Nodo leftRightChild = new Nodo(5);
        leftChild.setLeft(leftLeftChild);
        leftChild.setRght(leftRightChild);

        subTittle("IN-ORDER TRANSVERSAL: ");
        BinaryTreeTraversals.inOrderTraversal(root);

        subTittle("PRE-ORDER TRANSVERSAL: ");
        BinaryTreeTraversals.preOrderTraversal(root);

        subTittle("POSt-ORDER TRANSVERSAL: ");
        BinaryTreeTraversals.postOrderTraversal(root);

    }





    public static void run(String tittle){
        System.out.println("\n===============================================");
        System.out.println("\n\n\t"+(tittle)+"\n\n");
        System.out.println("===============================================\n");
    }
    public static void subTittle(String tittle){
        System.out.println("\n===============================================");
        System.out.println("\n\t"+(tittle)+"\n");
        System.out.println("===============================================\n");
    }
}
