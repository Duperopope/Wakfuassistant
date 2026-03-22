/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bog
implements aeh_2 {
    public static final bog iMI = new bog();
    public static final String iMJ = "currentDifficulty";
    public static final String iMK = "isAutoDownscaled";
    public static final String iML = "instanceName";
    public static final String iMM = "tooltipDifficulty";
    public static final String iMN = "tooltipDownscaling";
    public static final String iMO = "tooltipBonus";
    public static final String iMP = "gameplayIcon";
    public static final String[] iMQ = new String[]{"currentDifficulty", "isAutoDownscaled", "instanceName", "tooltipDifficulty", "tooltipDownscaling", "tooltipBonus", "gameplayIcon"};

    @Override
    public String[] bxk() {
        return iMQ;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(iMJ)) {
            return can_0.lHv.GN();
        }
        if (string.equals(iMK)) {
            return can_0.lHv.Fq() > 0;
        }
        if (string.equals(iML)) {
            Optional<eIb> optional = eId.quO.pC(can_0.lHv.bhh());
            int n = optional.map(eIb::d).orElse(-1);
            return aum_0.cWf().a(137, (long)n, new Object[0]);
        }
        if (string.equals(iMM)) {
            return bog.dAx();
        }
        if (string.equals(iMN)) {
            return bog.dAy();
        }
        if (string.equals(iMO)) {
            Optional<eIb> optional = eId.quO.pC(can_0.lHv.bhh());
            return optional.map(eIb2 -> {
                int n = can_0.lHv.GN();
                bgt_0 bgt_02 = bvz_0.dLl();
                int n2 = bgt_02 == null ? 0 : bgt_02.dpV().RE(eIb2.d());
                boolean bl = can_0.lHv.Fq() > 0 || eMQ.RD(eIb2.d());
                return aum_0.cWf().c(eIb2.cmY(), n, eIb2.dzH().aIi(), n2, bl ? 1 : 0);
            }).orElse(aum_0.cWf().c("error.unknown", new Object[0]));
        }
        if (string.equals(iMP)) {
            Optional<eIb> optional = eId.quO.pC(can_0.lHv.bhh());
            return bof.b(optional.get().dzH());
        }
        return null;
    }

    public static String dAw() {
        int n = can_0.lHv.GN();
        Optional<eIb> optional = eId.quO.pC(can_0.lHv.bhh());
        if (optional.isPresent()) {
            // empty if block
        }
        return aum_0.cWf().c("error.unknown", new Object[0]);
    }

    @NotNull
    public static String dAx() {
        int n = can_0.lHv.GN();
        eMU eMU2 = eMU.RH(n);
        String string = aum_0.cWf().c("stasis.dungeon.difficulty" + eMU2.fAO(), new Object[0]);
        return aum_0.cWf().c("stasis.dungeon.tooltip.difficulty", n, string);
    }

    public static String dAy() {
        int n = can_0.lHv.Fq();
        if (n > 0) {
            return aum_0.cWf().c("stasis.dungeon.tooltip.downscaled", n);
        }
        return aum_0.cWf().c("stasis.dungeon.tooltip.not.downscaled", new Object[0]);
    }

    public void dAz() {
        fse_1.gFu().a((aef_2)this, iMJ);
    }
}

