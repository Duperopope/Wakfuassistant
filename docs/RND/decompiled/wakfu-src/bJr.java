/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;

public final class bJr
extends foP
implements frl {
    private long klw;
    private fpg klx;
    private bkm_0 kly;
    private bkm_0 klz;
    bTe klA = null;
    private final ArrayList<wj_0> klB;
    private final TIntArrayList klC;
    private final TIntArrayList klD;
    private final TIntArrayList klE;
    private final TIntArrayList klF;
    private final ArrayList<bJC> klG;
    private final EnumMap<frk, frj> klH;
    private final bJB klI;
    private final bJv klJ;
    private final acd_1 klK = new acd_1();
    private int[] klL = null;
    private fiH<bfY> klM;

    bJr(int n) {
        super(n);
        this.klH = new EnumMap(frk.class);
        this.klB = new ArrayList();
        this.klD = new TIntArrayList();
        this.klE = new TIntArrayList();
        this.klI = new bJB(this);
        this.klG = new ArrayList();
        this.klF = new TIntArrayList();
        this.klC = new TIntArrayList();
        this.klJ = new bJv(this);
    }

    public String getName() {
        return aum_0.cWf().a(48, (long)this.d(), new Object[0]);
    }

    public long cXe() {
        return this.klw;
    }

    public void lB(long l) {
        this.klw = l;
    }

    public acd_1 eap() {
        return this.klK;
    }

    public void a(int n, int n2, short s) {
        this.klK.Q(n, n2, s);
    }

    public int[] eaq() {
        return this.klL;
    }

    public void D(int[] nArray) {
        this.klL = nArray;
    }

    public bkm_0 ear() {
        return this.kly;
    }

    public void a(bkm_0 bkm_02) {
        this.kly = bkm_02;
        this.klA = new bTe(bkm_02);
        this.kly.a(new bjs_0(this));
    }

    public void eas() {
        if (this.klA != null) {
            this.klA.aPc();
        }
    }

    public void eat() {
        if (this.klA != null) {
            this.klA.dhE();
        }
    }

    public bTe eau() {
        return this.klA;
    }

    public fpg eav() {
        return this.klx;
    }

    public void a(fpg fpg2) {
        this.klx = fpg2;
    }

    public bhx_0 cXa() {
        bgy bgy2 = bgg_0.dlO().ju(this.klw);
        if (bgy2 instanceof bhx_0) {
            return (bhx_0)bgy2;
        }
        if (bgy2 != null) {
            sMt.error((Object)("Un protecteur a un uid qui ne correspond pas \u00e0 celui d'un NPC uid=" + this.klw));
        }
        return null;
    }

    public String eaw() {
        String string;
        bJK bJK2 = (bJK)this.gfS();
        if (bJK2 == null) {
            return null;
        }
        if (aum_0.cWf().e(66, bJK2.d()) && (string = aum_0.cWf().a(66, (long)bJK2.d(), new Object[0])) != null && string.length() > 0) {
            return string;
        }
        return null;
    }

    public bkm_0 eax() {
        return this.klz;
    }

    public void b(bkm_0 bkm_02) {
        this.klz = bkm_02;
    }

    public ArrayList<wj_0> eay() {
        return this.klB;
    }

    public TIntArrayList eaz() {
        return this.klD;
    }

    public TIntArrayList eaA() {
        return this.klC;
    }

    public TIntArrayList eaB() {
        return this.klE;
    }

    public TIntArrayList eaC() {
        return this.klF;
    }

    public EnumMap<frk, frj> eaD() {
        return this.klH;
    }

    public bJB eaE() {
        return this.klI;
    }

    @Override
    public fpb eaF() {
        return this.klI.gfN();
    }

    public void a(bJC bJC2) {
        this.klG.add(bJC2);
    }

    public Iterator<bJC> eaG() {
        return this.klG.iterator();
    }

    public bJv eaH() {
        return this.klJ;
    }

    @Override
    public float a(frk frk2) {
        return this.klH.get((Object)frk2).getValue();
    }

    @Override
    public void a(frk frk2, float f2) {
        this.klH.get((Object)frk2).setValue(f2);
    }

    @Override
    public long a(fgv fgv2, frk frk2, long l) {
        if (!this.a(fgv2)) {
            return 0L;
        }
        frj frj2 = this.klH.get((Object)frk2);
        return frj2 != null ? frj2.uF(l) : 0L;
    }

    @Override
    public void a(frk frk2, int n) {
        throw new UnsupportedOperationException("Non support\u00e9 dnas le client");
    }

    @Override
    public boolean a(fgv fgv2) {
        return fgv2 instanceof bgy;
    }

    @Override
    public acd_1 aZw() {
        return this.klK;
    }

    public void a(fiH<bfY> fiH2) {
        this.klM = fiH2;
    }

    public fiH<bfY> eaI() {
        return this.klM;
    }

    @Override
    public /* synthetic */ foI eaJ() {
        return this.eaE();
    }
}

