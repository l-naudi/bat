package main.java.rs;

public class class282 extends class277 {

    final class338 field3640;
    public class262 field3642 = new class262();
    int field3643 = 1;

    public class282(class338 class338_1) {
        super(400);
        this.field3640 = class338_1;
    }

    public void method5184(class300 class300_1, int i_2, int i_3) {
        while (true) {
            if (class300_1.field3732 < i_2) {
                boolean bool_4 = class300_1.method5504((byte) 113) == 1;
                class283 class283_5 = new class283(class300_1.method5503(-231155257), this.field3640);
                class283 class283_6 = new class283(class300_1.method5503(-231155257), this.field3640);
                int i_7 = class300_1.method5496(-1459053594);
                int i_8 = class300_1.method5504((byte) 70);
                int i_9 = class300_1.method5504((byte) 69);
                boolean bool_10 = (i_9 & 0x2) != 0;
                boolean bool_11 = (i_9 & 0x1) != 0;
                if (i_7 > 0) {
                    class300_1.method5503(-231155257);
                    class300_1.method5504((byte) 91);
                    class300_1.method5499((byte) -30);
                }

                class300_1.method5503(-231155257);
                if (class283_5 != null && class283_5.method5205((byte) -122)) {
                    class284 class284_12 = (class284) this.method5138(class283_5, 2083171527);
                    if (bool_4) {
                        class284 class284_13 = (class284) this.method5138(class283_6, 2083171527);
                        if (class284_13 != null && class284_12 != class284_13) {
                            if (class284_12 != null) {
                                this.method5086(class284_13, 951866693);
                            } else {
                                class284_12 = class284_13;
                            }
                        }
                    }

                    if (class284_12 != null) {
                        this.method5083(class284_12, class283_5, class283_6, 336541548);
                        if (i_7 != class284_12.field3636) {
                            boolean bool_15 = true;

                            for (class286 class286_14 = (class286) this.field3642.method4922(); class286_14 != null; class286_14 = (class286) this.field3642.method4923()) {
                                if (class286_14.field3662.equals(class283_5)) {
                                    if (i_7 != 0 && class286_14.field3663 == 0) {
                                        class286_14.method3602();
                                        bool_15 = false;
                                    } else if (i_7 == 0 && class286_14.field3663 != 0) {
                                        class286_14.method3602();
                                        bool_15 = false;
                                    }
                                }
                            }

                            if (bool_15) {
                                this.field3642.method4921(new class286(class283_5, i_7));
                            }
                        }
                    } else {
                        if (this.method5079(1265799893) >= 400) {
                            continue;
                        }

                        class284_12 = (class284) this.method5088(class283_5, class283_6, (byte) -26);
                    }

                    if (i_7 != class284_12.field3636) {
                        class284_12.field3633 = ++this.field3643 - 1;
                        if (class284_12.field3636 == -1 && i_7 == 0) {
                            class284_12.field3633 = -(class284_12.field3633 * -782754599) * -1246846103;
                        }

                        class284_12.field3636 = i_7;
                    }

                    class284_12.field3634 = i_8;
                    class284_12.field3650 = bool_10;
                    class284_12.field3651 = bool_11;
                    continue;
                }

                throw new IllegalStateException();
            }

            this.method5133((short) 128);
            return;
        }
    }

    class274 vmethod5229(int i_1) {
        return new class284();
    }

    public boolean method5183(class283 class283_1, boolean bool_2, int i_3) {
        class284 class284_4 = (class284) this.method5082(class283_1, (byte) -108);
        return class284_4 != null && (!bool_2 || class284_4.field3636 != 0);
    }

    class274[] vmethod5230(int i_1, int i_2) {
        return new class284[i_1];
    }

}
