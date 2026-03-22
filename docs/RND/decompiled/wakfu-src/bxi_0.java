/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxi
 */
public class bxi_0
extends ayw_2<bCA> {
    public static final ayv_2 jAX = new ayv_2(new bxj_0());

    public bCA dNo() {
        bxh_0 bxh_02;
        try {
            bxh_02 = (bxh_0)jAX.borrowObject();
            bxh_0.a(bxh_02, jAX);
        }
        catch (Exception exception) {
            bxh_0.jAU.error((Object)"Error when retrieving an ArtisansBook from the pool", (Throwable)exception);
            bxh_02 = new bxh_0();
        }
        return bxh_02;
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

