package main.java.rs;

import java.util.*;

public final class class36 {

    static class168 field329;
    static String field328;
    final HashMap field322;
    final class233 field318;
    final class233 field323;
    public int field310 = 0;
    boolean field321 = false;
    boolean field311 = false;
    HashMap field317 = new HashMap();
    class324[] field320;
    HashMap field316;
    class38 field312;
    int field319;
    int field325;
    int field314;
    int field324;
    class29[][] field315;
    class325 field313;

    public class36(class324[] arr_1, HashMap hashmap_2, class233 class233_3, class233 class233_4) {
        this.field320 = arr_1;
        this.field322 = hashmap_2;
        this.field318 = class233_3;
        this.field323 = class233_4;
    }

    static final void method633(String string_0, int i_1) {
        StringBuilder stringbuilder_10000 = (new StringBuilder()).append(string_0);
        Object obj_10001 = null;
        String string_2 = stringbuilder_10000.append(" is already on your friend list").toString();
        class62.method1132(30, "", string_2, -2139884342);
    }

    public static int method625(int i_0, int i_1, int i_2, int i_3) {
        i_2 &= 0x3;
        return i_2 == 0 ? i_1 : (i_2 == 1 ? 7 - i_0 : (i_2 == 2 ? 7 - i_1 : i_0));
    }

    static final void method601(class66 class66_0, int i_1, int i_2, int i_3, byte b_4) {
        if (Client.field657 != class66_0) {
            if (Client.field791 < 400) {
                String string_5;
                int i_8;
                if (class66_0.field617 == 0) {
                    String string_6 = class66_0.field619[0] + class66_0.field621 + class66_0.field619[1];
                    i_8 = class66_0.field618;
                    int i_9 = Client.field657.field618;
                    int i_10 = i_9 - i_8;
                    String string_7;
                    if (i_10 < -9) {
                        string_7 = class73.method1756(16711680, -844505624);
                    } else if (i_10 < -6) {
                        string_7 = class73.method1756(16723968, -844505624);
                    } else if (i_10 < -3) {
                        string_7 = class73.method1756(16740352, -844505624);
                    } else if (i_10 < 0) {
                        string_7 = class73.method1756(16756736, -844505624);
                    } else if (i_10 > 9) {
                        string_7 = class73.method1756(65280, -844505624);
                    } else if (i_10 > 6) {
                        string_7 = class73.method1756(4259584, -844505624);
                    } else if (i_10 > 3) {
                        string_7 = class73.method1756(8453888, -844505624);
                    } else if (i_10 > 0) {
                        string_7 = class73.method1756(12648192, -844505624);
                    } else {
                        string_7 = class73.method1756(16776960, -844505624);
                    }

                    string_5 = string_6 + string_7 + " " + " (" + "level-" + class66_0.field618 + ")" + class66_0.field619[2];
                } else {
                    string_5 = class66_0.field619[0] + class66_0.field621 + class66_0.field619[1] + " " + " (" + "skill-" + class66_0.field617 + ")" + class66_0.field619[2];
                }

                int i_11;
                if (Client.field900 == 1) {
                    class188.method3644("Use", Client.field738 + " " + "->" + " " + class73.method1756(16777215, -844505624) + string_5, 14, i_1, i_2, i_3, -1599303692);
                } else if (Client.field810) {
                    if ((class35.field301 & 0x8) == 8) {
                        class188.method3644(Client.field813, Client.field814 + " " + "->" + " " + class73.method1756(16777215, -844505624) + string_5, 15, i_1, i_2, i_3, 1801868715);
                    }
                } else {
                    for (i_11 = 7; i_11 >= 0; --i_11) {
                        if (Client.field778[i_11] != null) {
                            short s_12 = 0;
                            if (Client.field778[i_11].equalsIgnoreCase("Attack")) {
                                if (Client.field678 == class84.field1170) {
                                    continue;
                                }

                                if (class84.field1167 == Client.field678 || class84.field1173 == Client.field678 && class66_0.field618 > Client.field657.field618) {
                                    s_12 = 2000;
                                }

                                if (Client.field657.field632 != 0 && class66_0.field632 != 0) {
                                    if (class66_0.field632 == Client.field657.field632) {
                                        s_12 = 2000;
                                    } else {
                                        s_12 = 0;
                                    }
                                }
                            } else if (Client.field779[i_11]) {
                                s_12 = 2000;
                            }

                            boolean bool_13 = false;
                            i_8 = Client.field811[i_11] + s_12;
                            class188.method3644(Client.field778[i_11], class73.method1756(16777215, -844505624) + string_5, i_8, i_1, i_2, i_3, 209520680);
                        }
                    }
                }

                for (i_11 = 0; i_11 < Client.field791; i_11++) {
                    if (Client.field794[i_11] == 23) {
                        Client.field668[i_11] = class73.method1756(16777215, -844505624) + string_5;
                        break;
                    }
                }

            }
        }
    }

    void method632(int i_1) {
        if (this.field316 == null) {
            this.field316 = new HashMap();
        }

        this.field316.clear();

        for (int i_2 = 0; i_2 < this.field315.length; i_2++) {
            for (int i_3 = 0; i_3 < this.field315[i_2].length; i_3++) {
                List list_4 = this.field315[i_2][i_3].method453((byte) 37);
                Iterator iterator_5 = list_4.iterator();

                while (iterator_5.hasNext()) {
                    class34 class34_6 = (class34) iterator_5.next();
                    if (class34_6.method578(-1274004046)) {
                        int i_7 = class34_6.vmethod597(1513522577);
                        if (!this.field316.containsKey(Integer.valueOf(i_7))) {
                            LinkedList linkedlist_8 = new LinkedList();
                            linkedlist_8.add(class34_6);
                            this.field316.put(Integer.valueOf(i_7), linkedlist_8);
                        } else {
                            List list_9 = (List) this.field316.get(Integer.valueOf(i_7));
                            list_9.add(class34_6);
                        }
                    }
                }
            }
        }

    }

    class22 method641(int i_1, int i_2, int i_3, int i_4, int i_5) {
        class22 class22_6 = new class22(this);
        int i_7 = this.field319 + i_1;
        int i_8 = i_2 + this.field325;
        int i_9 = i_3 + this.field319;
        int i_10 = i_4 + this.field325;
        int i_11 = i_7 / 64;
        int i_12 = i_8 / 64;
        int i_13 = i_9 / 64;
        int i_14 = i_10 / 64;
        class22_6.field180 = i_13 - i_11 + 1;
        class22_6.field176 = i_14 - i_12 + 1;
        class22_6.field175 = i_11 - this.field312.method338(-1254649049);
        class22_6.field177 = i_12 - this.field312.method340(124036044);
        if (class22_6.field175 < 0) {
            class22_6.field180 += class22_6.field175;
            class22_6.field175 = 0;
        }

        if (class22_6.field175 > this.field315.length - class22_6.field180) {
            class22_6.field180 = this.field315.length - class22_6.field175;
        }

        if (class22_6.field177 < 0) {
            class22_6.field176 += class22_6.field177;
            class22_6.field177 = 0;
        }

        if (class22_6.field177 > this.field315[0].length - class22_6.field176) {
            class22_6.field176 = this.field315[0].length - class22_6.field177;
        }

        class22_6.field180 = Math.min(class22_6.field180, this.field315.length);
        class22_6.field176 = Math.min(class22_6.field176, this.field315[0].length);
        return class22_6;
    }

    float method612(int i_1, int i_2, int i_3) {
        float f_4 = (float) i_1 / (float) i_2;
        if (f_4 > 8.0F) {
            return 8.0F;
        } else if (f_4 < 1.0F) {
            return 1.0F;
        } else {
            int i_5 = Math.round(f_4);
            return Math.abs((float) i_5 - f_4) < 0.05F ? (float) i_5 : f_4;
        }
    }

    public boolean method609(int i_1) {
        return this.field321;
    }

    public HashMap method610(int i_1) {
        this.method632(102545214);
        return this.field316;
    }

    public void method606(int i_1, int i_2, int i_3, int i_4, HashSet hashset_5, int i_6, int i_7, int i_8) {
        if (this.field313 != null) {
            this.field313.method6125(i_1, i_2, i_3, i_4);
            if (i_6 > 0 && i_6 % i_7 < i_7 / 2) {
                if (this.field316 == null) {
                    this.method632(-1110146603);
                }

                Iterator iterator_9 = hashset_5.iterator();

                while (true) {
                    List list_11;
                    do {
                        if (!iterator_9.hasNext()) {
                            return;
                        }

                        int i_10 = ((Integer) iterator_9.next()).intValue();
                        list_11 = (List) this.field316.get(Integer.valueOf(i_10));
                    } while (list_11 == null);

                    Iterator iterator_12 = list_11.iterator();

                    while (iterator_12.hasNext()) {
                        class34 class34_13 = (class34) iterator_12.next();
                        int i_14 = i_3 * (class34_13.field297.field2530 - this.field319) / this.field314;
                        int i_15 = i_4 - (class34_13.field297.field2528 - this.field325) * i_4 / this.field324;
                        class321.method6025(i_14 + i_1, i_15 + i_2, 2, 16776960, 256);
                    }
                }
            }
        }
    }

    public void method602(class233 class233_1, String string_2, boolean bool_3, byte b_4) {
        if (!this.field311) {
            this.field321 = false;
            this.field311 = true;
            System.nanoTime();
            int i_5 = class233_1.method4160(class35.field308.field306, 1321122112);
            int i_6 = class233_1.method4161(i_5, string_2, (byte) 106);
            class300 class300_7 = new class300(class233_1.method4163(class35.field308.field306, string_2, 794658484));
            class300 class300_8 = new class300(class233_1.method4163(class35.field302.field306, string_2, 529639123));
            System.nanoTime();
            System.nanoTime();
            this.field312 = new class38();

            try {
                this.field312.method666(class300_7, class300_8, i_6, bool_3, (byte) -52);
            } catch (IllegalStateException illegalstateexception_20) {
                return;
            }

            this.field312.method342((byte) -45);
            this.field312.method343(-1178629401);
            this.field312.method405((byte) 32);
            this.field319 = this.field312.method338(-1534939923) * 64;
            this.field325 = this.field312.method340(473515020) * 64;
            this.field314 = (this.field312.method339(419584711) - this.field312.method338(845768281) + 1) * 64;
            this.field324 = (this.field312.method341(-850737822) - this.field312.method340(-427693058) + 1) * 64;
            int i_17 = this.field312.method339(1490557672) - this.field312.method338(-264563708) + 1;
            int i_10 = this.field312.method341(947938392) - this.field312.method340(161263687) + 1;
            System.nanoTime();
            System.nanoTime();
            class88.method2069(-1709939450);
            this.field315 = new class29[i_17][i_10];
            Iterator iterator_11 = this.field312.field333.iterator();

            while (iterator_11.hasNext()) {
                class15 class15_12 = (class15) iterator_11.next();
                int i_13 = class15_12.field157;
                int i_14 = class15_12.field158;
                int i_15 = i_13 - this.field312.method338(-786100799);
                int i_16 = i_14 - this.field312.method340(-1970340826);
                this.field315[i_15][i_16] = new class29(i_13, i_14, this.field312.method325((byte) -26), this.field322);
                this.field315[i_15][i_16].method423(class15_12, this.field312.field331, 1340237556);
            }

            for (int i_18 = 0; i_18 < i_17; i_18++) {
                for (int i_19 = 0; i_19 < i_10; i_19++) {
                    if (this.field315[i_18][i_19] == null) {
                        this.field315[i_18][i_19] = new class29(this.field312.method338(-134766221) + i_18, this.field312.method340(-1532237977) + i_19, this.field312.method325((byte) -46), this.field322);
                        this.field315[i_18][i_19].method424(this.field312.field330, this.field312.field331, -523355957);
                    }
                }
            }

            System.nanoTime();
            System.nanoTime();
            if (class233_1.method4162(class35.field303.field306, string_2, (byte) 14)) {
                byte[] bytes_21 = class233_1.method4163(class35.field303.field306, string_2, -1408492249);
                this.field313 = class158.method3435(bytes_21, (byte) -56);
            }

            System.nanoTime();
            class233_1.method4156(1731367566);
            class233_1.method4158(-922458067);
            this.field321 = true;
        }
    }

    public List method607(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11) {
        LinkedList linkedlist_12 = new LinkedList();
        if (!this.field321) {
            return linkedlist_12;
        } else {
            class22 class22_13 = this.method641(i_1, i_2, i_3, i_4, -849608506);
            float f_14 = this.method612(i_7, i_3 - i_1, -131172900);
            int i_15 = (int) (64.0F * f_14);
            int i_16 = this.field319 + i_1;
            int i_17 = i_2 + this.field325;

            for (int i_18 = class22_13.field175; i_18 < class22_13.field180 + class22_13.field175; i_18++) {
                for (int i_19 = class22_13.field177; i_19 < class22_13.field177 + class22_13.field176; i_19++) {
                    List list_20 = this.field315[i_18][i_19].method440(i_5 + i_15 * (this.field315[i_18][i_19].field245 * 64 - i_16) / 64, i_8 + i_6 - i_15 * (this.field315[i_18][i_19].field246 * 64 - i_17 + 64) / 64, i_15, i_9, i_10, -1946741699);
                    if (!list_20.isEmpty()) {
                        linkedlist_12.addAll(list_20);
                    }
                }
            }

            return linkedlist_12;
        }
    }

    public final void method639(int i_1) {
        this.field316 = null;
    }

    public final void method604(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, byte b_9) {
        int[] ints_10 = class321.field3869;
        int i_11 = class321.field3875;
        int i_12 = class321.field3871;
        int[] ints_13 = new int[4];
        class321.method5999(ints_13);
        class22 class22_14 = this.method641(i_1, i_2, i_3, i_4, 1998978959);
        float f_15 = this.method612(i_7 - i_5, i_3 - i_1, -983856877);
        int i_16 = (int) Math.ceil(f_15);
        this.field310 = i_16;
        if (!this.field317.containsKey(Integer.valueOf(i_16))) {
            class40 class40_17 = new class40(i_16);
            class40_17.method719((byte) 4);
            this.field317.put(Integer.valueOf(i_16), class40_17);
        }

        int i_24 = class22_14.field180 + class22_14.field175 - 1;
        int i_18 = class22_14.field177 + class22_14.field176 - 1;

        int i_19;
        int i_20;
        for (i_19 = class22_14.field175; i_19 <= i_24; i_19++) {
            for (i_20 = class22_14.field177; i_20 <= i_18; i_20++) {
                this.field315[i_19][i_20].method473(i_16, (class40) this.field317.get(Integer.valueOf(i_16)), this.field320, this.field318, this.field323, -1781579709);
            }
        }

        class321.method6033(ints_10, i_11, i_12);
        class321.method6013(ints_13);
        i_19 = (int) (f_15 * 64.0F);
        i_20 = this.field319 + i_1;
        int i_21 = i_2 + this.field325;

        for (int i_22 = class22_14.field175; i_22 < class22_14.field175 + class22_14.field180; i_22++) {
            for (int i_23 = class22_14.field177; i_23 < class22_14.field177 + class22_14.field176; i_23++) {
                this.field315[i_22][i_23].method506(i_5 + i_19 * (this.field315[i_22][i_23].field245 * 64 - i_20) / 64, i_8 - i_19 * (this.field315[i_22][i_23].field246 * 64 - i_21 + 64) / 64, i_19, 1947241845);
            }
        }

    }

    public final void method605(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7, int i_8, HashSet hashset_9, HashSet hashset_10, int i_11, int i_12, boolean bool_13, int i_14) {
        class22 class22_15 = this.method641(i_1, i_2, i_3, i_4, -73084515);
        float f_16 = this.method612(i_7 - i_5, i_3 - i_1, 639010326);
        int i_17 = (int) (f_16 * 64.0F);
        int i_18 = this.field319 + i_1;
        int i_19 = i_2 + this.field325;

        int i_20;
        int i_21;
        for (i_20 = class22_15.field175; i_20 < class22_15.field180 + class22_15.field175; i_20++) {
            for (i_21 = class22_15.field177; i_21 < class22_15.field176 + class22_15.field177; i_21++) {
                if (bool_13) {
                    this.field315[i_20][i_21].method492((byte) 106);
                }

                this.field315[i_20][i_21].method432(i_5 + i_17 * (this.field315[i_20][i_21].field245 * 64 - i_18) / 64, i_8 - i_17 * (this.field315[i_20][i_21].field246 * 64 - i_19 + 64) / 64, i_17, hashset_9, (byte) 67);
            }
        }

        if (hashset_10 != null && i_11 > 0) {
            for (i_20 = class22_15.field175; i_20 < class22_15.field180 + class22_15.field175; i_20++) {
                for (i_21 = class22_15.field177; i_21 < class22_15.field176 + class22_15.field177; i_21++) {
                    this.field315[i_20][i_21].method433(hashset_10, i_11, i_12, (byte) 82);
                }
            }
        }

    }

}
