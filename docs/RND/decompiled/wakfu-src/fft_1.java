/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;
import java.awt.Dimension;
import java.awt.Insets;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from fFT
 */
public abstract class fft_1 {
    private static final Logger uro = Logger.getLogger(fft_1.class);
    protected fgi_1 urp;
    protected EntityGroup bVe;
    protected Entity3D urq;
    protected EntityGroup urr;
    protected awp_1 urs;
    protected awp_1 urt;
    private axb_2 ncL;
    protected awg_1 tEC;
    protected float bRL = 1.0f;
    protected int brt;
    protected int brs;
    protected ffk_2 uru;
    protected awg_1 tUl;
    protected int urv;
    protected int urw;
    protected int urx;
    protected int ury;
    protected TLongObjectHashMap<ffo_2> uoQ;
    private float urz = Float.NaN;
    private float urA = Float.NaN;

    protected void m(Entity entity) {
        entity.bIS().a(this.urs);
        entity.bIS().a(this.urt);
    }

    public void setMapDisplayer(fgi_1 fgi_12) {
        if (this.urp != null) {
            this.urp.clear();
        }
        this.urp = fgi_12;
        this.urp.gxu();
    }

    public final int gwS() {
        return this.brt;
    }

    public final void aba(int n) {
        this.brt = n;
    }

    public final int gwT() {
        return this.brs;
    }

    public final void abb(int n) {
        this.brs = n;
    }

    public final Entity gwU() {
        return this.bVe;
    }

    public final awg_1 gwV() {
        return this.tEC;
    }

    public final axb_2 gwW() {
        return this.ncL;
    }

    public void setPixmap(awg_1 awg_12) {
        this.tEC = awg_12;
        this.uru.aaP(awg_12.getWidth());
    }

    public final void z(axb_2 axb_22) {
        if (this.ncL == axb_22) {
            return;
        }
        this.ncL = axb_22;
    }

    public final void fR(float f2) {
        this.bRL = f2;
        this.urs.B(this.bRL, this.bRL, this.bRL);
        this.gwP();
    }

    protected final void bL(float f2, float f3) {
        if (this.urz == f2 && this.urA == f3) {
            return;
        }
        this.urz = f2;
        this.urA = f3;
        this.urt.A(f2, f3, -10000.0f);
        this.gwP();
    }

    protected void gwP() {
        if (this.urp == null) {
            return;
        }
        ((Entity)this.urp.gxt()).bIS().bPv();
        this.urq.bIS().bPv();
        this.urr.bIS().bPv();
    }

    protected abstract void gst();

    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        this.b(dimension);
        if (this.urp != null) {
            this.urp.a(this);
            this.gst();
            this.gwP();
        }
        this.A(this.gwX());
    }

    protected abstract void b(Dimension var1);

    public final void gS(int n, int n2) {
        this.brs = n;
        this.brt = n2;
    }

    public void aVH() {
        this.tEC = null;
        this.bVe.bsI();
        this.bVe = null;
        this.ncL = null;
        if (this.urp != null) {
            this.urp.clear();
            this.urp = null;
        }
        this.tUl = null;
        this.uoQ.clear();
        this.uoQ = null;
        this.urq.bsI();
        this.urq = null;
        this.urr.bsI();
        this.urr = null;
        this.uru = null;
    }

    public void aVI() {
        assert (this.bVe == null);
        assert (this.urp == null);
        assert (this.urq == null);
        assert (this.urr == null);
        this.bVe = (EntityGroup)EntityGroup.cXh.bSK();
        this.bVe.cWR = this;
        this.urs = new awp_1();
        this.urt = new awp_1();
        this.urz = Float.NaN;
        this.urA = Float.NaN;
        this.uoQ = new TLongObjectHashMap();
        this.urq = (Entity3D)Entity3D.cXb.bSK();
        this.urr = (EntityGroup)EntityGroup.cXh.bSK();
        this.m(this.urq);
        this.m(this.urr);
        this.uru = ffk_2.uoS;
    }

    public final axb_2 gwX() {
        return this.ncL == null ? awx_2.dnF : this.ncL;
    }

    public void b(long l, ffo_2 ffo_22) {
        this.uoQ.put(l, (Object)ffo_22);
    }

    public void vc(long l) {
        this.uoQ.remove(l);
    }

    public void gtl() {
        this.uoQ.clear();
    }

    protected void A(axb_2 axb_22) {
        TLongObjectIterator tLongObjectIterator = this.uoQ.iterator();
        while (tLongObjectIterator.hasNext()) {
            int n;
            tLongObjectIterator.advance();
            ffo_2 ffo_22 = (ffo_2)tLongObjectIterator.value();
            awg_1 awg_12 = ffo_22.getPixmap();
            if (awg_12 != null) {
                int n2 = (int)((float)awg_12.getWidth() / this.bRL / 1.5f);
                n = (int)((float)awg_12.getHeight() / this.bRL / 1.5f);
                fff_1.a(ffo_22.gwk() - this.brs / 2, ffo_22.gwl() + n + this.brt / 2, n2, n, awg_12, axb_22, this.urq);
            }
            ArrayList<ffl_2> arrayList = ffo_22.getChildren();
            int n3 = arrayList.size();
            for (n = 0; n < n3; ++n) {
                ffl_2 ffl_22 = arrayList.get(n);
                ZG zG = ffl_22.gvU();
                if (zG == null) continue;
                this.urr.g(zG.bpq());
            }
        }
    }

    public void p(awg_1 awg_12) {
        this.tUl = awg_12;
    }

    public void M(int n, int n2, int n3, int n4) {
        this.urv = n;
        this.urw = n2;
        this.urx = n3;
        this.ury = n4;
    }

    public void j(awk_1 awk_12) {
        if (this.uru != null) {
            this.uru.h(awk_12);
        }
        this.urp.j(awk_12);
    }
}

