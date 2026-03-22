/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fir
 */
public class fir_0
implements fij_0 {
    private fim_0 srN;
    private long aZl;

    fir_0() {
    }

    public fir_0(fim_0 fim_02) {
        this.srN = fim_02;
    }

    @Override
    public fim_0 fZF() {
        return this.srN;
    }

    public void ij(long l) {
        this.aZl = l;
    }

    @Override
    public long pf() {
        return this.aZl;
    }

    @Override
    public short cmL() {
        return this.dnH().cR(this.aZl);
    }

    @Override
    public short aVe() {
        return this.dnH().aVe();
    }

    @Override
    public float fZG() {
        return this.dnH().a(this.cmL(), this.aZl);
    }

    @Override
    public void a(fis_0 fis_02) {
    }

    @Override
    public void b(fis_0 fis_02) {
    }

    public boolean c(vr_2 vr_22) {
        vr_22.WB = this.srN.d();
        vr_22.YH = this.aZl;
        return true;
    }

    public boolean d(vr_2 vr_22) {
        this.srN = fin_0.srJ.VL(vr_22.WB);
        this.aZl = vr_22.YH;
        return true;
    }

    @Override
    public mj_1 dnH() {
        return fir_0.c(this.srN);
    }

    public static mj_1 c(fim_0 fim_02) {
        if (fim_02 != null && fim_02.d() == 2) {
            return mf_1.aWI;
        }
        return mb_1.aWe;
    }

    @Override
    public String beT() {
        return "xp(" + this.aZl + ")";
    }

    @Override
    public /* synthetic */ boolean b(Object object) {
        return this.d((vr_2)object);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.c((vr_2)object);
    }
}

