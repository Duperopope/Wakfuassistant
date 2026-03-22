/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBJ
 */
public class bbj_1
extends ayw_2<ng_1> {
    private static final ayv_2 jGx = new ayv_2(new bbk_2());

    public bbh_1 dPM() {
        bbh_1 bbh_12;
        try {
            bbh_12 = (bbh_1)jGx.borrowObject();
            bbh_1.a(bbh_12, jGx);
        }
        catch (Exception exception) {
            bbh_1.aGi().error((Object)"Erreur lors de l'extraction d'un CharacterStatueViewFactory du pool", (Throwable)exception);
            bbh_12 = new bbh_1();
        }
        return bbh_12;
    }

    @Override
    public /* synthetic */ ayx_2 baw() {
        return this.dPM();
    }

    @Override
    public /* synthetic */ Object makeObject() {
        return this.dPM();
    }
}

