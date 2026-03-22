/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bks
 */
public class bks_2
extends bkb_0 {
    protected static final Logger iqR = Logger.getLogger(bks_2.class);
    private long iqc;
    private final bba_2 iqS;
    private final short iqT;
    private final short iqU;

    public bks_2(bba_2 bba_22, short s) {
        this.iqS = bba_22;
        this.iqU = s;
        this.iqT = this.iqS.bem();
    }

    @Override
    public short dsm() {
        return this.iqU;
    }

    @Override
    public boolean dsn() {
        if (this.iqS == null) {
            iqR.error((Object)"[DISTRIBUTION] Impossible d'utiliser une machine de distribution null");
            return false;
        }
        if (this.iqd.doP() || this.iqd.djT()) {
            iqR.info((Object)"[DISTRIBUTION] Un joueur mort ou en combat ne peut utiliser de machine de distribution");
            return false;
        }
        return true;
    }

    @Override
    public void bIH() {
        this.iqd.i(false, true);
        this.iqd.a(this);
        this.iqd.a(this.iqd.aZw().x(this.iqS.aZw()));
        blq_0.a(this.iqd.ddI(), this.iqS.drR());
        if (this.iqS.dOY() > 0) {
            this.iqS.ac(this.iqS.dOY());
        }
        this.iqS.aVQ();
        if (this.iqc > 0L) {
            this.iqd.dcM().C(this.iqS.Sn(), this.iqc);
        } else {
            this.iqd.dnY();
        }
    }

    @Override
    public boolean k(boolean bl, boolean bl2) {
        this.iqd.dcM().ebM();
        this.iqd.ddI().dT(this.iqd.ddI().ddu());
        this.iqS.ac(this.iqT);
        this.iqS.aVQ();
        if (bl2) {
            cmo_0 cmo_02 = new cmo_0();
            cmo_02.dw((byte)3);
            cmo_02.cD(this.dsm());
            aue_0.cVJ().etu().d(cmo_02);
        }
        return true;
    }

    @Override
    public boolean dsd() {
        bdj_2 bdj_22 = this.iqd.ddI();
        this.iqd.dcM().ebM();
        this.iqS.ac(this.iqT);
        this.iqS.aVQ();
        String string = ZI.m(bdj_22.bkI(), true);
        bdj_22.dT(string);
        cmo_0 cmo_02 = new cmo_0();
        cmo_02.dw((byte)2);
        cmo_02.cD(this.iqU);
        aue_0.cVJ().etu().d(cmo_02);
        return true;
    }

    public void jV(long l) {
        this.iqc = l;
    }

    public String toString() {
        return "InteractiveElementUseOccupation{m_estimatedTime=" + this.iqc + ", m_machine=" + String.valueOf(this.iqS) + ", m_realMachineState=" + this.iqT + ", m_occupationTypeId=" + this.iqU + "}";
    }

    @Override
    public boolean dsj() {
        return false;
    }
}

