/*
 * Decompiled with CFR 0.152.
 */
public class bxL
extends ayw_2<bCA> {
    private static final ayv_2 jBO = new ayv_2(new bxM());

    public bCA dNo() {
        bxJ bxJ2;
        try {
            bxJ2 = (bxJ)jBO.borrowObject();
            bxJ.a(bxJ2, jBO);
        }
        catch (Exception exception) {
            bxJ.jBI.error((Object)("Erreur lors de l'extraction d'un " + bxJ.class.getName() + " du pool"), (Throwable)exception);
            bxJ2 = new bxJ();
        }
        return bxJ2;
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

