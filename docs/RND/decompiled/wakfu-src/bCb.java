/*
 * Decompiled with CFR 0.152.
 */
public class bCb
extends ayw_2<bCA> {
    private static final ayv_2 jGR = new ayv_2(new bcc_0());

    public bCA dNo() {
        bca_0 bca_02;
        try {
            bca_02 = (bca_0)jGR.borrowObject();
            bca_0.a(bca_02, jGR);
        }
        catch (Exception exception) {
            bca_0.jGO.error((Object)"Erreur lors de l'extraction d'un StreetLight du pool", (Throwable)exception);
            bca_02 = new bca_0();
        }
        return bca_02;
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

