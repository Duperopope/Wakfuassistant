/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Objects;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bnx
 */
public class bnx_2
implements aeh_2,
ffc_2 {
    public static final String iIw = "recipe";
    public static final String iIx = "recipeName";
    public static final String iIy = "recipeLevel";
    public static final String iIz = "resultItemIconUrl";
    public static final String iIA = "resultItemRarityIconUrl";
    public static final String iIB = "craftName";
    public static final String iIC = "fee";
    public static final String iID = "stepFee";
    public static final String[] iIE = new String[]{"recipe", "recipeName", "recipeLevel", "resultItemIconUrl", "resultItemRarityIconUrl", "craftName", "fee", "stepFee"};
    @NotNull
    private final eKR iIF;
    @Nullable
    private Integer iIG;
    private int iIH;

    public bnx_2(@NotNull eKR eKR2, @Nullable Integer n, int n2) {
        this.iIF = eKR2;
        this.iIG = n;
        this.iIH = n2;
    }

    @Override
    public String[] bxk() {
        return iIE;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "recipe": {
                return this.iIF;
            }
            case "recipeName": {
                return this.dzh();
            }
            case "recipeLevel": {
                return this.dzj();
            }
            case "resultItemIconUrl": {
                return auc_0.cVq().a("itemsIconsPath", "defaultIconPath", this.dzg().aVt());
            }
            case "resultItemRarityIconUrl": {
                return this.dwg().aKJ();
            }
            case "craftName": {
                return this.dzk();
            }
            case "fee": {
                return this.iIG;
            }
            case "stepFee": {
                return this.iIH;
            }
        }
        return null;
    }

    @NotNull
    public fhc_0 dzg() {
        int n = this.iIF.fyZ().azv();
        return fgD.fXh().Vd(n);
    }

    @NotNull
    public fgj dwg() {
        return this.dzg().dwg();
    }

    @NotNull
    public String dzh() {
        return aum_0.cWf().a(15, (long)this.dzg().d(), new Object[0]);
    }

    @NotNull
    public String dzi() {
        return aum_0.cWf().b(15, (long)this.dzg().d(), new Object[0]);
    }

    public short dzj() {
        return this.dxR().dxy();
    }

    @NotNull
    public String dzk() {
        return aum_0.cWf().a(43, (long)this.iIF.cms(), new Object[0]);
    }

    @NotNull
    public String dzl() {
        return aum_0.cWf().b(43, (long)this.iIF.cms(), new Object[0]);
    }

    public boolean a(@Nullable Integer n, int n2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        if (!Objects.equals(n, this.iIG)) {
            this.iIG = n;
            arrayList.add(iIC);
        }
        if (!Objects.equals(n2, this.iIH)) {
            this.iIH = n2;
            arrayList.add(iID);
        }
        if (!arrayList.isEmpty()) {
            fse_1.gFu().a((aef_2)this, arrayList);
            return true;
        }
        return false;
    }

    @Override
    public String cUG() {
        return this.dzi() + this.dzl() + this.dzj();
    }

    @NotNull
    @Generated
    public eKR dxR() {
        return this.iIF;
    }

    @Nullable
    @Generated
    public Integer dzm() {
        return this.iIG;
    }

    @Generated
    public int dzn() {
        return this.iIH;
    }
}

