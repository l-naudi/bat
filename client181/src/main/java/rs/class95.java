package main.java.rs;

import java.io.IOException;

public class class95 {

    public class328 field1313;
    class182 field1321;
    class182 field1317;
    class182 field1309;
    class260 field1316 = new class260();
    int field1311 = 0;
    class300 field1312 = new class300(5000);
    class299 field1314 = new class299(40000);
    class182 field1310 = null;
    int field1315 = 0;
    boolean field1322 = true;
    int field1318 = 0;
    int field1319 = 0;
    class305 field1320;

    static final void method2245(byte b_0) {
        for (class86 class86_1 = (class86) Client.field670.method4892(); class86_1 != null; class86_1 = (class86) Client.field670.method4894()) {
            if (class86_1.field1215 == class42.field372 && Client.field881 <= class86_1.field1240) {
                if (Client.field881 >= class86_1.field1217) {
                    if (class86_1.field1224 > 0) {
                        class79 class79_2 = Client.field694[class86_1.field1224 - 1];
                        if (class79_2 != null && class79_2.field1005 >= 0 && class79_2.field1005 < 13312 && class79_2.field949 >= 0 && class79_2.field949 < 13312) {
                            class86_1.method2033(class79_2.field1005, class79_2.field949, class62.method1130(class79_2.field1005, class79_2.field949, class86_1.field1215, (short) -29605) - class86_1.field1225, Client.field881, -653530834);
                        }
                    }

                    if (class86_1.field1224 < 0) {
                        int i_3 = -class86_1.field1224 - 1;
                        class66 class66_4;
                        if (i_3 == Client.field770) {
                            class66_4 = Client.field657;
                        } else {
                            class66_4 = Client.field909[i_3];
                        }

                        if (class66_4 != null && class66_4.field1005 >= 0 && class66_4.field1005 < 13312 && class66_4.field949 >= 0 && class66_4.field949 < 13312) {
                            class86_1.method2033(class66_4.field1005, class66_4.field949, class62.method1130(class66_4.field1005, class66_4.field949, class86_1.field1215, (short) -19214) - class86_1.field1225, Client.field881, -1906132151);
                        }
                    }

                    class86_1.method2043(Client.field718, (byte) -4);
                    class5.field22.method3077(class42.field372, (int) class86_1.field1218, (int) class86_1.field1227, (int) class86_1.field1228, 60, class86_1, class86_1.field1234, -1L, false);
                }
            } else {
                class86_1.method3607();
            }
        }

    }

    static boolean method2244(int i_0, int i_1) {
        for (int i_2 = 0; i_2 < Client.field754; i_2++) {
            if (Client.field921[i_2] == i_0) {
                return true;
            }
        }

        return false;
    }

    class305 method2223(short s_1) {
        return this.field1320;
    }

    void method2233(short s_1) {
        if (this.field1320 != null) {
            this.field1320.vmethod5830(-768440649);
            this.field1320 = null;
        }

    }

    void method2224(byte b_1) {
        this.field1320 = null;
    }

    final void method2218(int i_1) {
        this.field1316.method4803();
        this.field1311 = 0;
    }

    public final void method2219(class187 class187_1, int i_2) {
        this.field1316.method4819(class187_1);
        class187_1.field2331 = class187_1.field2333.field3732;
        class187_1.field2333.field3732 = 0;
        this.field1311 += class187_1.field2331;
    }

    void method2221(class305 class305_1, int i_2) {
        this.field1320 = class305_1;
    }

    final void method2234(int i_1) throws IOException {
        if (this.field1320 != null && this.field1311 > 0) {
            this.field1312.field3732 = 0;

            while (true) {
                class187 class187_2 = (class187) this.field1316.method4838();
                if (class187_2 == null || class187_2.field2331 > this.field1312.field3730.length - this.field1312.field3732) {
                    this.field1320.vmethod5829(this.field1312.field3730, 0, this.field1312.field3732, -1696227994);
                    this.field1319 = 0;
                    break;
                }

                this.field1312.method5488(class187_2.field2333.field3730, 0, class187_2.field2331, 910134597);
                this.field1311 -= class187_2.field2331;
                class187_2.method3607();
                class187_2.field2333.method5477(581390013);
                class187_2.method3620((byte) -108);
            }
        }

    }

}
