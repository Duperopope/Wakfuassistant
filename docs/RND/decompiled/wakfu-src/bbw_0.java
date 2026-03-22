/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBw
 */
public class bbw_0
extends ayw_2<bCA> {
    private static final ayv_2 jGj = new ayv_2(new bbx_1());

    public bCA dNo() {
        bbu_0 bbu_02;
        try {
            bbu_02 = (bbu_0)jGj.borrowObject();
            bbu_0.a(bbu_02, jGj);
        }
        catch (Exception exception) {
            bbu_0.jGh.error((Object)"Erreur lors de l'extraction d'un Phenix du pool", (Throwable)exception);
            bbu_02 = new bbu_0();
        }
        return bbu_02;
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

