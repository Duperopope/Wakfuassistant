/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAy
 */
public class bay_2
extends ayw_2<bCA> {
    public static final ayv_2 jFf = new ayv_2(new baz_2());

    public bCA dNo() {
        bax_2 bax_22;
        try {
            bax_22 = (bax_2)jFf.borrowObject();
            bax_2.a(bax_22, jFf);
        }
        catch (Exception exception) {
            bax_2.jFd.error((Object)"Error extracting InfiniteWaveEntrance of pool", (Throwable)exception);
            bax_22 = new bax_2();
        }
        return bax_22;
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

