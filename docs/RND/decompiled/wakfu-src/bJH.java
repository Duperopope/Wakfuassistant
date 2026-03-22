/*
 * Decompiled with CFR 0.152.
 */
public class bJH {
    public static long kmm = 0L;
    public static final int kmn = 60000;

    public static void eaS() {
        long l = System.currentTimeMillis();
        if (kmm + 60000L < l) {
            bJr bJr2;
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            boolean bl = bgt_02 != null && bgt_02.dnw() == bgt_02.dnx();
            bJr bJr3 = bJr2 = bl ? bTj.eno().enp() : bTj.eno().doD();
            if (bJr2 != null) {
                cnH cnH2 = new cnH();
                cnH2.Ck(bJr2.d());
                aue_0.cVJ().etu().d(cnH2);
                kmm = l;
            }
        }
    }
}

