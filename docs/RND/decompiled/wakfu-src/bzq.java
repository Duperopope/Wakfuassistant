/*
 * Decompiled with CFR 0.152.
 */
public class bzq
extends ayw_2<bCA> {
    private static final ayv_2 jDP = new ayv_2(new bzr());

    public bCA dNo() {
        bzm_0 bzm_02;
        try {
            bzm_02 = (bzm_0)jDP.borrowObject();
            bzm_0.a(bzm_02, jDP);
        }
        catch (Exception exception) {
            bzm_0.jDF.error((Object)"Erreur lors de l'extraction d'un Door du pool", (Throwable)exception);
            bzm_02 = new bzm_0();
        }
        return bzm_02;
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

