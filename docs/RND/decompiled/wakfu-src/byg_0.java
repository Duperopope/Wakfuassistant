/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from byg
 */
public class byg_0
extends ayw_2<bCA> {
    private static final ayv_2 jCm = new ayv_2(new byh());

    public bCA dNo() {
        bye_0 bye_02;
        try {
            bye_02 = (bye_0)jCm.borrowObject();
            bye_0.a(bye_02, jCm);
        }
        catch (Exception exception) {
            bye_0.jCi.error((Object)"Erreur lors de l'extraction d'un Chest du pool", (Throwable)exception);
            bye_02 = new bye_0();
        }
        return bye_02;
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

