/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

final class bsY
extends Enum<bsY> {
    public static final /* enum */ bsY jjY = new bsY(ett_1.opf);
    public static final /* enum */ bsY jjZ = new bsY(ett_1.opH);
    public static final /* enum */ bsY jka = new bsY(ett_1.opI);
    final axb_2 jkb;
    private static final /* synthetic */ bsY[] jkc;

    public static bsY[] values() {
        return (bsY[])jkc.clone();
    }

    public static bsY valueOf(String string) {
        return Enum.valueOf(bsY.class, string);
    }

    private bsY(ett_1 ett_12) {
        this.jkb = new fhl_2(ett_12);
    }

    @Generated
    private bsY(axb_2 axb_22) {
        this.jkb = axb_22;
    }

    private static /* synthetic */ bsY[] dHp() {
        return new bsY[]{jjY, jjZ, jka};
    }

    static {
        jkc = bsY.dHp();
    }
}

