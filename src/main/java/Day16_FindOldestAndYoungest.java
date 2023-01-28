import model.ChildWithBirthDate;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Day16_FindOldestAndYoungest {

    /**
     * Mikołaj przygotował dodatkowe prezenty dla najmłodszego i najstarszego dziecka.
     * Pomóż mu znaleźć je w liście.
     * Wypisz na ekran znalezione dzieci wraz z informacja, które jest najstarsze, a które najmłodsze.
     */

    public static void main(String[] args) {

        List<ChildWithBirthDate> children = prepareChildren();
        showYoungestAndOldestChildStream(children);


    }

    private static void showYoungestAndOldestChild(List<ChildWithBirthDate> kids) {
        ChildWithBirthDate oldest = kids.get(0);
        ChildWithBirthDate youngest = kids.get(0);
        for (ChildWithBirthDate x : kids) {
            if (x.getDateOfBirth().isBefore(oldest.getDateOfBirth())) {
                oldest = x;
            }
            if (x.getDateOfBirth().isAfter(youngest.getDateOfBirth())) {
                youngest = x;
            }

        }
        System.out.println("The oldest child is : " + oldest);
        System.out.println("The youngest child is : " + youngest);

    }

    private static void showYoungestAndOldestChildStream(List<ChildWithBirthDate> kids) {
        final List<ChildWithBirthDate> beforeSorted = kids.stream()
                .sorted(Comparator
                        .comparing(ChildWithBirthDate::getDateOfBirth))
                .toList();
        final ChildWithBirthDate oldest = beforeSorted.get(0);
        final ChildWithBirthDate youngest = beforeSorted.get(beforeSorted.size() - 1);

        System.out.println("The oldest child is : " + oldest);
        System.out.println("The youngest child is : " + youngest);

    }


    private static List<ChildWithBirthDate> prepareChildren() {
        return List.of(
                new ChildWithBirthDate(
                        "Jasiu" ,
                        "Kowalski" ,
                        LocalDate.of(2010 ,12 ,30)
                ) ,
                new ChildWithBirthDate(
                        "Kasia" ,
                        "Nowak" ,
                        LocalDate.of(2011 ,11 ,30)) ,
                new ChildWithBirthDate(
                        "Asia" ,
                        "Wisniewska" ,
                        LocalDate.of(2010 ,12 ,31)) ,
                new ChildWithBirthDate(
                        "Tomek" ,
                        "Wojcik" ,
                        LocalDate.of(2015 ,6 ,30)) ,
                new ChildWithBirthDate(
                        "Tomek" ,
                        "Zajac" ,
                        LocalDate.of(2020 ,12 ,30))
        );
    }
}