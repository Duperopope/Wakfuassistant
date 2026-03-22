/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bcx
 */
public abstract class bcx_2
implements aeh_2 {
    public static final int hFa = 1;
    public static final int hFb = 2;
    public static final int hFc = 3;
    public static final String hFd = "name";
    public static final String hFe = "iconUrl";
    public static final String hFf = "style";
    public static final String hFg = "type";
    public static final String hFh = "remainingTime";
    public static final String hFi = "goals";
    public static final String hFj = "ranking";
    public static final String hFk = "backgroundText";
    public static final String hFl = "canBeUnfollowed";

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hFd)) {
            return this.getName();
        }
        if (string.equals(hFe)) {
            return this.byf();
        }
        if (string.equals(hFf)) {
            return this.getStyle();
        }
        if (string.equals(hFg)) {
            return this.aeV();
        }
        if (string.equals(hFh)) {
            return this.dbr();
        }
        if (string.equals(hFi)) {
            return this.dbs();
        }
        if (string.equals(hFj)) {
            return this.dbt();
        }
        if (string.equals(hFk)) {
            return this.dbq();
        }
        if (string.equals(hFl)) {
            return aue_0.cVJ().cVL().dpy().Bc(this.d());
        }
        return null;
    }

    protected abstract String dbq();

    public abstract String getName();

    protected abstract String byf();

    public abstract int aeV();

    public abstract int d();

    protected abstract String dbr();

    protected abstract ArrayList<bcw_1> dbs();

    protected abstract String dbt();

    protected abstract String getStyle();

    public void dbA() {
        fse_1.gFu().a((aef_2)this, hFh);
    }

    public void dbB() {
        fse_1.gFu().a((aef_2)this, hFi, hFk, "tabbedContainerSize");
        bcm_1.hIK.dcv();
    }

    public void dbC() {
        fse_1.gFu().a((aef_2)this, hFj);
    }

    public void daR() {
        for (bcw_1 bcw_12 : this.dbs()) {
            fse_1.gFu().a((aef_2)bcw_12, "canBeCompassedNow");
            fse_1.gFu().a((aef_2)bcw_12, "canBeCompassed");
        }
    }
}

