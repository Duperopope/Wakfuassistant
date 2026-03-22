/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eMq
 */
public class emq_0
extends emv_0 {
    public static final emv_0 qMK = new emq_0();

    protected emq_0() {
    }

    @Override
    Object[] c(enk_0 enk_02, short s) {
        int n = enk_02.fAn();
        Object[] objectArray = new Object[n];
        for (int i = 0; i < n; ++i) {
            float f2 = enk_02.x(i, s);
            int n2 = enk_02.a(i, s, ene_0.qPu);
            objectArray[i] = new GF(n2, f2);
        }
        return objectArray;
    }
}

