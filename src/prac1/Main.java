package prac1;

public class Main {
    public static void main(String[] args) {
        Student[] students1 = new Student[]{
                new Student("John",  100 ),
                new Student("Jane",  85),
                new Student("Bob",  30)
        };

        Student[] students2 = new Student[]{
                new Student("John",  99 ),
                new Student("Jane",  85),
                new Student("Bob",  30)
        };

        MaximumScorePredicate maximumScorePredicate = new MaximumScorePredicate(100);

        System.out.println("First array contains student with max score: " + maximumScorePredicate.test(students1));
        System.out.println("Second array contains student with max score: " + maximumScorePredicate.test(students2));
    }
}

