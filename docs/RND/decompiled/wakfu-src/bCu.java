/*
 * Decompiled with CFR 0.152.
 */
public class bCu
extends ayw_2<ng_1> {
    private static final ayv_2 jHA = new ayv_2(new bcv_0());

    public bcs_0 dQm() {
        bcs_0 bcs_02;
        try {
            bcs_02 = (bcs_0)jHA.borrowObject();
            bcs_0.a(bcs_02, jHA);
        }
        catch (Exception exception) {
            bcs_0.aGi().error((Object)"Erreur lors de l'extraction d'un WakfuClientInteractiveAnimatedElementSceneView du pool", (Throwable)exception);
            bcs_02 = new bcs_0();
        }
        return bcs_02;
    }

    @Override
    public /* synthetic */ ayx_2 baw() {
        return this.dQm();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.dQm();
    }
}

