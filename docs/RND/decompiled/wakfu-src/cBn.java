/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class cBn {
    static final Logger mwZ = Logger.getLogger(cBn.class);
    private static final long mxa = 5000L;
    private final TIntObjectHashMap<cBt> mxb = new TIntObjectHashMap();
    private final ArrayList<cBq> mxc = new ArrayList();
    private long mxd = 5000L;
    private long mxe;
    private final Object mxf = new Object();
    private final ArrayList<cBp> mxg = new ArrayList();
    private final cBo mxh = new cBo(this);

    public cBn() {
        this.mxh.setName("SoundAmbEngine");
        this.mxh.start();
    }

    public ArrayList<cBq> eIh() {
        return this.mxc;
    }

    public long eIi() {
        return this.mxd;
    }

    public void nX(long l) {
        this.mxd = l;
        for (int i = this.mxc.size() - 1; i >= 0; --i) {
            this.mxc.get(i).nX(this.mxd);
        }
    }

    public void c(cBp cBp2) {
        this.mxg.add(cBp2);
    }

    public void d(cBp cBp2) {
        this.mxg.remove(cBp2);
    }

    public void dJ(String string) {
        try {
            apl_1 apl_12 = apl_1.dw(fo_0.by(string));
            cCB cCB2 = new cCB();
            cCB2.a(apl_12);
            this.a(cCB2);
        }
        catch (IOException iOException) {
            mwZ.error((Object)("Probl\u00e8me \u00e0 la lecture du fichier " + string));
        }
    }

    public void a(cCB cCB2) {
        Object object;
        Object object2;
        this.bhk();
        this.mxc.clear();
        this.mxb.clear();
        ArrayList<cCA> arrayList = cCB2.eJC();
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            this.mxc.add(this.a(arrayList.get(i)));
        }
        ArrayList<cCz> arrayList2 = cCB2.eJD();
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        int n2 = arrayList2.size();
        for (int i = 0; i < n2; ++i) {
            object2 = arrayList2.get(i);
            object = this.a((cCz)object2);
            if (object == null) continue;
            this.mxb.put(((cBt)object).d(), object);
            tIntObjectHashMap.put(((cBt)object).d(), object2);
        }
        TIntObjectIterator tIntObjectIterator = this.mxb.iterator();
        block2: while (tIntObjectIterator.hasNext()) {
            int n3;
            int n4;
            cBt cBt2;
            tIntObjectIterator.advance();
            n2 = tIntObjectIterator.key();
            object2 = (cBt)tIntObjectIterator.value();
            object = (cCz)tIntObjectHashMap.get(n2);
            if (object2 instanceof cBz) {
                Object object3;
                cBt2 = (cBz)object2;
                n4 = ((cCz)object).mAq.size();
                for (n3 = 0; n3 < n4; ++n3) {
                    object3 = (cBt)this.mxb.get((int)((cCz)object).mAq.get(n3));
                    cBt2.a(object3);
                }
                if (((cCz)object).mAl == -1) continue;
                n4 = this.mxc.size();
                for (n3 = 0; n3 < n4; ++n3) {
                    object3 = this.mxc.get(n3);
                    if (((cBq)object3).d() != ((cCz)object).mAl) continue;
                    ((cBq)object3).a((cBz)cBt2);
                    continue block2;
                }
                continue;
            }
            cBt2 = (cba_0)object2;
            n4 = ((cCz)object).mAq.size();
            for (n3 = 0; n3 < n4; ++n3) {
                ((cba_0)cBt2).oc(((cCz)object).mAq.get(n3));
            }
        }
        this.mxb.clear();
    }

    private cBq a(cCA cCA2) {
        cBq cBq2 = new cBq();
        cBq2.lK(cCA2.o);
        cBq2.setName(cCA2.p);
        cBq2.nX(this.mxd);
        return cBq2;
    }

    private cBt a(cCz cCz2) {
        cBt cBt2 = this.b(cCz2);
        if (cBt2 == null) {
            return null;
        }
        cBt2.lK(cCz2.o);
        cBt2.setName(cCz2.p);
        ArrayList<cbp_0> arrayList = cCz2.mAp;
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            cBt2.a(arrayList.get(i));
        }
        cBt2.cI(cCz2.mAv >= 0 ? (float)cCz2.mAv / 100.0f : -1.0f);
        cBt2.dQ(cCz2.mAw >= 0 ? (float)cCz2.mAw / 100.0f : -1.0f);
        return cBt2;
    }

    private cBt b(cCz cCz2) {
        if (cCz2.mAo) {
            cBu cBu2 = new cBu();
            cBu2.a(cBj.LA(cCz2.jBa));
            return cBu2;
        }
        if (cCz2.mAn) {
            cBw cBw2 = new cBw();
            cBw2.a(cCm.dW(cCz2.mAr));
            cBw2.a(cCz2.mxF);
            cBw2.jF(cCz2.mxE);
            return cBw2;
        }
        if (cCz2.mAm) {
            return new cBz();
        }
        cba_0 cba_02 = null;
        cAN cAN2 = cAN.dR(cCz2.mAs);
        if (cCz2.mAt == 0 && cAN2.eGT() != null) {
            cba_02 = new cBv();
            cba_02.f(cAN2.eGT());
        } else if (cCz2.mAt == 1 && cAN2.eGU() != null) {
            cBy cBy2 = new cBy();
            cBy2.f(cAN2.eGU());
            cBy2.jG(true);
            cBy2.sy(cCz2.cDx);
            cba_02 = cBy2;
        } else if (cCz2.mAt == 2 && cAN2.eGU() != null) {
            cBy cBy3 = new cBy();
            cBy3.f(cAN2.eGU());
            cBy3.sy(cCz2.cDx);
            cba_02 = cBy3;
        }
        if (cba_02 == null) {
            return null;
        }
        cba_02.LI(cCz2.mxV);
        cba_02.LB(cCz2.mAu);
        cba_02.LC(cCz2.mxX);
        cba_02.LD(cCz2.mxY);
        cba_02.LE(cCz2.mxZ);
        cba_02.LF(cCz2.mya);
        cba_02.LH(cCz2.myf);
        cba_02.LG(cCz2.mye);
        cba_02.LJ(cCz2.myr);
        return cba_02;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void ccA() {
        Object object = this.mxf;
        synchronized (object) {
            this.mxe = System.currentTimeMillis();
        }
        this.mxh.cL(true);
    }

    public void bhk() {
        long l = System.currentTimeMillis();
        this.mxh.cL(false);
        for (int i = this.mxc.size() - 1; i >= 0; --i) {
            cBq cBq2 = this.mxc.get(i);
            cBq2.nZ(l);
        }
    }

    public void a(cCs cCs2) {
        int n;
        long l = System.currentTimeMillis();
        for (n = this.mxg.size() - 1; n >= 0; --n) {
            this.mxg.get(n).a(cCs2);
        }
        for (n = this.mxc.size() - 1; n >= 0; --n) {
            cBq cBq2 = this.mxc.get(n);
            cBq2.a(cCs2, l);
        }
    }

    public void a(long l, agn_1 agn_12, cBj cBj2) {
        long l2 = System.currentTimeMillis();
        for (int i = this.mxc.size() - 1; i >= 0; --i) {
            cBq cBq2 = this.mxc.get(i);
            cBq2.a(l, agn_12, cBj2, l2);
        }
    }

    public void nT(long l) {
        long l2 = System.currentTimeMillis();
        for (int i = this.mxc.size() - 1; i >= 0; --i) {
            cBq cBq2 = this.mxc.get(i);
            cBq2.H(l, l2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void hD(long l) {
        Object object = this.mxf;
        synchronized (object) {
            int n;
            if (l < this.mxe) {
                return;
            }
            int n2 = this.mxg.size();
            for (n = 0; n < n2; ++n) {
                this.mxg.get(n).hR(l);
            }
            for (n = this.mxc.size() - 1; n >= 0; --n) {
                cBq cBq2 = this.mxc.get(n);
                cBq2.nY(this.mxe);
            }
            this.mxe += this.mxd;
        }
    }
}

