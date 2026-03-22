/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bFb
 */
public final class bfb_2
implements aeh_2 {
    public static final String jSM = "iconUrl";
    public static final String jSN = "selected";
    public static final String jSO = "enabled";
    public static final String[] jSP = new String[]{"iconUrl", "selected", "enabled"};
    final eNd jSQ;
    boolean bWn = false;
    final /* synthetic */ bez_0 jSR;

    public bfb_2(bez_0 bez_02, eNd eNd2) {
        this.jSR = bez_02;
        this.jSQ = eNd2;
    }

    public eNd dTh() {
        return this.jSQ;
    }

    public boolean bqr() {
        return this.bWn;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case jSM -> {
                exx_2 var4_4 = this.dTi();
                if (var4_4 == null) {
                    yield null;
                }
                yield biJ.imm.eu(var4_4.name());
            }
            case jSN -> this.bWn;
            case jSO -> this.isEnabled();
            default -> null;
        };
    }

    @Nullable
    private exx_2 dTi() {
        return switch (this.jSQ) {
            case eNd.qOZ -> exx_2.rGx;
            case eNd.qPa -> exx_2.rGy;
            case eNd.qPb -> exx_2.rGz;
            case eNd.qPc -> exx_2.rGA;
            default -> null;
        };
    }

    public boolean isEnabled() {
        return this.bWn || this.jSR.dTe() < this.jSR.jSJ;
    }

    public void setSelected(boolean bl) {
        this.bWn = bl;
        this.jSR.dTf();
    }

    @Override
    public String[] bxk() {
        return jSP;
    }
}

