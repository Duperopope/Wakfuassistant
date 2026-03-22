/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TByteLongIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TByteLongHashMap
 *  gnu.trove.map.hash.TIntByteHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.iterator.TByteLongIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TByteLongHashMap;
import gnu.trove.map.hash.TIntByteHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class bfT {
    private static final Logger hXl = Logger.getLogger(bfT.class);
    private final TByteLongHashMap hXm = new TByteLongHashMap();
    private final TIntByteHashMap hXn = new TIntByteHashMap();
    private acd_1 hXo;
    private byte bZe;
    private bfU hXp;
    private ux_0 hXq;
    private boolean hXr;
    private boolean hXs;
    private boolean hXt;
    private boolean cdF;
    private boolean hXu;
    private boolean hXv;
    private bgg hXw;
    private bgg[] hXx;
    private bgg[] hXy;
    private bgg hXz;
    private short hXA = (short)-1;
    private String hXB;
    private int hXC;
    private int hXD;
    private int hWI;
    private int epK;
    private bfM hXE;

    public bfT dif() {
        bfT bfT2 = new bfT();
        TByteLongIterator tByteLongIterator = this.hXm.iterator();
        while (tByteLongIterator.hasNext()) {
            tByteLongIterator.advance();
            bfT2.hXm.put(tByteLongIterator.key(), tByteLongIterator.value());
        }
        tByteLongIterator = this.hXn.iterator();
        while (tByteLongIterator.hasNext()) {
            tByteLongIterator.advance();
            bfT2.hXn.put(tByteLongIterator.key(), tByteLongIterator.value());
        }
        bfT2.hXo = this.hXo;
        bfT2.bZe = this.bZe;
        bfT2.hXp = this.hXp;
        bfT2.hXq = this.hXq;
        bfT2.hXr = this.hXr;
        bfT2.hXs = this.hXs;
        bfT2.hXt = this.hXt;
        bfT2.cdF = this.cdF;
        bfT2.hXu = this.hXu;
        bfT2.hXv = this.hXv;
        bfT2.hXw = this.hXw;
        if (this.hXx != null) {
            bfT2.hXx = new bgg[this.hXx.length];
            for (bgg bfT2.hXx[var2_3] : this.hXx) {
            }
        }
        if (this.hXy != null) {
            bfT2.hXy = new bgg[this.hXy.length];
            for (bgg bfT2.hXy[var2_4] : this.hXy) {
            }
        }
        bfT2.hXz = this.hXz;
        bfT2.hXA = this.hXA;
        bfT2.hXB = this.hXB;
        bfT2.hXC = this.hXC;
        bfT2.hXD = this.hXD;
        bfT2.hWI = this.hWI;
        bfT2.epK = this.epK;
        return bfT2;
    }

    public bfU dig() {
        return this.hXp;
    }

    public int d() {
        return this.hXp.d();
    }

    public bfS dih() {
        return this.hXp.dih();
    }

    bgi dii() {
        return this.hXp.dii();
    }

    public byte dij() {
        return this.bZe;
    }

    public void bi(byte by) {
        this.bZe = by;
    }

    boolean dik() {
        return this.hXr;
    }

    void fG(boolean bl) {
        this.hXr = bl;
    }

    boolean dil() {
        return this.hXt;
    }

    public void fH(boolean bl) {
        this.hXt = bl;
    }

    public boolean bVp() {
        return this.hXs;
    }

    public void fI(boolean bl) {
        if (this.hXs == bl) {
            return;
        }
        this.hXs = bl;
    }

    bgg dim() {
        return this.hXw;
    }

    void a(bgg bgg2) {
        this.hXw = bgg2;
    }

    static bfT a(bfU bfU2) {
        bfT bfT2 = new bfT();
        bfT2.hXp = bfU2;
        ArrayList<bgh> arrayList = bfT2.hXp.aFV();
        bfT2.hXx = new bgg[arrayList.size()];
        for (int i = 0; i < arrayList.size(); ++i) {
            bfT2.hXx[i] = new bgg(arrayList.get(i));
        }
        ArrayList<bgh> arrayList2 = bfT2.hXp.diF();
        if (arrayList2 != null) {
            bfT2.hXy = new bgg[arrayList2.size()];
            for (int i = 0; i < arrayList2.size(); ++i) {
                bfT2.hXy[i] = new bgg(arrayList2.get(i));
            }
        } else {
            bfT2.hXy = null;
        }
        bfT2.hXE = bgk.hZN.Cx(bfU2.d());
        return bfT2;
    }

    byte a(bgb bgb2) {
        assert (bgb2 != null) : "On essaye de r\u00e9cup\u00e9rer le status d'un goal null";
        return this.hXn.get(bgb2.d());
    }

    public bgg[] din() {
        return this.hXx;
    }

    public bgg[] dio() {
        return this.hXy;
    }

    void a(TIntArrayList tIntArrayList) {
        for (int i = 0; i < tIntArrayList.size(); ++i) {
            int n = tIntArrayList.get(i);
            if (this.hXn.get(n) == 1) continue;
            this.hXn.put(n, (byte)1);
        }
        if (this.hXE != null) {
            this.hXE.dbB();
        }
    }

    boolean e(byte by, long l) {
        boolean bl = this.hXm.containsKey(by) && this.hXm.get(by) != l;
        this.hXm.put(by, l);
        if (this.hXE != null) {
            this.hXE.dbB();
        }
        return bl;
    }

    long lB(String string) {
        return this.hXm.get(this.hXp.lE(string));
    }

    public String bAD() {
        return this.hXp.diA();
    }

    void Cj(int n) {
        if (this.hXn.get(n) != 1) {
            hXl.error((Object)("On essaie de terminer une action pas encore commenc\u00e9e, dans le scenario " + this.d() + " action d'id " + n));
        }
        this.hXn.put(n, (byte)2);
        if (this.hXE != null) {
            this.hXE.dbB();
        }
    }

    void b(TIntArrayList tIntArrayList) {
        if (!(this.hXw == null || tIntArrayList != null && tIntArrayList.contains(this.hXw.d()))) {
            this.hXw = null;
        }
        for (bgg bgg2 : this.hXx) {
            if (tIntArrayList != null && tIntArrayList.contains(bgg2.d())) {
                bgg2.fL(true);
                if (this.hXw != null) continue;
                this.hXw = bgg2;
                continue;
            }
            bgg2.fL(false);
        }
    }

    boolean dip() {
        ux_0 ux_02 = this.hXp.diG();
        ux_0 ux_03 = ue_0.bjV().bjc();
        if (ux_02 != null && ux_02.g(ux_03)) {
            return true;
        }
        if (this.hXq == null) {
            return false;
        }
        short s = this.hXp.aFT();
        if (s > 0) {
            uw_0 uw_02 = new uw_0(this.hXq);
            uw_02.a(uz_0.fo(s));
            if (uw_02.g(ux_03)) {
                return true;
            }
        }
        return false;
    }

    public short dhG() {
        if (this.hXu || this.hXs) {
            return 0;
        }
        if (this.hXp.aFT() == 0) {
            return -1;
        }
        if (this.hXq == null) {
            return this.hXp.aFT();
        }
        uw_0 uw_02 = new uw_0(this.hXq);
        uw_02.a(uz_0.fo(this.hXp.aFT()));
        uz_0 uz_02 = ue_0.bjV().bjc().l(uw_02);
        return uz_02.aYI() ? GC.cu(uz_02.bjS()) : (short)0;
    }

    public void az(boolean bl) {
        this.cdF = bl;
    }

    public void D(ux_0 ux_02) {
        this.hXq = ux_02;
    }

    public boolean aGd() {
        return this.hXp.aGd();
    }

    public boolean aGv() {
        return this.hXv;
    }

    public void ak(boolean bl) {
        this.hXv = bl;
    }

    boolean diq() {
        return this.hXp.aFT() > 0;
    }

    public boolean aOY() {
        return this.cdF;
    }

    boolean dir() {
        for (bgg bgg2 : this.hXx) {
            if (!bgg2.isValid()) continue;
            return false;
        }
        return true;
    }

    public void N(acd_1 acd_12) {
        if (this.hXo != null && acd_12 == null) {
            bif_2.dYO().dYQ();
        } else if (acd_12 != null) {
            bif_2.dYO().a(acd_12.getX(), acd_12.getY(), acd_12.bdi(), aue_0.cVJ().cVK().aqZ(), this, true);
        }
        this.hXo = acd_12;
    }

    public void fJ(boolean bl) {
        this.hXu = bl;
    }

    public boolean daI() {
        return this.hXu;
    }

    public short aFT() {
        return this.hXp.aFT();
    }

    public ux_0 dis() {
        return this.hXq;
    }

    public int ctn() {
        return this.epK;
    }

    public void Ck(int n) {
        this.epK = n;
    }

    public short dit() {
        return this.hXA;
    }

    public void bs(short s) {
        this.hXA = s;
        if (this.hXE != null) {
            this.hXE.dbC();
        }
    }

    public String toString() {
        return this.hXp.diA();
    }

    @Nullable
    public bgg Cl(int n) {
        if (this.hXx.length > n) {
            return this.hXx[n];
        }
        return null;
    }

    public void Cm(int n) {
        bgg bgg2 = this.hXz = n >= 0 && n < this.hXx.length ? this.hXx[n] : null;
        if (this.hXE != null) {
            this.hXE.dhr();
        }
    }

    bgg diu() {
        return this.hXz;
    }

    String div() {
        return this.hXB;
    }

    public void lC(String string) {
        this.hXB = string;
        if (this.hXE != null) {
            this.hXE.dhs();
        }
    }

    int diw() {
        return this.hXC;
    }

    public void Cn(int n) {
        this.hXC = n;
        if (this.hXE != null) {
            this.hXE.dht();
        }
    }

    int dix() {
        return this.hXD;
    }

    public void Co(int n) {
        this.hXD = n;
    }

    int diy() {
        return this.hWI;
    }

    public void Cg(int n) {
        this.hWI = n;
    }

    void E(ux_0 ux_02) {
        if (!ux_02.bjv()) {
            this.hXq = ux_02;
            this.cdF = true;
            abb_2.bUA().a(csj_2.eOt(), 1000L, this.d());
        }
    }
}

