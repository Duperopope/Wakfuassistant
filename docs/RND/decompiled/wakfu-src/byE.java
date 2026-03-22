/*
 * Decompiled with CFR 0.152.
 */
public class byE
extends ayw_2<bCA> {
    public static final ayv_2 jCR = new ayv_2(new byf_0());

    public bCA dNo() {
        byd_0 byd_02;
        try {
            byd_02 = (byd_0)jCR.borrowObject();
            byd_0.a(byd_02, jCR);
        }
        catch (Exception exception) {
            byd_0.jCQ.error((Object)"Erreur lors de l'extraction d'une CharacterStatue du pool", (Throwable)exception);
            byd_02 = new byd_0();
        }
        return byd_02;
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

