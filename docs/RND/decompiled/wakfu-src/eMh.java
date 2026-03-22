/*
 * Decompiled with CFR 0.152.
 */
public class eMh
extends eLT<eLZ> {
    private final boolean qMt;

    public eMh(eLZ eLZ2, int n, short s, boolean bl) {
        super(eLZ2, n, s);
        this.qMt = bl;
    }

    @Override
    protected int a(enk_0 enk_02, ahv_2 ahv_22, eLS eLS2) {
        return eLS2.a(ahv_22, enk_02, this, objectArray -> {
            if (!this.qMt) {
                return objectArray;
            }
            Object[] objectArray2 = new Object[((Object[])objectArray).length];
            for (int i = 0; i < ((Object[])objectArray).length; ++i) {
                Object object = objectArray[i];
                if (!(object instanceof GF)) {
                    objectArray2[i] = object;
                    continue;
                }
                GF gF = (GF)object;
                double d2 = gF.aNT() * 2.0;
                double d3 = Math.floor(gF.doubleValue()) * 2.0;
                objectArray2[i] = new GF((long)d3, d2);
            }
            return objectArray2;
        });
    }
}

