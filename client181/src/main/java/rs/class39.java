package main.java.rs;

public class class39 extends class21 {

    static class325[] field342;
    static short[] field336;
    int field340;
    int field335;
    int field337;
    int field338;

    static int method696(int i_0, class92 class92_1, boolean bool_2, int i_3) {
        if (i_0 == 5630) {
            Client.field700 = 250;
            return 1;
        } else {
            return 2;
        }
    }

    int method685(int i_1) {
        return this.field337;
    }

    int method680(int i_1) {
        return this.field338;
    }

    int method676(int i_1) {
        return this.field340;
    }

    void vmethod679(class300 class300_1, int i_2) {
        super.field160 = Math.min(super.field160, 4);
        super.field163 = new short[1][64][64];
        super.field170 = new short[super.field160][64][64];
        super.field165 = new byte[super.field160][64][64];
        super.field166 = new byte[super.field160][64][64];
        super.field164 = new class25[super.field160][64][64][];
        int i_3 = class300_1.method5504((byte) 16);
        if (i_3 != class30.field258.field260) {
            throw new IllegalStateException("");
        } else {
            int i_4 = class300_1.method5504((byte) 28);
            int i_5 = class300_1.method5504((byte) 40);
            int i_6 = class300_1.method5504((byte) 114);
            int i_7 = class300_1.method5504((byte) 21);
            if (i_4 == super.field157 && i_5 == super.field158 && i_6 == this.field337 && i_7 == this.field338) {
                for (int i_8 = 0; i_8 < 8; i_8++) {
                    for (int i_9 = 0; i_9 < 8; i_9++) {
                        this.method247(i_8 + this.field337 * 8, i_9 + this.field338 * 8, class300_1, -1521348339);
                    }
                }

            } else {
                throw new IllegalStateException("");
            }
        }
    }

    void method674(class300 class300_1, int i_2) {
        int i_3 = class300_1.method5504((byte) 8);
        if (i_3 != class31.field269.field270) {
            throw new IllegalStateException("");
        } else {
            super.field159 = class300_1.method5504((byte) 53);
            super.field160 = class300_1.method5504((byte) 33);
            super.field167 = class300_1.method5496(-1459053594);
            super.field156 = class300_1.method5496(-1459053594);
            this.field340 = class300_1.method5504((byte) 95);
            this.field335 = class300_1.method5504((byte) 120);
            super.field157 = class300_1.method5496(-1459053594);
            super.field158 = class300_1.method5496(-1459053594);
            this.field337 = class300_1.method5504((byte) 50);
            this.field338 = class300_1.method5504((byte) 115);
            super.field161 = class300_1.method5511((byte) 22);
            super.field162 = class300_1.method5511((byte) -5);
        }
    }

    int method678(int i_1) {
        return this.field335;
    }

    public boolean equals(Object object_1) {
        if (!(object_1 instanceof class39)) {
            return false;
        } else {
            class39 class39_2 = (class39) object_1;
            return (class39_2.field157 == super.field157 && super.field158 == class39_2.field158) && (class39_2.field337 == this.field337 && class39_2.field338 == this.field338);
        }
    }

    public int hashCode() {
        return super.field157 | super.field158 << 8 | this.field337 << 16 | this.field338 << 24;
    }

}
