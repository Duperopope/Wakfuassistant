/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from byT
 */
public class byt_0
extends ayw_2<bCA> {
    private static final ayv_2 jDf = new ayv_2(new byu_1());

    public bCA dNo() {
        byr_1 byr_12;
        try {
            byr_12 = (byr_1)jDf.borrowObject();
            byr_1.a(byr_12, jDf);
        }
        catch (Exception exception) {
            byr_1.jDd.error((Object)"Erreur lors de l'extraction d'un DimensionalBagExitTrigger du pool", (Throwable)exception);
            byr_12 = new byr_1();
        }
        return byr_12;
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

