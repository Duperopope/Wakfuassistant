/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bYt
 */
public class byt_2
implements aeh_2,
bye_1 {
    public static final String lzk = "rarityBorderStyle";
    public static final String lzl = "iconUrl";
    public static final String lzm = "text";
    private static final int lzn = 250;
    @NotNull
    private final String lzo;
    @NotNull
    private final String lzp;
    @NotNull
    private final fgj lzq;

    public byt_2(fm_1 fm_12, int n) {
        String string;
        int n2;
        if (fm_12 == fm_1.pA) {
            n2 = 4729667;
            string = bmj.DX(n);
            this.lzq = byp_2.lyZ.JE(n).egk().gkb();
        } else {
            bgv_2 bgv_22 = (bgv_2)bEm.dSb().Vd(n);
            n2 = bgv_22 == null ? 60614060 : (aue_0.cVJ().cVK().aWO() == 1 ? bgv_22.cpf() : bgv_22.aVt());
            string = bgv_2.Dm(n);
            this.lzq = bgv_22 != null ? bgv_22.dwg() : fgj.siB;
        }
        this.lzo = auc_0.cVq().zx(n2);
        this.lzp = aum_0.cWf().c("cosmetic.learned.toast", string);
    }

    @Override
    @NotNull
    public byh_1 eoU() {
        return byh_1.lAF;
    }

    @Override
    @NotNull
    public String eoV() {
        return "cosmeticLearnedToastDialog";
    }

    @Override
    public byf_1 eoW() {
        return byf_1.lAo;
    }

    @Override
    public byg_1 eoX() {
        return new byg_1(250, byc_1.nO(this.lzp), 250);
    }

    @Override
    public void a(@NotNull fey_2 fey_22) {
        fse_1.gFu().a("cosmeticToast", (Object)this, fey_22.getElementMap());
    }

    @Override
    public void b(@NotNull fey_2 fey_22) {
        this.a(fey_22);
    }

    @Override
    public void c(@NotNull fey_2 fey_22) {
        fse_1.gFu().a("cosmeticToast", null, fey_22.getElementMap());
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case lzk -> this.lzq.fWN();
            case lzl -> this.lzo;
            case lzm -> this.lzp;
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return new String[]{lzk, lzl, lzm};
    }
}

