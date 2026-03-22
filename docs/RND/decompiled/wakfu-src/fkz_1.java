/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fKZ
 */
public abstract class fkz_1
extends fkw_1 {
    protected axb_2 ncL = null;
    protected awg_1[] uqt;
    protected boolean uqu = false;
    protected Entity3D bRE;
    private ash_2 uqw;

    @Override
    public abstract void a(Dimension var1, Insets var2, Insets var3, Insets var4);

    @Override
    public final Entity getEntity() {
        return this.bRE;
    }

    public axb_2 getModulationColor() {
        return this.ncL;
    }

    public void setModulationColor(axb_2 axb_22) {
        if (this.ncL == axb_22) {
            return;
        }
        this.ncL = axb_22;
        if (this.ncL != null) {
            this.bRE.c(axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), axb_22.aIX());
        } else {
            this.bRE.c(1.0f, 1.0f, 1.0f, 1.0f);
        }
    }

    @Override
    public void aVH() {
        this.bRE.bsI();
        this.bRE = null;
        this.ncL = null;
        if (this.uqw != null) {
            this.uqw.bJq();
            this.uqw = null;
        }
    }

    @Override
    public void aVI() {
        assert (this.bRE == null);
        this.bRE = (Entity3D)Entity3D.cXb.bSK();
    }

    protected final void c(int n, int n2, int n3, int n4, awg_1 awg_12) {
        if (n3 == 0 || n4 == 0) {
            return;
        }
        this.uqw.a(n, n2, n3, n4, awg_12, this.ncL);
    }

    protected final void abX(int n) {
        if (this.uqw == null) {
            this.uqw = new ash_2();
        }
        this.uqw.a(this.bRE, n);
    }

    protected final void gDk() {
        this.uqw.bJr();
    }
}

