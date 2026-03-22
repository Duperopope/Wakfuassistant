/*
 * Decompiled with CFR 0.152.
 */
public class bxy
extends ayw_2<bCA> {
    public static final ayv_2 jBp = new ayv_2(new bxz());

    public bCA dNo() {
        bxx bxx2;
        try {
            bxx2 = (bxx)jBp.borrowObject();
            bxx.a(bxx2, jBp);
        }
        catch (Exception exception) {
            bxx.jBo.error((Object)"Erreur lors de l'extraction d'une CharacterStatue du pool", (Throwable)exception);
            bxx2 = new bxx();
        }
        return bxx2;
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

