/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.LinkedList;
import org.apache.log4j.Logger;

/*
 * Renamed from cWZ
 */
public class cwz_1
implements adi_1,
Runnable {
    public static final int nUi = 0;
    public static final int nUj = 1;
    public static final int nUk = 2;
    public static final int nUll = 5000;
    protected static final Logger nUm = Logger.getLogger(cwz_1.class);
    static final cwz_1 nUn = new cwz_1();
    private alx_2 ikv;
    final LinkedList<biv_1> nUo = new LinkedList();
    final LinkedList<biv_1> nUp = new LinkedList();
    private static final int nUq = 9;
    private static final int nUr = 1000;
    private static final int nUs = 100;
    boolean nUt;
    boolean nUu;
    private long nUv;
    public final ArrayList<cxf_2> nUw = new ArrayList();
    private biv_1 nUx;
    boolean bmw;
    private boolean nUy;
    private boolean nUz = false;

    public void a(biv_1 biv_12) {
        this.nUx = biv_12;
        fse_1.gFu().f("currentNotification", this.nUx);
    }

    public void kL(boolean bl) {
        this.nUy = bl;
        if (!this.nUy) {
            this.eWu();
        }
    }

    public void kM(boolean bl) {
        this.nUz = bl;
    }

    private void eWu() {
        this.nUv = System.currentTimeMillis();
    }

    public static cwz_1 eWv() {
        return nUn;
    }

    public boolean a(cxf_2 cxf_22) {
        return !this.nUw.contains(cxf_22) && this.nUw.add(cxf_22);
    }

    public void b(cxf_2 cxf_22) {
        this.nUw.remove(cxf_22);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean b(aam_2 aam_22) {
        switch (aam_22.d()) {
            case 19247: {
                cwz_1 cwz_12 = nUn;
                synchronized (cwz_12) {
                    if (this.nUz) {
                        return false;
                    }
                    dcd dcd2 = (dcd)aam_22;
                    biv_1 biv_12 = new biv_1(dcd2.dZx(), dcd2.bAD(), dcd2.getText(), dcd2.getSoundId(), dcd2.fbo());
                    if (this.bmw && this.eWB() < 9) {
                        this.b(biv_12);
                    } else {
                        this.nUo.addLast(biv_12);
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public void a(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.ikv = new cxa_2(this);
            fyw_0.gqw().a(this.ikv);
            fse_1.gFu().f("notificationPanel", this.nUp.toArray());
            faw_2 faw_22 = (faw_2)ccj_2.g("informationMessageDialog", 139264L);
            this.bmw = false;
            faw_22.setEnablePositionEvents(true);
            faw_22.a(fzq_0.tKi, new cxb_2(this, faw_22), true);
            fyw_0.gqw().d("wakfu.notificationPanel", cfh_2.class);
            this.eWu();
            abg_2.bUP().a((Runnable)this, 1000L, -1);
            cdv_0.euj().d(this);
        }
    }

    @Override
    public void b(aye_2 aye_22, boolean bl) {
        if (!bl) {
            this.clean();
            fse_1.gFu().vX("notificationPanel");
            fyw_0.gqw().b(this.ikv);
            fyw_0.gqw().tl("informationMessageDialog");
            fyw_0.gqw().tc("wakfu.notificationPanel");
            abg_2.bUP().h(this);
            cdv_0.euj().e(this);
        }
    }

    private void clean() {
        this.nUt = false;
        this.nUu = false;
        this.nUp.clear();
        this.nUw.clear();
        this.nUo.clear();
        abg_2.bUP().h(this);
    }

    @Override
    public long Sn() {
        return 0L;
    }

    @Override
    public void dC(long l) {
    }

    void b(biv_1 biv_12) {
        if (biv_12 == null) {
            return;
        }
        this.eWu();
        this.nUp.addFirst(biv_12);
        this.eWx();
        int n = biv_12.getSoundId();
        if (n != -1) {
            cAY.eHc().nP(n);
        }
        if (this.nUp.size() > 1) {
            return;
        }
        this.a(biv_12);
        faw_2 faw_22 = this.eWw();
        faw_22.x(cxg_1.class);
        faw_22.setVisible(true);
        int n2 = 100;
        cxg_1 cxg_12 = new cxg_1(faw_22.getY(), 100, faw_22, 0, 1000, abn.cdr, true);
        cxg_12.a(new cxc_1(this, cxg_12));
        faw_22.a(cxg_12);
        this.nUt = true;
    }

    private faw_2 eWw() {
        fhs_2 fhs_22 = fyw_0.gqw().gqC().uR("informationMessageDialog");
        if (fhs_22 == null) {
            return null;
        }
        return (faw_2)fhs_22.uH("mainContainer");
    }

    void eWx() {
        fse_1.gFu().f("notificationPanel", (Object)null);
        fse_1.gFu().f("notificationPanel", this.nUp.toArray());
    }

    @Override
    public void run() {
        if (this.nUy) {
            return;
        }
        this.a(false, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(boolean bl, biv_1 biv_12) {
        cwz_1 cwz_12 = nUn;
        synchronized (cwz_12) {
            if (this.nUt) {
                this.nUu = true;
                return;
            }
            this.nUu = false;
            if (this.nUp.isEmpty()) {
                return;
            }
            biv_1 biv_13 = this.nUp.getFirst();
            if (biv_13 != null) {
                long l;
                if (!bl && (l = System.currentTimeMillis()) - this.nUv < (long)biv_13.dZx().getDuration()) {
                    return;
                }
            } else {
                return;
            }
            if (this.nUp.size() == 1) {
                faw_2 faw_22 = this.eWw();
                faw_22.x(cxg_1.class);
                cxg_1 cxg_12 = new cxg_1(faw_22.getY(), -200, faw_22, 0, 1000, abn.cdr, false);
                cxg_12.a(new cxd_1(this, faw_22, cxg_12));
                faw_22.a(cxg_12);
                this.nUt = true;
            } else {
                biv_1 biv_14;
                if (bl && biv_12 != null) {
                    this.nUp.remove(biv_12);
                    biv_14 = biv_12;
                } else {
                    biv_14 = this.nUp.removeLast();
                }
                if (!this.nUo.isEmpty()) {
                    biv_1 biv_15 = this.nUo.poll();
                    this.b(biv_15);
                } else {
                    this.eWu();
                }
                if (biv_14 == this.nUx) {
                    this.a(this.nUp.getLast());
                }
                this.eWx();
            }
        }
    }

    void eWy() {
        for (int i = this.nUw.size() - 1; i >= 0; --i) {
            this.nUw.get(i).dow();
        }
    }

    void eWz() {
        for (int i = this.nUw.size() - 1; i >= 0; --i) {
            this.nUw.get(i).dox();
        }
    }

    public boolean eWA() {
        return this.eWB() == 0;
    }

    int eWB() {
        int n = 0;
        for (biv_1 biv_12 : this.nUp) {
            if (biv_12 == null) continue;
            ++n;
        }
        return n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void eWC() {
        cwz_1 cwz_12 = nUn;
        synchronized (cwz_12) {
            if (this.eWA() || this.nUt) {
                return;
            }
            this.a(true, this.nUx);
        }
    }

    public boolean a(biu_1 biu_12) {
        for (biv_1 biv_12 : this.nUp) {
            if (biv_12 == null || biv_12.dZx() != biu_12) continue;
            return true;
        }
        return false;
    }
}

