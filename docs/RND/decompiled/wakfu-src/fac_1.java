/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.Rectangle;

/*
 * Renamed from fAC
 */
public class fac_1
extends fax_1 {
    public static final String TAG = "animatedLoadingViewer";

    @Override
    protected void gst() {
        Entity entity = this.tOu.bpq();
        awp_1 awp_12 = (awp_1)entity.bIS().uW(0);
        awp_12.A((float)this.ukt.getWidth() / 2.0f + this.aAx, (float)this.ukt.getHeight() / 2.0f + this.aAy, 0.0f);
        float f2 = 1.0f;
        if (this.tOu.bqd() != null) {
            int n;
            aci_1 aci_12;
            int n2;
            float f3;
            double d2;
            f2 = this.tOu.bqd().getScale();
            fsm_1 fsm_12 = this.getSize();
            double d3 = fsm_12.getWidth();
            double d4 = d3 / (d2 = fsm_12.getHeight());
            this.azQ = d4 < (double)(f3 = (float)(n2 = (aci_12 = this.tOu.bqd().bHv()).bWG() - aci_12.bWF()) / (float)(n = aci_12.bWI() - aci_12.bWH())) ? (float)(d3 / (double)n2) : (float)(d2 / (double)n);
            float f4 = 0.8f;
            float f5 = 0.74f;
            float f6 = (float)n2 * this.azQ * 0.8f;
            float f7 = (float)n * this.azQ * 0.74f;
            this.setScissor(new Rectangle((int)((d3 - (double)f6) / 2.0), (int)((d2 - (double)f7) / 2.0), (int)f6, (int)f7));
        }
        awp_12.B(this.azQ / f2, this.azQ / f2, 0.0f);
        entity.bIS().bPv();
        this.tOy = false;
    }

    @Override
    public void setSize(int n, int n2) {
        super.setSize(n, n2);
        this.setNeedsToPostProcess();
    }

    @Override
    public String getTag() {
        return TAG;
    }
}

