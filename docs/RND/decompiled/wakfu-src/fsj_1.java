/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Cursor;
import org.apache.log4j.Logger;

/*
 * Renamed from fSJ
 */
public class fsj_1
implements fsl_1,
Runnable {
    private static Logger oO = Logger.getLogger(fsj_1.class);
    private Cursor[] veC;
    private int bSr;
    private int crT;

    public fsj_1(Cursor[] cursorArray, int n) {
        assert (n > 0) : "delay <= 0 !";
        assert (cursorArray != null && cursorArray.length > 0) : "Invalid cursor array !";
        this.veC = cursorArray;
        this.bSr = n;
        this.crT = 0;
    }

    public long Sn() {
        return 1L;
    }

    public void dC(long l) {
    }

    @Override
    public void cDD() {
        this.crT = 0;
        this.run();
        abg_2.bUP().a((Runnable)this, this.bSr, -1);
    }

    @Override
    public void eKH() {
        abg_2.bUP().h(this);
    }

    @Override
    public void run() {
        fyw_0.gqw().bmB().a(this.veC[this.crT]);
        this.crT = (this.crT + 1) % this.veC.length;
    }
}

