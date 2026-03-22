/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bBj
 */
public class bbj_2
extends ayw_2<bCA> {
    public static final ayv_2 jFY = new ayv_2(new bbk_1());

    public bCA dNo() {
        bbi_2 bbi_22;
        try {
            bbi_22 = (bbi_2)jFY.borrowObject();
            bbi_2.a(bbi_22, jFY);
        }
        catch (Exception exception) {
            bbi_2.jFX.error((Object)"Error extracting PvpSwitch of pool", (Throwable)exception);
            bbi_22 = new bbi_2();
        }
        return bbi_22;
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

