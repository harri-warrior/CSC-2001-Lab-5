//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        IO.println("Push & pop:");
        for (int i = 1; i<=10; i++) {
            IO.println("Num of Array pushes & pops in " + 100*i + "ms:");
            IO.println(AStack.lessThanTPushPopAS(i*100));
        }
        for (int i = 1; i<=10; i++) {
            IO.println("Num of Linked list pushes & pops in " + 100*i + "ms:");
            IO.println(LLStack.lessThanTPushPopLLS(i*100));
        }
    }
}
