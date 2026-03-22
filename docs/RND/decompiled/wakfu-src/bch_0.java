/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bCH
 */
public class bch_0
extends ayw_2<bCA> {
    private static final ayv_2 jJL = new ayv_2(new bCI());

    public bCA dNo() {
        bCF bCF2;
        try {
            bCF2 = (bCF)jJL.borrowObject();
            bCF.a(bCF2, jJL);
        }
        catch (Exception exception) {
            bCF.jJI.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bCF2 = new bCF();
        }
        return bCF2;
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

