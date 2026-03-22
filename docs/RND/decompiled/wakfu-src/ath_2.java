/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
import com.jogamp.opengl.GL2;

/*
 * Renamed from ath
 */
public final class ath_2 {
    public static final int dbm = 0;
    public static final int dbn = 1;
    public static final int dbo = 2;
    public static final int dbp = 4;
    public static final int dbq = 8;
    private GL2 cWv;
    private int dbr;

    public void e(GL2 gL2) {
        this.cWv = gL2;
    }

    public void uu(int n) {
        if (n == this.dbr) {
            return;
        }
        if (n == 0) {
            if ((this.dbr & 1) != 0) {
                this.cWv.glDisableClientState(32884);
            }
            if ((this.dbr & 2) != 0) {
                this.cWv.glDisableClientState(32885);
            }
            if ((this.dbr & 4) != 0) {
                this.cWv.glDisableClientState(32886);
            }
            if ((this.dbr & 8) != 0) {
                this.cWv.glDisableClientState(32888);
            }
            this.dbr = n;
            return;
        }
        this.dbr = n;
        if ((this.dbr & 1) != 0) {
            this.cWv.glEnableClientState(32884);
        }
        if ((this.dbr & 2) != 0) {
            this.cWv.glEnableClientState(32885);
        }
        if ((this.dbr & 4) != 0) {
            this.cWv.glEnableClientState(32886);
        }
        if ((this.dbr & 8) != 0) {
            this.cWv.glEnableClientState(32888);
        }
    }
}

