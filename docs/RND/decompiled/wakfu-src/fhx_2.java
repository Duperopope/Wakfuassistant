/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Comparator;

/*
 * Renamed from fHx
 */
public class fhx_2 {
    private static final fhx_2 uyh = new fhx_2();
    public static short uyi = 1;
    public static short uyj = (short)10000;
    public static final short uyk = 20000;
    public static final short uyl = 30000;
    private static final int uym = 4;
    private final ArrayList<fhv_1> uyn = new ArrayList();
    private short uyo = 0;
    private static final Comparator<fhv_1> uyp = new fhy_1();
    private faw_2 uyq;
    private fff_2 uyr;

    private fhx_2() {
    }

    public static fhx_2 gAQ() {
        return uyh;
    }

    public void q(fhv_1 fhv_12) {
        if (fhv_12.getModalLevel() > this.uyo) {
            this.uyo = fhv_12.getModalLevel();
            fhw_2.gAL().gAN();
        }
        this.uyn.add(fhv_12);
        this.uyn.sort(uyp);
    }

    public void r(fhv_1 fhv_12) {
        this.uyo = this.uyo + 1 < 20000 ? (short)20000 : (short)(this.uyo + 1);
        fhv_12.setModalLevel(this.uyo);
        fhw_2.gAL().gAN();
        this.uyn.add(fhv_12);
        this.uyn.sort(uyp);
        fbj_1 fbj_12 = fbj_1.getInstance();
        fbw_1 fbw_12 = fbj_12.getLayeredContainer();
        int n = fbw_12.getWidgetPositionInLayer((fes_2)fhv_12);
        if (this.uyn.size() == 1) {
            this.uyq = new faw_2();
            this.uyq.aVI();
            frp_1 frp_12 = new frp_1();
            frp_12.aVI();
            frp_12.setAlign(fzw_0.tLg);
            frp_12.setSize(fhx_2.a(fbj_12.getSize()));
            this.uyq.setLayoutData(frp_12);
            fkk_1 fkk_12 = new fkk_1();
            fkk_12.aVI();
            fkk_12.setColor(fyw_0.gqw().gqx());
            this.uyq.getAppearance().X(fkk_12);
            fbw_12.a(this.uyq, 26000, n);
            this.uyr = (fsm_12, fsm_13) -> frp_12.setSize(fhx_2.a(fsm_13));
            fbj_1.getInstance().a(this.uyr);
        } else {
            fbw_12.setWidgetPositionInLayer(this.uyq, n - 1);
        }
    }

    private static fsm_1 a(fsm_1 fsm_12) {
        return new fsm_1(fsm_12.width + 4, fsm_12.height + 4);
    }

    public void l(fhv_1 fhv_12) {
        boolean bl;
        if (fhv_12.getModalLevel() == this.uyo) {
            this.uyo = 0;
            for (fhv_1 fhv_13 : this.uyn) {
                if (fhv_13.getModalLevel() <= this.uyo) continue;
                this.uyo = fhv_13.getModalLevel();
            }
        }
        if (bl = this.uyn.remove(fhv_12)) {
            if (this.uyn.isEmpty()) {
                this.uyq.gAD();
                if (this.uyr != null) {
                    fbj_1.getInstance().b(this.uyr);
                }
            } else {
                fhv_1 fhv_13;
                fhv_13 = fbj_1.getInstance();
                fbw_1 fbw_12 = ((fch_1)fhv_13).getLayeredContainer();
                fhv_1 fhv_14 = this.uyn.get(this.uyn.size() - 1);
                int n = fbw_12.getWidgetPositionInLayer((fes_2)fhv_14);
                int n2 = fbw_12.getWidgetPositionInLayer(this.uyq);
                fbw_12.setWidgetPositionInLayer(this.uyq, n - (n2 < n ? 1 : 0));
            }
        }
    }

    public void bxV() {
        this.uyn.clear();
    }

    public short gAR() {
        return this.uyo;
    }

    public boolean hb(int n, int n2) {
        if (!this.uyn.isEmpty()) {
            fes_2 fes_22;
            for (fes_22 = fbj_1.getInstance().getWidget(n, n2); fes_22 != null && fes_22.getModalLevel() == -1 && fes_22 != fbj_1.getInstance(); fes_22 = fes_22.getParentOfType(fes_2.class)) {
            }
            if (fes_22 != null) {
                return fes_22.getModalLevel() >= this.uyn.get(0).getModalLevel();
            }
        }
        return true;
    }

    public boolean aJG() {
        return this.uyn.isEmpty();
    }
}

