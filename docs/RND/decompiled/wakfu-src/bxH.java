/*
 * Decompiled with CFR 0.152.
 */
public class bxH
extends ayw_2<bCA> {
    private static final ayv_2 jBH = new ayv_2(new bxI());

    public bCA dNo() {
        bxD bxD2;
        try {
            bxD2 = (bxD)jBH.borrowObject();
            bxD.a(bxD2, jBH);
        }
        catch (Exception exception) {
            bxD.jBu.error((Object)"Erreur lors de l'extraction d'un Chest du pool", (Throwable)exception);
            bxD2 = new bxD();
        }
        return bxD2;
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

