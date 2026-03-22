/*
 * Decompiled with CFR 0.152.
 */
public class bxB
extends ayw_2<bCA> {
    private static final ayv_2 jBt = new ayv_2(new bxC());

    public bCA dNo() {
        bxA bxA2;
        try {
            bxA2 = (bxA)jBt.borrowObject();
            bxA.a(bxA2, jBt);
        }
        catch (Exception exception) {
            bxA.jBq.error((Object)"Erreur lors de l'extraction d'un Board du pool", (Throwable)exception);
            bxA2 = new bxA();
        }
        return bxA2;
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

