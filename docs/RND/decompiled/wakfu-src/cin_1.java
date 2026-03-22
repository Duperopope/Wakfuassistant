/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cIn
 */
public class cin_1
extends cir_1 {
    private static final Logger ndB = Logger.getLogger(cin_1.class);
    private final fcb_0 ndC;

    public cin_1(fcb_0 fcb_02) {
        super(new cis_1(true, true));
        this.ndC = fcb_02;
    }

    @Override
    public fsc_0 eLc() {
        return fsc_0.tdV;
    }

    @Override
    protected void ey(int n, int n2) {
        acc_1 acc_12 = this.nae.getPatchCoordFromMouse(n, n2);
        fsP fsP2 = new fsP(this.nae.getWorkingHavenWorld(), cah_1.lFD);
        short s = this.eA(n, n2);
        fsG fsG2 = this.nae.b(this.ndC, acc_12.bWx(), acc_12.bWy());
        this.kWd = new civ_1(fsG2, s);
        fsP2.b(this.ndC.fRN(), acc_12.bWx(), acc_12.bWy());
        this.kWd.T(fsP2.glx());
    }

    private short eA(int n, int n2) {
        fsG fsG2 = this.nae.getGroundUnderMouse(n, n2);
        if (fsG2 != null) {
            this.nae.b(fsG2);
            return fsG2.fRN();
        }
        return fsu.tdo;
    }
}

