/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bBl
 */
public class bbl_1
extends bCA {
    static final Logger jFZ = Logger.getLogger(bbl_1.class);
    private boolean dlB;

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bkJ, rw_0.blo};
    }

    @Override
    protected rw_0 dNn() {
        return rw_0.bkJ;
    }

    @Override
    public cpm_1[] dNh() {
        return new cpm_1[]{cps_1.njN.eLI(), cps_1.njO.eLI()};
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    public fpR dPE() {
        return fpR.fz(this.bem());
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        this.b(rw_02);
        this.c(rw_02);
        if (rw_02 == rw_0.bkJ || rw_02 == rw_0.blo) {
            bND.a(new bbm_2(this, rw_02));
        }
        return true;
    }

    public void dk(boolean bl) {
        this.dlB = bl;
    }

    public boolean bOK() {
        return this.dlB;
    }

    @Override
    protected void dbu() {
        super.dbu();
        this.dlB = false;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ac((short)fpR.sQT.ordinal());
    }

    static /* synthetic */ void a(bbl_1 bbl_12, ayv_2 ayv_22) {
        bbl_12.a(ayv_22);
    }
}

