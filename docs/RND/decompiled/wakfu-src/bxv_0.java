/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxv
 */
public class bxv_0
extends ayw_2<bCA> {
    private static final ayv_2 jBn = new ayv_2(new bxw_0());

    public bCA dNo() {
        try {
            bxu bxu2 = (bxu)jBn.borrowObject();
            bxu.a(bxu2, jBn);
            return bxu2;
        }
        catch (Exception exception) {
            bxu.jBm.error((Object)"Create client object from pool", (Throwable)exception);
            return new bxu();
        }
    }

    @Override
    public /* synthetic */ ayx_2 baw() {
        return this.dNo();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.dNo();
    }
}

