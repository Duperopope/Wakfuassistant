/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bIS
 */
public class bis_1
implements aeh_2 {
    private static final String kik = "bossState";
    private static final String kil = "hoveredBoss";
    private static final String kim = "hoveredBossState";
    private static final String kin = "bossName";
    private static final String kio = "experienceMultiplier";
    private static final String kip = "\\.";
    private static final String kiq = ".";
    private static final String[] kir = new String[27];
    private int kis = 0;

    @Override
    public String[] bxk() {
        return kir;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.contains(kik)) {
            String[] stringArray = string.split(kip);
            String string2 = stringArray[1];
            int n = Integer.parseInt(string2);
            return bis_1.Hd(n);
        }
        if (string.equals(kio)) {
            bgt_0 bgt_02 = aue_0.cVJ().cVK();
            bMn bMn2 = bgt_02.Da(9120);
            if (bMn2 == null) {
                return aum_0.cWf().c("neo.experience.multiplier", 0);
            }
            List<Integer> list = bMn2.eez();
            if (list == null || list.isEmpty()) {
                return aum_0.cWf().c("neo.experience.multiplier", 0);
            }
            return aum_0.cWf().c("neo.experience.multiplier", list.getFirst());
        }
        if (string.contains(kin)) {
            String[] stringArray = string.split(kip);
            String string3 = stringArray[1];
            int n = Integer.parseInt(string3);
            return bjz_1.Dm(n);
        }
        if (string.equals(kil)) {
            return this.kis;
        }
        if (string.equals(kim)) {
            return bis_1.Hd(this.kis);
        }
        return null;
    }

    private static int Hd(int n) {
        czz_1 czz_12 = czy_1.obk.get(n);
        if (czz_12 == null) {
            return 0;
        }
        if (exu_1.rJd.b(exp_1.rIH) >= czz_12.eZn()) {
            if (aue_0.cVJ().cVK().dpy().oe(czz_12.eZr())) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    private static String mR(String string) {
        return "bossState." + string;
    }

    private static String mS(String string) {
        return "bossName." + string;
    }

    public void He(int n) {
        this.kis = n;
        fse_1.gFu().a((aef_2)this, kil, kim);
    }

    public void dZu() {
        fse_1.gFu().a((aef_2)this, kir);
    }

    static {
        int n = 0;
        for (Integer n2 : czy_1.obk.keySet()) {
            bis_1.kir[n] = bis_1.mR(n2.toString());
            bis_1.kir[++n] = bis_1.mS(n2.toString());
            ++n;
        }
        bis_1.kir[n] = kio;
    }
}

