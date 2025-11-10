public class Main {

    public static void main(String[] args) {
        run("Programa de Arboles Binarios");

        Nodo root= new Nodo(1);

        Nodo left = new Nodo(2);
        Nodo right = new Nodo(3);
        root.setLeft(left);
        root.setRght(right);

        root.left.left = new Nodo(4);
        root.left.rght = new Nodo(5);

        root.rght.rght = new Nodo(6);

        root.left.left.left = new Nodo(7);
        root.left.right.left =new Nodo(8);

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
