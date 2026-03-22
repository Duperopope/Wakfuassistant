/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class aPa
extends Enum<aPa>
implements aPP {
    public static final /* enum */ aPa evq = new aPa("local");
    public static final /* enum */ aPa evr = new aPa("whisp");
    public static final /* enum */ aPa evs = new aPa("party");
    public static final /* enum */ aPa evt = new aPa("guild");
    public static final /* enum */ aPa evu = new aPa("trade");
    public static final /* enum */ aPa evv = new aPa("battleground");
    public static final /* enum */ aPa evw = new aPa("intergame");
    public static final /* enum */ aPa evx = new aPa("politic");
    public static final /* enum */ aPa evy = new aPa("public politic", "(" + aum_0.cWf().c("publicChannel", new Object[0]) + ")");
    public static final /* enum */ aPa evz = new aPa("admin");
    public static final /* enum */ aPa evA = new aPa("defaultCommunity");
    public static final /* enum */ aPa evB = new aPa("frCommunity", Mv.aVk);
    public static final /* enum */ aPa evC = new aPa("enCommunity", Mv.aVl);
    public static final /* enum */ aPa evD = new aPa("esCommunity", Mv.aVm);
    public static final /* enum */ aPa evE = new aPa("ptCommunity", Mv.aVn);
    public static final /* enum */ aPa evF = new aPa("defaultRecruitment");
    public static final /* enum */ aPa evG = new aPa("frRecruitment", Mv.aVk);
    public static final /* enum */ aPa evH = new aPa("enRecruitment", Mv.aVl);
    public static final /* enum */ aPa evI = new aPa("esRecruitment", Mv.aVm);
    public static final /* enum */ aPa evJ = new aPa("ptRecruitment", Mv.aVn);
    public static final List<aPa> evK;
    public static final List<aPa> evL;
    private final String evM;
    private final String evN;
    private final Mv evO;
    private static final /* synthetic */ aPa[] evP;

    public static aPa[] values() {
        return (aPa[])evP.clone();
    }

    public static aPa valueOf(String string) {
        return Enum.valueOf(aPa.class, string);
    }

    private aPa(String string2) {
        this(string2, null, null);
    }

    private aPa(String string2, String string3) {
        this(string2, string3, null);
    }

    private aPa(String string2, Mv mv) {
        this(string2, null, mv);
    }

    private aPa(String string2, String string3, Mv mv) {
        this.evN = string2;
        this.evM = string3;
        this.evO = mv;
    }

    @Override
    public String cyQ() {
        return this.evM;
    }

    @Override
    public String cyR() {
        return this.evN;
    }

    @Override
    public Mv aUXX() {
        return this.evO;
    }

    @Override
    public boolean cyS() {
        return this == evx || this == evy;
    }

    public static aPa iD(String string) {
        for (aPa aPa2 : aPa.values()) {
            if (!aPa2.evN.equals(string)) continue;
            return aPa2;
        }
        return null;
    }

    @Nullable
    public static aPa g(Mv mv) {
        for (aPa aPa2 : evK) {
            if (aPa2.evO != mv) continue;
            return aPa2;
        }
        return null;
    }

    @Nullable
    public static aPa h(Mv mv) {
        for (aPa aPa2 : evL) {
            if (aPa2.evO != mv) continue;
            return aPa2;
        }
        return null;
    }

    private static /* synthetic */ aPa[] cyT() {
        return new aPa[]{evq, evr, evs, evt, evu, evv, evw, evx, evy, evz, evA, evB, evC, evD, evE, evF, evG, evH, evI, evJ};
    }

    static {
        evP = aPa.cyT();
        evK = List.of(evB, evC, evD, evE);
        evL = List.of(evG, evH, evI, evJ);
    }
}

