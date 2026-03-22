/*
 * Decompiled with CFR 0.152.
 */
public class bCm
extends ayw_2<bCA> {
    public static final ayv_2 jHl = new ayv_2(new bcn_0());

    public bCA dNo() {
        bck_0 bck_02;
        try {
            bck_02 = (bck_0)jHl.borrowObject();
            bck_0.a(bck_02, jHl);
        }
        catch (Exception exception) {
            bck_0.jHf.error((Object)"Erreur lors de l'extraction d'une DistributionMachine du pool", (Throwable)exception);
            bck_02 = new bck_0();
        }
        return bck_02;
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

