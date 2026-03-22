/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eKu
 */
public class eku_0 {
    private long aZl;
    private int qCg;
    private int qCh;
    private int qCi;
    private int qCj;
    private boolean qCk;
    private short qCl;
    private final Set<Integer> qCm = new HashSet<Integer>();

    protected void fyf() {
        ++this.qCg;
    }

    protected void lE(boolean bl) {
        if (bl) {
            ++this.qCh;
        } else {
            ++this.qCi;
        }
    }

    protected void dQ(short s) {
        this.qCj += s;
    }

    public long qf(long l) {
        long l2 = this.aZl + l;
        if (eKX.qi(l2) >= 200) {
            this.aZl = eKX.dV((short)200);
            return this.aZl;
        }
        return this.aZl += l;
    }

    public boolean Qx(int n) {
        return this.qCm.add(n);
    }

    protected boolean Qy(int n) {
        return this.qCm.contains(n);
    }

    public short cmL() {
        return eKX.qi(this.aZl);
    }

    public static eku_0 a(@NotNull dg_1 dg_12, @Nullable dc_1 dc_12) {
        eku_0 eku_02 = new eku_0();
        eku_02.aZl = dg_12.pf();
        dj_2 dj_22 = dg_12.ph();
        eku_02.qCg = dj_22.pG() ? dj_22.pH() : 0;
        eku_02.qCi = dj_22.pI() ? dj_22.pJ() : 0;
        eku_02.qCh = dj_22.pK() ? dj_22.pL() : 0;
        int n = eku_02.qCj = dj_22.pM() ? dj_22.pN() : 0;
        if (dc_12 != null) {
            eku_02.qCk = dc_12.getEnabled();
            eku_02.qCl = (short)(dc_12.rH() ? dc_12.rI() : 0);
        } else {
            eku_02.qCk = false;
            eku_02.qCl = 0;
        }
        for (di_2 di_22 : dg_12.pj()) {
            eku_02.qCm.add(di_22.rX());
        }
        return eku_02;
    }

    public static eku_0 d(@NotNull gf_2 gf_22) {
        eku_0 eku_02 = new eku_0();
        eku_02.aZl = eKX.dV((short)gf_22.tL());
        eku_02.qCg = 0;
        eku_02.qCi = 0;
        eku_02.qCh = 0;
        eku_02.qCj = 0;
        eku_02.qCk = false;
        eku_02.qCl = 0;
        for (di_2 di_22 : gf_22.pj()) {
            eku_02.qCm.add(di_22.rX());
        }
        return eku_02;
    }

    protected List<di_2> fyg() {
        ArrayList<di_2> arrayList = new ArrayList<di_2>();
        for (int n : this.qCm) {
            arrayList.add(di_2.rZ().aM(n).sf());
        }
        return arrayList;
    }

    public dg_1 fyh() {
        dl_1 dl_12 = dj_2.pP();
        if (this.qCg > 0) {
            dl_12.av(this.qCg);
        }
        if (this.qCi > 0) {
            dl_12.aw(this.qCi);
        }
        if (this.qCh > 0) {
            dl_12.ax(this.qCh);
        }
        if (this.qCj > 0) {
            dl_12.ay(this.qCj);
        }
        return dg_1.pn().a(dl_12.pW()).J(this.aZl).i(this.fyg()).pt();
    }

    protected dc_1 fyi() {
        de_2 de_22 = dc_1.rK().d(this.qCk);
        if (this.qCl > 0) {
            de_22.aL(this.qCl);
        }
        return de_22.rQ();
    }

    public gf_2 fyj() {
        return gf_2.Do().cM(this.cmL()).v(this.fyg()).Du();
    }

    @Generated
    public long pf() {
        return this.aZl;
    }

    @Generated
    public int pH() {
        return this.qCg;
    }

    @Generated
    public int fyk() {
        return this.qCh;
    }

    @Generated
    public int fyl() {
        return this.qCi;
    }

    @Generated
    public int pN() {
        return this.qCj;
    }

    @Generated
    public boolean fym() {
        return this.qCk;
    }

    @Generated
    public short fyn() {
        return this.qCl;
    }

    @Generated
    public Set<Integer> fyo() {
        return this.qCm;
    }

    @Generated
    public void ij(long l) {
        this.aZl = l;
    }

    @Generated
    public void Qz(int n) {
        this.qCg = n;
    }

    @Generated
    public void QA(int n) {
        this.qCh = n;
    }

    @Generated
    public void QB(int n) {
        this.qCi = n;
    }

    @Generated
    public void QC(int n) {
        this.qCj = n;
    }

    @Generated
    public void lF(boolean bl) {
        this.qCk = bl;
    }

    @Generated
    public void dR(short s) {
        this.qCl = s;
    }
}

