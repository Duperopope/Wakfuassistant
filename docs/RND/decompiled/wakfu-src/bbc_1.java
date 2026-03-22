/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bBC
 */
public class bbc_1
extends bCA {
    static final Logger jGp = Logger.getLogger(bbc_1.class);
    private bbg_1 jGq;

    @Override
    protected fi_1 bey() {
        return new bbd_2(this);
    }

    @Override
    public cpm_1[] dNh() {
        if (((bDl)this.dNj()).dQK() <= 0) {
            return cpm_1.nip;
        }
        cqw_1 cqw_12 = (cqw_1)cps_1.niR.eLI();
        cqw_12.CV(crc_2.nmp.nnW);
        cqw_12.setName("desc.mru.openSeedSpreader");
        cqw_12.e(rw_0.bla);
        return new cpm_1[]{cqw_12};
    }

    @Override
    public void c(ng_1 ng_12) {
        jGp.info((Object)("[ON VIEW UPDATED] " + String.valueOf(ng_12)));
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        jGp.info((Object)("Action performed on interactive element : " + rw_02.toString()));
        this.b(rw_02);
        if (rw_02 == rw_0.bla) {
            this.jGq = new bbg_1(this);
            aue_0.cVJ().a(this.jGq);
            this.c(rw_02);
        }
        return true;
    }

    public bbg_1 dPK() {
        return this.jGq;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bla;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bla};
    }

    @Override
    public byte bcN() {
        return 8;
    }

    @Override
    public bDh dNj() {
        if (this.jJu == null) {
            this.jJu = new bDl(this);
        }
        return this.jJu;
    }

    @Override
    public boolean bej() {
        return true;
    }

    static /* synthetic */ void a(bbc_1 bbc_12, ayv_2 ayv_22) {
        bbc_12.a(ayv_22);
    }
}

