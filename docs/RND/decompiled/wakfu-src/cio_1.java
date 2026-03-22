/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cIo
 */
public class cio_1
extends cir_1 {
    private static final Logger ndD = Logger.getLogger(cio_1.class);
    private final fsb_0 ndE;
    private final int ndF;
    private final int ndG;

    public cio_1(fsb_0 fsb_02) {
        super(new cis_1(false, true));
        this.ndE = fsb_02;
        this.ndF = this.ndE.gli().bWx();
        this.ndG = this.ndE.gli().bWy();
    }

    @Override
    public fsc_0 eLc() {
        return fsc_0.tdW;
    }

    @Override
    protected void ey(int n, int n2) {
        if (this.ndE == null) {
            ndD.error((Object)"pas de batiment a d\u00e9placer");
            return;
        }
        fbk_0 fbk_02 = this.ndE.glj().erN();
        acc_1 acc_12 = this.nae.getCellCoordFromMouse(n, n2);
        acc_1 acc_13 = this.nae.getHavenWorldImages().JX(fbk_02.conn());
        int n3 = acc_12.bWx() + acc_13.bWx();
        int n4 = acc_12.bWy() + acc_13.bWy();
        fsn_0 fsn_02 = new fsn_0(this.nae.getWorkingHavenWorld(), cah_1.lFD);
        caj_2 caj_22 = new caj_2(this.ndE.Lx(), fbk_02.aIi(), this.ndE.glj().azv(), (short)n3, (short)n4);
        fsn_02.b(caj_22);
        fsb_0 fsb_02 = this.nae.i(caj_22);
        this.kWd = new cia_1(fsb_02, (short)this.ndF, (short)this.ndG);
        this.kWd.T(fsn_02.glx());
    }

    @Override
    protected void eLd() {
        super.eLd();
    }
}

