package comparision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class NameRunner {
    public static void main(String[] args) {

        Name n1 = new Name("kirill");
        Name n2 = new Name("roma");
        Name n3 = new Name("marianna");

        List<Name> namesList = new ArrayList<>();
        namesList.add(n1);
        namesList.add(n2);
        namesList.add(n3);

        System.out.println(namesList);

        sortMethod(namesList, Comparator.comparingInt(var -> var.getName().length()));
    }
























    private static void sortMethod(List<Name> names, Comparator<Name> comparator) {
        Collections.sort(names, comparator);
        System.out.println(names);
    }

    private static Name produceMethod(Supplier <Name> supplier) {
        return supplier.get();
    }
}
