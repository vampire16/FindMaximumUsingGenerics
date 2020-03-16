public class Maximum {
    public static void main(String[] args){
        System.out.println("Welcome");
    }

    public static <E extends Comparable> E findMax(E first, E second, E third) {
        E maximum = first;

        if (second.compareTo(maximum)>0)
            maximum = second;
        if (third.compareTo(maximum)>0)
            maximum = third;
        return maximum;
    }
}
