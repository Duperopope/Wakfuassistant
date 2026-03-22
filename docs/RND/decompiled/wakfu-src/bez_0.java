/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bEZ
 */
public class bez_0
implements aeh_2 {
    public static final String jSF = "hasVariableElements";
    public static final String jSG = "elements";
    public static final String jSH = "selectedCountText";
    public static final String[] jSI = new String[]{"hasVariableElements", "elements", "selectedCountText"};
    final int jSJ;
    private final List<bfb_2> jSK;

    private bez_0(int n) {
        this.jSJ = n;
        this.jSK = fgy_0.smw.stream().map(eNd2 -> new bfb_2(this, (eNd)eNd2)).toList();
    }

    public static bez_0 c(@NotNull ffV ffV2, int n) {
        int n2;
        HashSet<eNd> hashSet;
        bez_0 bez_02 = new bez_0(bez_0.d(ffV2, n));
        int n3 = bez_02.jSJ;
        if (ffV2.eAX() != null && ffV2.eAX().Vi(n) != null) {
            hashSet = ffV2.eAX().Vi(n);
        } else {
            n2 = n == enf_0.qPQ.d() ? 1 : 0;
            hashSet = fgy_0.gp(ctj_2.ePr().f(n2 != 0, n3));
        }
        n2 = 0;
        for (bfb_2 bfb_22 : bez_02.jSK) {
            if (n2 == n3) break;
            if (!hashSet.contains(bfb_22.jSQ)) continue;
            bfb_22.bWn = true;
            ++n2;
        }
        return bez_02;
    }

    public static int d(@NotNull ffV ffV2, int n) {
        for (enk_0 enk_02 : ffV2.dOg().bcx()) {
            if (enk_02.avZ() != n) continue;
            return (int)enk_02.Rz(1);
        }
        return 0;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{jSF, jSG, jSH}, (Object)string2, n)) {
            case 0 -> this.jSJ > 0;
            case 1 -> this.jSK;
            case 2 -> "(" + this.dTe() + "/" + this.jSJ + ")";
            default -> null;
        };
    }

    int dTe() {
        int n = 0;
        for (bfb_2 bfb_22 : this.jSK) {
            if (!bfb_22.bWn) continue;
            ++n;
        }
        return n;
    }

    public boolean dRp() {
        return this.dTe() == this.jSJ;
    }

    public int bxW() {
        return this.jSJ;
    }

    void dTf() {
        fse_1.gFu().aT("chooseItemElements", "canValidateElements");
        fse_1.gFu().a((aef_2)this, jSH);
        for (bfb_2 bfb_22 : this.jSK) {
            fse_1.gFu().a((aef_2)bfb_22, "enabled", "selected");
        }
    }

    public byte dTg() {
        if (this.jSJ == 0) {
            return 0;
        }
        return fgy_0.P(this.jSK.stream().filter(bfb_2::bqr).map(bfb_2::dTh).collect(Collectors.toSet()));
    }

    @Override
    public String[] bxk() {
        return jSI;
    }
}

