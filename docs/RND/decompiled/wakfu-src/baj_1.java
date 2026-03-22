/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bAj
 */
public class baj_1
extends ayw_2<bCA> {
    private static final ayv_2 jEP = new ayv_2(new bak_0());

    public bCA dNo() {
        bah_2 bah_22;
        try {
            bah_22 = (bah_2)jEP.borrowObject();
            bah_2.a(bah_22, jEP);
        }
        catch (Exception exception) {
            bah_2.jEN.error((Object)"Erreur lors de l'extraction d'un HavenWorldEntrance du pool", (Throwable)exception);
            bah_22 = new bah_2();
        }
        return bah_22;
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

