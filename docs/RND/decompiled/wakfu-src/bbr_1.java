/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bBr
 */
public class bbr_1
extends bCA {
    static final Logger jGd = Logger.getLogger(bbr_1.class);
    protected fdb_0 jGe;

    bbr_1() {
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        this.b(rw_02);
        return false;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.blj;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.blj};
    }

    @Override
    public cpm_1[] dNh() {
        cpm_1[] cpm_1Array = new cpm_1[1];
        return cpm_1Array;
    }

    @Override
    public short chU() {
        return 60;
    }

    @Override
    public String getName() {
        return aum_0.cWf().a(110, (long)this.jGe.d(), new Object[0]);
    }

    @Override
    public void dNq() {
        if (BH.aU(this.baB)) {
            this.jGe = null;
            return;
        }
        String[] stringArray = this.baB.split(";");
        if (stringArray.length != 1) {
            jGd.error((Object)("[LD] L'IE de Stool " + this.aXv + " doit avoir 1 param\u00e8tre"));
            return;
        }
        fdb_0 fdb_02 = (fdb_0)fda_0.rWI.a(fdv_0.rZj, Integer.valueOf(stringArray[0]));
        if (fdb_02 == null) {
            jGd.error((Object)("[LD] L'IE de Recycle " + this.aXv + " \u00e0 un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.jGe = fdb_02;
    }

    protected int bcJ() {
        return 1;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jGe = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.bmf = 1;
        this.setVisible(true);
        this.bf(false);
        this.bi(true);
        this.jHu = true;
        this.jHv = true;
        assert (this.jGe == null);
    }

    @Override
    public bDh dNj() {
        if (this.jJu == null) {
            this.jJu = new bDk(this);
        }
        return this.jJu;
    }

    @Override
    public boolean bej() {
        return true;
    }

    static /* synthetic */ void a(bbr_1 bbr_12, ayv_2 ayv_22) {
        bbr_12.a(ayv_22);
    }
}

