package main.java.rs;

public class class125 {

    static int[] field1638 = new int[500];
    static int[] field1639 = new int[500];
    static int[] field1636 = new int[500];
    static int[] field1635 = new int[500];
    class132 field1634 = null;
    int field1637 = -1;
    boolean field1644 = false;
    int[] field1640;
    int[] field1641;
    int[] field1642;
    int[] field1643;

    class125(byte[] bytes_1, class132 class132_2) {
        this.field1634 = class132_2;
        class300 class300_3 = new class300(bytes_1);
        class300 class300_4 = new class300(bytes_1);
        class300_3.field3732 = 2;
        int i_5 = class300_3.method5504((byte) 56);
        int i_6 = -1;
        int i_7 = 0;
        class300_4.field3732 = i_5 + class300_3.field3732;

        int i_8;
        for (i_8 = 0; i_8 < i_5; i_8++) {
            int i_9 = class300_3.method5504((byte) 117);
            if (i_9 > 0) {
                if (this.field1634.field1798[i_8] != 0) {
                    for (int i_10 = i_8 - 1; i_10 > i_6; --i_10) {
                        if (this.field1634.field1798[i_10] == 0) {
                            field1638[i_7] = i_10;
                            field1639[i_7] = 0;
                            field1636[i_7] = 0;
                            field1635[i_7] = 0;
                            ++i_7;
                            break;
                        }
                    }
                }

                field1638[i_7] = i_8;
                short s_11 = 0;
                if (this.field1634.field1798[i_8] == 3) {
                    s_11 = 128;
                }

                if ((i_9 & 0x1) != 0) {
                    field1639[i_7] = class300_4.method5507(2007436322);
                } else {
                    field1639[i_7] = s_11;
                }

                if ((i_9 & 0x2) != 0) {
                    field1636[i_7] = class300_4.method5507(1203276131);
                } else {
                    field1636[i_7] = s_11;
                }

                if ((i_9 & 0x4) != 0) {
                    field1635[i_7] = class300_4.method5507(368529403);
                } else {
                    field1635[i_7] = s_11;
                }

                i_6 = i_8;
                ++i_7;
                if (this.field1634.field1798[i_8] == 5) {
                    this.field1644 = true;
                }
            }
        }

        if (bytes_1.length != class300_4.field3732) {
            throw new RuntimeException();
        } else {
            this.field1637 = i_7;
            this.field1640 = new int[i_7];
            this.field1641 = new int[i_7];
            this.field1642 = new int[i_7];
            this.field1643 = new int[i_7];

            for (i_8 = 0; i_8 < i_7; i_8++) {
                this.field1640[i_8] = field1638[i_8];
                this.field1641[i_8] = field1639[i_8];
                this.field1642[i_8] = field1636[i_8];
                this.field1643[i_8] = field1635[i_8];
            }

        }
    }

}
