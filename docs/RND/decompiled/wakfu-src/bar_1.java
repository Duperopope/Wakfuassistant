/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAR
 */
public class bar_1
extends ayw_2<bCA> {
    private static final ayv_2 jFJ = new ayv_2(new bas_1());

    public bCA dNo() {
        bap_0 bap_02;
        try {
            bap_02 = (bap_0)jFJ.borrowObject();
            bap_0.a(bap_02, jFJ);
        }
        catch (Exception exception) {
            bap_0.jFC.error((Object)("Erreur lors de l'extraction d'un " + bap_0.class.getName() + " du pool"), (Throwable)exception);
            bap_02 = new bap_0();
        }
        return bap_02;
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

