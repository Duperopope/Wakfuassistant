/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fKy
 */
public class fky_2
extends fkk_1 {
    private static final Logger uGv = Logger.getLogger(fky_2.class);
    public static final String TAG = "GradientBackground";
    private flc_1 uGw;

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public void setColor(fyp_0 fyp_02) {
        this.setColor(fyp_02.getColor(), fyp_02.getPosition());
    }

    public void setColor(axb_2 axb_22, fzs_0 fzs_02) {
        this.getMesh().setColor(axb_22, fzs_02);
    }

    @Override
    public flc_1 getMesh() {
        return this.uGw;
    }

    @Override
    public boolean isValidAdd(fhi_2 fhi_22) {
        if (fhi_22 instanceof fyp_0 && ((fyp_0)fhi_22).getPosition() == null) {
            uGv.error((Object)"Tentative d'ajout d'un ColorElement sans position");
            return false;
        }
        return super.isValidAdd(fhi_22);
    }

    @Override
    protected void a(fyp_0 fyp_02) {
        if (this.uxK == null) {
            return;
        }
        for (int i = this.uxK.size() - 1; i >= 0; --i) {
            fhv_1 fhv_12 = (fhv_1)this.uxK.get(i);
            if (!(fhv_12 instanceof fyp_0) || ((fyp_0)fhv_12).getPosition() != fyp_02.getPosition()) continue;
            this.m(fhv_12);
        }
    }

    @Override
    public void aVI() {
        super.aVI();
        this.uGw = new flc_1();
        this.uGw.aVI();
    }

    @Override
    public void aVH() {
        super.aVH();
        this.uGw.aVH();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fky_2 fky_22 = (fky_2)fhi_22;
        if (this.uGw != null) {
            for (fzs_0 fzs_02 : fzs_0.values()) {
                axb_2 axb_22 = this.uGw.a(fzs_02);
                if (axb_22 == null) continue;
                fky_22.setColor(axb_22, fzs_02);
            }
        }
        super.a(fhi_22);
    }
}

