public record Node<T>(T first, Node <T> rest){
    public static <T> Node<T> addToEnd(Node<T> lst, T value) {
        return switch(lst) {
            case null -> new Node<T>(value,null);
            case Node(T f, Node <T> r) -> new Node<T>(f, addToEnd(r,value));
        };
    }
    public static <T> Node<T> addToFront(Node<T> lst, T value) {
        return new Node<T>(value,lst);
    }
    public static <T> int getSize(Node<T> lst) {
        return switch(lst) {
            case null -> 0;
            case Node(T f, Node <T> r) -> 1 + getSize(r);
        };
    }

    public static <T> boolean equals(Node<T> list1, Node<T> list2) {
        return switch (list1) {
            case null -> list2 == null;
            case Node(T f1, Node<T> r1) -> switch (list2) {
                case null -> false;
                case Node(T f2, Node<T> r2) -> java.util.Objects.equals(f1, f2) && equals(r1, r2);
            };
        };
    }
}
