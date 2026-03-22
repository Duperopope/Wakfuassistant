/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBU
 */
public class bbu_1
extends ayw_2<bCA> {
    private static final ayv_2 jGK = new ayv_2(new bbv_1());

    public bCA dNo() {
        bbt_1 bbt_12;
        try {
            bbt_12 = (bbt_1)jGK.borrowObject();
            bbt_1.a(bbt_12, jGK);
        }
        catch (Exception exception) {
            bbt_1.jGJ.error((Object)"Erreur lors de l'extraction d'un Lever du pool", (Throwable)exception);
            bbt_12 = new bbt_1();
        }
        return bbt_12;
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

