/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class cBq
implements agl_1 {
    private static final Logger mxj = Logger.getLogger(cBq.class);
    private static final boolean mxk = false;
    private long mxd;
    private int o;
    private String p;
    private final aah_1<aah_1<ArrayList<cba_0>>> mxl = new aah_1(4);
    private final aaq_1<ArrayList<cba_0>> mxm = new aaq_1();
    private final ArrayList<cBz> mxn = new ArrayList();
    private final ArrayList<cba_0> mxo = new ArrayList();
    private final ArrayList<agk_1> mxp = new ArrayList();
    private final TIntArrayList mxq = new TIntArrayList();
    private boolean mxr = false;
    private final ArrayList<cBr> mxs = new ArrayList();
    private final ArrayList<cba_0> mxt = new ArrayList();
    private final ArrayList<cba_0> mxu = new ArrayList();
    private final ArrayList<cba_0> mxv = new ArrayList();

    public int d() {
        return this.o;
    }

    public void lK(int n) {
        this.o = n;
    }

    public String getName() {
        return this.p;
    }

    public void setName(String string) {
        this.p = string;
    }

    public ArrayList<cba_0> eIj() {
        return this.mxo;
    }

    public ArrayList<cBz> eIk() {
        return this.mxn;
    }

    public void a(cBz cBz2) {
        this.mxn.add(cBz2);
    }

    public long eIi() {
        return this.mxd;
    }

    public void nX(long l) {
        this.mxd = l;
    }

    public void clear() {
        this.mxn.clear();
    }

    public void a(cBr cBr2) {
        this.mxs.add(cBr2);
    }

    public void b(cBr cBr2) {
        this.mxs.remove(cBr2);
    }

    public void nY(long l) {
        if (this.mxo.size() == 0) {
            this.ob(l);
        } else {
            this.mxr = true;
        }
    }

    private void d(agk_1 agk_12) {
        int n = this.mxp.indexOf(agk_12);
        if (n == -1) {
            this.mxp.add(agk_12);
            this.mxq.add(1);
            agk_12.a(this);
        } else {
            this.mxq.setQuick(n, this.mxq.getQuick(n) + 1);
        }
    }

    private void e(agk_1 agk_12) {
        int n = this.mxp.indexOf(agk_12);
        if (n != -1) {
            int n2 = this.mxq.getQuick(n);
            if (n2 > 1) {
                this.mxq.setQuick(n, n2 - 1);
            } else {
                this.mxp.remove(n);
                this.mxq.removeAt(n);
                agk_12.b(this);
            }
        }
    }

    private void eIl() {
        this.mxt.clear();
        for (int i = this.mxn.size() - 1; i >= 0; --i) {
            this.mxn.get(i).S(this.mxt);
        }
    }

    public void bhk() {
        this.nZ(System.currentTimeMillis());
    }

    public synchronized void nZ(long l) {
        int n;
        Iterable<Object> iterable;
        int n2;
        for (n2 = this.mxl.bTR() - 1; n2 >= 0; --n2) {
            iterable = this.mxl.vU(n2);
            if (iterable == null) continue;
            for (n = ((azz_2)((Object)iterable)).bTR() - 1; n >= 0; --n) {
                ArrayList arrayList = (ArrayList)((aah_1)iterable).vU(n);
                int n3 = arrayList.size();
                for (int i = 0; i < n3; ++i) {
                    cba_0 cba_02 = (cba_0)arrayList.get(i);
                    cba_02.nZ(l);
                    this.e((agk_1)cba_02.ccr());
                }
            }
            ((aah_1)iterable).clear();
        }
        for (n2 = this.mxm.aVo() - 1; n2 >= 0; --n2) {
            iterable = this.mxm.vU(n2);
            if (iterable == null) continue;
            int n4 = ((ArrayList)iterable).size();
            for (n = 0; n < n4; ++n) {
                cba_0 cba_03 = (cba_0)((ArrayList)iterable).get(n);
                cba_03.nZ(l);
                this.e((agk_1)cba_03.ccr());
            }
            ((ArrayList)iterable).clear();
        }
        this.mxm.clear();
        int n5 = this.mxo.size();
        for (n2 = 0; n2 < n5; ++n2) {
            cba_0 cba_04 = this.mxo.get(n2);
            cba_04.nZ(l);
            this.e((agk_1)cba_04.ccr());
        }
        this.mxo.clear();
    }

    public void ccA() {
        this.oa(System.currentTimeMillis());
    }

    public void oa(long l) {
        this.ob(l);
    }

    private void a(@NotNull cba_0 cba_02, long l) {
        this.a(this.mxo, cba_02, l);
    }

    private void a(@NotNull ArrayList<cba_0> arrayList, @NotNull cba_0 cba_02, long l) {
        arrayList.add(cba_02);
        cba_02.oa(l);
        this.d((agk_1)cba_02.ccr());
    }

    private void b(@NotNull cba_0 cba_02, long l) {
        this.b(this.mxo, cba_02, l);
    }

    private void b(@NotNull ArrayList<cba_0> arrayList, @NotNull cba_0 cba_02, long l) {
        arrayList.remove(cba_02);
        cba_02.nZ(l);
        this.e((agk_1)cba_02.ccr());
    }

    public synchronized void a(cCs cCs2, long l) {
        int n;
        int n2;
        ArrayList<cba_0> arrayList;
        this.mxu.clear();
        for (int i = this.mxn.size() - 1; i >= 0; --i) {
            this.mxn.get(i).a(this.mxu, cCs2);
        }
        aah_1<ArrayList<cba_0<Object>>> aah_12 = this.mxl.vK(cCs2.aZv());
        if (aah_12 == null) {
            aah_12 = new aah_1();
            this.mxl.b(cCs2.aZv(), aah_12);
        }
        if ((arrayList = aah_12.vK(n2 = cCs2.eJn())) == null) {
            arrayList = new ArrayList();
            aah_12.b(n2, arrayList);
        }
        for (n = arrayList.size() - 1; n >= 0; --n) {
            cba_0<Object> cba_02 = arrayList.get(n);
            if (this.mxu.contains(cba_02)) continue;
            this.b(arrayList, cba_02, l);
        }
        int n3 = this.mxu.size();
        for (n = 0; n < n3; ++n) {
            cba_0 cba_03 = this.mxu.get(n);
            if (cCs2.ckv() && cba_03 instanceof cBy) {
                cBy cBy2 = (cBy)cba_03;
                cBy2.a(cCs2.erT());
            }
            if (arrayList.contains(cba_03)) continue;
            this.a(arrayList, cba_03, l);
        }
    }

    public synchronized void a(long l, agn_1 agn_12, cBj cBj2, long l2) {
        this.mxv.clear();
        for (int i = this.mxn.size() - 1; i >= 0; --i) {
            this.mxn.get(i).a(this.mxv, cBj2);
        }
        if (this.mxv.size() == 0) {
            return;
        }
        ArrayList<cba_0> arrayList = this.mxm.hd(l);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.mxm.a(l, arrayList);
        }
        int n = this.mxv.size();
        for (int i = 0; i < n; ++i) {
            cba_0 cba_02 = this.mxv.get(i).eIP();
            if (cba_02 instanceof cBy) {
                cBy cBy2 = (cBy)cba_02;
                cBy2.a(agn_12);
            }
            if (arrayList.contains(cba_02)) continue;
            this.a(arrayList, cba_02, l2);
        }
    }

    public synchronized void H(long l, long l2) {
        ArrayList<cba_0> arrayList = this.mxm.hc(l);
        if (arrayList == null) {
            return;
        }
        int n = arrayList.size();
        for (int i = 0; i < n; ++i) {
            cba_0 cba_02 = arrayList.get(i);
            cba_02.nZ(l2);
            this.e((agk_1)cba_02.ccr());
        }
    }

    private void ob(long l) {
        int n;
        this.eIl();
        for (n = this.mxo.size() - 1; n >= 0; --n) {
            cba_0 cba_02 = this.mxo.get(n);
            if (this.mxt.contains(cba_02)) continue;
            this.b(cba_02, l);
        }
        int n2 = this.mxt.size();
        for (n = 0; n < n2; ++n) {
            cba_0 cba_03 = this.mxt.get(n);
            if (this.mxo.contains(cba_03)) continue;
            this.a(cba_03, l);
        }
        this.mxr = false;
    }

    @Override
    public synchronized void a(agk_1 agk_12, long l) {
        int n;
        Iterable<Object> iterable;
        int n2;
        if (this.mxr) {
            this.ob(l);
        }
        for (n2 = this.mxo.size() - 1; n2 >= 0; --n2) {
            this.a(agk_12, l, this.mxo, n2);
        }
        for (n2 = this.mxl.bTR() - 1; n2 >= 0; --n2) {
            iterable = this.mxl.vU(n2);
            for (n = ((azz_2)((Object)iterable)).bTR() - 1; n >= 0; --n) {
                ArrayList<cba_0> arrayList = ((aah_1)iterable).vU(n);
                for (int i = arrayList.size() - 1; i >= 0; --i) {
                    this.a(agk_12, l, arrayList, i);
                }
            }
        }
        for (n2 = this.mxm.aVo() - 1; n2 >= 0; --n2) {
            iterable = this.mxm.vU(n2);
            for (n = ((ArrayList)iterable).size() - 1; n >= 0; --n) {
                this.a(agk_12, l, (ArrayList<cba_0>)iterable, n);
            }
        }
        int n3 = this.mxs.size();
        for (n2 = 0; n2 < n3; ++n2) {
            this.mxs.get(n2).a(this);
        }
    }

    private void a(agk_1 agk_12, long l, ArrayList<cba_0> arrayList, int n) {
        cba_0 cba_02 = arrayList.get(n);
        if (cba_02.ccr() != agk_12) {
            return;
        }
        if (!cba_02.od(l)) {
            arrayList.remove(cba_02);
            this.e((agk_1)cba_02.ccr());
        }
    }
}

