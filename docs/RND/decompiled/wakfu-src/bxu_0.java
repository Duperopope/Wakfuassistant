/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxU
 */
public class bxu_0
extends ayw_2<bCA> {
    private static final ayv_2 jCa = new ayv_2(new bxV());

    public bCA dNo() {
        bxR bxR2;
        try {
            bxR2 = (bxR)jCa.borrowObject();
            bxR.a(bxR2, jCa);
        }
        catch (Exception exception) {
            bxR.jBU.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bxR2 = new bxR();
        }
        bCu bCu2 = new bCu();
        ng_1 ng_12 = (ng_1)bCu2.baw();
        ng_12.nT(1);
        ng_12.nU(0);
        ng_12.B((byte)3);
        bxR2.a(ng_12);
        return bxR2;
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

