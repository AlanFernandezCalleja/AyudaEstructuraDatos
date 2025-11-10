public class BinaryTreeTraversals {
    public static void inOrderTraversal(Nodo nodo){
        if (nodo != null) {
            inOrderTraversal(nodo.getLeft());
            System.out.print(nodo.getValue() + " ");
            inOrderTraversal(nodo.getRght());
        }
    }
    public static void preOrderTraversal(Nodo nodo){
        if (nodo != null) {
                System.out.print(nodo.getValue() + " ");
                preOrderTraversal(nodo.getLeft());
                preOrderTraversal(nodo.getRght());
            }
    }
    public static void postOrderTraversal(Nodo nodo){
        if (nodo != null) {
                postOrderTraversal(nodo.getLeft());
                postOrderTraversal(nodo.getRght());
                System.out.print(nodo.getValue() + " ");
            }
    }
}
