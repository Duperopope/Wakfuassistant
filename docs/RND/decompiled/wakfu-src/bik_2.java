/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bIK
 */
public class bik_2
extends bip_2 {
    private static final Logger khY = Logger.getLogger(bik_2.class);
    private static final bik_2 khZ = new bik_2();
    private static final String kia = "bgColor";
    private axb_2 kib;

    public fba_2 dZk() {
        return (fba_2)this.kfX;
    }

    public void a(fba_2 fba_22) {
        super.a(fba_22);
        this.dYf();
    }

    @Override
    protected void dYg() {
        ffp_2 ffp_22;
        Object object;
        Object object2;
        fba_2 fba_22 = this.dZk();
        if (fba_22 == null) {
            return;
        }
        fba_22.gtl();
        if (this.kfZ == null) {
            return;
        }
        if (this.kfZ instanceof bio_2) {
            object2 = (biq_1)this.kfZ.gvG();
            object = (bio_2)this.kfZ;
            if (object2 instanceof bic_2 && ((bic_2)(ffp_22 = (bic_2)object2)).dYx() == (long)((bio_2)object).clk()) {
                this.kfZ = object2;
                this.dYg();
                return;
            }
            if (object2 instanceof bio_2 && ((bio_2)(ffp_22 = (bio_2)object2)).clk() == ((bio_2)object).clk()) {
                this.kfZ = object2;
                this.dYg();
                return;
            }
        }
        object2 = this.kfZ.dYw();
        object = object2.iterator();
        while (object.hasNext()) {
            ffp_22 = (ffp_2)object.next();
            fba_22.a(ffp_22);
        }
    }

    @Override
    public Object eu(String string) {
        if (string.equals(kia)) {
            return this.kib;
        }
        return super.eu(string);
    }

    public static bik_2 dZl() {
        return khZ;
    }

    @Override
    public void dXL() {
        super.dXL();
        fse_1.gFu().f("miniMap", this);
        fse_1.gFu().f("ambienceZone", bzl_2.eqr());
    }

    @Override
    public float getZoomScale() {
        return ((bsg_1)aie_0.cfn().bmH()).c(bsn_1.liy);
    }

    @Override
    public void setZoomScale(float f2) {
        ((bsg_1)aie_0.cfn().bmH()).a((afe)bsn_1.liy, f2);
        super.setZoomScale(f2);
    }

    @Override
    public fso_1 dXT() {
        return bit_2.kgs;
    }

    @Override
    public void a(biq_1 biq_12) {
        if (this.dYb()) {
            this.kib = new awx_2(152, 205, 221, 255);
            this.dYc();
        } else {
            super.a(biq_12);
            bzq_2 bzq_22 = bzp_2.eqt().mA(this.dYd());
            if (bzq_22 != null) {
                this.kib = bzq_22.lEF;
            }
        }
        fse_1.gFu().a((aef_2)this, "isMapAvailable", kia);
    }

    @Override
    protected void dYh() {
    }

    public void dZm() {
        if (this.dYb()) {
            this.dYc();
        }
    }

    @Override
    public /* synthetic */ fbb_2 dXM() {
        return this.dZk();
    }
}

