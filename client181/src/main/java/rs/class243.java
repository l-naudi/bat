package main.java.rs;

public class class243 extends class175 {

    public static class233 field3247;
    public static class145 field3239 = new class145(64);
    public static class145 field3240 = new class145(30);
    static int field3248;
    public int field3238 = -1;
    int field3241;
    int field3252 = 128;
    int field3249 = 128;
    int field3250 = 0;
    int field3251 = 0;
    int field3253 = 0;
    int field3242;
    short[] field3244;
    short[] field3243;
    short[] field3246;
    short[] field3245;

    static void method4415(int i_0) {
        if (class136.field1875 != null) {
            class136.field1875.method6309(class42.field372, (Client.field657.field1005 >> 7) + class196.field2389, (Client.field657.field949 >> 7) + class1.field1, false, (byte) -128);
            class136.field1875.method6471(-1903923036);
        }

    }

    void method4410(class300 class300_1, int i_2, int i_3) {
        if (i_2 == 1) {
            this.field3242 = class300_1.method5496(-1459053594);
        } else if (i_2 == 2) {
            this.field3238 = class300_1.method5496(-1459053594);
        } else if (i_2 == 4) {
            this.field3252 = class300_1.method5496(-1459053594);
        } else if (i_2 == 5) {
            this.field3249 = class300_1.method5496(-1459053594);
        } else if (i_2 == 6) {
            this.field3250 = class300_1.method5496(-1459053594);
        } else if (i_2 == 7) {
            this.field3251 = class300_1.method5504((byte) 43);
        } else if (i_2 == 8) {
            this.field3253 = class300_1.method5504((byte) 109);
        } else {
            int i_4;
            int i_5;
            if (i_2 == 40) {
                i_4 = class300_1.method5504((byte) 21);
                this.field3244 = new short[i_4];
                this.field3243 = new short[i_4];

                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.field3244[i_5] = (short) class300_1.method5496(-1459053594);
                    this.field3243[i_5] = (short) class300_1.method5496(-1459053594);
                }
            } else if (i_2 == 41) {
                i_4 = class300_1.method5504((byte) 14);
                this.field3246 = new short[i_4];
                this.field3245 = new short[i_4];

                for (i_5 = 0; i_5 < i_4; i_5++) {
                    this.field3246[i_5] = (short) class300_1.method5496(-1459053594);
                    this.field3245[i_5] = (short) class300_1.method5496(-1459053594);
                }
            }
        }

    }

    public final class127 method4406(int i_1, int i_2) {
        class127 class127_3 = (class127) field3240.method3320(this.field3241);
        if (class127_3 == null) {
            class121 class121_4 = class121.method2769(class43.field379, this.field3242, 0);
            if (class121_4 == null) {
                return null;
            }

            int i_5;
            if (this.field3244 != null) {
                for (i_5 = 0; i_5 < this.field3244.length; i_5++) {
                    class121_4.method2783(this.field3244[i_5], this.field3243[i_5]);
                }
            }

            if (this.field3246 != null) {
                for (i_5 = 0; i_5 < this.field3246.length; i_5++) {
                    class121_4.method2784(this.field3246[i_5], this.field3245[i_5]);
                }
            }

            class127_3 = class121_4.method2802(this.field3251 + 64, this.field3253 + 850, -30, -50, -30);
            field3240.method3322(class127_3, this.field3241);
        }

        class127 class127_6;
        if (this.field3238 != -1 && i_1 != -1) {
            class127_6 = class7.method81(this.field3238, (byte) 1).method4787(class127_3, i_1, -1365798268);
        } else {
            class127_6 = class127_3.method2860(true);
        }

        if (this.field3252 != 128 || this.field3249 != 128) {
            class127_6.method2944(this.field3252, this.field3249, this.field3252);
        }

        if (this.field3250 != 0) {
            if (this.field3250 == 90) {
                class127_6.method2869();
            }

            if (this.field3250 == 180) {
                class127_6.method2869();
                class127_6.method2869();
            }

            if (this.field3250 == 270) {
                class127_6.method2869();
                class127_6.method2869();
                class127_6.method2869();
            }
        }

        return class127_6;
    }

    void method4407(class300 class300_1, int i_2) {
        while (true) {
            int i_3 = class300_1.method5504((byte) 124);
            if (i_3 == 0) {
                return;
            }

            this.method4410(class300_1, i_3, -1978905591);
        }
    }

}
