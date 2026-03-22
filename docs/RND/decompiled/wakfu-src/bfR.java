/*
 * Decompiled with CFR 0.152.
 */
import java.util.Date;

public class bfR
implements aeh_2 {
    public static final bfR hWV = new bfR();
    public static final String hWW = "title";
    public static final String hWX = "isEmpty";
    public static final String hWY = "timeStateText";
    public static final String hWZ = "remainingTime";
    private final Date hXa = new Date();

    public void g(long l, boolean bl) {
        if (l > 0L) {
            this.hXa.setTime(System.currentTimeMillis() + l);
            if (bl) {
                this.dic();
            }
        }
    }

    public void dic() {
        abb_2.bUA().b(csj_2.eOt());
        abb_2.bUA().a(csj_2.eOt(), 1000L, -1);
        this.cAN();
    }

    private short dhG() {
        long l = System.currentTimeMillis();
        return (short)Math.max(0L, (this.hXa.getTime() - l) / 1000L);
    }

    public void dhE() {
        fse_1.gFu().a((aef_2)this, hWY, hWZ);
    }

    public void cAN() {
        fse_1.gFu().a((aef_2)this, hWW, hWX, hWY, hWZ);
    }

    @Override
    public String[] bxk() {
        return null;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hWW)) {
            return aum_0.cWf().c("challenge.state.waitingNext", new Object[0]);
        }
        if (string.equals(hWX)) {
            return true;
        }
        if (string.equals(hWY)) {
            ahv_2 ahv_22 = new ahv_2();
            ahv_22.ceC().c(aum_0.cWf().c("challenge.remainingTime", bfW.br(this.dhG()))).ceD();
            return ahv_22.ceL();
        }
        if (string.equals(hWZ)) {
            return bfW.br(this.dhG());
        }
        if (string.equals("isChaos")) {
            return false;
        }
        return null;
    }
}

