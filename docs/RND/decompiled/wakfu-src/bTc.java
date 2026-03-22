/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public class bTc
implements aeh_2 {
    private static final String lmE = "style";
    private static final String lmF = "effect";
    private static final String lmG = "enabled";
    private final fpb lmH;
    private final bJr lmI;
    private final boolean lmJ;

    public bTc(fpb fpb2, bJr bJr2) {
        this(fpb2, bJr2, true);
    }

    private bTc(fpb fpb2, bJr bJr2, boolean bl) {
        this.lmH = fpb2;
        this.lmI = bJr2;
        this.lmJ = bl;
    }

    @Override
    public String[] bxk() {
        return new String[]{lmE, lmF, lmG};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(lmF)) {
            return this.enm();
        }
        if (string.equals(lmG)) {
            return this.isEnabled();
        }
        if (string.equals(lmE)) {
            if (!this.lmJ) {
                return "";
            }
            if (this.lmH == fpb.sNo) {
                return "PassportMDCBadBuff";
            }
            if (this.lmH == fpb.sNp) {
                return "PassportMDCMediumBuff";
            }
            if (this.lmH == fpb.sNn || this.lmH == fpb.sNq) {
                return "PassportMDCGoodBuff";
            }
            return "PassportMDCBadBuff";
        }
        return null;
    }

    private boolean isEnabled() {
        return bTc.a(this.lmI, this.lmH);
    }

    private static boolean a(bJr bJr2, fpb fpb2) {
        if (bJr2 == null) {
            return true;
        }
        return fpb2 == bJr2.eaF();
    }

    private String enm() {
        return bTc.d(this.lmH);
    }

    static String d(fpb fpb2) {
        ahv_2 ahv_22 = new ahv_2();
        if (fpb2 == fpb.sNo) {
            ahv_22.c(aum_0.cWf().c("protector.buffs.unsatisfied", new Object[0]));
        } else if (fpb2 == fpb.sNp) {
            ahv_22.c(aum_0.cWf().c("protector.buffs.half.satisfied", new Object[0]));
        } else if (fpb2 == fpb.sNq) {
            ahv_22.c(aum_0.cWf().c("protector.buffs.satisfied", new Object[0]));
        }
        return ahv_22.ceL();
    }
}

