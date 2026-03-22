/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.list.array.TLongArrayList;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cBA
 */
public abstract class cba_0<ASG extends agk_1>
extends cBt<cba_0> {
    protected static final Logger mxI = Logger.getLogger(cba_0.class);
    private static final boolean mxJ = false;
    public static final int mxK = 0;
    public static final int mxL = 1;
    public static final int mxM = 0;
    public static final int mxN = 1;
    public static final int mxO = 0;
    public static final int mxP = 1;
    public static final int mxQ = 2;
    private final TLongArrayList mxR = new TLongArrayList();
    private boolean mxS = false;
    protected final TLongArrayList mxT = new TLongArrayList();
    private int mxU = 0;
    private int mxV = 0;
    private int mxW = 0;
    private int mxX = 0;
    private int mxY = 0;
    private int mxZ = 0;
    private int mya = 0;
    private boolean myb = true;
    private int myc = 5;
    private int myd;
    private int mye;
    private int myf = 0;
    protected ASG dPo;
    private long myg;
    private long htu;
    private long myh;
    private long myi;
    private long myj;
    private long myk;
    private int myl;
    private long mym;
    private long myn;
    private long myo;
    private int myp;
    private ahk_1 ign;
    private ahk_1 myq;
    private int myr = 0;
    private long mys;
    private boolean myt = false;
    private cbb_0 myu;

    public void f(ASG ASG) {
        this.dPo = ASG;
    }

    public ASG ccr() {
        return this.dPo;
    }

    public int eIx() {
        return this.mxW;
    }

    public void LB(int n) {
        this.mxW = n;
    }

    public int eIy() {
        return this.mxX;
    }

    public void LC(int n) {
        this.mxX = n;
        this.mxY = Math.max(this.mxX, this.mxY);
    }

    public int eIz() {
        return this.mxY;
    }

    public void LD(int n) {
        this.mxY = n;
        this.mxX = Math.min(this.mxX, this.mxY);
    }

    public int eIA() {
        return this.mxZ;
    }

    public void LE(int n) {
        this.mxZ = n;
        this.mya = Math.max(this.mxZ, this.mya);
    }

    public int eIB() {
        return this.mya;
    }

    public void LF(int n) {
        this.mya = n;
        this.mxZ = Math.min(this.mxZ, this.mya);
    }

    public int eIC() {
        return this.mye;
    }

    public void LG(int n) {
        this.mye = n;
    }

    public int eID() {
        return this.myf;
    }

    public void LH(int n) {
        this.myf = n;
    }

    public int eIE() {
        return this.mxV;
    }

    public void LI(int n) {
        this.mxV = n;
    }

    public int eIF() {
        return this.myr;
    }

    public void LJ(int n) {
        this.myr = n;
    }

    public void oc(long l) {
        this.mxR.add(l);
        this.mxS = false;
    }

    public void j(long[] lArray) {
        this.mxR.add(lArray);
        this.mxS = false;
    }

    @Override
    public void a(cbb_0 cbb_02) {
        this.myu = cbb_02;
    }

    @Override
    public cba_0 eIw() {
        if (this.isValid()) {
            return this;
        }
        return null;
    }

    @Override
    public void S(ArrayList<cba_0> arrayList) {
        if (this.isValid()) {
            arrayList.add(this);
        }
    }

    @Override
    public void a(ArrayList<cba_0> arrayList, cCs cCs2) {
    }

    @Override
    public void a(ArrayList<cba_0> arrayList, cBj cBj2) {
    }

    @Override
    public void oa(long l) {
        this.eIN();
        this.myg = l;
        this.myl = 0;
        this.myi = this.myk = (long)0;
        this.myj = this.myk;
        if (this.cck()) {
            this.mxU = 0;
        }
        if (this.myr != 0) {
            this.mys = l + (long)this.myr;
            this.myh = this.mye >= 0 ? this.mys + (long)this.mye : 0L;
            this.myt = true;
            return;
        }
        this.myh = this.mye >= 0 ? l + (long)this.mye : 0L;
        this.myt = true;
    }

    @Override
    public void nZ(long l) {
        this.bhk();
    }

    public void bhk() {
        this.eIN();
        this.myt = false;
    }

    public boolean od(long l) {
        this.htu = l;
        if (!this.myt) {
            return true;
        }
        if (this.mys != 0L) {
            if (l < this.mys) {
                return true;
            }
            this.mys = 0L;
        }
        if (this.mye != -1 && this.myh <= this.htu) {
            this.eIN();
            this.myt = false;
            return false;
        }
        if (!this.cck()) {
            if (this.ign == null) {
                long l2 = this.eII();
                if (l2 == -1L) {
                    return false;
                }
                boolean bl = false;
                switch (this.myf) {
                    case 1: {
                        bl = true;
                        break;
                    }
                    case 2: {
                        bl = false;
                    }
                }
                this.ign = this.t(l2, bl);
                if (this.ign == null) {
                    return false;
                }
                if (this.myf == 2) {
                    this.mye = this.ign.ccG();
                    long l3 = this.myh = this.myr != 0 ? this.mys + (long)this.mye : this.myg + (long)this.mye;
                }
                if (this.myu != null) {
                    this.myu.g(this.ign);
                }
                this.myl = this.eIH();
                float f2 = this.eIL();
                if (this.eIq()) {
                    this.ign.cI(f2);
                    this.ign.dQ(f2);
                } else {
                    this.ign.cI(0.0f);
                    this.ign.dQ(f2);
                    this.ign.br(f2, GC.a(1000, 0, this.ign.ccG()));
                }
            }
            return true;
        }
        if (this.eIJ()) {
            if (l >= this.myk && this.myk != -1L) {
                long l4;
                if (this.myq != null) {
                    this.a(this.myq, this.eIH());
                }
                if (this.ign != null) {
                    this.a(this.ign, true, this.myl);
                }
                if ((l4 = this.eII()) == -1L) {
                    return false;
                }
                this.myq = this.t(l4, false);
                if (this.myq != null) {
                    if (this.myu != null) {
                        this.myu.g(this.myq);
                    }
                    this.mym = l;
                    this.myn = l + (long)this.myq.ccG();
                    this.myp = this.eIH();
                    this.myo = Math.max(this.mym, this.myn - (long)this.myp);
                    this.myq.cI(0.0f);
                    float f3 = this.eIL();
                    this.myq.dQ(f3);
                    this.myq.br(f3, this.eIG());
                }
                this.eIO();
            }
        } else {
            if (this.myk == 0L) {
                this.myk = l + (long)this.eIG();
            }
            if (l >= this.myj && this.myj != 0L) {
                this.a(this.ign, false, 0.0f);
                this.ign = null;
            }
            if (l >= this.myk) {
                long l5 = this.eII();
                if (l5 == -1L) {
                    return false;
                }
                this.ign = this.t(l5, false);
                if (this.ign != null) {
                    if (this.myu != null) {
                        this.myu.g(this.ign);
                    }
                    this.myi = l;
                    this.myj = l + (long)this.ign.ccG();
                    this.myl = this.eIG();
                    this.myk = this.myj + (long)this.myl;
                    this.ign.cI(this.eIL());
                }
            }
        }
        return true;
    }

    private void f(ahk_1 ahk_12) {
        if (this.myu != null) {
            this.myu.g(ahk_12);
        }
    }

    protected abstract ahk_1 t(long var1, boolean var3);

    private int eIG() {
        return GC.q(this.mxX, this.mxY);
    }

    private int eIH() {
        return GC.q(this.mxZ, this.mya);
    }

    private long eII() {
        long l;
        if (this.mxR.size() == 0) {
            return -1L;
        }
        if (!this.mxS) {
            this.eIM();
            this.mxU = 0;
        }
        if (this.mxU >= this.mxT.size()) {
            if (this.mxV == 1 && this.mxT.size() > 1 && this.myd-- <= 0) {
                l = this.mxT.getQuick(this.mxT.size() - 1);
                do {
                    this.eIM();
                } while (l == this.mxT.getQuick(0));
            }
            this.mxU = 0;
        }
        l = this.mxT.getQuick(this.mxU);
        ++this.mxU;
        return l;
    }

    private boolean eIJ() {
        return this.mxW == 0;
    }

    private boolean eIK() {
        return this.myf == 1;
    }

    private boolean cck() {
        return this.myf == 0;
    }

    private float eIL() {
        float f2 = this.bBt();
        float f3 = this.bwE();
        if (f3 == -1.0f) {
            return f2;
        }
        f3 = Math.max(f2, f3);
        return GC.b(f2, f3);
    }

    private void eIM() {
        if (!this.mxS || this.mxV == 1) {
            this.mxT.clear();
            this.mxT.add(this.mxR.toArray());
            this.mxS = true;
        }
        if (this.mxV == 1) {
            this.mxT.shuffle(GC.aFZ);
            int n = this.myc;
            for (int i = this.mxT.size() - 1; i >= n; --i) {
                this.mxT.removeAt(i);
            }
            this.myd = 20;
        }
    }

    private void eIN() {
        if (this.ign != null) {
            this.a(this.ign, true, 1000.0f);
            this.ign = null;
        }
        if (this.myq != null) {
            this.a(this.myq, true, 1000.0f);
            this.myq = null;
        }
    }

    private void a(ahk_1 ahk_12, float f2) {
        this.a(ahk_12, this.eIJ(), f2);
    }

    private void a(ahk_1 ahk_12, boolean bl, float f2) {
        if (ahk_12 == null) {
            return;
        }
        if (bl) {
            ahk_12.br(0.0f, f2);
            ahk_12.dZ(true);
        } else {
            ahk_12.ccF();
        }
    }

    private void eIO() {
        this.ign = this.myq;
        this.myi = this.mym;
        this.myk = this.myo;
        this.myj = this.myn;
        this.myl = this.myp;
        this.myq = null;
        this.mym = -1L;
        this.myo = -1L;
        this.myn = -1L;
        this.myp = -1;
    }

    @Override
    protected void c(cCz cCz2) {
        super.c(cCz2);
        cCz2.mAm = false;
        int n = this.mxR.size();
        for (int i = 0; i < n; ++i) {
            cCz2.mAq.add(this.mxR.get(i));
        }
        cCz2.mye = this.mye;
        cCz2.myf = this.myf;
        cCz2.mxV = this.mxV;
        cCz2.mAu = this.mxW;
        cCz2.mxX = this.mxX;
        cCz2.mxY = this.mxY;
        cCz2.mAs = cAN.c(this.dPo).eGR();
    }

    @Override
    public void B(TObjectProcedure<cba_0> tObjectProcedure) {
        tObjectProcedure.execute((Object)this);
    }

    public cba_0 eIP() {
        cba_0 cba_02 = this.eIs();
        this.b(cba_02);
        return cba_02;
    }

    protected abstract cba_0 eIs();

    @Override
    protected void b(cBt cBt2) {
        cba_0 cba_02 = (cba_0)cBt2;
        super.b(cba_02);
        cba_02.j(this.mxR.toArray());
        cba_02.mxV = this.mxV;
        cba_02.mxW = this.mxW;
        cba_02.mxX = this.mxX;
        cba_02.mxY = this.mxY;
        cba_02.mxZ = this.mxZ;
        cba_02.mya = this.mya;
        cba_02.myb = this.myb;
        cba_02.myc = this.myc;
        cba_02.mye = this.mye;
        cba_02.myf = this.myf;
        cba_02.dPo = this.dPo;
        cba_02.myr = this.myr;
    }
}

