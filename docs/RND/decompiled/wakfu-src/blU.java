/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class blU
implements aeh_2 {
    public static final String ixG = "defaultName";
    public static final String ixH = "actionText";
    public static final String ixI = "displayIcons";
    public static final String ixJ = "icons";
    public static final String ixK = "selectedIcon";
    public static final String[] ixL = new String[]{"defaultName", "actionText", "displayIcons", "icons", "selectedIcon"};
    private final blV ixM;
    private final String ixN;
    private final List<blW> ixO = new ArrayList<blW>();
    @Nullable
    private blW ixP;

    private blU(blV blV2, String string) {
        this.ixM = blV2;
        this.ixN = string;
    }

    private void q(Collection<bmi> collection) {
        this.ixO.clear();
        for (bmi bmi2 : collection) {
            aeh_2 aeh_22;
            int n;
            if (!bmi2.aaz() || !bjf_1.l(bmi2.duf())) continue;
            if (bmi2.duf() == fm_1.pA) {
                n = 4729667;
            } else {
                aeh_22 = bmi2.duo();
                n = ctb_2.eQw().aWO() == 1 ? aeh_22.cpf() : aeh_22.aVt();
            }
            aeh_22 = new blW(bmi2.duf(), n);
            this.ixO.add((blW)aeh_22);
            if (!bmi2.dvI()) continue;
            this.ixP = aeh_22;
        }
    }

    @NotNull
    public static String DL(int n) {
        return aum_0.cWf().c("cosmetic.preset.new.preset.name", n + 1);
    }

    public static blU DM(int n) {
        String string = blU.DL(n);
        return new blU(blV.ixQ, string);
    }

    public static blU a(bmk bmk2) {
        blU blU2 = new blU(blV.ixR, bmk2.getName());
        blU2.q(bmk2.dvP());
        return blU2;
    }

    public static blU b(bmk bmk2) {
        blU blU2 = new blU(blV.ixS, bmk2.getName());
        blU2.q(bmk2.dvP());
        return blU2;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "defaultName": {
                return this.ixN;
            }
            case "actionText": {
                return aum_0.cWf().c(this.ixM.ixU, new Object[0]);
            }
            case "displayIcons": {
                return this.ixM.ixV;
            }
            case "icons": {
                return this.ixO;
            }
            case "selectedIcon": {
                return this.ixP;
            }
        }
        return null;
    }

    public short duT() {
        return this.ixM.ixT;
    }

    @Nullable
    public blW duU() {
        return this.ixP;
    }

    public void a(blW blW2) {
        this.ixP = blW2;
        fse_1.gFu().a((aef_2)this, ixK);
    }

    @Override
    public String[] bxk() {
        return ixL;
    }
}

