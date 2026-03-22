/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Comparator;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from beR
 */
public class ber_2
implements aeh_2 {
    public static final String hOp = "name";
    public static final String hOq = "remainingPoints";
    public static final String hOr = "nextLevelGain";
    public static final String hOs = "aptitudesList";
    public static final String hOt = "icon";
    public static final String hOu = "tagRoundStyle";
    public static final String hOv = "categoryIconStyle";
    private static final String[] hOw = new String[]{"name", "remainingPoints", "nextLevelGain", "aptitudesList", "icon"};
    public static final Comparator<ber_2> hOx = Comparator.comparingInt(ber_2::deV);
    private final ehx_0 hOy;
    private final ehy_0 hOz;
    private final ArrayList<bes_2> hOA = new ArrayList();

    public ber_2(ehx_0 ehx_02, ehy_0 ehy_02) {
        this.hOy = ehx_02;
        this.hOz = ehy_02;
        for (bep_2 bep_22 : this.hOy.fvZ()) {
            this.hOA.add(new bes_2(ehy_02, this, bep_22));
        }
        this.hOA.sort(bes_2.hOK);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "name": {
                return aum_0.cWf().a(147, (long)this.hOy.d(), new Object[0]);
            }
            case "remainingPoints": {
                return this.deT();
            }
            case "aptitudesList": {
                return this.hOA;
            }
            case "nextLevelGain": {
                short s = aue_0.cVJ().cVK().cmL();
                int n = this.hOy.dx(s);
                if (n == -1) {
                    return null;
                }
                return aum_0.cWf().c("aptitude.nextLevelActivation", n);
            }
            case "icon": {
                return null;
            }
            case "tagRoundStyle": {
                int n = this.deT();
                if (n > 0) {
                    return "tagRoundEnabled";
                }
                if (n == 0) {
                    return "tagRoundDisabled";
                }
                return "tagRoundNegative";
            }
            case "categoryIconStyle": {
                return "Aptitude" + this.hOy.d();
            }
        }
        return null;
    }

    public int deT() {
        return this.hOz.s(this.hOy.d(), cvu_2.eUq());
    }

    public boolean deU() {
        for (bes_2 bes_22 : this.hOA) {
            if (bes_22.cmL() <= 0) continue;
            return true;
        }
        return false;
    }

    public int d() {
        return this.hOy.d();
    }

    private int deV() {
        return this.hOy.deV();
    }

    public void deW() {
        for (bes_2 bes_22 : this.hOA) {
            bes_22.dfc();
        }
        fse_1.gFu().a((aef_2)this, hOq, hOu);
    }

    @Override
    public String[] bxk() {
        return hOw;
    }
}

