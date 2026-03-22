/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fsq
 */
public abstract class fsq_0
implements fst {
    private static final Logger tda = Logger.getLogger(fsq_0.class);
    public static final int tdb = -6;
    private static final int tdc = 4;
    private static final int tdd = 4;
    protected final long tde;
    private int tdf;
    private int tdg;
    private int brs;
    private int brt;
    private short[][] tdh;
    private final TLongObjectHashMap<fam_0> tdi = new TLongObjectHashMap();
    private final fsz_0 tdj = new fsz_0(this.tdi);

    protected fsq_0(long l, int n, int n2, int n3, int n4) {
        this.tde = l;
        this.H(n, n2, n3, n4);
        this.fK((short)0);
    }

    protected fsq_0(long l) {
        this(l, 0, 0, 4, 4);
    }

    protected fsq_0(fsq_0 fsq_02) {
        this.tde = fsq_02.tde;
        this.tdf = fsq_02.tdf;
        this.tdg = fsq_02.tdg;
        this.brs = fsq_02.brs;
        this.brt = fsq_02.brt;
        this.tdh = (short[][])fsq_02.tdh.clone();
        int n = fsq_02.tdh.length;
        for (int i = 0; i < n; ++i) {
            this.tdh[i] = (short[])fsq_02.tdh[i].clone();
        }
        this.tdi.putAll(fsq_02.tdi);
        this.tdj.ehP();
    }

    public fam_0 ZO(int n) {
        return (fam_0)this.tdi.get((long)n);
    }

    @Override
    public boolean gs(int n, int n2) {
        return this.gld().cL(n, n2);
    }

    @Override
    public aci_1 gld() {
        return new aci_1(this.bwS() + 2, this.bgo() - 2, this.bwT() + 2, this.bgp() - 8);
    }

    @Override
    public final int bwS() {
        return this.tdf;
    }

    @Override
    public final int bwT() {
        return this.tdg;
    }

    public final int gle() {
        return this.brs;
    }

    public final int glf() {
        return this.brt;
    }

    @Override
    public final int bgo() {
        return this.tdf + this.brs - 1;
    }

    @Override
    public final int bgp() {
        return this.tdg + this.brt - 1;
    }

    public final void H(int n, int n2, int n3, int n4) {
        short s = fsq_0.ZT(n3);
        short s2 = fsq_0.ZU(n4);
        this.tdh = new short[s][s2];
        this.brs = s;
        this.brt = s2;
        this.tdf = fsq_0.ZT(n);
        this.tdg = fsq_0.ZU(n2);
    }

    protected final short[][] glg() {
        short[][] sArrayArray = new short[this.brs][];
        for (int i = 0; i < this.brs; ++i) {
            sArrayArray[i] = (short[])this.tdh[i].clone();
        }
        return sArrayArray;
    }

    protected final void fK(short s) {
        for (int i = 0; i < this.brs; ++i) {
            for (int j = 0; j < this.brt; ++j) {
                this.tdh[i][j] = s;
            }
        }
    }

    public ewi ah(short s, short s2) {
        ewi ewi2 = new ewi(s, s2);
        this.a(s, s2, ewi2);
        return ewi2;
    }

    protected final void a(short s, short s2, fss_0 fss_02) {
        short s3 = fsq_0.ZT(s);
        short s4 = fsq_0.ZU(s2);
        fss_02.a(this.gu(s3, s4), this.gu(s3 + 1, s4), this.gu(s3, s4 + 1), this.gu(s3 + 1, s4 + 1));
        this.b(s, s2, fss_02);
    }

    public void b(short s, short s2, fss_0 fss_02) {
        fss_02.a(this.tdj.aj(s, s2));
    }

    public final boolean ai(short s, short s2) {
        short s3 = fsq_0.ZT(s);
        short s4 = fsq_0.ZU(s2);
        if (s3 < this.bwS() || s3 > this.bgo() || s4 < this.bwT() || s4 > this.bgp()) {
            return false;
        }
        return this.gt(s3, s4) != fsu.tdo || this.gt(s3 + 1, s4) != fsu.tdo || this.gt(s3, s4 + 1) != fsu.tdo || this.gt(s3 + 1, s4 + 1) != fsu.tdo;
    }

    @Override
    public final void aq(int n, int n2, short s) {
        this.tdh[n - this.tdf][n2 - this.tdg] = s;
    }

    @Override
    public short gt(int n, int n2) {
        return this.tdh[n - this.tdf][n2 - this.tdg];
    }

    public void d(short s, short s2, short s3, short s4, short s5, short s6) {
        short s7 = fsq_0.ZT(s);
        short s8 = fsq_0.ZU(s2);
        this.aq(s7, s8, s3);
        this.aq(s7 + 1, s8, s4);
        this.aq(s7, s8 + 1, s5);
        this.aq(s7 + 1, s8 + 1, s6);
    }

    protected final fsu gu(int n, int n2) {
        short s = this.gt(n, n2);
        return s == fsu.tdo ? null : this.Kh(s);
    }

    public abstract fsu Kh(int var1);

    public long bhh() {
        return this.tde;
    }

    @Override
    public void j(fam_0 fam_02) {
        this.uK(fam_02.ZC());
        this.tdi.put(fam_02.ZC(), (Object)fam_02);
        this.tdj.ehP();
    }

    @Override
    @Nullable
    public fam_0 uK(long l) {
        fam_0 fam_02 = (fam_0)this.tdi.remove(l);
        if (fam_02 != null) {
            this.tdj.ehP();
        }
        return fam_02;
    }

    public static short ZP(int n) {
        int n2 = GC.B((float)n / 9.0f);
        return GC.cu(n2);
    }

    public static short ZQ(int n) {
        int n2 = GC.B((float)n / 9.0f);
        return GC.cu(n2);
    }

    public static short ZR(int n) {
        int n2 = GC.B((float)n / 2.0f);
        return GC.cu(n2);
    }

    public static short ZS(int n) {
        int n2 = GC.B((float)n / 2.0f);
        return GC.cu(n2);
    }

    public static short ZT(int n) {
        int n2 = n * 2;
        return GC.cu(n2);
    }

    public static short ZU(int n) {
        int n2 = n * 2;
        return GC.cu(n2);
    }

    public static short ZV(int n) {
        return fsq_0.ZT(n);
    }

    public static short ZW(int n) {
        return fsq_0.ZU(n);
    }

    public static short ZX(int n) {
        int n2 = fsq_0.ZT(n) + 1;
        return GC.cu(n2);
    }

    public static short ZY(int n) {
        return fsq_0.ZU(n);
    }

    public static short ZZ(int n) {
        return fsq_0.ZT(n);
    }

    public static short aaa(int n) {
        int n2 = fsq_0.ZU(n) + 1;
        return GC.cu(n2);
    }

    public static short aab(int n) {
        int n2 = fsq_0.ZT(n) + 1;
        return GC.cu(n2);
    }

    public static short aac(int n) {
        int n2 = fsq_0.ZU(n) + 1;
        return GC.cu(n2);
    }

    @Override
    public fam_0[] aj(short s, short s2) {
        return this.tdj.aj(s, s2);
    }

    @Override
    public boolean y(TObjectProcedure<fam_0> tObjectProcedure) {
        return this.tdi.forEachValue(tObjectProcedure);
    }

    public abstract fsq_0 err();

    public fam_0 av(long l, int n) {
        fam_0 fam_02 = (fam_0)this.tdi.get(l);
        if (fam_02 == null) {
            tda.error((Object)("le batiment " + l + " n'existe pas"));
            return null;
        }
        fam_02.lP(n);
        return fam_02;
    }

    @Override
    public int fRp() {
        return 250000;
    }

    @Override
    public /* synthetic */ fst ers() {
        return this.err();
    }
}

