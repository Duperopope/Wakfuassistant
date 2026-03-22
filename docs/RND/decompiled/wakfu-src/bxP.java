/*
 * Decompiled with CFR 0.152.
 */
public class bxP
extends ayw_2<bCA> {
    private static final ayv_2 jBT = new ayv_2(new bxq_0());

    public bxn_0 dNS() {
        bxn_0 bxn_02;
        try {
            bxn_02 = (bxn_0)jBT.borrowObject();
            bxn_0.a(bxn_02, jBT);
        }
        catch (Exception exception) {
            bxR.jBU.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bxn_02 = new bxn_0();
        }
        bCu bCu2 = new bCu();
        ng_1 ng_12 = (ng_1)bCu2.baw();
        ng_12.nT(1);
        ng_12.nU(0);
        ng_12.B((byte)3);
        bxn_02.a(ng_12);
        return bxn_02;
    }

    @Override
    public /* synthetic */ ayx_2 baw() {
        return this.dNS();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.dNS();
    }
}

