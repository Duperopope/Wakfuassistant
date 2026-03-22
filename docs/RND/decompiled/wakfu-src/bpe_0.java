/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collections;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bpe
 */
public class bpe_0
implements aeh_2 {
    public static final String iUp = "name";
    public static final String iUq = "iconUrl";
    public static final String iUr = "quantity";
    public static final String iUs = "isBasic";
    public static final String iUt = "themeItemBorderStyle";
    public static final String iUu = "themeItemHoverBorderStyle";
    public static final String iUv = "slotColors";
    public static final String iUw = "nameStyle";
    public static final String[] iUx = new String[]{"name", "iconUrl", "quantity", "isBasic", "themeItemBorderStyle", "themeItemHoverBorderStyle", "slotColors", "nameStyle"};
    private final int iUy;
    private final int iUz;
    private final fgj iUA;
    @NotNull
    private final fhp_0 iUB;
    private final int iUC;
    private int ejM;

    public bpe_0(int n) {
        this.iUy = n;
        bgv_2 bgv_22 = (bgv_2)bEm.dSb().Vd(this.iUy);
        if (bgv_22 == null || bgv_22.dCC() == null) {
            throw new IllegalArgumentException("Cannot create a sublimation item from id not corresponding to sublimation: " + n);
        }
        this.iUz = aue_0.cVJ().cVK().aWO() == 1 ? bgv_22.cpf() : bgv_22.aVt();
        this.iUA = bgv_22.dwg();
        this.iUB = bgv_22.dCC();
        this.iUC = bpe_0.c(bgv_22);
        this.ejM = 0;
    }

    public bpe_0(@NotNull ffV ffV2) {
        this.iUy = ffV2.acs();
        if (ffV2.dCC() == null) {
            throw new IllegalArgumentException("Cannot create a sublimation item from an item without a sublimation definition: " + String.valueOf(ffV2));
        }
        this.iUz = aue_0.cVJ().cVK().aWO() == 1 ? ffV2.cpf() : ffV2.aVt();
        this.iUA = ffV2.dwg();
        this.iUB = ffV2.dCC();
        this.iUC = bpe_0.c(ffV2.dOg());
        this.ejM = ffV2.bfd();
    }

    private static int c(fhc_0 fhc_02) {
        if (!(fhc_02 instanceof bgv_2)) {
            return 0;
        }
        bgv_2 bgv_22 = (bgv_2)fhc_02;
        if (bgv_22.bcx().aVo() == 0) {
            return 0;
        }
        return (int)bgv_22.bcx().vK(0).Rz(1);
    }

    public int dCA() {
        return this.iUy;
    }

    public fgj dCB() {
        return this.iUA;
    }

    public int oP() {
        return this.ejM;
    }

    @NotNull
    public fhp_0 dCC() {
        return this.iUB;
    }

    public int dCD() {
        return this.iUC;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case iUp -> this.getName();
            case iUq -> auc_0.cVq().zx(this.iUz);
            case iUr -> this.ejM;
            case iUs -> this.iUB.dCF() == fhr_0.sqz;
            case iUt -> this.iUA.fWN();
            case iUu -> this.iUA.fWO();
            case iUv -> {
                rd_0[] var4_4 = this.iUB.fZe();
                if (var4_4 == null) {
                    yield Collections.emptyList();
                }
                yield bES.a(var4_4);
            }
            case iUw -> {
                boolean var5_6;
                if (this.ejM == 0) {
                    yield "wipFadedGray14";
                }
                ffV var4_5 = cui_1.eRw().dBU();
                boolean v1 = var5_6 = var4_5 != null && var4_5.dXg();
                if (!var5_6) {
                    yield "wipLight14";
                }
                if (this.iUB.dCF() == fhr_0.sqz) {
                    if (var4_5.eAZ().ahy() == this.iUy) {
                        yield "wipGoldBold14";
                    }
                    if (fhk_0.a(var4_5.eAZ(), this.iUB)) {
                        yield "wipGold14";
                    }
                } else if (var4_5.eAZ().ahA() == this.iUy) {
                    yield "wipGoldBold14";
                }
                yield "wipLight14";
            }
            default -> null;
        };
    }

    @NotNull
    public String getName() {
        return bgv_2.Dm(this.iUy);
    }

    @NotNull
    public String dah() {
        return bgv_2.Dn(this.iUy);
    }

    public int dCE() {
        if (this.iUB.dCF() != fhr_0.sqz) {
            return 0;
        }
        int n = 0;
        for (rd_0 rd_02 : this.iUB.fZe()) {
            n = 10 * n + rd_02.aJr();
        }
        return n;
    }

    public void S(@NotNull ffV ffV2) {
        if (ffV2.avr() != this.iUy) {
            throw new IllegalArgumentException("Item does not have correct ref ID");
        }
        this.ejM += ffV2.bfd();
    }

    @Override
    public String[] bxk() {
        return iUx;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        bpe_0 bpe_02 = (bpe_0)object;
        return this.iUy == bpe_02.iUy;
    }

    public int hashCode() {
        return Objects.hash(this.iUy);
    }

    public String toString() {
        return "SublimationItem{m_sublimationRefId=" + this.iUy + ", m_quantity=" + this.ejM + ", name=\"" + this.getName() + "\"}";
    }
}

