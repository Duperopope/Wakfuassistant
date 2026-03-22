/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fCH
 */
public class fch_1
extends faw_2 {
    private static Logger oO = Logger.getLogger(fch_1.class);
    public static final String TAG = "RootContainer";
    protected faw_2 tSq;
    protected faw_2 tZO;
    protected fbw_1 tZP;
    protected final fho_1 tZQ = new fho_1(this);

    @Override
    public void e(fhv_1 fhv_12) {
        this.tSq.e(fhv_12);
    }

    @Override
    public void b(fhp_1 fhp_12) {
        this.tSq.b(fhp_12);
    }

    public void a(fes_2 fes_22, int n, boolean bl) {
        if (bl) {
            this.tSq.c(fes_22, n);
        } else {
            super.c(fes_22, n);
        }
    }

    @Override
    public void c(fes_2 fes_22, int n) {
        this.a(fes_22, n, true);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    public faw_2 getContentContainer() {
        return this.tSq;
    }

    public fbw_1 getLayeredContainer() {
        return this.tZP;
    }

    public fho_1 getWindowManager() {
        return this.tZQ;
    }

    public void guh() {
        this.tZP = new fbw_1();
        this.tZP.aVI();
        this.tSq = faw_2.checkOut();
        frp_1 frp_12 = new frp_1();
        frp_12.aVI();
        frp_12.setSize(new fsm_1(100.0f, 100.0f));
        this.tSq.d(frp_12);
        this.tZP.d(this.tSq, -30000);
        super.d(this.tZP);
    }

    @Override
    public void aVI() {
        super.aVI();
        fci_1 fci_12 = new fci_1(this);
        fci_12.aVI();
        this.a(fci_12);
        this.guh();
        this.tRf = true;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.tZQ.clean();
        fhw_2.gAL().eY(this);
    }
}

