/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxl
 */
public class bxl_0
extends ayw_2<bCA> {
    private static final ayv_2 jBc = new ayv_2(new bxm_0());

    public bCA dNo() {
        bxk_0 bxk_02;
        try {
            bxk_02 = (bxk_0)jBc.borrowObject();
            bxk_0.a(bxk_02, jBc);
        }
        catch (Exception exception) {
            bxk_0.jAY.error((Object)"Erreur lors de l'extraction d'un AudioMarker du pool", (Throwable)exception);
            bxk_02 = new bxk_0();
        }
        return bxk_02;
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

