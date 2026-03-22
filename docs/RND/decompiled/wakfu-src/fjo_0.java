/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fjo
 */
public final class fjo_0 {
    protected static final Logger syk = Logger.getLogger(fjo_0.class);
    public static final boolean syl = false;
    public static final int sym = 0;
    public static final int syn = 30;
    public static final int syo = 31;
    public static final int syp = 32;
    public static final int syq = 33;
    public static final int syr = 34;
    public static final fjo_0 sys = new fjo_0(0, flq_0.gdc());
    private static fky_0 syt;
    @Nullable
    private flc_0 syu;
    @Nullable
    private fld_0 syv;
    @Nullable
    private fkV syw;
    @Nullable
    private fkz_0 syx;
    private int epQ;
    short syy;
    int syz;
    int syA;
    private final fjq syB = new fjq(this);
    private final fkr_0 syC = new fkr_0(this);
    private final fjr syD = new fjr(this);

    public static boolean a(@Nullable fjo_0 fjo_02, @Nullable fjo_0 fjo_03) {
        boolean bl;
        boolean bl2 = fjo_02 == null;
        boolean bl3 = bl = fjo_03 == null;
        if (bl2) {
            return bl || fjo_03.Xt() == 0;
        }
        if (bl) {
            return fjo_02.Xt() == 0;
        }
        return fjo_02.Xt() == fjo_03.Xt();
    }

    public void a(short s, int n, int n2) {
        this.syy = s;
        this.syz = n;
        this.syA = n2;
    }

    public fjq gbd() {
        return this.syB;
    }

    public static void a(fky_0 fky_02) {
        syt = fky_02;
        fjo_0.sys.syu = fky_02.a(sys);
        fjo_0.sys.syv = fky_02.b(sys);
        fjo_0.sys.syx = fky_02.d(sys);
        fjo_0.sys.syw = fky_02.c(sys);
    }

    public static fjo_0 gbe() {
        return fjo_0.WD(-1);
    }

    public static fjo_0 WD(int n) {
        if (syt == null) {
            throw new UnsupportedOperationException("La factory de handlers de nation (NationHandlersFactory) doit \u00eatre d\u00e9finie");
        }
        return new fjo_0(n, syt);
    }

    private fjo_0(int n, fky_0 fky_02) {
        this.syu = fky_02.a(this);
        this.syv = fky_02.b(this);
        this.syw = fky_02.c(this);
        this.syx = fky_02.d(this);
        this.epQ = n;
    }

    public int Xt() {
        return this.epQ;
    }

    public void Le(int n) {
        this.epQ = n;
    }

    public void gbf() {
        if (this.syu != null) {
            this.syu.gbf();
        }
        if (this.syv != null) {
            this.syv.gbf();
        }
        if (this.syw != null) {
            this.syw.gbf();
        }
        if (this.syx != null) {
            this.syx.gbf();
        }
    }

    public byte[] a(fkp_0 fkp_02) {
        return this.syC.b(fkp_02);
    }

    public void j(byte[] byArray, int n) {
        this.syC.k(byArray, n);
    }

    public byte[] gbg() {
        return this.syC.b(fkp_0.sAY);
    }

    public byte[] gbh() {
        return this.syC.b(fkp_0.sBo);
    }

    public fkl_0 a(fkq_0 fkq_02) {
        switch (fkq_02) {
            case sBs: {
                return this.gbn();
            }
            case sBt: {
                return this.gbi();
            }
            case sBu: {
                return this.gbj();
            }
            case sBz: {
                return this.gbk();
            }
            case sBI: {
                return this.gbN();
            }
            case sBE: {
                return this.gbl();
            }
            case sBF: {
                return this.gbm();
            }
            case sBG: {
                return this.gbt();
            }
            case sBv: {
                return this.gbu();
            }
            case sBw: {
                return this.gbG();
            }
            case sBx: {
                return this.gbH();
            }
            case sBy: {
                return this.gbM();
            }
            case sBA: {
                return this.gbI();
            }
            case sBC: {
                return this.gbK();
            }
            case sBD: {
                return this.gbL();
            }
            case sBB: {
                return this.gbJ();
            }
            case sBH: {
                return this.gbd();
            }
        }
        return fkl_0.sAW;
    }

    fkl_0 gbi() {
        if (this.syv != null) {
            return this.syv.gbi();
        }
        return fkl_0.sAW;
    }

    fkl_0 gbj() {
        if (this.syv != null) {
            return this.syv.gbj();
        }
        return fkl_0.sAW;
    }

    fkl_0 gbk() {
        if (this.syv != null) {
            return this.syv.gbk();
        }
        return fkl_0.sAW;
    }

    fkl_0 gbl() {
        if (this.syw != null) {
            return this.syw.gbl();
        }
        return fkl_0.sAW;
    }

    fkl_0 gbm() {
        if (this.syv != null) {
            return this.syv.gbm();
        }
        return fkl_0.sAW;
    }

    fjr gbn() {
        return this.syD;
    }

    public String toString() {
        return "{Nation id=" + this.epQ + "}";
    }

    public void a(short s, short s2, int n, int n2) {
        if (this.syx != null) {
            this.syx.b(s, s2, n, n2);
        }
    }

    public flB gbo() {
        if (this.syx != null) {
            return this.syx.gbo();
        }
        throw new UnsupportedOperationException();
    }

    public short gbp() {
        if (this.syx != null) {
            return this.syx.gbp();
        }
        throw new UnsupportedOperationException();
    }

    public short gbq() {
        if (this.syx != null) {
            return this.syx.gbq();
        }
        throw new UnsupportedOperationException();
    }

    public int gbr() {
        if (this.syx != null) {
            return this.syx.gbr();
        }
        throw new UnsupportedOperationException();
    }

    public int gbs() {
        if (this.syx != null) {
            return this.syx.gbs();
        }
        throw new UnsupportedOperationException();
    }

    public void mg(long l) {
        if (this.syx == null) {
            throw new UnsupportedOperationException();
        }
        this.syx.mg(l);
    }

    public void mh(long l) {
        if (this.syx == null) {
            throw new UnsupportedOperationException();
        }
        this.syx.mh(l);
    }

    fkl_0 gbt() {
        if (this.syx != null) {
            return this.syx.gcM();
        }
        return fkl_0.sAW;
    }

    fkl_0 gbu() {
        if (this.syx != null) {
            return this.syx.gcN();
        }
        return fkl_0.sAW;
    }

    public void a(fkB fkB2) {
        if (this.syx == null) {
            return;
        }
        this.syx.c(fkB2);
    }

    public void b(fkB fkB2) {
        if (this.syx == null) {
            return;
        }
        this.syx.d(fkB2);
    }

    public void a(fkD fkD2) {
        if (this.syv == null) {
            return;
        }
        this.syv.c(fkD2);
    }

    public void b(fkD fkD2) {
        if (this.syv == null) {
            return;
        }
        this.syv.d(fkD2);
    }

    public void a(ua_0 ua_02, ua_0 ua_03) {
        if (this.syv != null) {
            this.syv.a(ua_02, ua_03);
        }
    }

    public void b(ux_0 ux_02, ua_0 ua_02, boolean bl) {
        if (this.syv != null) {
            this.syv.b(ux_02, ua_02, bl);
        }
    }

    public boolean gbv() {
        return this.syv != null && this.syv.gcR();
    }

    public boolean gbw() {
        return this.syv != null && this.syv.ekX();
    }

    public void aa(ux_0 ux_02) {
        if (this.syv != null) {
            this.syv.ab(ux_02);
        }
    }

    public boolean gbx() {
        return this.syv != null && this.syv.gcU();
    }

    public boolean tP(long l) {
        return this.syv != null && this.syv.ui(l);
    }

    public ux_0 eCK() {
        if (this.syv != null) {
            return this.syv.eCK();
        }
        return null;
    }

    public ua_0 eCS() {
        if (this.syv != null) {
            return this.syv.eCS();
        }
        return null;
    }

    public ua_0 gby() {
        if (this.syv != null) {
            return this.syv.gcT();
        }
        return null;
    }

    public boolean tQ(long l) {
        return this.syv != null && this.syv.tQ(l);
    }

    public fkw tR(long l) {
        if (this.syv != null) {
            return this.syv.tR(l);
        }
        return null;
    }

    public TLongObjectIterator<fkw> gbz() {
        if (this.syv != null) {
            return this.syv.gcW();
        }
        return fld_0.sDn;
    }

    public int ekU() {
        if (this.syv != null) {
            return this.syv.ekU();
        }
        return 0;
    }

    public int ekZ() {
        if (this.syv != null) {
            return this.syv.ekZ();
        }
        return 0;
    }

    public void d(int n, int n2, ArrayList<fkw> arrayList) {
        if (this.syv != null) {
            this.syv.d(n, n2, arrayList);
        }
    }

    public void P(ArrayList<fkw> arrayList) {
        if (this.syv != null) {
            this.syv.P(arrayList);
        }
    }

    public void dV(int n, int n2) {
        if (this.syv != null) {
            this.syv.dV(n, n2);
        }
    }

    public void a(fjc_0 fjc_02) {
        if (this.syv != null) {
            this.syv.b(fjc_02);
        }
    }

    public void o(long l, String string) {
        if (this.syv != null) {
            this.syv.d(l, string);
        }
    }

    public void b(long l, fkw fkw2) {
        if (this.syv != null) {
            this.syv.a(l, fkw2);
        }
    }

    public void a(fkw fkw2) {
        if (this.syv != null) {
            this.syv.c(fkw2.Sn(), fkw2);
        }
    }

    public void a(fji_0 fji_02) {
        if (this.syv != null) {
            this.syv.a(fji_02);
        }
    }

    public void a(long l, byte by, long l2) {
        if (this.syv != null) {
            this.syv.a(l, by, l2);
        }
    }

    public void a(fkL fkL2, fkL fkL3, fkO fkO2) {
        if (this.syv != null) {
            this.syv.a(fkL2, fkL3, fkO2);
        }
    }

    public void a(long l, fkL fkL2) {
        if (this.syv != null) {
            this.syv.a(l, fkL2);
        }
    }

    public void l(fjo_0 fjo_02) {
        if (this.syv != null) {
            this.syv.l(fjo_02);
        }
    }

    public fkx gbA() {
        return this.syv != null ? this.syv.gbA() : fld_0.sDo;
    }

    public fkJ gbB() {
        return this.syv != null ? this.syv.gbB() : null;
    }

    public fnf_0 gbC() {
        return this.syv != null ? this.syv.gbC() : null;
    }

    public fku_0 gbD() {
        return this.syv != null ? this.syv.gbD() : null;
    }

    public fni_0 gbE() {
        return this.syv != null ? this.syv.gbE() : null;
    }

    @Nullable
    public fld_0 gbF() {
        return this.syv;
    }

    public void tS(long l) {
        if (this.syv != null) {
            this.syv.ug(l);
        }
    }

    public void tT(long l) {
        if (this.syv != null) {
            this.syv.uh(l);
        }
    }

    public void E(long l, long l2) {
        if (this.syv != null) {
            this.syv.E(l, l2);
        }
    }

    public long emh() {
        if (this.syv != null) {
            return this.syv.emh();
        }
        return Long.MAX_VALUE;
    }

    public void ekY() {
        if (this.syv != null) {
            this.syv.clear();
        }
    }

    fkl_0 gbG() {
        return this.syv != null ? this.syv.gbG() : fkl_0.sAW;
    }

    fkl_0 gbH() {
        return this.syv != null ? this.syv.gbH() : fkl_0.sAW;
    }

    fkl_0 gbI() {
        return this.syv != null ? this.syv.gbI() : fkl_0.sAW;
    }

    fkl_0 gbJ() {
        return this.syv != null ? this.syv.gbJ() : fkl_0.sAW;
    }

    fkl_0 gbK() {
        return this.syv != null ? this.syv.gbK() : fkl_0.sAW;
    }

    fkl_0 gbL() {
        return this.syv != null ? this.syv.gbL() : fkl_0.sAW;
    }

    fkl_0 gbM() {
        return this.syv != null ? this.syv.gcX() : fkl_0.sAW;
    }

    fkl_0 gbN() {
        return this.syv != null ? this.syv.gcY() : fkl_0.sAW;
    }

    public int gbO() {
        return this.syu.gbO();
    }

    public boolean d(fjm fjm2) {
        return this.syu != null && this.syu.d(fjm2);
    }

    public void a(fkC fkC2) {
        if (this.syu == null) {
            return;
        }
        this.syu.c(fkC2);
    }

    public void b(fkC fkC2) {
        if (this.syu == null) {
            return;
        }
        this.syu.d(fkC2);
    }

    public void tU(long l) {
        if (this.syu != null) {
            this.syu.uf(l);
        }
    }

    @Nullable
    public fjm tV(long l) {
        if (this.syu == null) {
            return null;
        }
        return this.syu.tV(l);
    }

    public void e(@NotNull fjm fjm2) {
        if (this.syu != null) {
            this.syu.e(fjm2);
        }
    }

    public void a(@NotNull fjm fjm2) {
        if (this.syu != null) {
            this.syu.a(fjm2);
        }
    }

    public void mj(long l) {
        if (this.syu != null) {
            this.syu.mj(l);
        }
    }

    public void a(long l, fkK fkK2) {
        if (this.syu != null) {
            this.syu.a(l, fkK2);
        }
    }

    public void b(long l, fkK fkK2) {
        if (this.syu != null) {
            this.syu.b(l, fkK2);
        }
    }

    public boolean f(@NotNull fjm fjm2) {
        if (this.syu != null) {
            return this.syu.f(fjm2);
        }
        throw new UnsupportedOperationException();
    }

    public void g(@NotNull fjm fjm2) {
        if (this.syu != null) {
            this.syu.k(fjm2);
        }
    }

    public void Z(TObjectProcedure<fjm> tObjectProcedure) {
        if (this.syu != null) {
            this.syu.Z(tObjectProcedure);
        }
    }

    public void a(fkz fkz2) {
        if (this.syw == null) {
            return;
        }
        this.syw.c(fkz2);
    }

    public void b(fkz fkz2) {
        if (this.syw == null) {
            return;
        }
        this.syw.d(fkz2);
    }

    public void f(int n, int[] nArray) {
        if (this.syw == null) {
            return;
        }
        this.syw.f(n, nArray);
    }

    public void g(int n, int[] nArray) {
        if (this.syw == null) {
            return;
        }
        this.syw.g(n, nArray);
    }

    public void Jk(int n) {
        if (this.syw == null) {
            return;
        }
        this.syw.Jk(n);
    }

    public void h(int n, int[] nArray) {
        if (this.syw == null) {
            return;
        }
        this.syw.h(n, nArray);
    }

    @Nullable
    public azm_1 WE(int n) {
        if (this.syw == null) {
            return null;
        }
        return this.syw.WE(n);
    }

    public void WF(int n) {
        if (this.syv == null) {
            return;
        }
        this.syv.WF(n);
    }

    public short gbP() {
        return this.syy;
    }

    public int gbQ() {
        return this.syz;
    }

    public int gbR() {
        return this.syA;
    }

    public int hashCode() {
        return this.epQ;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof fjo_0)) {
            return false;
        }
        return ((fjo_0)object).epQ == this.epQ;
    }

    static {
        fjt.syH.n(sys);
        syt = null;
    }
}

