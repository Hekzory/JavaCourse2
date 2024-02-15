package prac1;

import java.util.Arrays;
import java.util.function.Predicate;

public class MaximumScorePredicate implements Predicate<Student[]> {
    private final int maxScore;

    public MaximumScorePredicate(int maxScore) {
        this.maxScore = maxScore;
    }

    @Override
    public boolean test(Student[] students) {
        return Arrays.stream(students).anyMatch(student -> student.getScore() == this.maxScore);
    }
}

