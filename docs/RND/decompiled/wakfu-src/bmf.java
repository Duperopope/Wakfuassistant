/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class bmf
implements aeh_2 {
    public static final String iyK = "iconUrl";
    public static final String iyL = "name";
    public static final String iyM = "canHaveColorationsOrAccessories";
    public static final String iyN = "canHaveColorations";
    public static final String iyO = "canHaveAccessories";
    public static final String iyP = "colorations";
    public static final String iyQ = "accessories";
    public static final String iyR = "selectedColoration";
    public static final String iyS = "selectedAccessory";
    public static final String[] iyT = new String[]{"iconUrl", "name", "canHaveColorationsOrAccessories", "canHaveColorations", "canHaveAccessories", "colorations", "accessories"};
    @NotNull
    private final ekp_0 iyU;
    @NotNull
    private final List<ffV> iyV;
    @NotNull
    private final List<ffV> iyW;
    private final int iyX;

    public bmf(@NotNull ekp_0 ekp_02) {
        this.iyU = ekp_02;
        fov_0 fov_02 = this.dvo();
        this.iyV = fov_02 != null ? fgD.Q(bjn_0.a(fov_02)) : List.of();
        this.iyW = fov_02 != null ? fgD.Q(fov_02.gfB()) : List.of();
        this.iyX = ekp_02.fxV().orElse(fov_02 != null ? fov_02.gfD() : 0);
    }

    @Nullable
    private fov_0 dvo() {
        foA foA2 = foC.sLW.aF(this.iyU.AK());
        if (foA2 == null) {
            return null;
        }
        return foy_0.sLJ.XQ(foA2.ctm());
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "iconUrl": {
                return auc_0.cVq().a((fjm)ctb_2.eQw(), this.iyU.AK());
            }
            case "name": {
                return bgv_2.Dm(this.iyU.AK());
            }
            case "canHaveColorationsOrAccessories": {
                return this.dvp() || this.dvq();
            }
            case "canHaveColorations": {
                return this.dvp();
            }
            case "canHaveAccessories": {
                return this.dvq();
            }
            case "colorations": {
                return this.iyV;
            }
            case "accessories": {
                ArrayList<aef_2> arrayList = new ArrayList<aef_2>(1 + this.iyW.size());
                arrayList.add(bmg.iyZ);
                arrayList.addAll(this.iyW);
                return arrayList;
            }
            case "selectedColoration": {
                return this.DR(this.iyX);
            }
            case "selectedAccessory": {
                Optional<Integer> optional = this.iyU.fxW();
                if (optional.isEmpty()) {
                    return bmg.iyZ;
                }
                for (ffV ffV2 : this.iyW) {
                    if (ffV2.avr() != optional.get().intValue()) continue;
                    return ffV2;
                }
                return bmg.iyZ;
            }
        }
        return null;
    }

    @Nullable
    private ffV DR(int n) {
        for (ffV ffV2 : this.iyV) {
            if (ffV2.avr() != n) continue;
            return ffV2;
        }
        return null;
    }

    public boolean dvp() {
        return this.iyV.size() > 1;
    }

    public boolean dvq() {
        return !this.iyW.isEmpty();
    }

    @Override
    public String[] bxk() {
        return iyT;
    }
}

