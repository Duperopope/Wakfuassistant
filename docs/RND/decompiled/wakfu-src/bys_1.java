/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bys
 */
public class bys_1
extends ayw_2<bCA> {
    public static final ayv_2 jCB = new ayv_2(new byt_1());

    public bCA dNo() {
        byr_0 byr_02;
        try {
            byr_02 = (byr_0)jCB.borrowObject();
            byr_0.a(byr_02, jCB);
        }
        catch (Exception exception) {
            byr_0.jCx.error((Object)"Erreur lors de l'extraction d'une CraftTable du pool", (Throwable)exception);
            byr_02 = new byr_0();
        }
        return byr_02;
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

