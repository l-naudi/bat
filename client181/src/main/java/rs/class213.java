package main.java.rs;

public class class213 {

    static class295 field2529;
    public int field2531;
    public int field2530;
    public int field2528;

    public class213(class213 class213_1) {
        this.field2531 = class213_1.field2531;
        this.field2530 = class213_1.field2530;
        this.field2528 = class213_1.field2528;
    }

    public class213(int i_1, int i_2, int i_3) {
        this.field2531 = i_1;
        this.field2530 = i_2;
        this.field2528 = i_3;
    }

    public class213(int i_1) {
        if (i_1 == -1) {
            this.field2531 = -1;
        } else {
            this.field2531 = i_1 >> 28 & 0x3;
            this.field2530 = i_1 >> 14 & 0x3fff;
            this.field2528 = i_1 & 0x3fff;
        }

    }

    public static void method3989(int i_0) {
        class249.field3301.method3323();
    }

    static void method3990(byte b_0) {
        class85.field1209 = 24;
        class268.method4988("", "You were disconnected from the server.", "", 1786715078);
    }

    String method3975(String string_1, int i_2) {
        return this.field2531 + string_1 + (this.field2530 >> 6) + string_1 + (this.field2528 >> 6) + string_1 + (this.field2530 & 0x3f) + string_1 + (this.field2528 & 0x3f);
    }

    public int method3971(int i_1) {
        return this.field2531 << 28 | this.field2530 << 14 | this.field2528;
    }

    boolean method3973(class213 class213_1, int i_2) {
        return this.field2531 == class213_1.field2531 && (this.field2530 == class213_1.field2530 && this.field2528 == class213_1.field2528);
    }

    public int hashCode() {
        return this.method3971(-1529444039);
    }

    public boolean equals(Object object_1) {
        return this == object_1 || (object_1 instanceof class213 && this.method3973((class213) object_1, 2096599249));
    }

    public String toString() {
        return this.method3975(",", -1242820641);
    }

}
