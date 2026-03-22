/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.Dimension;
import java.util.ArrayList;

/*
 * Renamed from fFS
 */
public final class ffs_1
extends fft_1 {
    private float ccG;
    private float ccH;
    private float urk;
    private float url;
    private int urm;
    private int urn;

    @Override
    public void setMapDisplayer(fgi_1 fgi_12) {
        super.setMapDisplayer(fgi_12);
        this.m((Entity)this.urp.gxt());
    }

    public void bK(float f2, float f3) {
        this.urk = f2;
        this.url = f3;
        this.b(null);
    }

    public void setSize(int n, int n2) {
        this.urm = n;
        this.urn = n2;
        this.b(null);
    }

    public void aE(float f2, float f3) {
        this.ccG = f2;
        this.ccH = f3;
        this.b(null);
    }

    @Override
    protected void b(Dimension dimension) {
        float f2 = (this.urk + this.ccG) * this.bRL;
        float f3 = (this.url + this.ccH) * this.bRL;
        float f4 = (float)(this.urm / 2) - f2;
        float f5 = (float)(this.urn / 2) - f3;
        this.bL(f4, f5);
    }

    @Override
    protected void gst() {
        this.urq.clear();
        this.urr.bJk();
        ArrayList<Entity> arrayList = this.bVe.bJd();
        Object t = this.urp.gxt();
        if (arrayList.isEmpty()) {
            this.bVe.g((Entity)t);
            this.bVe.g(this.urq);
            this.bVe.g(this.urr);
        } else if (arrayList.get(0) != t) {
            this.bVe.b(0, (Entity)t);
        }
    }
}

