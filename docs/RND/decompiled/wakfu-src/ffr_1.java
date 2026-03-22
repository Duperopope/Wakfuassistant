/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongByteHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import gnu.trove.map.hash.TLongByteHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fFR
 */
public final class ffr_1
extends fft_1 {
    private static final Logger urf = Logger.getLogger(ffr_1.class);
    private Entity3D urg;
    private Entity3D urh;
    private static final short uri = 3855;

    @Override
    public void setMapDisplayer(fgi_1 fgi_12) {
        super.setMapDisplayer(fgi_12);
        this.m((Entity)this.urp.gxt());
        this.gwQ();
    }

    public void a(axb_2 axb_22, int n, boolean bl) {
        if (n < 0 || n >= this.urg.bJf()) {
            return;
        }
        GeometryMesh geometryMesh = (GeometryMesh)this.urg.uh(n);
        geometryMesh.c(axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), bl ? 0.6f : 0.3f);
    }

    public void g(int n, float f2) {
        if (n < 0 || n >= this.urg.bJf()) {
            return;
        }
        GLGeometryMesh gLGeometryMesh = (GLGeometryMesh)this.urg.uh(n);
        gLGeometryMesh.cN(f2);
    }

    @Override
    protected void gwP() {
        super.gwP();
        this.urg.bIS().bPv();
        this.urh.bIS().bPv();
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        super.a(dimension, insets, insets2, insets3);
        this.y(this.gwX());
    }

    @Override
    protected void b(Dimension dimension) {
        this.bL((float)dimension.getWidth() * 0.5f, (float)dimension.getHeight() * 0.5f);
    }

    @Override
    protected void gst() {
        this.urg.clear();
        this.urq.clear();
        this.urh.clear();
        this.urr.bJk();
        ArrayList<Entity> arrayList = this.bVe.bJd();
        Object t = this.urp.gxt();
        if (arrayList.isEmpty()) {
            this.bVe.g((Entity)t);
            this.bVe.g(this.urg);
            this.bVe.g(this.urq);
            this.bVe.g(this.urh);
            this.bVe.g(this.urr);
        } else if (arrayList.get(0) != t) {
            this.bVe.b(0, (Entity)t);
        }
    }

    private void y(axb_2 axb_22) {
        if (this.tUl != null) {
            fff_1.a(-this.brs / 2 + this.urv, this.brt / 2 - this.urw, this.urx, this.ury, this.tUl, axb_22, this.urh);
        }
    }

    @Override
    public void aVH() {
        super.aVH();
        this.urg.bsI();
        this.urg = null;
        this.urh.bsI();
        this.urh = null;
    }

    @Override
    public void aVI() {
        super.aVI();
        assert (this.urg == null);
        assert (this.urh == null);
        this.urg = (Entity3D)Entity3D.cXb.bSK();
        this.urh = (Entity3D)Entity3D.cXb.bSK();
        this.m(this.urg);
        this.m(this.urh);
    }

    private void gwQ() {
        if (this.urp != null) {
            this.uru.gg("nation");
            ((Entity)this.urp.gxt()).a(this.uru.bJY(), this.uru.bJZ(), this.uru.bJT());
        }
    }

    private void gwR() {
        if (this.urp != null) {
            this.uru.gg("highlight");
            ((Entity)this.urp.gxt()).a(this.uru.bJY(), this.uru.bJZ(), this.uru.bJT());
        }
    }

    public void oM(boolean bl) {
        if (bl) {
            this.gwQ();
        } else {
            this.gwR();
        }
    }

    public void b(TLongByteHashMap tLongByteHashMap) {
        if (this.uru != null) {
            this.uru.a(tLongByteHashMap);
        }
    }

    public void h(TLongObjectHashMap<axb_2> tLongObjectHashMap) {
        if (this.uru != null) {
            this.uru.g(tLongObjectHashMap);
        }
    }

    public void aaO(int n) {
        if (this.uru != null) {
            this.uru.aaO(n);
        }
    }
}

