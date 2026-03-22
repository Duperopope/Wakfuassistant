/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from byp
 */
public class byp_0
extends ayw_2<bCA> {
    public static final ayv_2 jCw = new ayv_2(new byq_1());

    public bym dOc() {
        bym bym2;
        try {
            bym2 = (bym)jCw.borrowObject();
            bym.a(bym2, jCw);
        }
        catch (Exception exception) {
            bym.jCq.error((Object)"Erreur lors de l'extraction d'une Collector du pool", (Throwable)exception);
            bym2 = new bym();
        }
        return bym2;
    }

    @Override
    public /* synthetic */ ayx_2 baw() {
        return this.dOc();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.dOc();
    }
}

