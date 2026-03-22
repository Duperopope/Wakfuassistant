/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.LinkedList;
import org.apache.log4j.Logger;

/*
 * Renamed from aFZ
 */
public class afz_1
implements afx_2 {
    protected static final Logger dJZ = Logger.getLogger(afz_1.class);
    private static final afz_1 dKa = new afz_1();
    private agc_2 dKb = age_2.dKw;
    private afw_2 dKc;
    private final LinkedList<afw_2> dKd = new LinkedList();
    private boolean dKe = false;

    public static afz_1 cbc() {
        return dKa;
    }

    public afw_2 c(aft_2 aft_22) {
        if (this.dKc == null) {
            this.dKc = this.dKb.cbn();
        }
        this.dKc.b(aft_22);
        aft_22.a(this.dKc);
        return this.dKc;
    }

    public afw_2 d(aft_2 aft_22) {
        afw_2 afw_22 = this.dKb.cbn();
        afw_22.b(aft_22);
        this.dKd.add(afw_22);
        aft_22.a(afw_22);
        return afw_22;
    }

    public void cbd() {
        if (this.dKc != null) {
            this.dKc.bLI();
        }
        this.dKc = null;
    }

    public void clear() {
        this.cbd();
        int n = this.dKd.size();
        for (int i = 0; i < n; ++i) {
            try {
                this.dKd.get(i).bLI();
                continue;
            }
            catch (Exception exception) {
                dJZ.error((Object)"", (Throwable)exception);
            }
        }
        this.dKd.clear();
        this.dKe = false;
    }

    public afw_2 cbe() {
        return this.dKc;
    }

    public LinkedList<afw_2> cbf() {
        return this.dKd;
    }

    public void cbg() {
        if (this.dKc == null) {
            return;
        }
        this.dKd.add(this.dKc);
        this.dKc = null;
        if (!this.dKe) {
            this.cbh();
        }
    }

    private void cbh() {
        if (!this.dKe && !this.dKd.isEmpty()) {
            this.dKe = true;
            afw_2 afw_22 = this.dKd.getFirst();
            afw_22.a(this);
            afw_22.cba();
        }
    }

    @Override
    public void b(afw_2 afw_22) {
        this.dKd.remove(afw_22);
        this.dKe = false;
        this.cbh();
    }

    public void cbi() {
        dJZ.info((Object)("Action In Execution : " + this.dKe));
        if (!this.dKd.isEmpty()) {
            for (afw_2 object : this.dKd) {
                dJZ.info((Object)("Executing Action Group (" + object.caZ().size() + " actions)"));
                for (aft_2 aft_22 : object.caZ()) {
                    dJZ.info((Object)(" * " + aft_22.getClass().getSimpleName()));
                }
            }
        }
        if (this.dKc != null) {
            dJZ.info((Object)("Pending Action Group (" + this.dKc.caZ().size() + " groupes)"));
            for (aft_2 aft_23 : this.dKc.caZ()) {
                dJZ.info((Object)(" - " + aft_23.getClass().getSimpleName()));
            }
        } else {
            dJZ.info((Object)"Pending Action Group is null");
        }
    }

    public void cbb() {
        while (!this.dKd.isEmpty()) {
            afw_2 afw_22 = this.dKd.getFirst();
            afw_22.b(this);
            afw_22.cbb();
            this.dKd.remove(afw_22);
        }
    }

    public void a(agc_2 agc_22) {
        this.dKb = agc_22;
    }
}

