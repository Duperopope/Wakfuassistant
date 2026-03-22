/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bGA
 */
public abstract class bga_2 {
    private static final String[] jVV = new String[]{"inventoryDialog", "inventoryOnlyDialog", "heroBuildDialog"};
    @Nullable
    private Runnable jVW;
    private final fmi_2 jVX = new bge_2(this);
    private final fmh_1 jVY = new bgc_2(this);
    private final fmg_1 jVZ = new bgb_2(this);
    private final fms_2 jWa = new bgd_2(this);
    private boolean bTz;

    public void q(@Nullable Runnable runnable) {
        this.jVW = runnable;
    }

    public final void dTX() {
        if (this.bTz) {
            return;
        }
        bgt_0 bgt_03 = aue_0.cVJ().cVK();
        if (!this.F(bgt_03)) {
            return;
        }
        this.bTz = true;
        fhn_1.gzT().a(this.dUa(), true);
        fbj_1.getInstance().a(fzq_0.tJT, this.jVX, true);
        fbj_1.getInstance().a(fzq_0.tJv, this.jVY, true);
        fbj_1.getInstance().a(fzq_0.tJM, this.jVZ, true);
        fbj_1.getInstance().a(fzq_0.tJF, this.jWa, true);
        fcI.a(bbs_2.xl(), (exP2, ffV2) -> {
            fse_1.gFu().a((aef_2)ffV2, "isValidForCurrentMode");
            return true;
        });
        if (this.dUe()) {
            fcI.a(bbs_2.xl(), bgt_02 -> {
                Object t = bgt_02.a(fez_0.seq);
                if (t == null) {
                    return;
                }
                t.r(object -> fse_1.gFu().a((aef_2)((ffV)object), "isValidForCurrentMode"));
            });
        }
        fse_1.gFu().f("inventoryCurrentMode", this.dUf().d());
        this.cby();
    }

    public final void dTY() {
        if (!this.bTz) {
            return;
        }
        this.bTz = false;
        fhn_1.gzT().bYz();
        fbj_1.getInstance().b(fzq_0.tJT, this.jVX, true);
        fbj_1.getInstance().b(fzq_0.tJv, this.jVY, true);
        fbj_1.getInstance().b(fzq_0.tJM, this.jVZ, true);
        fbj_1.getInstance().b(fzq_0.tJF, this.jWa, true);
        fse_1.gFu().f("inventoryCurrentMode", (Object)null);
        if (this.jVW != null) {
            this.jVW.run();
        }
        this.dTZ();
    }

    @Contract(value="null -> false")
    boolean F(@Nullable bgt_0 bgt_02) {
        if (bgt_02 == null || bgt_02.djU()) {
            return false;
        }
        return this.G(bgt_02);
    }

    protected abstract boolean G(@NotNull bgt_0 var1);

    protected abstract void cby();

    protected abstract void dTZ();

    protected abstract fzo_0 dUa();

    protected abstract fzo_0 dUb();

    protected abstract fzo_0 dUc();

    protected abstract boolean dUd();

    protected abstract boolean dUe();

    protected abstract boolean d(@NotNull bgt_0 var1, @NotNull ffV var2);

    public boolean aX(@NotNull ffV ffV2) {
        bgt_0 bgt_02 = this.ln(ffV2.LV());
        if (bgt_02 == null) {
            return false;
        }
        return this.d(bgt_02, ffV2);
    }

    protected abstract void a(@NotNull flp_2 var1, @NotNull bgt_0 var2, @NotNull ffV var3);

    protected abstract void b(@NotNull flp_2 var1, @NotNull bgt_0 var2, @NotNull ffV var3);

    public abstract bgf_2 dUf();

    Optional<ffV> dUg() {
        fcv_1 fcv_12;
        fes_2 fes_22 = fbj_1.getInstance().getMouseOver();
        if (fes_22 == null) {
            return Optional.empty();
        }
        fcv_1 fcv_13 = fcv_12 = fes_22 instanceof fcv_1 ? (fcv_1)fes_22 : fes_22.getParentOfType(fcv_1.class);
        if (fcv_12 == null) {
            return Optional.empty();
        }
        if (!this.mI(fcv_12.getElementMap().gAt())) {
            return Optional.empty();
        }
        Object object = fcv_12.getItemValue();
        if (object instanceof ffV) {
            return Optional.of((ffV)object);
        }
        if (this.dUd() && object instanceof bgp_1) {
            return Optional.ofNullable(((bgp_1)object).getItem());
        }
        return Optional.empty();
    }

    private boolean mI(@Nullable String string) {
        if (string == null) {
            return false;
        }
        for (String string2 : jVV) {
            if (!string.startsWith(string2)) continue;
            return true;
        }
        return this.dUe() && string.startsWith("temporaryTransferInventoryDialog");
    }

    @Nullable
    bgt_0 ln(long l) {
        bgt_0 bgt_02;
        long l2 = bbs_2.xl();
        if (this.dUe() && (bgt_02 = (bgt_0)fcI.ai(l2, l)) != null) {
            return bgt_02;
        }
        if (this.dUd()) {
            return (bgt_0)fcI.ag(l2, l);
        }
        return (bgt_0)fcI.ac(l2, l);
    }
}

