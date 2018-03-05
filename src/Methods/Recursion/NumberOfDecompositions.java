package Methods.Recursion;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class NumberOfDecompositions {

    static void calc(Deque<Integer> story, int residue) {
        if (residue == 0) {
            System.out.println(story.toString().replaceAll("]|\\[|,", ""));
            return;
        }
        int maxValue = story.isEmpty() ? residue : Math.min(story.getLast(), residue);

        for (int i = 1; i <= maxValue; i++) {
            story.addLast(i);
            calc(story, residue - i);
            story.removeLast();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        calc(new LinkedList<>(), count);
    }
}
