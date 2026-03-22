/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import java.awt.Insets;

/*
 * Renamed from fFW
 */
public class ffw_1
extends ffz_1 {
    private Entity3D bRE;
    private axb_2 urJ;
    private final Insets urK = new Insets(0, 0, 0, 0);
    private boolean tMi = true;
    private VertexBufferPCT cdJ;
    private VertexBufferPCT urL;
    private static final arq_2 urM;
    private static final arq_2 urN;

    @Override
    public void setBorderColor(axb_2 axb_22) {
        if (this.urJ == axb_22) {
            return;
        }
        this.urJ = axb_22;
        this.gwq();
    }

    @Override
    public axb_2 getBorderColor() {
        return this.urJ;
    }

    @Override
    public void setBorder(Insets insets) {
        this.urK.set(insets.top, insets.left, insets.bottom, insets.right);
    }

    @Override
    public Insets getBorder() {
        return this.urK;
    }

    @Override
    protected void gwq() {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        if (this.chO == null) {
            f9 = 1.0f;
            f8 = 1.0f;
            f7 = 1.0f;
            f6 = 1.0f;
        } else {
            f6 = this.chO.aIU();
            f7 = this.chO.aIV();
            f8 = this.chO.aIW();
            f9 = this.chO.aIX();
        }
        if (this.ncL != null) {
            f6 *= this.ncL.aIU();
            f7 *= this.ncL.aIV();
            f8 *= this.ncL.aIW();
            f9 *= this.ncL.aIX();
        }
        for (int i = 0; i < this.urL.bIG(); ++i) {
            this.urL.a(i, f6, f7, f8, f9);
        }
        if (this.urJ == null) {
            f5 = 1.0f;
            f4 = 1.0f;
            f3 = 1.0f;
            f2 = 1.0f;
        } else {
            f2 = this.urJ.aIU();
            f3 = this.urJ.aIV();
            f4 = this.urJ.aIW();
            f5 = this.urJ.aIX();
        }
        if (this.ncL != null) {
            f2 *= this.ncL.aIU();
            f3 *= this.ncL.aIV();
            f4 *= this.ncL.aIW();
            f5 *= this.ncL.aIX();
        }
        for (int i = 0; i < this.cdJ.bIG(); ++i) {
            this.cdJ.a(i, f2, f3, f4, f5);
        }
    }

    public boolean isHorizontal() {
        return this.tMi;
    }

    @Override
    public void setHorizontal(boolean bl) {
        this.tMi = bl;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float f2) {
        n3 = (int)((float)n3 * (this.tMi ? f2 : 1.0f));
        n4 = (int)((float)n4 * (this.tMi ? 1.0f : f2));
        n3 = Math.max(n3, this.urK.left + this.urK.right);
        n4 = Math.max(n4, this.urK.top + this.urK.bottom);
        int n5 = n;
        int n6 = n2 + n4;
        this.cdJ.c(0, n5, n2);
        this.cdJ.c(1, n5 + this.urK.left, n2);
        this.cdJ.c(2, n5 + this.urK.left, n2 + this.urK.bottom);
        this.cdJ.c(3, n5, n2 + this.urK.bottom);
        this.cdJ.c(4, n5 + this.urK.left, n6 - this.urK.top);
        this.cdJ.c(5, n5, n6 - this.urK.top);
        this.cdJ.c(6, n5, n6);
        this.cdJ.c(7, n5 + this.urK.left, n6);
        this.cdJ.c(8, n + n3 - this.urK.right, n6);
        this.cdJ.c(9, n + n3, n6);
        this.cdJ.c(10, n + n3, n6 - this.urK.top);
        this.cdJ.c(11, n + n3 - this.urK.right, n6 - this.urK.top);
        this.cdJ.c(12, n + n3 - this.urK.right, n2 + this.urK.bottom);
        this.cdJ.c(13, n + n3, n2 + this.urK.bottom);
        this.cdJ.c(14, n + n3, n2);
        this.cdJ.c(15, n + n3 - this.urK.right, n2);
        this.urL.c(0, n5 + this.urK.left, n2 + this.urK.bottom);
        this.urL.c(1, n + n3 - this.urK.right, n2 + this.urK.bottom);
        this.urL.c(2, n + n3 - this.urK.right, n6 - this.urK.top);
        this.urL.c(3, n5 + this.urK.left, n6 - this.urK.top);
        this.uql = this.tMi ? new acb_1(n + n3, (float)n2 + (float)n4 / 2.0f) : new acb_1((float)n + (float)n3 / 2.0f, n2 + n4);
    }

    @Override
    public final Entity getEntity() {
        return this.bRE;
    }

    @Override
    public final void aVI() {
        this.bRE = (Entity3D)Entity3D.cXb.bSK();
        GeometryMesh geometryMesh = (GeometryMesh)GLGeometryMesh.dbh.bSK();
        this.bRE.b(geometryMesh);
        geometryMesh.bsI();
        assert (this.cdJ == null);
        this.cdJ = VertexBufferPCT.cWa.uf(16);
        geometryMesh.a(aso_1.cZQ, this.cdJ, urM);
        geometryMesh = (GeometryMesh)GLGeometryMesh.dbh.bSK();
        this.bRE.b(geometryMesh);
        geometryMesh.bsI();
        assert (this.urL == null);
        this.urL = VertexBufferPCT.cWa.uf(4);
        geometryMesh.a(aso_1.cZQ, this.urL, urN);
    }

    @Override
    public final void aVH() {
        super.aVH();
        this.chO = null;
        this.urJ = null;
        this.urK.set(0, 0, 0, 0);
        this.bRE.bsI();
        this.bRE = null;
        this.cdJ.bsI();
        this.cdJ = null;
        this.urL.bsI();
        this.urL = null;
    }

    static {
        short[] sArray = new short[]{5, 4, 7, 6, 5, 7, 4, 11, 8, 7, 4, 8, 11, 10, 9, 8, 11, 9, 3, 2, 4, 5, 3, 4, 12, 13, 10, 11, 12, 10, 0, 1, 2, 3, 0, 2, 1, 15, 12, 2, 1, 12, 15, 14, 13, 12, 15, 13};
        urM = new arq_2(sArray);
        short[] sArray2 = new short[]{0, 1, 2, 3, 0, 2};
        urN = new arq_2(sArray2);
    }
}

