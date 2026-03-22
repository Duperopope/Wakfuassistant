/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxf
 */
public class bxf_0
extends ayw_2<bCA> {
    public static final ayv_2 jAT = new ayv_2(new bxg_0());

    public bCA dNo() {
        bxd_0 bxd_02;
        try {
            bxd_02 = (bxd_0)jAT.borrowObject();
            bxd_0.a(bxd_02, jAT);
        }
        catch (Exception exception) {
            bxd_0.jAR.error((Object)"Erreur lors de l'extraction du pool", (Throwable)exception);
            bxd_02 = new bxd_0();
        }
        return bxd_02;
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

