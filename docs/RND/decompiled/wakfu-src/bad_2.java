/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bAd
 */
public class bad_2
extends bCA {
    static final Logger jEI = Logger.getLogger(bad_2.class);
    private fdv jEJ;
    long jEK;

    @Override
    protected fi_1 bey() {
        return new bae_2(this);
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        this.b(rw_02);
        this.c(rw_02);
        return true;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bll;
    }

    @Override
    public rw_0[] dNf() {
        return new rw_0[]{rw_0.bll, rw_0.bld};
    }

    @Override
    public void dNq() {
        this.jEJ = (fdv)fda_0.rWI.a(fdv_0.rZq, Integer.parseInt(this.baB));
    }

    @Override
    public cpm_1[] dNh() {
        fqy_0 fqy_02 = fqz_0.giz().YY(this.jEJ.clf());
        ArrayList<cqw_1> arrayList = new ArrayList<cqw_1>();
        cqb_2 cqb_22 = new cqb_2("informations", crc_2.nms.nnW);
        cqb_22.e(rw_0.bll);
        arrayList.add(cqb_22);
        if (aue_0.cVJ().cVK().dpL().a(evn_2.ovf)) {
            cqw_1 cqw_12 = new cqw_1();
            cqw_12.e(rw_0.bld);
            cqw_12.setName("XXX---> 3V01U7!0N <---XXX");
            cqw_12.CV(crc_2.nnn.nnW);
            arrayList.add(cqw_12);
        }
        return arrayList.toArray(new cpm_1[arrayList.size()]);
    }

    @Override
    public String getName() {
        return "TODO";
    }

    public long ZC() {
        return this.jEK;
    }

    public fdv dPf() {
        return this.jEJ;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.jEJ = null;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jEJ = null;
    }

    static /* synthetic */ void a(bad_2 bad_22, ayv_2 ayv_22) {
        bad_22.a(ayv_22);
    }
}

