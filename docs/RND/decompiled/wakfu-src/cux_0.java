/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from cuX
 */
public final class cux_0 {
    public static final cux_0 mjE = new cux_0();
    private fpv hQH;
    private fpv mjF;

    private cux_0() {
    }

    public void a(fpv fpv2) {
        this.hQH = fpv2;
        this.hQH.a(cuz_0.mjH);
        fse_1.gFu().f("battlegroundView", new bfi_0(this.hQH));
    }

    public fpv eDD() {
        return this.hQH;
    }

    public Optional<fpv> eDE() {
        return Optional.ofNullable(this.hQH);
    }

    public void b(fpv fpv2) {
        this.mjF = fpv2;
    }

    public Optional<fpv> eDF() {
        return Optional.ofNullable(this.mjF);
    }

    public void h(bJK bJK2) {
        fpt fpt2;
        if (bJK2 == null) {
            return;
        }
        if (this.mjF == null) {
            return;
        }
        int n = this.mjF.att();
        Optional<fpt> optional = fpu.sOH.FP(n);
        if (optional.isPresent() && (fpt2 = optional.get()).clk() != bJK2.d()) {
            this.mjF = null;
        }
    }
}

