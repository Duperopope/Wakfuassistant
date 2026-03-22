/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.glu.GLU
 *  com.jogamp.opengl.glu.GLUquadric
 */
import com.jogamp.opengl.GL;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.glu.GLUquadric;

/*
 * Renamed from auXX
 */
public final class auxx_2
extends auz_2 {
    private boolean cHn = false;
    private int cbO;
    private int ccJ;
    private int brs;
    private int brt;
    private static final GLU dfU = new GLU();
    private GLUquadric dfV = dfU.gluNewQuadric();

    public final void cX(boolean bl) {
        this.cHn = bl;
    }

    public final boolean bMA() {
        return this.cHn;
    }

    public final void o(int n, int n2, int n3, int n4) {
        if (this.cbO == n && this.ccJ == n2 && this.brs == n3 && this.brt == n4) {
            return;
        }
        this.cbO = n;
        this.ccJ = n2;
        this.brs = n3 < 0 ? 0 : n3;
        this.brt = n4 < 0 ? 0 : n4;
    }

    public final int bMB() {
        return this.cbO;
    }

    public final int bMC() {
        return this.ccJ;
    }

    public final int bMD() {
        return this.brs;
    }

    public final int bME() {
        return this.brt;
    }

    @Override
    public final void i(GL gL) {
    }

    @Override
    public avb_2 bMF() {
        return null;
    }
}

