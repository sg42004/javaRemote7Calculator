
package recursion;

public class Simple {
    public static void main(String[] args) {
        callMyself(20);
    }


    public static void callMyself(long i) {
        if (i < 0) return; //ja ir viens, tad var šādi if.
        System.out.print(i + " ");
        i -= 1;
        callMyself(i);
        System.out.print(i + " * ");

    }

    //static -> lai var izsaukt neveidojot nekādus objektus

}
