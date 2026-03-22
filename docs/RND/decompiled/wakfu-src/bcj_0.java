/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCj
 */
public class bcj_0
extends ayw_2<bCA> {
    static final ayv_2 jHe = new ayv_2(bCd.jGT);

    public bCA dNo() {
        bCd bCd2;
        try {
            bCd2 = (bCd)jHe.borrowObject();
            bCd.a(bCd2, jHe);
        }
        catch (Exception exception) {
            bCd.jGS.error((Object)"Erreur lors de l'extraction d'une DistributionMachine du pool", (Throwable)exception);
            bCd2 = new bCd();
        }
        return bCd2;
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

