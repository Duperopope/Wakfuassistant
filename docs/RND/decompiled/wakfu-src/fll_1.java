/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import java.awt.Dimension;
import java.awt.Insets;

/*
 * Renamed from fLl
 */
public class fll_1
extends fkw_1 {
    private static final arq_2 uIf;
    private VertexBufferPCT cdJ;
    private Entity3D bRE;
    private axb_2 chO;
    private axb_2 ncL;

    public final void D(axb_2 axb_22) {
        assert (axb_22 != null) : "Color can't be null";
        if (this.chO == axb_22) {
            return;
        }
        this.chO = axb_22;
        this.gwq();
    }

    public final axb_2 gDr() {
        return this.chO;
    }

    public final void E(axb_2 axb_22) {
        if (this.ncL == axb_22) {
            return;
        }
        this.ncL = axb_22;
        this.gwq();
    }

    public final axb_2 gDs() {
        return this.ncL;
    }

    private void gwq() {
        float f2 = this.chO != null ? this.chO.aIU() : 1.0f;
        float f3 = this.chO != null ? this.chO.aIV() : 1.0f;
        float f4 = this.chO != null ? this.chO.aIW() : 1.0f;
        float f5 = this.chO != null ? this.chO.aIX() : 1.0f;
        f2 *= this.ncL != null ? this.ncL.aIU() : 1.0f;
        f3 *= this.ncL != null ? this.ncL.aIV() : 1.0f;
        f4 *= this.ncL != null ? this.ncL.aIW() : 1.0f;
        f5 *= this.ncL != null ? this.ncL.aIX() : 1.0f;
        float[] fArray = new float[this.cdJ.bIG() * 4];
        for (int i = 0; i < fArray.length; i += 4) {
            fArray[i] = f2;
            fArray[i + 1] = f3;
            fArray[i + 2] = f4;
            fArray[i + 3] = f5;
        }
        this.cdJ.G(fArray);
    }

    @Override
    public void a(Dimension dimension, Insets insets, Insets insets2, Insets insets3) {
        int n = insets.left + insets2.left;
        int n2 = insets.right + insets2.right;
        int n3 = insets.top + insets2.top;
        int n4 = insets.bottom + insets2.bottom;
        int n5 = 0;
        float[] fArray = new float[this.cdJ.bIG() * 2];
        fArray[n5++] = insets.left;
        fArray[n5++] = insets.bottom;
        fArray[n5++] = n;
        fArray[n5++] = insets.bottom;
        fArray[n5++] = n;
        fArray[n5++] = n4;
        fArray[n5++] = insets.left;
        fArray[n5++] = n4;
        fArray[n5++] = n;
        fArray[n5++] = dimension.height - n3;
        fArray[n5++] = insets.left;
        fArray[n5++] = dimension.height - n3;
        fArray[n5++] = insets.left;
        fArray[n5++] = dimension.height - insets.top;
        fArray[n5++] = n;
        fArray[n5++] = dimension.height - insets.top;
        fArray[n5++] = dimension.width - n2;
        fArray[n5++] = dimension.height - insets.top;
        fArray[n5++] = dimension.width - insets.right;
        fArray[n5++] = dimension.height - insets.top;
        fArray[n5++] = dimension.width - insets.right;
        fArray[n5++] = dimension.height - n3;
        fArray[n5++] = dimension.width - n2;
        fArray[n5++] = dimension.height - n3;
        fArray[n5++] = dimension.width - n2;
        fArray[n5++] = n4;
        fArray[n5++] = dimension.width - insets.right;
        fArray[n5++] = n4;
        fArray[n5++] = dimension.width - insets.right;
        fArray[n5++] = insets.bottom;
        fArray[n5++] = dimension.width - n2;
        fArray[n5] = insets.bottom;
        this.cdJ.E(fArray);
    }

    @Override
    public Entity getEntity() {
        return this.bRE;
    }

    @Override
    public void aVH() {
        this.chO = null;
        this.ncL = null;
        this.bRE.bsI();
        this.bRE = null;
        this.cdJ.bsI();
        this.cdJ = null;
    }

    @Override
    public void aVI() {
        assert (this.bRE == null) : "Object is already checked out";
        assert (this.cdJ == null);
        this.bRE = (Entity3D)Entity3D.cXb.bSK();
        GeometryMesh geometryMesh = (GeometryMesh)GLGeometryMesh.dbh.bSK();
        this.bRE.b(geometryMesh);
        geometryMesh.bsI();
        this.cdJ = VertexBufferPCT.cWa.uf(16);
        geometryMesh.a(aso_1.cZQ, this.cdJ, uIf);
    }

    static {
        short[] sArray = new short[]{5, 4, 7, 6, 5, 7, 4, 11, 8, 7, 4, 8, 11, 10, 9, 8, 11, 9, 3, 2, 4, 5, 3, 4, 12, 13, 10, 11, 12, 10, 0, 1, 2, 3, 0, 2, 1, 15, 12, 2, 1, 12, 15, 14, 13, 12, 15, 13};
        uIf = new arq_2(sArray);
    }
}

