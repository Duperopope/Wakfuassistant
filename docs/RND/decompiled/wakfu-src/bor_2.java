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

/*
 * Renamed from bOr
 */
public class bor_2
implements aeh_2,
ffc_2 {
    public static final String kKJ = "title";
    public static final String kKK = "guideElements";
    public static final String kKL = "icon";
    public static final String kKM = "illustration";
    public static final String kKN = "description";
    public static final String kKO = "pageNumber";
    public static final String kKP = "hasPreviousPage";
    public static final String kKQ = "hasNextPage";
    public static final String kKR = "unread";
    public static final String kKS = "selected";
    public static final String kKT = "adminGuideInfo";
    public static final String kKU = "hasManyPages";
    public static final String[] kKV = new String[]{"title", "guideElements", "illustration", "description", "pageNumber", "hasPreviousPage", "hasNextPage", "unread", "selected", "adminGuideInfo", "hasManyPages"};
    public static final String[] kKW = new String[]{"illustration", "description", "pageNumber", "hasPreviousPage", "hasNextPage"};
    private final bom_2 kKX;
    private int hQx;
    private boolean kKY;
    private boolean bWn;

    public bor_2(@NotNull bom_2 bom_22) {
        this.kKX = bom_22;
        this.hQx = 0;
    }

    @Override
    public String[] bxk() {
        return kKV;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "title": {
                return this.bAD();
            }
            case "illustration": {
                String string2 = this.kKX.egL().get(this.hQx).cod();
                return BH.aU(string2) ? null : auc_0.cVq().kE(string2);
            }
            case "icon": {
                Optional<bon_2> optional = bop_2.egN().Ix(this.kKX.cjd());
                return optional.filter(bon_22 -> bon_22.bnd() > 0).map(bon_22 -> auc_0.cVq().zR(bon_22.bnd())).orElse(null);
            }
            case "description": {
                return aum_0.cWf().a(156, (long)this.kKX.egL().get(this.hQx).d(), new Object[0]);
            }
            case "pageNumber": {
                return this.hQx + 1 + " / " + this.kKX.egL().size();
            }
            case "hasPreviousPage": {
                return this.ecL();
            }
            case "hasNextPage": {
                return this.ecM();
            }
            case "unread": {
                return this.kKY;
            }
            case "selected": {
                return this.bWn;
            }
            case "hasManyPages": {
                return this.kKX.egL().size() > 1;
            }
            case "adminGuideInfo": {
                return "Admin :\nGuide id=" + this.kKX.d() + "\nCategory id=" + this.kKX.cjd() + " (" + aum_0.cWf().a(154, (long)this.kKX.cjd(), new Object[0]) + ")";
            }
        }
        return null;
    }

    public boolean ecM() {
        return this.hQx < this.kKX.egL().size() - 1;
    }

    public boolean ecL() {
        return this.hQx > 0;
    }

    public void ik(boolean bl) {
        this.kKY = bl;
        fse_1.gFu().a((aef_2)this, kKR);
    }

    public boolean egS() {
        return this.kKY;
    }

    public void setSelected(boolean bl) {
        this.bWn = bl;
        fse_1.gFu().a((aef_2)this, kKS);
    }

    public boolean bqr() {
        return this.bWn;
    }

    public void dxp() {
        if (this.hQx >= this.kKX.egL().size()) {
            return;
        }
        ++this.hQx;
        fse_1.gFu().a((aef_2)this, kKW);
    }

    public void dxo() {
        if (this.hQx <= 0) {
            return;
        }
        --this.hQx;
        fse_1.gFu().a((aef_2)this, kKW);
    }

    @NotNull
    private String bAD() {
        return aum_0.cWf().a(155, (long)this.kKX.d(), new Object[0]);
    }

    public int wp() {
        return this.kKX.wp();
    }

    public int d() {
        return this.kKX.d();
    }

    public int cjd() {
        return this.kKX.cjd();
    }

    @Override
    public String cUG() {
        return aum_0.cWf().b(155, (long)this.kKX.d(), new Object[0]);
    }
}

