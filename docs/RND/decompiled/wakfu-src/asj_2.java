/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 *  com.jogamp.opengl.GLAutoDrawable
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from asj
 */
public class asj_2
implements axu_1 {
    private static final Logger cXy = Logger.getLogger(asj_2.class);
    private static final int cXz = 3;
    public static final int cXA = 1000;
    public static final int cXB = 1000;
    private ask_2 cXC;
    private int bUi;
    private int cXD;
    private int cXE = 1000;
    private final float[] cXF;
    private final float[] cXG;
    private final float[] cXH;
    private final EntitySprite cXI;
    private axq_1 cXJ;
    private final ArrayList<asi_2> cXK = new ArrayList();
    private final ArrayList<asp_2> cXL = new ArrayList();
    private Runnable cXM;
    private static final asj_2 cXN = new asj_2();
    int cXO = 0;

    private asj_2() {
        this.cXG = new float[4];
        this.cXF = new float[4];
        this.cXH = new float[4];
        this.cXG[3] = 0.0f;
        this.cXF[3] = 1.0f;
        this.bUi = 0;
        this.cXD = 1000;
        this.cXC = ask_2.cXS;
        this.cXI = (EntitySprite)EntitySprite.cXk.bSJ();
        this.cXI.cWR = this;
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.dbk.bSJ();
        this.cXI.a(gLGeometrySprite);
        gLGeometrySprite.bsI();
        this.cXI.c(this.cXF[0], this.cXF[1], this.cXF[2], this.cXF[3]);
        this.cXI.setTexture(null);
        this.cXI.setVisible(false);
        this.cXI.bJm().c(auw_2.dfL, auw_2.dfM);
    }

    public static asj_2 bJt() {
        return cXN;
    }

    public final boolean bJu() {
        return this.cXC == ask_2.cXP;
    }

    public final boolean bJv() {
        return this.cXC == ask_2.cXR;
    }

    public final boolean bJw() {
        return this.cXC == ask_2.cXQ;
    }

    public final boolean bJx() {
        return this.cXC == ask_2.cXS;
    }

    public final void uk(int n) {
        this.cXE = n;
    }

    public final void a(int n, axq_1 axq_12) {
        this.a(n, axq_12, 0);
    }

    public final void a(int n, axq_1 axq_12, int n2) {
        if (this.cXC == ask_2.cXQ) {
            cXy.error((Object)"Error occured during fade in", (Throwable)new Exception());
            if (n2 < 3) {
                this.ul(n);
                this.a(n, axq_12, n2 + 1);
                return;
            }
        }
        this.cXJ = axq_12;
        this.a(n, awx_2.dnG);
        this.a(ask_2.cXP);
    }

    @Override
    public final void qy(int n) {
        if (this.cXC == ask_2.cXQ) {
            this.cXO += n;
            if (this.cXO > 10000) {
                this.cXO = 0;
            }
            for (int i = this.cXL.size() - 1; i >= 0; --i) {
                if (this.cXL.get(i).isValid()) continue;
                return;
            }
            if (this.cXO == 0) {
                // empty if block
            }
            this.cXO = 0;
            this.ul(this.cXE);
            return;
        }
        if (this.cXC == ask_2.cXS) {
            return;
        }
        this.bUi += n;
        if (this.bUi > this.cXD) {
            this.bUi = this.cXD;
            this.cXH[0] = this.cXF[0];
            this.cXH[1] = this.cXF[1];
            this.cXH[2] = this.cXF[2];
            this.cXH[3] = this.cXF[3];
            if (this.cXC == ask_2.cXP) {
                this.a(ask_2.cXQ);
                this.cXJ = null;
            } else {
                this.a(ask_2.cXS);
            }
        } else {
            float f2 = (float)this.bUi / (float)this.cXD;
            this.cXH[0] = GC.a(this.cXG[0], this.cXF[0], f2);
            this.cXH[1] = GC.a(this.cXG[1], this.cXF[1], f2);
            this.cXH[2] = GC.a(this.cXG[2], this.cXF[2], f2);
            this.cXH[3] = GC.a(this.cXG[3], this.cXF[3], f2);
        }
        this.cXI.c(this.cXH[0], this.cXH[1], this.cXH[2], this.cXH[3]);
        this.cXI.setVisible(this.cXH[3] > 0.004f);
    }

    @Override
    public void init(GLAutoDrawable gLAutoDrawable) {
    }

    @Override
    public final void bb(int n, int n2) {
        this.cXI.e(n2 / 2, -n / 2, n, n2);
        if (this.cXJ != null) {
            this.cXJ.bb(n, n2);
        }
    }

    @Override
    public void b(GL2 gL2) {
        if (this.cXC == ask_2.cXS) {
            return;
        }
        if (this.cXJ != null) {
            this.cXJ.b(gL2);
        }
        atg_2 atg_22 = aru_2.cVG.bIv();
        atg_22.b(Matrix44.dAe);
        this.cXI.b(atg_22);
    }

    public final void a(asi_2 asi_22) {
        this.cXK.add(asi_22);
    }

    public final void b(asi_2 asi_22) {
        this.cXK.remove(asi_22);
    }

    public final void a(asp_2 asp_22) {
        this.cXL.add(asp_22);
    }

    public final void b(asp_2 asp_22) {
        this.cXL.remove(asp_22);
    }

    private void ul(int n) {
        if (this.cXC == ask_2.cXS) {
            cXy.error((Object)"Error occured during fade out", (Throwable)new Exception());
        }
        if (this.cXM != null) {
            this.cXM.run();
            this.cXM = null;
        }
        if (this.cXJ != null) {
            this.cXJ.bqO();
        }
        this.cXJ = null;
        this.a(n, awx_2.dnB);
        this.a(ask_2.cXR);
    }

    private void a(int n, axb_2 axb_22) {
        this.cXG[0] = this.cXH[0];
        this.cXG[1] = this.cXH[1];
        this.cXG[2] = this.cXH[2];
        this.cXG[3] = this.cXH[3];
        this.cXF[0] = axb_22.aIU();
        this.cXF[1] = axb_22.aIV();
        this.cXF[2] = axb_22.aIW();
        this.cXF[3] = axb_22.aIX();
        this.cXD = n;
        this.bUi = 0;
    }

    public final void bJy() {
        this.a(ask_2.cXQ);
    }

    private void a(ask_2 ask_22) {
        if (this.cXC == ask_22) {
            return;
        }
        this.cXC = ask_22;
        for (int i = this.cXK.size() - 1; i >= 0; --i) {
            this.cXC.c(this.cXK.get(i));
        }
    }

    public final void f(Runnable runnable) {
        this.cXM = runnable;
    }
}

