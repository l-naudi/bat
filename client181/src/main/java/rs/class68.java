package main.java.rs;

public final class class68 extends class180 {

    public static class237 field944;
    static class6 field942;
    int field943;
    int field937;
    int field934;
    int field932;
    int field938;
    int field940;
    int field939;
    int field935;
    int field933;
    int field936;
    int field941 = 0;
    int field931 = -1;

    static void method1653(int i_0, int i_1, int i_2) {
        long long_3 = (i_0 << 16) + i_1;
        class232 class232_5 = (class232) class236.field3180.method5952(long_3);
        if (class232_5 != null) {
            class236.field3170.method4793(class232_5);
        }
    }

    static final class61 method1652(int i_0, int i_1, int i_2, byte b_3) {
        class61 class61_4 = new class61();
        class61_4.field571 = i_1;
        class61_4.field569 = i_2;
        Client.field816.method5951(class61_4, i_0);
        class12.method146(i_1, -2080937521);
        class217 class217_5 = class80.method1978(i_0, -1789424359);
        class224.method4120(class217_5, -1083646474);
        if (Client.field850 != null) {
            class224.method4120(Client.field850, -1263151193);
            Client.field850 = null;
        }

        for (int i_6 = 0; i_6 < Client.field791; i_6++) {
            if (class1.method5(Client.field794[i_6], -2073640894)) {
                if (i_6 < Client.field791 - 1) {
                    for (int i_7 = i_6; i_7 < Client.field791 - 1; i_7++) {
                        Client.field796[i_7] = Client.field796[i_7 + 1];
                        Client.field668[i_7] = Client.field668[i_7 + 1];
                        Client.field794[i_7] = Client.field794[i_7 + 1];
                        Client.field795[i_7] = Client.field795[i_7 + 1];
                        Client.field792[i_7] = Client.field792[i_7 + 1];
                        Client.field793[i_7] = Client.field793[i_7 + 1];
                        Client.field769[i_7] = Client.field769[i_7 + 1];
                    }
                }

                --i_6;
                --Client.field791;
            }
        }

        class12.method145((byte) 107);
        class27.method413(class217.field2556[i_0 >> 16], class217_5, false, 1377168714);
        class48.method813(i_1, 1924602779);
        if (Client.field905 != -1) {
            class17.method175(Client.field905, 1, -1199742641);
        }

        return class61_4;
    }

}
