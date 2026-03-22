/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from byK
 */
public class byk_0
extends bxb_0 {
    static final Logger jCV = Logger.getLogger(byk_0.class);
    public static final short jCW = 1;
    private int emw;
    protected fdo jCX;

    protected byk_0() {
    }

    @Override
    protected void eZ(ByteBuffer byteBuffer) {
        this.emw = byteBuffer.getInt();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.ac((short)1);
        this.setVisible(true);
        this.bi(true);
        this.bf(true);
        this.emw = -1;
        assert (this.jCX == null);
    }

    @Override
    public void aVH() {
        super.aVH();
        this.jCX = null;
    }

    @Override
    public void c(ng_1 ng_12) {
    }

    @Override
    public boolean b(rw_0 rw_02, RG rG) {
        if (rw_02 == rw_0.bkJ) {
            cso_2 cso_22 = cso_2.eOa();
            cso_22.Mr(this.jCX.fTm());
            aue_0.cVJ().a(cso_22);
            return true;
        }
        return super.b(rw_02, rG);
    }

    @Override
    public void dNq() {
        String[] stringArray = this.baB.split(";");
        if (stringArray.length != 1) {
            jCV.error((Object)("[LD] L'IE de DimensionalBagBackgroundDisplay " + this.aXv + " doit avoir 1 param\u00e8tre"));
            return;
        }
        fdo fdo2 = (fdo)fda_0.rWI.a(fdv_0.rYV, Integer.valueOf(stringArray[0]));
        if (fdo2 == null) {
            jCV.error((Object)("[LD] L'IE de DimensionalBagBackgroundDisplay " + this.aXv + " \u00e0 un parametre [" + Integer.valueOf(stringArray[0]) + "] qui ne correspond a rien dans les Admins"));
            return;
        }
        this.jCX = fdo2;
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
        cqf_1 cqf_12 = (cqf_1)cps_1.niQ.eLI();
        cqf_12.CV(crc_2.nms.nnW);
        cqf_12.qb("desc.mru.lookAt");
        return new cpm_1[]{cqf_12};
    }

    @Override
    public boolean dOf() {
        Object r = fgD.fXh().Vd(this.emw);
        return r != null;
    }

    @Override
    public String getName() {
        Object r = fgD.fXh().Vd(this.emw);
        if (r != null) {
            return ((fhc_0)r).getName();
        }
        return "<UNKNOWN>";
    }

    @Override
    protected void a(ox_1 ox_12) {
    }

    @Override
    public fnJ dOh() {
        return fnJ.sKr;
    }

    static /* synthetic */ void a(byk_0 byk_02, ayv_2 ayv_22) {
        byk_02.a(ayv_22);
    }
}

