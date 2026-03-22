/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;

/*
 * Renamed from fFC
 */
public class ffc_1
extends ffz_1 {
    private static final byte uqx = 32;
    private Entity3D bRE;
    private VertexBufferPCT cdJ;
    private arq_2 cSn;
    private float uqy = 0.5f;
    private float uqz = 1.0f;
    private final byte uqA = (byte)32;
    private float tXt = 1.5707964f;
    private float tXs = 1.0f;
    protected awg_1 tEC = null;
    private boolean tXE = true;

    @Override
    public void setDeltaAngle(float f2) {
        this.tXt = f2;
    }

    @Override
    protected void gwq() {
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.chO == null) {
            f5 = 1.0f;
            f4 = 1.0f;
            f3 = 1.0f;
            f2 = 1.0f;
        } else {
            f2 = this.chO.aIU();
            f3 = this.chO.aIV();
            f4 = this.chO.aIW();
            f5 = this.chO.aIX();
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

    @Override
    public void setFullCirclePercentage(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.tXs = f2;
    }

    public void setInnerRadiusFactor(float f2) {
        this.uqy = f2;
    }

    public void setOuterRadiusFactor(float f2) {
        this.uqz = f2;
    }

    @Override
    public void setPixmaps(awg_1 awg_12, awg_1 awg_13, awg_1 awg_14, awg_1 awg_15, awg_1 awg_16, awg_1 awg_17, awg_1 awg_18, awg_1 awg_19, awg_1 awg_110) {
        this.tEC = awg_16;
        this.bRE.a(0, this.tEC.bHg());
        this.c(this.cdJ, this.cdJ.bIF());
    }

    @Override
    public void setClockwise(boolean bl) {
        this.tXE = bl;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int n5;
        int n6;
        float f9 = (float)(this.tXE ? -1 : 1) * (float)(Math.PI * 2 * (double)this.tXs) / 32.0f;
        int n7 = (int)Math.floor(32.0f * f2) + 1;
        float f10 = -((float)(Math.PI * 2 * (double)this.tXs * (double)f2));
        if (!this.tXE) {
            f10 = (float)(Math.PI * 2 - (double)f10);
        }
        if ((n6 = (n7 + (n7 > 32 ? 0 : 1)) * 2) < 4) {
            this.aaY(0);
            return;
        }
        this.aaY(n6);
        int n8 = n3 / 2 + n;
        int n9 = n4 / 2 + n2;
        float f11 = (float)Math.min(n3, n4) / 2.0f;
        float f12 = f11 * this.uqy;
        float f13 = f11 * this.uqz;
        for (n5 = 0; n5 < n7; ++n5) {
            f8 = (float)Math.cos(f9 * (float)n5 + this.tXt);
            f7 = (float)Math.sin(f9 * (float)n5 + this.tXt);
            f6 = f8 * f12 + (float)n8;
            f5 = f7 * f12 + (float)n9;
            f4 = f8 * f13 + (float)n8;
            f3 = f7 * f13 + (float)n9;
            this.cdJ.c(n5 * 2, f6, f5);
            this.cdJ.c(n5 * 2 + 1, f4, f3);
        }
        if (n7 < 33) {
            n5 = n7;
            f8 = (float)Math.cos(f10 + this.tXt);
            f7 = (float)Math.sin(f10 + this.tXt);
            f6 = f8 * f12 + (float)n8;
            f5 = f7 * f12 + (float)n9;
            f4 = f8 * f13 + (float)n8;
            f3 = f7 * f13 + (float)n9;
            this.cdJ.c(n5 * 2, f6, f5);
            this.cdJ.c(n5 * 2 + 1, f4, f3);
        }
        double d2 = (f13 + f12) / 2.0f;
        double d3 = Math.cos(f10 + this.tXt) * d2 + (double)n8;
        double d4 = Math.sin(f10 + this.tXt) * d2 + (double)n9;
        this.uql = new acb_1((float)d3, (float)d4);
    }

    @Override
    public final Entity getEntity() {
        return this.bRE;
    }

    private void aaY(int n) {
        if (n != this.cdJ.bIF()) {
            this.c(this.cdJ, n);
        }
    }

    protected void c(VertexBufferPCT vertexBufferPCT, int n) {
        vertexBufferPCT.ud(n);
        if (this.tEC != null) {
            boolean bl = false;
            for (int i = 0; i < n; ++i) {
                boolean bl2 = i % 4 < 2;
                bl = !bl;
                float f2 = bl2 ? this.tEC.aKs() : this.tEC.aKq();
                float f3 = bl ? this.tEC.aKp() : this.tEC.aKr();
                vertexBufferPCT.b(i, f2, f3);
            }
        }
    }

    @Override
    public void aVI() {
        this.bRE = (Entity3D)Entity3D.cXb.bSK();
        GeometryMesh geometryMesh = (GeometryMesh)GLGeometryMesh.dbh.bSK();
        int n = 66;
        this.cdJ = VertexBufferPCT.cWa.ue(66);
        this.cSn = arq_2.cVv;
        this.cdJ.ud(66);
        this.setColor(new awx_2(awx_2.dnF));
        geometryMesh.a(aso_1.cZR, this.cdJ, this.cSn);
        this.bRE.b(geometryMesh);
        geometryMesh.bsI();
    }

    @Override
    public final void aVH() {
        super.aVH();
        this.cdJ.bsI();
        this.cdJ = null;
        this.cSn = null;
        this.bRE.bsI();
        this.bRE = null;
        this.chO = null;
        this.tEC = null;
    }
}

