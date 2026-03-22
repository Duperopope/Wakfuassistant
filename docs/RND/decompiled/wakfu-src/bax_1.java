/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAX
 */
public class bax_1
extends ayw_2<bCA> {
    public static final ayv_2 jFN = new ayv_2(new bay_1());

    public bCA dNo() {
        baw_1 baw_12;
        try {
            baw_12 = (baw_1)jFN.borrowObject();
            baw_1.a(baw_12, jFN);
        }
        catch (Exception exception) {
            baw_1.jFM.error((Object)"Erreur lors de l'extraction d'une NationSelectionBoard du pool", (Throwable)exception);
            baw_12 = new baw_1();
        }
        return baw_12;
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

