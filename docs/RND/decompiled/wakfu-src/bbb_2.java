/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from bBb
 */
public class bbb_2
extends bxb_0
implements bDs {
    static final Logger jFP = Logger.getLogger(bbb_2.class);
    public static final short jFQ = 1;
    private bDn jCz;
    private static final cpm_1[] jFR = cpm_1.nip;

    protected bbb_2() {
    }

    @Override
    protected void eZ(ByteBuffer byteBuffer) {
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jCz = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ac((short)1);
        this.setVisible(true);
        this.bf(false);
        this.bi(true);
        this.ht(true);
        this.setSelectable(true);
        assert (this.jCz == null);
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        if (!super.b(rw_02, rG)) {
            this.b(rw_02);
        }
        return true;
    }

    @Override
    public rw_0 dNn() {
        return rw_0.bkJ;
    }

    @Override
    protected rw_0[] dNg() {
        return new rw_0[]{rw_0.bkJ};
    }

    @Override
    protected cpm_1[] dNi() {
        if (this.jCz == null) {
            jFP.error((Object)("Pas de m_info pour craftTableId=" + this.aXv));
            return jFR;
        }
        fqy_0 fqy_02 = fqz_0.giz().YY(this.jCz.clf());
        if (fqy_02 == null) {
            jFP.error((Object)("Pas de visual id=" + this.jCz.clf()));
            return jFR;
        }
        cqg_2 cqg_22 = (cqg_2)cps_1.niK.eLI();
        cqg_22.b(fqy_02);
        cro_1 cro_12 = (cro_1)cps_1.njD.eLI();
        cro_12.b(fqy_02);
        return new cpm_1[]{cqg_22, cro_12};
    }

    @Override
    public short chU() {
        return 60;
    }

    @Override
    public String getName() {
        if (this.jCz == null) {
            jFP.error((Object)("Pas de param\u00e9trage valide pour craftTableId=" + this.aXv));
            return "#ERROR#";
        }
        return aum_0.cWf().a(59, (long)this.jCz.d(), new Object[0]);
    }

    @Override
    public void dNq() {
        super.dNq();
        bDn bDn2 = (bDn)fda_0.rWI.a(fdv_0.rYT, Integer.valueOf(this.baB));
        if (bDn2 == null) {
            jFP.error((Object)("[LD] La Machine de Craft " + this.aXv + " \u00e0 un param\u00e8tre [" + Integer.valueOf(this.baB) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.jCz = bDn2;
        this.ht(true);
    }

    @Override
    public int cms() {
        return this.jCz.cms();
    }

    @Override
    public boolean Gb(int n) {
        return this.jCz.fTq().contains(n);
    }

    @Override
    protected void a(ox_1 ox_12) {
    }

    @Override
    public boolean i(int n, byte by) {
        return this.jCz != null ? this.jCz.fTq().contains(n) : false;
    }

    @Override
    public int clf() {
        return this.jCz != null ? this.jCz.clf() : 0;
    }

    @Override
    public fnJ dOh() {
        return fnJ.sKt;
    }

    @Override
    public bDn dOd() {
        return this.jCz;
    }

    static /* synthetic */ void a(bbb_2 bbb_22, ayv_2 ayv_22) {
        bbb_22.a(ayv_22);
    }
}

