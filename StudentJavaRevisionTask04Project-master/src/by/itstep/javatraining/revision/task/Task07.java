package by.itstep.javatraining.revision.task;

/*	Task 07. Boxes [коробки]
 *
 *	Есть две коробки, первая размером A1, B1, C1, вторая размером A2, B2, C2.
 *	Определите, можно ли разместить одну из этих коробок внутри другой, при условии,
 *	что поворачивать коробки можно только на 90 градусов вокруг рёбер.
 *
 *	Предварительные условия:
 *	1)	стенки коробок имеют нулевую толщину;
 *	2)	одна коробка не может "выглядывать" из другой, она должна помещаться в ней полностью,
 *		однако признак вложенности допускает равенство одного или двух соответствующих сторон
 *		коробок (но не всех трёх одновременно, потому что тогда коробки будут считаться
 *		одинаковыми);
 *	3)	объёмы коробок не могут служить надёжным критерием для их сравнения;
 *	4)	не забудьте про "защиту от дурака": все величины должны быть больше нуля.
 *
 *	Формат входных данных
 *	Метод получает на вход шесть целых чисел типа int.
 *
 *	Формат выходных данных
 *	Метод должен возвратить одну из следующих строк:
 *  1) "Error." - если размеры коробок некорректны.
 *  2) "Boxes are equal." - если коробки одинаковые,
 *	3) "The first box is smaller than the second one." - если первая коробка может быть положена во вторую,
 *	4) "The first box is larger than the second one." - если вторая коробка может быть положена в первую,
 *	5) "Boxes are incomparable." - во всех остальных случаях.
 *
 *	[ input 1]: 1 2 3 3 2 1
 *	[output 1]: Boxes are equal.
 *
 *	[ input 2]: 2 2 3 3 2 1
 *	[output 2]: The first box is larger than the second one.
 *
 *	[ input 3]: 3 2 1 2 2 3
 *	[output 3]: The first box is smaller than the second one.
 *
 *	[ input 4]: 3 11 5 4 7 9
 *	[output 4]: Boxes are incomparable.
 *
 *	[ input 5]: 0 11 5 4 7 9
 *	[output 5]: Error.
 *
 *	[ input 6]: 3 -11 5 4 7 9
 *	[output 6]: Error.
 */

import java.util.Arrays;

public class Task07 {
    public static String start(int a1, int b1, int c1,
                               int a2, int b2, int c2) {

        if (a1 <= 0 || b1 <= 0 || c1 <= 0 || a2 <= 0 || b2 <= 0 || c2 <= 0) {
            return "Error.";
        }

        String result = "Boxes are incomparable.";

        int[] box1 = {a1, b1, c1};
        int[] box2 = {a2, b2, c2};
        Arrays.sort(box1);
        Arrays.sort(box2);

        if (Arrays.equals(box1, box2)) {
            result = "Boxes are equal.";
        } else if (box1[0] >= box2[0]
                && box1[1] >= box2[1]
                && box1[2] >= box2[2]) {
            result = "The first box is larger than the second one.";

        } else if (box1[0] <= box2[0]
                && box1[1] <= box2[1]
                && box1[2] <= box2[2]) {
            result = "The first box is smaller than the second one.";
        }

        return result;
    }
}
