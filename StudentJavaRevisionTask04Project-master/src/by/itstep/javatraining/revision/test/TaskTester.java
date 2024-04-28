package by.itstep.javatraining.revision.test;

import by.itstep.javatraining.revision.task.*;

public class TaskTester {
    public static final String RIGHT = "completed successfully. Well DONE!!!";
    public static final String WRONG = "was NOT running successfully. Something was WRONG!";

    private static String getResult(String task, boolean result) {
        return task + " " + (result ? RIGHT : WRONG);
    }

    public static String testingTask01() {

        boolean result = Task01.start(1, 1, 1, 2, 2, 2) == 3661
                && Task01.start(0, 0, 0, 1, 1, 1) == 3661
                && Task01.start(2, 2, 2, 3, 3, 3) == 3661
                && Task01.start(3, 3, 3, 4, 4, 4) == 3661
                && Task01.start(1, 2, 30, 1, 3, 20) == 50
                && Task01.start(0, 0, 0, 0, 0, 1) == 1
                && Task01.start(0, 0, 0, 0, 1, 0) == 60
                && Task01.start(0, 0, 0, 1, 0, 0) == 3600

                && Task01.start(1, 1, 1, 1, 1, 1) == 0
                && Task01.start(2, 2, 2, 1, 1, 1) == 3661
                && Task01.start(4, 4, 4, 3, 3, 3) == 3661
                && Task01.start(1, 3, 20, 1, 2, 30) == 50
                && Task01.start(0, 0, 1, 0, 0, 0) == 1
                && Task01.start(0, 1, 0, 0, 0, 0) == 60
                && Task01.start(1, 0, 0, 0, 0, 0) == 3600

                && Task01.start(24, 1, 1, 1, 1, 1) == -1
                && Task01.start(25, 1, 1, 1, 1, 1) == -1
                && Task01.start(1, 1, 1, 24, 1, 1) == -1
                && Task01.start(1, 1, 1, 25, 1, 1) == -1
                && Task01.start(1, 60, 1, 1, 1, 1) == -1
                && Task01.start(1, 1, 60, 1, 1, 1) == -1
                && Task01.start(1, 61, 1, 1, 1, 1) == -1
                && Task01.start(1, 1, 61, 1, 1, 1) == -1
                && Task01.start(1, 1, 1, 1, 60, 1) == -1
                && Task01.start(1, 1, 1, 1, 1, 60) == -1
                && Task01.start(1, 1, 1, 1, 61, 1) == -1
                && Task01.start(1, 1, 1, 1, 1, 61) == -1


                && Task01.start(-1, 1, 1, 1, 1, 1) == -1
                && Task01.start(1, -1, 1, 1, 1, 1) == -1
                && Task01.start(1, 1, -1, 1, 1, 1) == -1
                && Task01.start(1, 1, 1, -1, 1, 1) == -1
                && Task01.start(1, 1, 1, 1, -1, 1) == -1
                && Task01.start(1, 1, 1, 1, 1, -1) == -1;

        return getResult("Task 01 [Time-Turner]", result);
    }

    public static String testingTask02() {

        boolean result = Task02.start(20, 21, 22) == 32
                && Task02.start(19, 15, 23) == 30
                && Task02.start(16, 18, 20) == 27
                && Task02.start(1, 1, 1) == 3
                && Task02.start(2, 1, 1) == 3
                && Task02.start(1, 2, 1) == 3
                && Task02.start(1, 1, 2) == 3
                && Task02.start(2, 2, 1) == 3
                && Task02.start(1, 2, 2) == 3
                && Task02.start(2, 1, 2) == 3
                && Task02.start(2, 2, 2) == 3
                && Task02.start(1000, 1000, 1000) == 1500
                && Task02.start(0, 6, 5) == 0
                && Task02.start(5, 0, 5) == 0
                && Task02.start(5, 6, 0) == 0
                && Task02.start(-5, 6, 5) == 0
                && Task02.start(5, -6, 5) == 0
                && Task02.start(5, 6, -5) == 0;

        return getResult("Task 02 [Desks]", result);
    }

    public static String testingTask03() {

        boolean result = Task03.start(0).trim().equalsIgnoreCase("0:00:00")
                && Task03.start(3602).trim().equalsIgnoreCase("1:00:02")
                && Task03.start(86399).trim().equalsIgnoreCase("23:59:59")
                && Task03.start(129700).trim().equalsIgnoreCase("12:01:40")
                && Task03.start(1).trim().equalsIgnoreCase("0:00:01")
                && Task03.start(3600).trim().equalsIgnoreCase("1:00:00")
                && Task03.start(60).trim().equalsIgnoreCase("0:01:00")
                && Task03.start(3661).trim().equalsIgnoreCase("1:01:01")

                && Task03.start(-1).trim().equalsIgnoreCase("error");

        return getResult("Task 03 [Digital Watch]", result);
    }

    public static String testingTask04() {
        boolean result = Task04.start(23, 52, 8, 43) == 8
                && Task04.start(14, 7, 6, 11) == 1

                && Task04.start(23, 52, -1, 43) == -1
                && Task04.start(0, 52, 6, 43) == -1
                && Task04.start(24, 10, 8, -24) == -1
                && Task04.start(-24, 10, 8, 24) == -1
                && Task04.start(24, -10, 8, 24) == -1
                && Task04.start(24, 0, 8, 24) == -1
                && Task04.start(24, 10, 9, 25) == -1
                && Task04.start(10, 24, 9, 25) == -1
                && Task04.start(14, 10, 11, 7) == -1
                && Task04.start(10, 14, 11, 7) == -1

                && Task04.start(23, 52, 0, 43) == 0
                && Task04.start(7, 14, 6, 11) == 1
                && Task04.start(14, 8, 4, 8) == 4
                && Task04.start(8, 14, 4, 8) == 4
                && Task04.start(8, 14, 4, 12) == 2
                && Task04.start(52, 23, 20, 8) == 3
                && Task04.start(8, 25, 8, 23) == 0
                && Task04.start(53, 41, 20, 25) == 20
                && Task04.start(46, 41, 20, 25) == 20
                && Task04.start(10, 6, 1, 2) == 1
                && Task04.start(24, 10, 8, 24) == 0;

        return getResult("Task 04 [Student and Swimming Pool]", result);
    }

    public static String testingTask05() {
        boolean result = Task05.start(7, 6, 1).trim().equals("1 6 7")
                && Task05.start(6, 7, 2).trim().equals("2 6 7")
                && Task05.start(7, 7, 4).trim().equals("4 7 7")
                && Task05.start(7, 4, 7).trim().equals("4 7 7")
                && Task05.start(4, 7, 7).trim().equals("4 7 7")
                && Task05.start(1, 2, 3).trim().equals("1 2 3")
                && Task05.start(1, 3, 2).trim().equals("1 2 3")
                && Task05.start(2, 1, 3).trim().equals("1 2 3")
                && Task05.start(2, 3, 1).trim().equals("1 2 3")
                && Task05.start(3, 1, 2).trim().equals("1 2 3")
                && Task05.start(3, 2, 1).trim().equals("1 2 3")
                && Task05.start(1, 1, 1).trim().equals("1 1 1");

        return getResult("Task 05 [Ordering Numbers]", result);
    }

    public static String testingTask06() {
        boolean result = Task06.start(4, 6, 5, 6, 5, 6)

                && !Task06.start(3, 5, 5, 2, 3, 4)
                && !Task06.start(0, 3, 5, 2, 3, 4)
                && !Task06.start(3, -5, 5, 2, 3, 4)

                && !Task06.start(3, 0, 5, 2, 3, 4)
                && !Task06.start(3, 3, 0, 2, 3, 4)
                && !Task06.start(3, 3, 5, 0, 3, 4)
                && !Task06.start(3, 3, 5, 2, 0, 4)
                && !Task06.start(3, 3, 5, 2, 3, 0)
                && !Task06.start(-3, 5, 5, 2, 3, 4)
                && !Task06.start(3, 5, -5, 2, 3, 4)
                && !Task06.start(3, 5, 5, -2, 3, 4)
                && !Task06.start(3, 5, 5, 2, -3, 4)
                && !Task06.start(3, 5, 5, 2, 3, -4)

                && !Task06.start(5, 5, 3, 2, 3, 4)
                && !Task06.start(3, 5, 5, 2, 4, 3)
                && !Task06.start(3, 5, 5, 3, 2, 4)
                && !Task06.start(3, 5, 5, 3, 4, 2)
                && !Task06.start(3, 5, 5, 4, 2, 3)
                && !Task06.start(3, 5, 5, 4, 3, 2)
                && !Task06.start(5, 5, 5, 4, 4, 4)
                && !Task06.start(5, 5, 4, 4, 4, 4)
                && !Task06.start(5, 4, 5, 4, 4, 4)
                && !Task06.start(4, 5, 5, 4, 4, 4)
                && !Task06.start(5, 4, 4, 4, 4, 4)
                && !Task06.start(4, 5, 4, 4, 4, 4)
                && !Task06.start(4, 4, 5, 4, 4, 4)
                && !Task06.start(2, 1, 1, 1, 1, 1)
                && !Task06.start(1, 2, 1, 1, 1, 1)
                && !Task06.start(1, 1, 2, 1, 1, 1)

                && !Task06.start(5, 12, 8, 15, 16, 2)
                && !Task06.start(5, 8, 12, 15, 16, 2)
                && !Task06.start(12, 5, 8, 15, 16, 2)
                && !Task06.start(12, 8, 5, 15, 16, 2)
                && !Task06.start(8, 5, 12, 15, 16, 2)
                && !Task06.start(8, 12, 5, 15, 16, 2)
                && !Task06.start(5, 12, 8, 15, 2, 16)
                && !Task06.start(5, 12, 8, 16, 15, 2)
                && !Task06.start(5, 12, 8, 16, 2, 15)
                && !Task06.start(5, 12, 8, 2, 16, 15)
                && !Task06.start(5, 12, 8, 2, 15, 16)

                && !Task06.start(3, 7, 11, 1, 9, 11)
                && !Task06.start(7, 11, 3, 1, 9, 11)
                && !Task06.start(11, 3, 7, 1, 9, 11)
                && !Task06.start(3, 7, 11, 9, 11, 1)
                && !Task06.start(3, 7, 11, 11, 1, 9)

                && Task06.start(4, 5, 6, 6, 5, 6)
                && Task06.start(6, 4, 5, 6, 5, 6)
                && Task06.start(6, 5, 4, 6, 5, 6)
                && Task06.start(5, 6, 4, 6, 5, 6)
                && Task06.start(5, 4, 6, 6, 5, 6)
                && Task06.start(4, 6, 5, 6, 6, 5)
                && Task06.start(4, 6, 5, 5, 6, 6)
                && Task06.start(4, 4, 4, 5, 5, 5)
                && Task06.start(1, 1, 1, 1, 1, 1)
                && Task06.start(1, 1, 1, 2, 1, 1)
                && Task06.start(1, 1, 1, 1, 2, 1)
                && Task06.start(1, 1, 1, 1, 1, 2)
                && Task06.start(4, 4, 4, 4, 4, 4)
                && Task06.start(4, 4, 4, 4, 5, 5)
                && Task06.start(4, 4, 4, 5, 4, 5)
                && Task06.start(4, 4, 4, 5, 5, 4)
                && Task06.start(4, 4, 4, 4, 4, 5)
                && Task06.start(4, 4, 4, 4, 5, 4)
                && Task06.start(4, 4, 4, 5, 4, 4);

        return getResult("Task 06 [Rectangular World 3]", result);
    }

    public static String testingTask07() {
        boolean result = Task07.start(1, 2, 3, 3, 2, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task07.start(2, 2, 3, 3, 2, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(3, 2, 1, 2, 2, 3).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(3, 11, 5, 4, 7, 9).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(0, 11, 5, 4, 7, 9).trim().equalsIgnoreCase("Error.")
                && Task07.start(3, -11, 5, 4, 7, 9).trim().equalsIgnoreCase("Error.")

                && Task07.start(1, 1, 1, 1, 1, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task07.start(2, 1, 1, 2, 1, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task07.start(1, 2, 1, 2, 1, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task07.start(1, 1, 2, 2, 1, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task07.start(2, 1, 1, 1, 2, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task07.start(2, 1, 1, 1, 1, 2).trim().equalsIgnoreCase("Boxes are equal.")
                && Task07.start(2, 2, 1, 2, 2, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task07.start(2, 1, 2, 2, 2, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task07.start(1, 2, 2, 2, 2, 1).trim().equalsIgnoreCase("Boxes are equal.")
                && Task07.start(1, 2, 2, 1, 2, 2).trim().equalsIgnoreCase("Boxes are equal.")
                && Task07.start(1, 2, 2, 2, 1, 2).trim().equalsIgnoreCase("Boxes are equal.")

                && Task07.start(2, 3, 2, 3, 2, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(3, 2, 2, 3, 2, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(2, 2, 3, 3, 1, 2).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(2, 2, 3, 2, 3, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(2, 2, 3, 2, 1, 3).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(2, 2, 3, 1, 2, 3).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(2, 2, 3, 1, 3, 2).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(2, 2, 2, 1, 1, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(2, 2, 2, 2, 1, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(2, 2, 2, 1, 2, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(2, 2, 2, 1, 1, 2).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(2, 2, 2, 2, 2, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(2, 2, 2, 2, 1, 2).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(2, 2, 2, 1, 2, 2).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(2, 2, 1, 1, 1, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(2, 1, 2, 1, 1, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(1, 2, 2, 1, 1, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(1, 1, 2, 1, 1, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(1, 2, 1, 1, 1, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")
                && Task07.start(2, 1, 1, 1, 1, 1).trim().equalsIgnoreCase("The first box is larger than the second one.")

                && Task07.start(3, 1, 2, 2, 2, 3).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(2, 3, 1, 2, 2, 3).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(2, 1, 3, 2, 2, 3).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(1, 2, 3, 2, 2, 3).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(1, 3, 2, 2, 2, 3).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(3, 2, 1, 2, 3, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(3, 2, 1, 3, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(1, 1, 1, 2, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(2, 1, 1, 2, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(1, 2, 1, 2, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(1, 1, 2, 2, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(1, 2, 2, 2, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(2, 1, 2, 2, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(2, 2, 1, 2, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(1, 1, 1, 1, 2, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(1, 1, 1, 2, 1, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(1, 1, 1, 2, 2, 1).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(1, 1, 1, 1, 1, 2).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(1, 1, 1, 1, 2, 1).trim().equalsIgnoreCase("The first box is smaller than the second one.")
                && Task07.start(1, 1, 1, 2, 1, 1).trim().equalsIgnoreCase("The first box is smaller than the second one.")

                && Task07.start(3, 5, 11, 4, 7, 9).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(11, 5, 3, 4, 7, 9).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(11, 3, 5, 4, 7, 9).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(5, 11, 3, 4, 7, 9).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(5, 3, 11, 4, 7, 9).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(3, 11, 5, 4, 9, 7).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(3, 11, 5, 7, 9, 4).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(3, 11, 5, 7, 4, 9).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(3, 11, 5, 9, 7, 4).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(3, 11, 5, 9, 4, 7).trim().equalsIgnoreCase("Boxes are incomparable.")

                && Task07.start(5, 12, 8, 15, 16, 2).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(5, 8, 12, 15, 16, 2).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(12, 5, 8, 15, 16, 2).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(12, 8, 5, 15, 16, 2).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(8, 5, 12, 15, 16, 2).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(8, 12, 5, 15, 16, 2).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(5, 12, 8, 15, 2, 16).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(5, 12, 8, 16, 15, 2).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(5, 12, 8, 16, 2, 15).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(5, 12, 8, 2, 16, 15).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(5, 12, 8, 2, 15, 16).trim().equalsIgnoreCase("Boxes are incomparable.")

                && Task07.start(3, 7, 11, 1, 9, 11).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(7, 11, 3, 1, 9, 11).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(11, 3, 7, 1, 9, 11).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(3, 7, 11, 9, 11, 1).trim().equalsIgnoreCase("Boxes are incomparable.")
                && Task07.start(3, 7, 11, 11, 1, 9).trim().equalsIgnoreCase("Boxes are incomparable.")

                && Task07.start(3, 0, 5, 4, 7, 9).trim().equalsIgnoreCase("Error.")
                && Task07.start(3, 11, 0, 4, 7, 9).trim().equalsIgnoreCase("Error.")
                && Task07.start(3, 11, 5, 0, 7, 9).trim().equalsIgnoreCase("Error.")
                && Task07.start(3, 11, 5, 4, 0, 9).trim().equalsIgnoreCase("Error.")
                && Task07.start(3, 11, 5, 4, 7, 0).trim().equalsIgnoreCase("Error.")
                && Task07.start(-3, 11, 5, 4, 7, 9).trim().equalsIgnoreCase("Error.")
                && Task07.start(3, 11, -5, 4, 7, 9).trim().equalsIgnoreCase("Error.")
                && Task07.start(3, 11, 5, -4, 7, 9).trim().equalsIgnoreCase("Error.")
                && Task07.start(3, 11, 5, 4, -7, 9).trim().equalsIgnoreCase("Error.")
                && Task07.start(3, 11, 5, 4, 7, -9).trim().equalsIgnoreCase("Error.");

        return getResult("Task 07 [Boxes]", result);
    }

    public static String testingTaskX() {

        boolean result = TaskX.start(-1, 1) == 55
                && TaskX.start(40, 2) == 24
                && TaskX.start(0, 1) == 0
                && TaskX.start(10, 0) == 0
                && TaskX.start(1, 1) == 1
                && TaskX.start(2, 1) == 2
                && TaskX.start(2, 2) == 4
                && TaskX.start(-2, 1) == 54
                && TaskX.start(-2, 2) == 52
                && TaskX.start(10, 1000) == 32
                && TaskX.start(-10, 1000) == 24
                && TaskX.start(-1000, 10) == 24
                && TaskX.start(1000, 10) == 32

                && TaskX.start(10, -1) == -1
                && TaskX.start(-10, -1) == -1;

        return getResult("Task X [Minsk Ring Road]", result);
    }
}
