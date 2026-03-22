/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bnk
 */
public class bnk_1
implements aeh_2 {
    public static final String iGY = "levelText";
    public static final String iGZ = "equipmentCraftFee";
    public static final String iHa = "componentCraftFee";
    public static final String iHb = "feeHasFallThrough";
    public static final String iHc = "userDefined";
    private final ekb_0 iHd;
    private int iHe;
    private int iHf;
    private boolean iHg;
    private boolean iHh;
    public static final String[] iHi = new String[]{"levelText", "equipmentCraftFee", "componentCraftFee", "feeHasFallThrough", "userDefined"};

    @Override
    public String[] bxk() {
        return iHi;
    }

    public bnk_1(ekb_0 ekb_02, ekd_0 ekd_02, boolean bl, boolean bl2) {
        this.iHd = ekb_02;
        this.iHe = ekd_02 != null ? ekd_02.fyF() : 0;
        this.iHf = ekd_02 != null ? ekd_02.fyG() : 0;
        this.iHg = bl;
        this.iHh = bl2;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "levelText": {
                return aum_0.cWf().c("craftFee.recipeLevel.level", this.iHd.aVf(), this.iHd.aVe());
            }
            case "equipmentCraftFee": {
                return this.iHe;
            }
            case "componentCraftFee": {
                return this.iHf;
            }
            case "feeHasFallThrough": {
                return this.iHg;
            }
            case "userDefined": {
                return this.iHh;
            }
        }
        return null;
    }

    public ekb_0 dyn() {
        return this.iHd;
    }

    public boolean a(@Nullable ekd_0 ekd_02, boolean bl, boolean bl2) {
        int n;
        int n2;
        ArrayList<String> arrayList = new ArrayList<String>();
        int n3 = n2 = ekd_02 != null ? ekd_02.fyF() : 0;
        if (n2 != this.iHe) {
            this.iHe = n2;
            arrayList.add(iGZ);
        }
        int n4 = n = ekd_02 != null ? ekd_02.fyG() : 0;
        if (n != this.iHf) {
            this.iHf = n;
            arrayList.add(iHa);
        }
        if (bl2 != this.iHh) {
            this.iHh = bl2;
            arrayList.add(iHc);
        }
        if (bl != this.iHg) {
            this.iHg = bl;
            arrayList.add(iHb);
        }
        if (!arrayList.isEmpty()) {
            fse_1.gFu().a((aef_2)this, arrayList);
            return true;
        }
        return false;
    }
}

