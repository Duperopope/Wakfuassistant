/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import java.awt.Dimension;
import java.awt.Insets;
import org.apache.log4j.Logger;

/*
 * Renamed from cId
 */
public class cid_1
extends fkx_2 {
    private static final Logger ncK = Logger.getLogger(cid_1.class);
    protected Entity3D bRE;
    private axb_2 ncL;
    private awg_1 ncM;
    private awg_1 ncN;
    private awg_1 ncO;
    private awg_1 ncP;
    private boolean ncQ = false;
    private boolean ncR = false;
    private int[] ncS;
    private int[] nbf;
    private float[] ncT;
    private int brs;
    private int brt;
    private int ncU;
    private int ncV;
    private int ncW;
    private int ncX;

    public void setPixelSeparations(int[] nArray, int[] nArray2, float[] fArray) {
        this.ncS = nArray;
        this.ncT = fArray;
        this.G(nArray2);
        this.nbf = nArray2;
        this.eKV();
        this.eKY();
    }

    public float[] eKP() {
        return this.ncT;
    }

    public int[] getPixelSeparations() {
        return this.ncS;
    }

    public void b(awg_1 awg_12) {
        this.ncM = awg_12;
        this.eKU();
    }

    public void c(awg_1 awg_12) {
        this.ncO = awg_12;
        this.eKU();
    }

    public void d(awg_1 awg_12) {
        this.ncP = awg_12;
        this.eKU();
    }

    public void e(awg_1 awg_12) {
        this.ncN = awg_12;
        this.eKU();
    }

    public awg_1 eKQ() {
        return this.ncM;
    }

    public awg_1 eKR() {
        return this.ncN;
    }

    public awg_1 eKS() {
        return this.ncO;
    }

    public awg_1 eKT() {
        return this.ncP;
    }

    private void eKU() {
        this.ncQ = this.ncM != null && this.ncP != null && this.ncO != null && this.ncN != null;
    }

    private void G(int[] nArray) {
        int n = nArray.length - 1;
        int n2 = this.nbf.length - 1;
        while (n2 >= 0 || n >= 0) {
            int n3;
            int n4 = this.nbf.length > n2 && n2 >= 0 ? this.nbf[n2] : 0;
            int n5 = n3 = nArray.length > n && n >= 0 ? nArray[n] : 0;
            if (n < 0 || n2 >= 0 && n4 < n3) {
                this.Md(n2);
                --n2;
                continue;
            }
            if (n2 < 0 || n >= 0 && n4 > n3) {
                this.Mc(n2);
                --n;
                continue;
            }
            --n2;
            --n;
        }
    }

    private void eKV() {
        int n = this.bRE.bJf();
        int n2 = n - 3;
        if (n2 < this.ncS.length) {
            ncK.warn((Object)("mauvais nombre de jonctions : " + n2 + "/" + this.ncS.length));
        } else if (n2 > this.ncS.length) {
            ncK.warn((Object)("mauvais nombre de jonctions : " + n2 + "/" + this.ncS.length));
        }
    }

    private void af(int n, int n2, int n3) {
        int n4 = this.bRE.bJf();
        int n5 = n4 - 3;
        if (n < 0 || n >= n5) {
            return;
        }
        GeometrySprite geometrySprite = (GeometrySprite)this.bRE.uh(n + 3);
        geometrySprite.ba(n3, n2);
        geometrySprite.c(1.0f, 1.0f, 1.0f, this.ncT[n]);
    }

    public void Mc(int n) {
        if (!this.ncQ) {
            return;
        }
        int n2 = this.bRE.bJf() - 3;
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.dbk.bSK();
        geometrySprite.cb(this.ncP.getWidth(), this.ncP.getHeight());
        geometrySprite.c(1.0f, 1.0f, 1.0f, 1.0f);
        geometrySprite.a(this.ncP.aKp(), this.ncP.aKq(), this.ncP.aKr(), this.ncP.aKs(), this.ncP.getRotation());
        this.bRE.a(geometrySprite, this.ncP.bHg(), null);
        geometrySprite.bsI();
        if (n2 > 0) {
            for (int i = n2; i >= n && i > 0; --i) {
                GeometrySprite geometrySprite2 = (GeometrySprite)this.bRE.uh(i + 3);
                GeometrySprite geometrySprite3 = (GeometrySprite)this.bRE.uh(i - 1 + 3);
                geometrySprite2.f(geometrySprite3.bKn(), geometrySprite3.bKl(), geometrySprite3.bKr(), geometrySprite3.bKs());
            }
        }
    }

    public void Md(int n) {
        int n2 = this.bRE.bJf();
        int n3 = n2 - 3;
        if (n3 <= 0) {
            return;
        }
        this.bRE.c(this.bRE.uh(3 + n));
    }

    private void eKW() {
        this.a(this.brs - this.ncM.getWidth(), 0, this.ncM.getWidth(), this.ncM.getHeight(), this.ncM);
        this.a(this.brs - this.ncN.getWidth(), 0, this.ncN.getWidth(), this.ncN.getHeight(), this.ncN);
        this.a(this.brs - this.ncO.getWidth(), 0, this.ncO.getWidth(), 0, this.ncO);
        this.ncR = true;
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        this.ncU = insets.left + insets2.left + insets3.left;
        this.ncX = insets.bottom + insets2.bottom + insets3.bottom;
        this.ncV = insets.right + insets2.right + insets3.right;
        this.ncW = insets.top + insets2.top + insets3.top;
        this.brs = dimension.width - this.ncU - this.ncV;
        this.brt = dimension.height - this.ncW - this.ncX;
        if (!this.ncQ) {
            return;
        }
        if (!this.ncR) {
            this.eKW();
        }
        this.eKX();
    }

    private void eKX() {
        GeometrySprite geometrySprite = (GeometrySprite)this.bRE.uh(0);
        geometrySprite.ba(this.ncX + this.ncM.getHeight(), this.ncU + this.brs - this.ncM.getWidth());
        geometrySprite = (GeometrySprite)this.bRE.uh(1);
        geometrySprite.ba(this.ncX + this.brt, this.ncU + this.brs - this.ncN.getWidth());
        geometrySprite = (GeometrySprite)this.bRE.uh(2);
        geometrySprite.f(this.ncX + this.brt - this.ncN.getHeight(), this.ncU + this.brs - this.ncN.getWidth(), this.ncO.getWidth(), this.brt - this.ncN.getHeight() - this.ncM.getHeight());
        this.eKY();
    }

    private void eKY() {
        if (this.ncS != null && this.ncS.length > 0) {
            int n = this.ncS.length;
            for (int i = 0; i < n; ++i) {
                this.af(i, this.ncU + this.brs - this.ncO.getWidth(), this.ncX + this.ncS[i]);
            }
        }
    }

    private void a(int n, int n2, int n3, int n4, awg_1 awg_12) {
        if (awg_12 == null || awg_12.bHg() == null) {
            return;
        }
        GeometrySprite geometrySprite = (GeometrySprite)GLGeometrySprite.dbk.bSK();
        geometrySprite.f(n2, n, n3, n4);
        if (this.ncL != null) {
            geometrySprite.c(this.ncL.aIU(), this.ncL.aIV(), this.ncL.aIW(), this.ncL.aIX());
        } else {
            geometrySprite.c(1.0f, 1.0f, 1.0f, 1.0f);
        }
        geometrySprite.a(awg_12.aKp(), awg_12.aKq(), awg_12.aKr(), awg_12.aKs(), awg_12.getRotation());
        this.bRE.a(geometrySprite, awg_12.bHg(), null);
        geometrySprite.bsI();
    }

    @Override
    public Entity getEntity() {
        return this.bRE;
    }

    @Override
    public void aVH() {
        this.ncM = null;
        this.ncN = null;
        this.ncP = null;
        this.ncO = null;
        this.bRE.bsI();
        this.bRE = null;
        this.ncL = null;
    }

    @Override
    public void aVI() {
        assert (this.bRE == null) : "Object already checked out";
        this.bRE = (Entity3D)Entity3D.cXb.bSK();
        this.ncQ = false;
        this.ncR = false;
        this.nbf = new int[0];
        this.ncT = new float[0];
        this.ncS = new int[0];
    }
}

