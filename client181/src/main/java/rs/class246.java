package main.java.rs;

public class class246 extends class175 {

    public static class233 field3281;
    public static class233 field3280;
    static class145 field3278 = new class145(64);
    static class145 field3276 = new class145(64);
    public int field3279;
    public int field3275 = 255;
    public int field3282 = 255;
    public int field3283 = -1;
    public int field3277 = 1;
    public int field3285 = 70;
    public int field3288 = 30;
    public int field3289 = 0;
    int field3286 = -1;
    int field3287 = -1;

    void method4464(class300 class300_1, int i_2, byte b_3) {
        if (i_2 == 1) {
            class300_1.method5496(-1459053594);
        } else if (i_2 == 2) {
            this.field3275 = class300_1.method5504((byte) 112);
        } else if (i_2 == 3) {
            this.field3282 = class300_1.method5504((byte) 117);
        } else if (i_2 == 4) {
            this.field3283 = 0;
        } else if (i_2 == 5) {
            this.field3285 = class300_1.method5496(-1459053594);
        } else if (i_2 == 6) {
            class300_1.method5504((byte) 106);
        } else if (i_2 == 7) {
            this.field3286 = class300_1.method5511((byte) 35);
        } else if (i_2 == 8) {
            this.field3287 = class300_1.method5511((byte) -61);
        } else if (i_2 == 11) {
            this.field3283 = class300_1.method5496(-1459053594);
        } else if (i_2 == 14) {
            this.field3288 = class300_1.method5504((byte) 117);
        } else if (i_2 == 15) {
            this.field3289 = class300_1.method5504((byte) 30);
        }

    }

    void method4473(class300 class300_1, byte b_2) {
        while (true) {
            int i_3 = class300_1.method5504((byte) 66);
            if (i_3 == 0) {
                return;
            }

            this.method4464(class300_1, i_3, (byte) -62);
        }
    }

    public class325 method4466(int i_1) {
        if (this.field3287 < 0) {
            return null;
        } else {
            class325 class325_2 = (class325) field3276.method3320(this.field3287);
            if (class325_2 != null) {
                return class325_2;
            } else {
                class325_2 = class65.method1178(field3280, this.field3287, 0, -1115802193);
                if (class325_2 != null) {
                    field3276.method3322(class325_2, this.field3287);
                }

                return class325_2;
            }
        }
    }

    public class325 method4465(byte b_1) {
        if (this.field3286 < 0) {
            return null;
        } else {
            class325 class325_2 = (class325) field3276.method3320(this.field3286);
            if (class325_2 != null) {
                return class325_2;
            } else {
                class325_2 = class65.method1178(field3280, this.field3286, 0, 310507605);
                if (class325_2 != null) {
                    field3276.method3322(class325_2, this.field3286);
                }

                return class325_2;
            }
        }
    }

}
