/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.LinkedList;
import org.apache.log4j.Logger;

/*
 * Renamed from bkC
 */
public class bkc_2
implements Runnable {
    private static final Logger irj = Logger.getLogger(bkc_2.class);
    private static final bkc_2 irk = new bkc_2();
    private static final float[] irl = new float[]{1.0f, 1.0f, 1.0f, 0.6f};
    private final LinkedList<bkb_1> irm = new LinkedList();
    public static final boolean irn = false;

    public static bkc_2 dsD() {
        return irk;
    }

    private bkc_2() {
    }

    public void dsE() {
        while (!this.a(this.dsF())) {
        }
    }

    private boolean a(bkb_1 bkb_12) {
        if (bkb_12 == null) {
            return true;
        }
        bkb_12.dsl();
        if (bkb_12.isEnabled() && bkb_12.bxO()) {
            bkb_12.run(true);
            return true;
        }
        return false;
    }

    bkb_1 dsF() {
        if (this.irm.isEmpty()) {
            return null;
        }
        return this.irm.poll();
    }

    public void b(bkb_1 bkb_12) {
        if (this.c(bkb_12)) {
            return;
        }
        bkb_12.dsk();
        this.irm.add(bkb_12);
    }

    public boolean dsG() {
        return this.irm.isEmpty();
    }

    public void clear() {
        irj.info((Object)"[QUEUE_COLLECT] on clear toutes les actions");
        this.dsK();
        for (int i = this.irm.size() - 1; i >= 0; --i) {
            this.d(this.irm.get(i));
        }
    }

    public boolean c(bkb_1 bkb_12) {
        bmv_2 bmv_22 = bkb_12.dsB();
        ZG zG = bkb_12.dsC();
        if (bmv_22 == null || zG == null) {
            return true;
        }
        for (bkb_1 bkb_13 : this.irm) {
            if (!bmv_22.equals(bkb_13.dsB()) || !zG.equals(bkb_13.dsC())) continue;
            return true;
        }
        return false;
    }

    public void d(bkb_1 bkb_12) {
        if (this.irm.contains(bkb_12)) {
            bkb_12.dsl();
            this.irm.remove(bkb_12);
        }
    }

    public boolean j(bKV bKV2) {
        for (bkb_1 bkb_12 : this.irm) {
            if (!bkb_12.dsC().equals(bKV2)) continue;
            return true;
        }
        return false;
    }

    public void dsH() {
        this.dsI();
        abg_2.bUP().a((Runnable)this, 5000L, 1);
    }

    public void dsI() {
        abg_2.bUP().h(this);
    }

    public boolean dsJ() {
        bkb_0 bkb_02 = aue_0.cVJ().cVK().dps();
        return bkb_02 != null && (bkb_02.dsm() == 3 || bkb_02.dsm() == 6);
    }

    public void dsK() {
        this.dsI();
    }

    @Override
    public void run() {
        irj.warn((Object)"[QUEUE_COLLECT] timeOut execut\u00e9");
        this.dsE();
    }
}

