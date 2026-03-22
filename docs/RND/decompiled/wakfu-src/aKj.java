/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public final class aKj
extends Enum<aKj>
implements aeh_2 {
    public static final /* enum */ aKj edv = new aKj(0, null, null);
    public static final /* enum */ aKj edw = new aKj(1, new aKc(new fhl_2(ett_1.onO), new fhl_2(ett_1.onP), new fhl_2(ett_1.onQ), new fhl_2(ett_1.onN), new fhl_2(ett_1.onI), new fhl_2(ett_1.onJ)), new aKk(bsn_1.ljf, bsn_1.lje));
    public static final /* enum */ aKj edx = new aKj(2, new aKc(new fhl_2(ett_1.onK), new fhl_2(ett_1.onL), new fhl_2(ett_1.onM), new fhl_2(ett_1.onH), new fhl_2(ett_1.onI), new fhl_2(ett_1.onJ)), new aKk(bsn_1.ljh, bsn_1.ljg));
    public static final String edy = "id";
    public static final String edz = "name";
    public static final String edA = "description";
    public static final String[] edB;
    private final byte edC;
    private final aKc edD;
    private final aKk edE;
    private static final /* synthetic */ aKj[] edF;

    public static aKj[] values() {
        return (aKj[])edF.clone();
    }

    public static aKj valueOf(String string) {
        return Enum.valueOf(aKj.class, string);
    }

    private aKj(byte by, aKc aKc2, aKk aKk2) {
        this.edC = by;
        this.edD = aKc2;
        this.edE = aKk2;
    }

    public byte aJr() {
        return this.edC;
    }

    public aKc ciz() {
        return this.edD;
    }

    public aKk ciA() {
        return this.edE;
    }

    public static aKj aP(byte by) {
        for (aKj aKj2 : aKj.values()) {
            if (aKj2.edC != by) continue;
            return aKj2;
        }
        return null;
    }

    public aKj ciB() {
        aKj[] aKjArray = aKj.values();
        return aKjArray[(this.ordinal() + 1) % aKjArray.length];
    }

    @Override
    public String[] bxk() {
        return edB;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "id": {
                return this.edC;
            }
            case "name": {
                return aum_0.cWf().c("tacticalView.mode." + this.edC, new Object[0]);
            }
            case "description": {
                amc_1 amc_12 = aUm.cUI().fb("switchTacticalView");
                return aum_0.cWf().c(aua_0.hhw + this.edC, amc_12 != null ? new aUl(amc_12).cUy() : "Unknown shortcut");
            }
        }
        return null;
    }

    private static /* synthetic */ aKj[] ciC() {
        return new aKj[]{edv, edw, edx};
    }

    static {
        edF = aKj.ciC();
        edB = new String[]{edy, edz, edA};
    }
}

