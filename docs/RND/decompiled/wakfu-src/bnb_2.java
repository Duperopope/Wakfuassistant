/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bnb
 */
public class bnb_2
implements aeh_2 {
    public static final String iFK = "currentRecipesPage";
    public static final String iFL = "currentPageText";
    public static final String iFM = "onlyIngredientsOk";
    public static final String iFN = "nameFilter";
    public static final String iFO = "minLevelFilter";
    public static final String iFP = "maxLevelFilter";
    public static final String iFQ = "currentCraft";
    public static final int iFR = 7;
    private final bnc_2 iFS;
    private List<bmv_1> iFT = new ArrayList<bmv_1>();
    private int iBx;
    boolean iFU = false;
    String hVA = "";
    int iFV = 0;
    int iFW = 200;
    public static final String[] iFX = new String[]{"currentRecipesPage", "currentPageText", "onlyIngredientsOk", "nameFilter", "minLevelFilter", "maxLevelFilter", "currentCraft"};

    public bnb_2(int n) {
        this.Es(n);
        this.iFS = new bnc_2(this, 7);
    }

    @Override
    public String[] bxk() {
        return iFX;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (Strings.isNullOrEmpty((String)string)) {
            return null;
        }
        switch (string) {
            case "currentRecipesPage": {
                return this.iFS == null ? null : this.iFS.dxV();
            }
            case "currentPageText": {
                return this.iFS == null ? "" : this.iFS.dfB();
            }
            case "onlyIngredientsOk": {
                return this.iFU;
            }
            case "nameFilter": {
                return this.hVA;
            }
            case "minLevelFilter": {
                return this.iFV;
            }
            case "maxLevelFilter": {
                return this.iFW;
            }
            case "currentCraft": {
                return this.dxS();
            }
        }
        return null;
    }

    private bms_1 dxS() {
        return aue_0.cVJ().cVK().dnZ().Eg(this.iBx);
    }

    public void Eq(int n) {
        this.iFV = n;
        this.BH(0);
    }

    public void Er(int n) {
        this.iFW = n;
        this.BH(0);
    }

    public void dxT() {
        this.iFU = !this.iFU;
        this.BH(0);
    }

    public void ke(String string) {
        this.hVA = string;
        this.BH(0);
    }

    public void Es(int n) {
        if (this.iBx == n) {
            return;
        }
        this.BH(0);
        this.iBx = n;
        this.iFT.clear();
        this.dxU();
        fse_1.gFu().a((aef_2)this, iFK, iFL, iFQ);
    }

    private void dxU() {
        List<eKR> list = bmr_1.iEC.Eo(this.iBx);
        bgt_0 bgt_02 = aue_0.cVJ().cVK();
        bmf_2 bmf_22 = new bmf_2(this.iBx, bgt_02.Xi(), bgt_02.dpK());
        for (eKR eKR2 : list) {
            bmv_1 bmv_12 = new bmv_1(eKR2, bmf_22);
            bmv_12.gD(bgt_02.b(eKR2));
            this.iFT.add(bmv_12);
        }
    }

    public static boolean a(bgt_0 bgt_02, bmv_1 bmv_12) {
        return bgt_02.b(bmv_12.dxA());
    }

    List<bmv_1> dxV() {
        if (this.iFT != null) {
            return this.iFT;
        }
        this.iFT = new ArrayList<bmv_1>();
        this.dxU();
        return this.iFT;
    }

    public int dfz() {
        if (this.iFS == null) {
            return 1;
        }
        return this.iFS.dfz();
    }

    public int dxd() {
        if (this.iFS == null) {
            return 1;
        }
        return this.iFS.dfC();
    }

    public void BH(int n) {
        if (this.iFS == null) {
            return;
        }
        this.iFS.BH(n);
    }
}

