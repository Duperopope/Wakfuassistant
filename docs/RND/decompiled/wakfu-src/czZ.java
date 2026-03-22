/*
 * Decompiled with CFR 0.152.
 */
public final class czZ
implements aaq_2<cvo> {
    @Override
    public boolean a(cvo cvo2) {
        int n = cvo2.getX();
        int n2 = cvo2.getY();
        bKV bKV2 = bLe.ecw().dQ(n, n2);
        if (bKV2 == null) {
            return false;
        }
        short s = cvo2.ecx();
        long l = cvo2.awI();
        int n3 = cvo2.awK();
        bKV2.m((byte)s, true);
        bKV2.lI(l);
        bKV2.HR(n3);
        return false;
    }

    @Override
    public int bkq() {
        return 13607;
    }
}

