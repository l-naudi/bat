package main.java.rs;

public class class240 extends class175 {

    public static int field3203;
    static class300 field3209;
    static class324 field3207;
    static class233 field3204;
    static class145 field3205 = new class145(64);
    public int field3206 = 0;

    public static boolean method4366(char var_0, int i_1) {
        if ((var_0 <= 0 || var_0 >= 128) && (var_0 < 160 || var_0 > 255)) {
            if (var_0 != 0) {
                char[] arr_2 = class288.field3667;

                for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
                    char var_4 = arr_2[i_3];
                    if (var_0 == var_4) {
                        return true;
                    }
                }
            }

            return false;
        } else {
            return true;
        }
    }

    void method4354(class300 class300_1, int i_2, int i_3) {
        if (i_2 == 5) {
            this.field3206 = class300_1.method5496(-1459053594);
        }

    }

    void method4353(class300 class300_1, int i_2) {
        while (true) {
            int i_3 = class300_1.method5504((byte) 24);
            if (i_3 == 0) {
                return;
            }

            this.method4354(class300_1, i_3, -1780799047);
        }
    }

}
