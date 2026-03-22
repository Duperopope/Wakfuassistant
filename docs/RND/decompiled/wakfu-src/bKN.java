/*
 * Decompiled with CFR 0.152.
 */
public class bKN
implements aao_2 {
    private int ehc;

    @Override
    public boolean b(aam_2 aam_22) {
        bgt_0 bgt_02;
        ZH zH;
        if (aam_22.d() == Integer.MIN_VALUE && (zH = (bgt_02 = aue_0.cVJ().cVK()).dla()) != null) {
            ciR ciR2 = new ciR(this.ehc, zH.bcC(), zH.bcD(), 0L);
            aue_0.cVJ().etu().d(ciR2);
        }
        return false;
    }

    @Override
    public long Sn() {
        return 1L;
    }

    @Override
    public void dC(long l) {
    }

    public void HQ(int n) {
        this.ehc = n;
    }
}

