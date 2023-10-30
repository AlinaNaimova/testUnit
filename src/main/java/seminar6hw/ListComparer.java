package seminar6hw;

import java.util.List;

public class ListComparer {
    final List<Integer> lst1;
    final List<Integer> lst2;

    public ListComparer(List<Integer> lst1, List<Integer> lst2) {
        this.lst1 = lst1;
        this.lst2 = lst2;
    }

    public static double getAverage(List<Integer> list) {
        return list.stream()
                .mapToInt(a -> a)
                .average().orElse(0);
    }

    public String compareLists() {
        double avg1 = getAverage(lst1);
        double avg2 = getAverage(lst2);

        if (avg1 < avg2) {
            return "Второй список имеет большее среднее значение";
        } else if (avg1 > avg2) {
            return "Первый список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
