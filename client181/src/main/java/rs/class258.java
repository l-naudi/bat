package main.java.rs;

public class class258 extends class175 {

    public static class233 field3516;
    public static class233 field3517;
    public static class233 field3527;
    public static class145 field3524 = new class145(64);
    public static class145 field3519 = new class145(100);
    static class143 field3534;
    public int field3515 = -1;
    public boolean field3526 = false;
    public int field3533 = 5;
    public int field3528 = -1;
    public int field3521 = -1;
    public int field3535 = 99;
    public int field3525 = -1;
    public int field3532 = -1;
    public int field3529 = 2;
    public int[] field3522;
    public int[] field3520;
    public int[] field3523;
    int[] field3518;
    int[] field3530;

    void method4780(class300 class300_1, int i_2, int i_3) {
        int i_4;
        int i_5;
        if (i_2 == 1) {
            i_4 = class300_1.method5496(-1459053594);
            this.field3522 = new int[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
                this.field3522[i_5] = class300_1.method5496(-1459053594);
            }

            this.field3520 = new int[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
                this.field3520[i_5] = class300_1.method5496(-1459053594);
            }

            for (i_5 = 0; i_5 < i_4; i_5++) {
                this.field3520[i_5] += class300_1.method5496(-1459053594) << 16;
            }
        } else if (i_2 == 2) {
            this.field3515 = class300_1.method5496(-1459053594);
        } else if (i_2 == 3) {
            i_4 = class300_1.method5504((byte) 124);
            this.field3518 = new int[i_4 + 1];

            for (i_5 = 0; i_5 < i_4; i_5++) {
                this.field3518[i_5] = class300_1.method5504((byte) 39);
            }

            this.field3518[i_4] = 9999999;
        } else if (i_2 == 4) {
            this.field3526 = true;
        } else if (i_2 == 5) {
            this.field3533 = class300_1.method5504((byte) 102);
        } else if (i_2 == 6) {
            this.field3528 = class300_1.method5496(-1459053594);
        } else if (i_2 == 7) {
            this.field3521 = class300_1.method5496(-1459053594);
        } else if (i_2 == 8) {
            this.field3535 = class300_1.method5504((byte) 10);
        } else if (i_2 == 9) {
            this.field3525 = class300_1.method5504((byte) 56);
        } else if (i_2 == 10) {
            this.field3532 = class300_1.method5504((byte) 39);
        } else if (i_2 == 11) {
            this.field3529 = class300_1.method5504((byte) 51);
        } else if (i_2 == 12) {
            i_4 = class300_1.method5504((byte) 69);
            this.field3530 = new int[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
                this.field3530[i_5] = class300_1.method5496(-1459053594);
            }

            for (i_5 = 0; i_5 < i_4; i_5++) {
                this.field3530[i_5] += class300_1.method5496(-1459053594) << 16;
            }
        } else if (i_2 == 13) {
            i_4 = class300_1.method5504((byte) 122);
            this.field3523 = new int[i_4];

            for (i_5 = 0; i_5 < i_4; i_5++) {
                this.field3523[i_5] = class300_1.method5567(-606766378);
            }
        }

    }

    public class127 method4784(class127 class127_1, int i_2, int i_3) {
        i_2 = this.field3520[i_2];
        class138 class138_4 = class30.method537(i_2 >> 16, (short) -5354);
        i_2 &= 0xffff;
        if (class138_4 == null) {
            return class127_1.method2859(true);
        } else {
            class127 class127_5 = class127_1.method2859(!class138_4.method3268(i_2, 1270501095));
            class127_5.method2888(class138_4, i_2);
            return class127_5;
        }
    }

    public class127 method4765(class127 class127_1, int i_2, class258 class258_3, int i_4, int i_5) {
        i_2 = this.field3520[i_2];
        class138 class138_6 = class30.method537(i_2 >> 16, (short) -15133);
        i_2 &= 0xffff;
        if (class138_6 == null) {
            return class258_3.method4784(class127_1, i_4, 1790643125);
        } else {
            i_4 = class258_3.field3520[i_4];
            class138 class138_7 = class30.method537(i_4 >> 16, (short) -25301);
            i_4 &= 0xffff;
            class127 class127_8;
            if (class138_7 == null) {
                class127_8 = class127_1.method2859(!class138_6.method3268(i_2, 1644534064));
                class127_8.method2888(class138_6, i_2);
                return class127_8;
            } else {
                class127_8 = class127_1.method2859(!class138_6.method3268(i_2, 458788534) & !class138_7.method3268(i_4, 1192790777));
                class127_8.method2867(class138_6, i_2, class138_7, i_4, this.field3518);
                return class127_8;
            }
        }
    }

    class127 method4763(class127 class127_1, int i_2, int i_3, byte b_4) {
        i_2 = this.field3520[i_2];
        class138 class138_5 = class30.method537(i_2 >> 16, (short) -14626);
        i_2 &= 0xffff;
        if (class138_5 == null) {
            return class127_1.method2859(true);
        } else {
            class127 class127_6 = class127_1.method2859(!class138_5.method3268(i_2, 318487825));
            i_3 &= 0x3;
            if (i_3 == 1) {
                class127_6.method2871();
            } else if (i_3 == 2) {
                class127_6.method2870();
            } else if (i_3 == 3) {
                class127_6.method2869();
            }

            class127_6.method2888(class138_5, i_2);
            if (i_3 == 1) {
                class127_6.method2869();
            } else if (i_3 == 2) {
                class127_6.method2870();
            } else if (i_3 == 3) {
                class127_6.method2871();
            }

            return class127_6;
        }
    }

    class127 method4787(class127 class127_1, int i_2, int i_3) {
        i_2 = this.field3520[i_2];
        class138 class138_4 = class30.method537(i_2 >> 16, (short) -9683);
        i_2 &= 0xffff;
        if (class138_4 == null) {
            return class127_1.method2860(true);
        } else {
            class127 class127_5 = class127_1.method2860(!class138_4.method3268(i_2, 213488098));
            class127_5.method2888(class138_4, i_2);
            return class127_5;
        }
    }

    public class127 method4767(class127 class127_1, int i_2, int i_3) {
        int i_4 = this.field3520[i_2];
        class138 class138_5 = class30.method537(i_4 >> 16, (short) -17997);
        i_4 &= 0xffff;
        if (class138_5 == null) {
            return class127_1.method2859(true);
        } else {
            class138 class138_6 = null;
            int i_7 = 0;
            if (this.field3530 != null && i_2 < this.field3530.length) {
                i_7 = this.field3530[i_2];
                class138_6 = class30.method537(i_7 >> 16, (short) -10000);
                i_7 &= 0xffff;
            }

            class127 class127_8;
            if (class138_6 != null && i_7 != 65535) {
                class127_8 = class127_1.method2859(!class138_5.method3268(i_4, -192963652) & !class138_6.method3268(i_7, -1688256999));
                class127_8.method2888(class138_5, i_4);
                class127_8.method2888(class138_6, i_7);
                return class127_8;
            } else {
                class127_8 = class127_1.method2859(!class138_5.method3268(i_4, 502039853));
                class127_8.method2888(class138_5, i_4);
                return class127_8;
            }
        }
    }

    void method4761(int i_1) {
        if (this.field3525 == -1) {
            if (this.field3518 != null) {
                this.field3525 = 2;
            } else {
                this.field3525 = 0;
            }
        }

        if (this.field3532 == -1) {
            if (this.field3518 != null) {
                this.field3532 = 2;
            } else {
                this.field3532 = 0;
            }
        }

    }

    void method4759(class300 class300_1, byte b_2) {
        while (true) {
            int i_3 = class300_1.method5504((byte) 88);
            if (i_3 == 0) {
                return;
            }

            this.method4780(class300_1, i_3, -1384847796);
        }
    }

}
