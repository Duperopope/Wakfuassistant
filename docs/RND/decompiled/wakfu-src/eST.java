/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public abstract class eST
extends eSS {
    private static final int rlF = 1;
    private static final int rlG = 2;
    private static final int rlH = 4;
    private static final int rlI = 8;
    private static final int rlJ = 16;
    private static final int rlK = 32;
    private static final int rlL = 64;
    public static final int rlM = 1;
    public static final int rlN = 2;
    public static final int rlO = 4;
    public static final int rlP = 6;
    public static final QX rlQ;
    protected abi_1 bmk;
    protected boolean rlR;
    protected boolean rlS;
    protected boolean rlT;
    protected boolean rlU;
    protected byte aXR;
    protected int rlV;
    protected eja_0 jCH;
    private final long[] rlW = new long[1];

    public QX fIy() {
        return rlQ;
    }

    public eST(int n, aoh_1 aoh_12, BitSet bitSet, BitSet bitSet2, int n2, int n3, float[] fArray, float[] fArray2, boolean bl, boolean bl2, int n4) {
        super(n, aoh_12, bitSet, bitSet2, n2, n3, fArray, fArray2, bl, bl2, n4);
    }

    public eST k(etj_0 etj_02) {
        eST eST2 = (eST)super.b(etj_02);
        if (etj_02 != null && etj_02.bcB() != null) {
            eST2.a(etj_02.bcB());
        }
        return eST2;
    }

    protected eST() {
    }

    @Override
    public int aeV() {
        return etm_0.rnD.aHp();
    }

    @Override
    public void aPg() {
        Object object;
        boolean bl;
        this.rlV = Math.round(this.oO(0));
        boolean bl2 = this.oO(1) != -1.0f;
        boolean bl3 = this.oO(9) >= 0.0f && this.oO(9) <= 127.0f;
        boolean bl4 = bl = this.biv.length >= 14;
        if (bl2 || bl3 || bl) {
            exx_2 exx_22;
            byte by;
            object = new ArrayList();
            if (bl2) {
                ((ArrayList)object).add(exx_2.rGi);
            }
            if (bl3) {
                ((ArrayList)object).add(exx_2.rGw);
            }
            int n = 10;
            while (this.biv.length >= n + 4) {
                by = (byte)this.oO(n);
                exx_22 = exx_2.c(by);
                if (exx_22 == null) {
                    bih.error((Object)("Unable to add dynamic charac " + this.oO(n) + " to effectarea : unknown charac"));
                } else {
                    ((ArrayList)object).add(exx_22);
                }
                n += 4;
            }
            if (((ArrayList)object).size() > 0) {
                this.jCH = new eja_0((Iterable<pt_0>)object);
                this.jCH.aYH();
            }
            n = 10;
            while (this.biv.length >= n + 4) {
                by = (byte)this.oO(n);
                exx_22 = exx_2.c(by);
                if (exx_22 != null) {
                    exf_2 exf_22 = (exf_2)this.b(exx_22);
                    if (exf_22 == null) {
                        bih.error((Object)"UNable to find a newly created dynamic charac for this effect area");
                    } else {
                        int n2 = (int)this.oO(n + 1);
                        int n3 = (int)this.oO(n + 2);
                        int n4 = (int)this.oO(n + 3);
                        if (n3 == -2) {
                            exf_22.ou(exf_22.aYX());
                        } else if (n3 != -1) {
                            exf_22.ou(n3);
                        }
                        if (n4 == -2) {
                            exf_22.ot(exf_22.aYY());
                        } else if (n4 != -1) {
                            exf_22.ot(n4);
                        }
                        exf_22.op(n2);
                    }
                }
                n += 4;
            }
        }
        object = this.bci();
        if (bl2) {
            float f2 = this.oO(1);
            float f3 = this.oO(2);
            int n = (int)(f2 + (float)this.cmL() * f3);
            this.jCH.b(exx_2.rGi).ot(n);
            this.jCH.b(exx_2.rGi).aYO();
        }
        if (bl3 && object != null) {
            pr_0 pr_02 = this.b(exx_2.rGw);
            byte by = (byte)this.oO(9);
            if (object.a(exx_2.rGw) && (by & 1) != 0) {
                pr_02.nt(object.c(exx_2.rGw));
            }
            if (object.a(exx_2.rGx) && (by & 2) != 0) {
                pr_02.nt(object.c(exx_2.rGx));
            }
            if (object.a(exx_2.rGy) && (by & 4) != 0) {
                pr_02.nt(object.c(exx_2.rGy));
            }
            if (object.a(exx_2.rGz) && (by & 8) != 0) {
                pr_02.nt(object.c(exx_2.rGz));
            }
            if (object.a(exx_2.rGA) && (by & 0x10) != 0) {
                pr_02.nt(object.c(exx_2.rGA));
            }
            if (object.a(exx_2.rHn) && (by & 0x20) != 0) {
                pr_02.nt(object.c(exx_2.rHn));
            }
        }
        this.rlR = this.oO(3) == 1.0f;
        this.rlS = this.oO(4) == 1.0f;
        this.bhH = this.oO(5) == 1.0f ? new ers_0(this) : null;
        this.rlT = this.oO(6) == 1.0f;
        this.rlU = this.oO(7) == 1.0f;
        int n = (int)this.oO(8);
        this.aXR = n <= 0 ? (byte)6 : (byte)n;
    }

    @Override
    public boolean bcR() {
        return this.rlR || this.rlS;
    }

    @Override
    public boolean bcS() {
        return this.rlR;
    }

    @Override
    public boolean fID() {
        return this.rlS;
    }

    @Override
    public boolean e(anu_1 anu_12) {
        if (anu_12 == this.biq) {
            return this.rlT;
        }
        return this.rlU;
    }

    @Override
    public QE baz() {
        return this.bhH;
    }

    @Override
    public boolean baA() {
        return true;
    }

    @Override
    public pr_0 fIB() {
        return this.b(exx_2.rGi);
    }

    @Override
    public pr_0 b(pt_0 pt_02) {
        if (this.jCH == null) {
            return null;
        }
        return this.jCH.b(pt_02);
    }

    @Override
    public eja_0 fIC() {
        return this.jCH;
    }

    @Override
    public boolean a(pt_0 pt_02) {
        if (this.jCH == null) {
            return false;
        }
        return this.jCH.g(pt_02);
    }

    @Override
    public long[] c(anu_1 anu_12) {
        if (anu_12 != null) {
            this.rlW[0] = anf_2.L(anu_12.bcC(), anu_12.bcD(), anu_12.bcE());
            return this.rlW;
        }
        return null;
    }

    @Override
    public List<anu_1> d(anu_1 anu_12) {
        return Collections.singletonList(this.biq);
    }

    @Override
    public byte bcN() {
        return this.aXR;
    }

    public int fIN() {
        return this.rlV;
    }

    @Override
    public boolean baF() {
        if (super.baF()) {
            return true;
        }
        if (this.jCH != null && this.a(exx_2.rGi)) {
            return this.jCH.c(exx_2.rGi) <= 0;
        }
        return false;
    }

    @Override
    public void a(abi_1 abi_12) {
        this.bmk = abi_12;
    }

    @Override
    public abi_1 bcB() {
        if (this.bmk == null) {
            return super.bcB();
        }
        return this.bmk;
    }

    @Override
    public byte[] fIz() {
        azg_1 azg_12 = new azg_1();
        if (this.a(exx_2.rGi)) {
            azg_12.vC(this.d(exx_2.rGi));
            azg_12.vC(this.c(exx_2.rGi));
        }
        return azg_12.bTe();
    }

    @Override
    public void fz(ByteBuffer byteBuffer) {
        if (this.a(exx_2.rGi)) {
            int n = byteBuffer.getInt();
            int n2 = byteBuffer.getInt();
            this.b(exx_2.rGi).ot(n);
            this.b(exx_2.rGi).op(n2);
        }
    }

    @Override
    public /* synthetic */ eSS b(etj_0 etj_02) {
        return this.k(etj_02);
    }

    @Override
    public /* synthetic */ aox_1 bEt() {
        return this.fIy();
    }

    @Override
    public /* synthetic */ QQ a(QS qS) {
        return this.k((etj_0)qS);
    }

    static {
        ArrayList<QW> arrayList = new ArrayList<QW>();
        ArrayList<aou_1> arrayList2 = new ArrayList<aou_1>();
        arrayList2.add(new aou_1("UserDefined ID"));
        arrayList2.add(new aou_1("PV (-1 = pas de PV)"));
        arrayList2.add(new aou_1("PV inc par level (useless si HP == -1)"));
        arrayList2.add(new aou_1("Bloque mouvement (oui si 1, non sinon)"));
        arrayList2.add(new aou_1("Bloque ligne de vue (oui si 1, non sinon)"));
        arrayList2.add(new aou_1("Avec RunningEffectManager (oui si 1, non sinon)"));
        arrayList2.add(new aou_1("P-e triggered par owner (oui si 1, non sinon)"));
        arrayList2.add(new aou_1("P-e triggered par qqun d'autre (oui si 1, non sinon)"));
        arrayList2.add(new aou_1("Hauteur (NORMAL_HEIGHT si <= 0)"));
        arrayList2.add(new aou_1("Bonus d\u00e9gats owner recopi\u00e9s (-1:aucun 1:phys 2:Feu 4:Eau 8:Terre 16:Air 32:Stasis 64:Meca"));
        arrayList.add(new QW("Fake fighter sous forme d'effect area", arrayList2.toArray(new aou_1[arrayList2.size()])));
        for (int i = 1; i < 6; ++i) {
            arrayList2.add(new aou_1("Charac#" + i + " : id"));
            arrayList2.add(new aou_1("Charac#" + i + " : valeur initiale"));
            arrayList2.add(new aou_1("Charac#" + i + " : valeur min (-1 = default min, -2 = lower bound)"));
            arrayList2.add(new aou_1("Charac#" + i + " : valeur max (-1 = default max, -2 = upper bound)"));
            arrayList.add(new QW("Fake fighter avec " + i + " charac dynamique", arrayList2.toArray(new aou_1[arrayList2.size()])));
        }
        rlQ = new QX(arrayList.toArray(new QW[arrayList.size()]));
    }
}

