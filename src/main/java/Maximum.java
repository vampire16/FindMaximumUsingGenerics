public class Maximum<E extends Comparable> {
    E first;
    E second;
    E third;

    public Maximum(E first, E second, E third) {
        this.first=first;
        this.second=second;
        this.third=third;
    }

//    public static void main(String[] args){
//        System.out.println("Welcome");
//    }

    public <E extends Comparable> E findMax() {
        E maximum = (E) first;

        if (second.compareTo(maximum)>0)
            maximum = (E) second;
        if (third.compareTo(maximum)>0)
            maximum = (E) third;
        return maximum;
    }
}
