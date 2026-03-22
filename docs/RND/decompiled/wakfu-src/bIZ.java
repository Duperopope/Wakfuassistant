/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class bIZ {
    protected static final Logger kjW = Logger.getLogger(bIZ.class);
    private final LinkedList<cyf_1> kjX = new LinkedList();
    cyf_1 kjY;

    public void a(cyf_1 cyf_12) {
        String string = cyf_12.getText();
        boolean bl = cyf_12.bKa();
        long l = cyf_12.Tz();
        if (!bl && !((bsg_1)aie_0.cfn().bmH()).a(bsn_1.ljD)) {
            return;
        }
        if (this.kjY == null || !this.kjY.bKa() && bl) {
            this.kjY = cyf_12;
            fse_1.gFu().f("petBubbleMessage", string);
            if (l != -1L) {
                long l2 = l > 0L ? l : (long)(Xh.dK(string) / 2);
                abg_2.bUP().a((Runnable)new bja_0(this, cyf_12), l2, 1);
            }
            aPd.f("gelutin", string);
        } else {
            this.kjX.addLast(cyf_12);
        }
    }

    public void dZU() {
        this.kjY = null;
        if (!this.kjX.isEmpty()) {
            this.a(this.kjX.poll());
        } else {
            cye_1.eYk().eYl();
        }
    }

    public void clean() {
        this.kjY = null;
        this.kjX.clear();
        cye_1.eYk().eYl();
    }
}

