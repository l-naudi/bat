package main.java.rs;

import java.util.*;

public class class333 {

    static final class292 field3978;
    static final class292 field3979;
    static final class292 field3980;

    static {
        field3978 = class292.field3679;
        field3979 = class292.field3684;
        field3980 = class292.field3681;
    }

    final int[] field4020 = new int[]{1008, 1009, 1010, 1011, 1012};
    public boolean field4025 = false;
    int field3970 = -1;
    int field3993 = -1;
    int field3996 = -1;
    int field3997 = -1;
    int field3995 = -1;
    int field3975 = -1;
    int field3984 = 3;
    int field4023 = 50;
    boolean field4002 = false;
    HashSet field4003 = null;
    int field4022 = -1;
    int field4017 = -1;
    int field4006 = -1;
    int field4007 = -1;
    int field4001 = -1;
    int field3989 = -1;
    boolean field4013 = true;
    HashSet field4014 = new HashSet();
    HashSet field4015 = new HashSet();
    HashSet field4016 = new HashSet();
    HashSet field3988 = new HashSet();
    boolean field4018 = false;
    int field4011 = 0;
    HashSet field4005 = new HashSet();
    class213 field4024 = null;
    int field3977 = -1;
    int field3998 = -1;
    int field4030 = -1;
    class26 field3986;
    class36 field4019;
    float field3994;
    float field3974;
    List field3972;
    Iterator field3991;
    long field3982;
    int field3990;
    int field3999;
    class325 field4026;
    int field4027;
    class324[] field3983;
    class233 field4029;
    class233 field3976;
    class233 field4010;
    class295 field3981;
    HashMap field4021;
    class332 field4028;
    HashMap field3992;
    class26 field3987;
    class26 field3985;
    int field4000;
    int field4012;

    boolean method6307(int i_1) {
        return this.field3970 != -1 && this.field3993 != -1;
    }

    public class26 method6308(int i_1, int i_2, int i_3, byte b_4) {
        Iterator iterator_5 = this.field3992.values().iterator();

        class26 class26_6;
        do {
            if (!iterator_5.hasNext()) {
                return null;
            }

            class26_6 = (class26) iterator_5.next();
        } while (!class26_6.method373(i_1, i_2, i_3, 772882794));

        return class26_6;
    }

    float method6323(int i_1, int i_2) {
        return i_1 == 25 ? 1.0F : (i_1 == 37 ? 1.5F : (i_1 == 50 ? 2.0F : (i_1 == 75 ? 3.0F : (i_1 == 100 ? 4.0F : 8.0F))));
    }

    public class26 method6327(int i_1, int i_2) {
        Iterator iterator_3 = this.field3992.values().iterator();

        class26 class26_4;
        do {
            if (!iterator_3.hasNext()) {
                return null;
            }

            class26_4 = (class26) iterator_3.next();
        } while (class26_4.method347((byte) -34) != i_1);

        return class26_4;
    }

    void method6449(class26 class26_1, int i_2) {
        this.field3986 = class26_1;
        this.field4019 = new class36(this.field3983, this.field4021, this.field3976, this.field4010);
        this.field4028.method6285(this.field3986.method369(-1549026278), (byte) 124);
    }

    void method6313(class26 class26_1, int i_2) {
        if (this.field3986 == null || class26_1 != this.field3986) {
            this.method6449(class26_1, -1813483224);
            this.method6314(-1, -1, -1, 1348080831);
        }
    }

    public int method6332(int i_1) {
        return this.field3986 == null ? -1 : this.field3990 + this.field3986.method338(-1264098925) * 64;
    }

    void method6450(byte b_1) {
        if (class68.field944 != null) {
            this.field3994 = this.field3974;
        } else {
            if (this.field3994 < this.field3974) {
                this.field3994 = Math.min(this.field3974, this.field3994 + this.field3994 / 30.0F);
            }

            if (this.field3994 > this.field3974) {
                this.field3994 = Math.max(this.field3974, this.field3994 - this.field3994 / 30.0F);
            }

        }
    }

    void method6350(byte b_1) {
        this.field3988.clear();
        this.field3988.addAll(this.field4014);
        this.field3988.addAll(this.field4016);
    }

    void method6314(int i_1, int i_2, int i_3, int i_4) {
        if (this.field3986 != null) {
            int[] ints_5 = this.field3986.method330(i_1, i_2, i_3, 1197175712);
            if (ints_5 == null) {
                ints_5 = this.field3986.method330(this.field3986.method343(-1111611912), this.field3986.method342((byte) -30), this.field3986.method405((byte) -16), 1762283890);
            }

            this.method6305(ints_5[0] - this.field3986.method338(-1607087713) * 64, ints_5[1] - this.field3986.method340(426909580) * 64, true, 997010308);
            this.field3970 = -1;
            this.field3993 = -1;
            this.field3994 = this.method6323(this.field3986.method337(459716843), -1360526836);
            this.field3974 = this.field3994;
            this.field3972 = null;
            this.field3991 = null;
            this.field4019.method639(-715602432);
        }
    }

    public int method6412(int i_1) {
        return this.field3996;
    }

    public int method6333(int i_1) {
        return this.field3986 == null ? -1 : this.field3999 + this.field3986.method340(297229601) * 64;
    }

    void method6304(int i_1) {
        if (this.method6307(-1067289346)) {
            int i_2 = this.field3970 - this.field3990;
            int i_3 = this.field3993 - this.field3999;
            if (i_2 != 0) {
                i_2 /= Math.min(8, Math.abs(i_2));
            }

            if (i_3 != 0) {
                i_3 /= Math.min(8, Math.abs(i_3));
            }

            this.method6305(i_2 + this.field3990, i_3 + this.field3999, true, 1498384117);
            if (this.field3970 == this.field3990 && this.field3999 == this.field3993) {
                this.field3970 = -1;
                this.field3993 = -1;
            }

        }
    }

    final void method6306(byte b_1) {
        this.field3989 = -1;
        this.field4001 = -1;
        this.field4007 = -1;
        this.field4006 = -1;
    }

    public void method6369(int i_1, int i_2, int i_3) {
        if (this.field3986 != null && this.field3986.method329(i_1, i_2, 431640899)) {
            this.field3970 = i_1 - this.field3986.method338(120607152) * 64;
            this.field3993 = i_2 - this.field3986.method340(-20854713) * 64;
        }
    }

    public void method6380(int i_1, int i_2, int i_3) {
        if (this.field3986 != null) {
            this.method6305(i_1 - this.field3986.method338(-1585762587) * 64, i_2 - this.field3986.method340(-972485029) * 64, true, 2047866040);
            this.field3970 = -1;
            this.field3993 = -1;
        }
    }

    void method6302(int i_1, int i_2, boolean bool_3, long long_4) {
        if (this.field3986 != null) {
            int i_6 = (int) ((float) this.field3990 + ((float) (i_1 - this.field3995) - (float) this.method6412(-1200687327) * this.field3994 / 2.0F) / this.field3994);
            int i_7 = (int) ((float) this.field3999 - ((float) (i_2 - this.field3975) - (float) this.method6461((byte) 127) * this.field3994 / 2.0F) / this.field3994);
            this.field4024 = this.field3986.method331(i_6 + this.field3986.method338(-1555576379) * 64, i_7 + this.field3986.method340(-531003506) * 64, 1177032245);
            if (this.field4024 != null && bool_3) {
                boolean bool_8 = Client.field890 >= 2;
                if (bool_8 && class45.field395[82] && class45.field395[81]) {
                    class28.method418(this.field4024.field2530, this.field4024.field2528, this.field4024.field2531, false, 1223150720);
                } else {
                    boolean bool_9 = true;
                    if (this.field4013) {
                        int i_10 = i_1 - this.field4000;
                        int i_11 = i_2 - this.field4012;
                        if (long_4 - this.field3982 > 500L || i_10 < -25 || i_10 > 25 || i_11 < -25 || i_11 > 25) {
                            bool_9 = false;
                        }
                    }

                    if (bool_9) {
                        class187 class187_12 = class235.method4265(class183.field2248, Client.field880.field1313, 1775123545);
                        class187_12.field2333.method5539(this.field4024.method3971(1080399232), (byte) -31);
                        Client.field880.method2219(class187_12, 2067459847);
                        this.field3982 = 0L;
                    }
                }
            }
        } else {
            this.field4024 = null;
        }

    }

    final void method6305(int i_1, int i_2, boolean bool_3, int i_4) {
        this.field3990 = i_1;
        this.field3999 = i_2;
        class206.method3939(-1069420175);
        if (bool_3) {
            this.method6306((byte) 1);
        }

    }

    public int method6461(byte b_1) {
        return this.field3997;
    }

    public class34 method6355(byte b_1) {
        if (this.field3991 == null) {
            return null;
        } else {
            class34 class34_2;
            do {
                if (!this.field3991.hasNext()) {
                    return null;
                }

                class34_2 = (class34) this.field3991.next();
            } while (class34_2.vmethod597(-1218669056) == -1);

            return class34_2;
        }
    }

    boolean method6318(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        return this.field4026 == null || (this.field4026.field3899 != i_1 || this.field4026.field3900 != i_2 || (this.field4019.field310 != this.field4027 || (this.field4030 != Client.field924 || (i_3 > 0 || i_4 > 0 || (i_3 + i_1 < i_5 || i_2 + i_4 < i_6)))));
    }

    void method6322(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        byte b_7 = 20;
        int i_8 = i_3 / 2 + i_1;
        int i_9 = i_4 / 2 + i_2 - 18 - b_7;
        class321.method6012(i_1, i_2, i_3, i_4, -16777216);
        class321.method6008(i_8 - 152, i_9, 304, 34, -65536);
        class321.method6012(i_8 - 150, i_9 + 2, i_5 * 3, 30, -65536);
        this.field3981.method5341("Loading...", i_8, b_7 + i_9, -1, -1);
    }

    void method6319(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, byte b_7) {
        if (class68.field944 != null) {
            int i_8 = 512 / (this.field4019.field310 * 2);
            int i_9 = i_3 + 512;
            int i_10 = i_4 + 512;
            float f_11 = 1.0F;
            i_9 = (int) ((float) i_9 / f_11);
            i_10 = (int) ((float) i_10 / f_11);
            int i_12 = this.method6332(455278746) - i_5 / 2 - i_8;
            int i_13 = this.method6333(408492838) - i_6 / 2 - i_8;
            int i_14 = i_1 - (i_8 + i_12 - this.field3977) * this.field4019.field310;
            int i_15 = i_2 - this.field4019.field310 * (i_8 - (i_13 - this.field3998));
            if (this.method6318(i_9, i_10, i_14, i_15, i_3, i_4, -1863961695)) {
                if (this.field4026 != null && this.field4026.field3899 == i_9 && this.field4026.field3900 == i_10) {
                    Arrays.fill(this.field4026.field3908, 0);
                } else {
                    this.field4026 = new class325(i_9, i_10);
                }

                this.field3977 = this.method6332(1671180892) - i_5 / 2 - i_8;
                this.field3998 = this.method6333(140338410) - i_6 / 2 - i_8;
                this.field4027 = this.field4019.field310;
                class68.field944.method4321(this.field3977, this.field3998, this.field4026, (float) this.field4027 / f_11, -690333183);
                this.field4030 = Client.field924;
                i_14 = i_1 - (i_12 + i_8 - this.field3977) * this.field4019.field310;
                i_15 = i_2 - this.field4019.field310 * (i_8 - (i_13 - this.field3998));
            }

            class321.method6004(i_1, i_2, i_3, i_4, 0, 128);
            if (f_11 == 1.0F) {
                this.field4026.method6135(i_14, i_15, 192);
            } else {
                this.field4026.method6217(i_14, i_15, (int) (f_11 * (float) i_9), (int) ((float) i_10 * f_11), 192);
            }
        }

    }

    public void method6317(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
        int[] ints_7 = new int[4];
        class321.method5999(ints_7);
        class321.method5997(i_1, i_2, i_3 + i_1, i_2 + i_4);
        class321.method6012(i_1, i_2, i_3, i_4, -16777216);
        int i_8 = this.field4028.method6284(-805069530);
        if (i_8 < 100) {
            this.method6322(i_1, i_2, i_3, i_4, i_8, 1955930802);
        } else {
            if (!this.field4019.method609(1588270336)) {
                this.field4019.method602(this.field4029, this.field3986.method369(-185399103), Client.field655, (byte) 1);
                if (!this.field4019.method609(1588270336)) {
                    return;
                }
            }

            if (this.field4003 != null) {
                ++this.field4017;
                if (this.field4017 % this.field4023 == 0) {
                    this.field4017 = 0;
                    ++this.field4022;
                }

                if (this.field4022 >= this.field3984 && !this.field4002) {
                    this.field4003 = null;
                }
            }

            int i_9 = (int) Math.ceil((float) i_3 / this.field3994);
            int i_10 = (int) Math.ceil((float) i_4 / this.field3994);
            this.field4019.method604(this.field3990 - i_9 / 2, this.field3999 - i_10 / 2, i_9 / 2 + this.field3990, i_10 / 2 + this.field3999, i_1, i_2, i_3 + i_1, i_2 + i_4, (byte) 36);
            boolean bool_11;
            if (!this.field4018) {
                bool_11 = false;
                if (i_5 - this.field4011 > 100) {
                    this.field4011 = i_5;
                    bool_11 = true;
                }

                this.field4019.method605(this.field3990 - i_9 / 2, this.field3999 - i_10 / 2, i_9 / 2 + this.field3990, i_10 / 2 + this.field3999, i_1, i_2, i_3 + i_1, i_2 + i_4, this.field3988, this.field4003, this.field4017, this.field4023, bool_11, -855095363);
            }

            this.method6319(i_1, i_2, i_3, i_4, i_9, i_10, (byte) -125);
            bool_11 = Client.field890 >= 2;
            if (bool_11 && this.field4025 && this.field4024 != null) {
                this.field3981.method5346("Coord: " + this.field4024, class321.field3874 + 10, class321.field3870 + 20, 16776960, -1);
            }

            this.field3996 = i_9;
            this.field3997 = i_10;
            this.field3995 = i_1;
            this.field3975 = i_2;
            class321.method6013(ints_7);
        }
    }

    public void method6299(int i_1) {
        class29.field244.method3350(5);
    }

    public void method6320(int i_1, int i_2, int i_3, int i_4, int i_5) {
        if (this.field4028.method6295(1906092832)) {
            if (!this.field4019.method609(1588270336)) {
                this.field4019.method602(this.field4029, this.field3986.method369(131273805), Client.field655, (byte) 1);
                if (!this.field4019.method609(1588270336)) {
                    return;
                }
            }

            this.field4019.method606(i_1, i_2, i_3, i_4, this.field4003, this.field4017, this.field4023, -1827079020);
        }
    }

    public void method6470(int i_1, int i_2, class213 class213_3, class213 class213_4, byte b_5) {
        class62 class62_6 = new class62();
        class41 class41_7 = new class41(i_2, class213_3, class213_4);
        class62_6.method1131(new Object[]{class41_7}, (byte) 27);
        switch (i_1) {
            case 1008:
                class62_6.method1123(10, 141891736);
                break;
            case 1009:
                class62_6.method1123(11, 1193524243);
                break;
            case 1010:
                class62_6.method1123(12, 337217428);
                break;
            case 1011:
                class62_6.method1123(13, -192643947);
                break;
            case 1012:
                class62_6.method1123(14, -1854867623);
        }

        class184.method3613(class62_6, (byte) 41);
    }

    public void method6298(class233 class233_1, class233 class233_2, class233 class233_3, class295 class295_4, HashMap hashmap_5, class324[] arr_6, int i_7) {
        this.field3983 = arr_6;
        this.field4029 = class233_1;
        this.field3976 = class233_2;
        this.field4010 = class233_3;
        this.field3981 = class295_4;
        this.field4021 = new HashMap();
        this.field4021.put(class17.field113, hashmap_5.get(field3978));
        this.field4021.put(class17.field118, hashmap_5.get(field3979));
        this.field4021.put(class17.field116, hashmap_5.get(field3980));
        this.field4028 = new class332(class233_1);
        int i_8 = this.field4029.method4160(class35.field308.field306, 1993215311);
        int[] ints_9 = this.field4029.method4153(i_8, 1426425678);
        this.field3992 = new HashMap(ints_9.length);

        for (int i_10 = 0; i_10 < ints_9.length; i_10++) {
            class300 class300_11 = new class300(this.field4029.method4144(i_8, ints_9[i_10], 1731639626));
            class26 class26_12 = new class26();
            class26_12.method344(class300_11, ints_9[i_10], (byte) 0);
            this.field3992.put(class26_12.method369(-229522962), class26_12);
            if (class26_12.method334(-1524903705)) {
                this.field3985 = class26_12;
            }
        }

        this.method6313(this.field3985, 812407126);
        this.field3987 = null;
    }

    public void method6309(int i_1, int i_2, int i_3, boolean bool_4, byte b_5) {
        class26 class26_6 = this.method6308(i_1, i_2, i_3, (byte) 30);
        if (class26_6 == null) {
            if (!bool_4) {
                return;
            }

            class26_6 = this.field3985;
        }

        boolean bool_7 = false;
        if (class26_6 != this.field3987 || bool_4) {
            this.field3987 = class26_6;
            this.method6313(class26_6, 2110747910);
            bool_7 = true;
        }

        if (bool_7 || bool_4) {
            this.method6314(i_1, i_2, i_3, 2043648085);
        }

    }

    public void method6471(int i_1) {
        this.field4028.method6286(52307485);
    }

    public void method6335(int i_1, int i_2, boolean bool_3, int i_4, int i_5, int i_6, int i_7, int i_8) {
        if (this.field4028.method6295(1906092832)) {
            this.method6450((byte) -59);
            this.method6304(-1342245212);
            if (bool_3) {
                int i_9 = (int) Math.ceil((float) i_6 / this.field3994);
                int i_10 = (int) Math.ceil((float) i_7 / this.field3994);
                List list_11 = this.field4019.method607(this.field3990 - i_9 / 2 - 1, this.field3999 - i_10 / 2 - 1, i_9 / 2 + this.field3990 + 1, i_10 / 2 + this.field3999 + 1, i_4, i_5, i_6, i_7, i_1, i_2, 286331893);
                HashSet hashset_12 = new HashSet();

                Iterator iterator_13;
                class34 class34_14;
                class62 class62_15;
                class41 class41_16;
                for (iterator_13 = list_11.iterator(); iterator_13.hasNext(); class184.method3613(class62_15, (byte) 2)) {
                    class34_14 = (class34) iterator_13.next();
                    hashset_12.add(class34_14);
                    class62_15 = new class62();
                    class41_16 = new class41(class34_14.vmethod597(-229566020), class34_14.field298, class34_14.field297);
                    class62_15.method1131(new Object[]{class41_16, Integer.valueOf(i_1), Integer.valueOf(i_2)}, (byte) 110);
                    if (this.field4005.contains(class34_14)) {
                        class62_15.method1123(17, -1679225214);
                    } else {
                        class62_15.method1123(15, 641845623);
                    }
                }

                iterator_13 = this.field4005.iterator();

                while (iterator_13.hasNext()) {
                    class34_14 = (class34) iterator_13.next();
                    if (!hashset_12.contains(class34_14)) {
                        class62_15 = new class62();
                        class41_16 = new class41(class34_14.vmethod597(723844955), class34_14.field298, class34_14.field297);
                        class62_15.method1131(new Object[]{class41_16, Integer.valueOf(i_1), Integer.valueOf(i_2)}, (byte) 126);
                        class62_15.method1123(16, 960122041);
                        class184.method3613(class62_15, (byte) 20);
                    }
                }

                this.field4005 = hashset_12;
            }
        }
    }

    public void method6482(int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, int i_7) {
        if (this.field4028.method6295(1906092832)) {
            int i_8 = (int) Math.ceil((float) i_3 / this.field3994);
            int i_9 = (int) Math.ceil((float) i_4 / this.field3994);
            List list_10 = this.field4019.method607(this.field3990 - i_8 / 2 - 1, this.field3999 - i_9 / 2 - 1, i_8 / 2 + this.field3990 + 1, i_9 / 2 + this.field3999 + 1, i_1, i_2, i_3, i_4, i_5, i_6, 286331893);
            if (!list_10.isEmpty()) {
                Iterator iterator_11 = list_10.iterator();

                boolean bool_14;
                do {
                    if (!iterator_11.hasNext()) {
                        return;
                    }

                    class34 class34_12 = (class34) iterator_11.next();
                    class241 class241_13 = class222.method4118(class34_12.vmethod597(1352739892), -673469339);
                    bool_14 = false;

                    for (int i_15 = this.field4020.length - 1; i_15 >= 0; --i_15) {
                        if (class241_13.field3210[i_15] != null) {
                            class188.method3644(class241_13.field3210[i_15], class241_13.field3211, this.field4020[i_15], class34_12.vmethod597(-1665446524), class34_12.field298.method3971(-1895806048), class34_12.field297.method3971(-1899393960), 2114243607);
                            bool_14 = true;
                        }
                    }
                } while (!bool_14);

            }
        }
    }

    public void method6310(int i_1, int i_2) {
        class26 class26_3 = this.method6327(i_1, -1118693055);
        if (class26_3 != null) {
            this.method6313(class26_3, 1238595784);
        }

    }

    public int method6451(byte b_1) {
        return (double) this.field3974 == 1.0D ? 25 : ((double) this.field3974 == 1.5D ? 37 : ((double) this.field3974 == 2.0D ? 50 : ((double) this.field3974 == 3.0D ? 75 : ((double) this.field3974 == 4.0D ? 100 : 200))));
    }

    public void method6485(int i_1, int i_2) {
        this.field3974 = this.method6323(i_1, -1159750951);
    }

    public boolean method6326(int i_1) {
        return this.field4028.method6295(1906092832);
    }

    public void method6301(int i_1, int i_2, boolean bool_3, boolean bool_4, byte b_5) {
        long long_6 = class206.method3939(-2069806468);
        this.method6302(i_1, i_2, bool_4, long_6);
        if (!this.method6307(-1798677301) && (bool_4 || bool_3)) {
            if (bool_4) {
                this.field4001 = i_1;
                this.field3989 = i_2;
                this.field4006 = this.field3990;
                this.field4007 = this.field3999;
            }

            if (this.field4006 != -1) {
                int i_8 = i_1 - this.field4001;
                int i_9 = i_2 - this.field3989;
                this.method6305(this.field4006 - (int) ((float) i_8 / this.field3974), (int) ((float) i_9 / this.field3974) + this.field4007, false, 206616151);
            }
        } else {
            this.method6306((byte) 1);
        }

        if (bool_4) {
            this.field3982 = long_6;
            this.field4000 = i_1;
            this.field4012 = i_2;
        }

    }

    public class213 method6415(byte b_1) {
        return this.field3986 == null ? null : this.field3986.method331(this.method6332(302099777), this.method6333(-1722466928), 1591288232);
    }

    public void method6330(int i_1, int i_2, int i_3, int i_4) {
        if (this.field3986 != null) {
            int[] ints_5 = this.field3986.method330(i_1, i_2, i_3, 1037680047);
            if (ints_5 != null) {
                this.method6369(ints_5[0], ints_5[1], -1604144136);
            }

        }
    }

    public void method6389(int i_1, int i_2, int i_3, int i_4) {
        if (this.field3986 != null) {
            int[] ints_5 = this.field3986.method330(i_1, i_2, i_3, -235419821);
            if (ints_5 != null) {
                this.method6380(ints_5[0], ints_5[1], 2145778203);
            }

        }
    }

    public int method6311(byte b_1) {
        return this.field3986 == null ? -1 : this.field3986.method347((byte) 21);
    }

    public void method6338(byte b_1) {
        this.field3984 = 3;
    }

    public class26 method6312(byte b_1) {
        return this.field3986;
    }

    public void method6340(int i_1) {
        this.field4023 = 50;
    }

    public void method6337(int i_1, int i_2) {
        if (i_1 >= 1) {
            this.field3984 = i_1;
        }

    }

    public void method6343(int i_1) {
        this.field4003 = null;
    }

    public void method6339(int i_1, int i_2) {
        if (i_1 >= 1) {
            this.field4023 = i_1;
        }

    }

    public void method6341(int i_1, int i_2) {
        this.field4003 = new HashSet();
        this.field4003.add(Integer.valueOf(i_1));
        this.field4022 = 0;
        this.field4017 = 0;
    }

    public void method6492(boolean bool_1, int i_2) {
        this.field4002 = bool_1;
    }

    public void method6342(int i_1, int i_2) {
        this.field4003 = new HashSet();
        this.field4022 = 0;
        this.field4017 = 0;

        for (int i_3 = 0; i_3 < class314.field3846; i_3++) {
            if (class222.method4118(i_3, -673469339) != null && class222.method4118(i_3, -673469339).field3230 == i_1) {
                this.field4003.add(Integer.valueOf(class222.method4118(i_3, -673469339).field3213));
            }
        }

    }

    public class34 method6346(int i_1) {
        if (!this.field4028.method6295(1906092832)) {
            return null;
        } else if (!this.field4019.method609(1588270336)) {
            return null;
        } else {
            HashMap hashmap_2 = this.field4019.method610(1642973210);
            this.field3972 = new LinkedList();
            Iterator iterator_3 = hashmap_2.values().iterator();

            while (iterator_3.hasNext()) {
                List list_4 = (List) iterator_3.next();
                this.field3972.addAll(list_4);
            }

            this.field3991 = this.field3972.iterator();
            return this.method6355((byte) 3);
        }
    }

    public void method6403(boolean bool_1, byte b_2) {
        this.field4018 = !bool_1;
    }

    public boolean method6347(short s_1) {
        return !this.field4018;
    }

    public void method6345(int i_1, boolean bool_2, byte b_3) {
        if (!bool_2) {
            this.field4014.add(Integer.valueOf(i_1));
        } else {
            this.field4014.remove(Integer.valueOf(i_1));
        }

        this.method6350((byte) 27);
    }

    public void method6476(int i_1, boolean bool_2, int i_3) {
        if (!bool_2) {
            this.field4015.add(Integer.valueOf(i_1));
        } else {
            this.field4015.remove(Integer.valueOf(i_1));
        }

        for (int i_4 = 0; i_4 < class314.field3846; i_4++) {
            if (class222.method4118(i_4, -673469339) != null && class222.method4118(i_4, -673469339).field3230 == i_1) {
                int i_5 = class222.method4118(i_4, -673469339).field3213;
                if (!bool_2) {
                    this.field4016.add(Integer.valueOf(i_5));
                } else {
                    this.field4016.remove(Integer.valueOf(i_5));
                }
            }
        }

        this.method6350((byte) -67);
    }

    public boolean method6348(int i_1, byte b_2) {
        return !this.field4014.contains(Integer.valueOf(i_1));
    }

    public void method6315(class26 class26_1, class213 class213_2, class213 class213_3, boolean bool_4, int i_5) {
        if (class26_1 != null) {
            if (this.field3986 == null || class26_1 != this.field3986) {
                this.method6449(class26_1, -1956464788);
            }

            if (!bool_4 && this.field3986.method373(class213_2.field2531, class213_2.field2530, class213_2.field2528, 1217284738)) {
                this.method6314(class213_2.field2531, class213_2.field2530, class213_2.field2528, 1722414721);
            } else {
                this.method6314(class213_3.field2531, class213_3.field2530, class213_3.field2528, 1901778927);
            }

        }
    }

    public boolean method6349(int i_1, int i_2) {
        return !this.field4015.contains(Integer.valueOf(i_1));
    }

    public class213 method6352(int i_1, class213 class213_2, int i_3) {
        if (!this.field4028.method6295(1906092832)) {
            return null;
        } else if (!this.field4019.method609(1588270336)) {
            return null;
        } else if (!this.field3986.method329(class213_2.field2530, class213_2.field2528, -924381995)) {
            return null;
        } else {
            HashMap hashmap_4 = this.field4019.method610(1662606206);
            List list_5 = (List) hashmap_4.get(Integer.valueOf(i_1));
            if (list_5 != null && !list_5.isEmpty()) {
                class34 class34_6 = null;
                int i_7 = -1;
                Iterator iterator_8 = list_5.iterator();

                while (true) {
                    class34 class34_9;
                    int i_12;
                    do {
                        if (!iterator_8.hasNext()) {
                            return class34_6.field297;
                        }

                        class34_9 = (class34) iterator_8.next();
                        int i_10 = class34_9.field297.field2530 - class213_2.field2530;
                        int i_11 = class34_9.field297.field2528 - class213_2.field2528;
                        i_12 = i_10 * i_10 + i_11 * i_11;
                        if (i_12 == 0) {
                            return class34_9.field297;
                        }
                    } while (i_12 >= i_7 && class34_6 != null);

                    class34_6 = class34_9;
                    i_7 = i_12;
                }
            } else {
                return null;
            }
        }
    }

}
