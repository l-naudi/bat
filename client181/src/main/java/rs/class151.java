package main.java.rs;

import java.util.Comparator;

public class class151 implements Comparator {

    static class325 field1972;
    static class235 field1971;
    final boolean field1973;

    public class151(boolean bool_1) {
        this.field1973 = bool_1;
    }

    public static boolean method3382(int i_0, int i_1) {
        return (i_0 >> 29 & 0x1) != 0;
    }

    int method3373(class279 class279_1, class279 class279_2, int i_3) {
        return this.field1973 ? class279_1.field3633 - class279_2.field3633 : class279_2.field3633 - class279_1.field3633;
    }

    public int compare(Object object_1, Object object_2) {
        return this.method3373((class279) object_1, (class279) object_2, 2005097552);
    }

    public boolean equals(Object object_1) {
        return super.equals(object_1);
    }

}
