package main.java.rs;

public final class class136 {

    static class333 field1875;
    public class135 field1884;
    public class135 field1881;
    public long field1882 = 0L;
    int field1876;
    int field1877;
    int field1879;
    int field1880;
    int field1878;
    int field1883 = 0;

    public static class138 method3262(class233 class233_0, class233 class233_1, int i_2, boolean bool_3, byte b_4) {
        boolean bool_5 = true;
        int[] ints_6 = class233_0.method4153(i_2, -661353659);

        for (int i_7 = 0; i_7 < ints_6.length; i_7++) {
            byte[] bytes_8 = class233_0.method4150(i_2, ints_6[i_7], -377229485);
            if (bytes_8 == null) {
                bool_5 = false;
            } else {
                int i_9 = (bytes_8[0] & 0xff) << 8 | bytes_8[1] & 0xff;
                byte[] bytes_10;
                if (bool_3) {
                    bytes_10 = class233_1.method4150(0, i_9, -377229485);
                } else {
                    bytes_10 = class233_1.method4150(i_9, 0, -377229485);
                }

                if (bytes_10 == null) {
                    bool_5 = false;
                }
            }
        }

        if (!bool_5) {
            return null;
        } else {
            try {
                return new class138(class233_0, class233_1, i_2, bool_3);
            } catch (Exception exception_12) {
                return null;
            }
        }
    }

    public static class251 method3261(int i_0, int i_1) {
        class251 class251_2 = (class251) class251.field3315.method3320(i_0);
        if (class251_2 != null) {
            return class251_2;
        } else {
            byte[] bytes_3 = class251.field3314.method4144(8, i_0, 164321431);
            class251_2 = new class251();
            if (bytes_3 != null) {
                class251_2.method4533(new class300(bytes_3), (byte) 49);
            }

            class251.field3315.method3322(class251_2, i_0);
            return class251_2;
        }
    }

}
