package main.java.rs;

import java.awt.*;

public final class class48 extends Canvas {

    static int field422;
    static int field418;
    Component field423;

    class48(Component component_1) {
        this.field423 = component_1;
    }

    static void method813(int i_0, int i_1) {
        if (i_0 != -1) {
            if (class162.method3445(i_0, 1772418873)) {
                class217[] arr_2 = class217.field2556[i_0];

                for (int i_3 = 0; i_3 < arr_2.length; i_3++) {
                    class217 class217_4 = arr_2[i_3];
                    if (class217_4.field2630 != null) {
                        class62 class62_5 = new class62();
                        class62_5.field575 = class217_4;
                        class62_5.field581 = class217_4.field2630;
                        class96.method2267(class62_5, 5000000, -806238798);
                    }
                }

            }
        }
    }

    static final void method810(int i_0, int i_1, int i_2, int i_3, class325 class325_4, class211 class211_5, int i_6) {
        int i_7 = i_3 * i_3 + i_2 * i_2;
        if (i_7 > 4225 && i_7 < 90000) {
            int i_8 = Client.field722 & 0x7ff;
            int i_9 = class130.field1787[i_8];
            int i_10 = class130.field1784[i_8];
            int i_11 = i_10 * i_2 + i_3 * i_9 >> 16;
            int i_12 = i_3 * i_10 - i_9 * i_2 >> 16;
            double d_13 = Math.atan2(i_11, i_12);
            int i_15 = class211_5.field2519 / 2 - 25;
            int i_16 = (int) (Math.sin(d_13) * (double) i_15);
            int i_17 = (int) (Math.cos(d_13) * (double) i_15);
            byte b_18 = 20;
            class151.field1972.method6193(i_16 + (i_0 + class211_5.field2519 / 2 - b_18 / 2), class211_5.field2522 / 2 + i_1 - b_18 / 2 - i_17 - 10, b_18, b_18, 15, 15, d_13, 256);
        } else {
            class76.method1935(i_0, i_1, i_2, i_3, class325_4, class211_5, (byte) 73);
        }

    }

    static class71 method812(int i_0) {
        return class71.field1024 < class71.field1022 ? class71.field1031[++class71.field1024 - 1] : null;
    }

    public final void paint(Graphics graphics_1) {
        this.field423.paint(graphics_1);
    }

    public final void update(Graphics graphics_1) {
        this.field423.update(graphics_1);
    }

}
