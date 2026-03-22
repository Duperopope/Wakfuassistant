/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCq
 */
public class bcq_0
extends ayw_2<bCA> {
    public static final ayv_2 jHq = new ayv_2(new bcr_0());
    private final fre_0 jHr;

    public bcq_0(fre_0 fre_02) {
        this.jHr = fre_02;
    }

    public bCA dNo() {
        bco_0 bco_02;
        try {
            bco_02 = (bco_0)jHq.borrowObject();
            bco_0.a(bco_02, jHq);
        }
        catch (Exception exception) {
            bco_0.jHm.error((Object)"Erreur lors de l'extraction d'une DistributionMachine du pool", (Throwable)exception);
            bco_02 = new bco_0();
        }
        bco_02.jFc = this.jHr;
        return bco_02;
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

