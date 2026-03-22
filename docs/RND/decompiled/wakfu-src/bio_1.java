/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bIo
 */
public class bio_1
implements aeh_2 {
    public static final String kfy = "mimiSymbicItem";
    public static final String kfz = "statItem";
    public static final String kfA = "skinItem";
    public static final String kfB = "resultItem";
    private final ffV kfC;
    private ffV kfD;
    private ffV kfE;
    private ffV kfF;

    public bio_1(ffV ffV2) {
        this.kfC = ffV2;
    }

    private void dXG() {
        if (this.kfE == null || this.kfD == null) {
            this.bl(null);
            fse_1.gFu().b("itemDetail", this.kfD, "mimiSymbicDialog");
            return;
        }
        this.kfF = this.kfD.fVU();
        int n = bjf_1.f(this.kfE);
        this.kfF.UX(n);
        this.bl(this.kfF);
    }

    public void bj(ffV ffV2) {
        this.kfD = ffV2;
        if (this.kfD == null) {
            this.dXH();
        }
        fse_1.gFu().a((aef_2)this, kfz);
        fse_1.gFu().b("itemDetail", this.kfD, "mimiSymbicDialog");
        this.dXG();
    }

    private void dXH() {
        this.bl(null);
        this.bk(null);
    }

    public void bk(ffV ffV2) {
        this.kfE = ffV2;
        fse_1.gFu().a((aef_2)this, kfA);
        this.dXG();
    }

    private void bl(ffV ffV2) {
        this.kfF = ffV2;
        fse_1.gFu().a((aef_2)this, kfB);
        fse_1.gFu().b("itemDetail", this.kfF, "mimiSymbicDialog");
        fse_1.gFu().b("pet", (Object)null, "mimiSymbicDialog");
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (kfy.equals(string)) {
            return this.kfC;
        }
        if (kfz.equals(string)) {
            return this.kfD;
        }
        if (kfA.equals(string)) {
            return this.kfE;
        }
        if (kfB.equals(string)) {
            return this.kfF;
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    public ffV dXI() {
        return this.kfC;
    }

    public ffV dXJ() {
        return this.kfD;
    }

    public ffV dXK() {
        return this.kfE;
    }
}

