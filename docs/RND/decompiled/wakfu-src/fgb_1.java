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
 * Renamed from fGb
 */
public class fgb_1
extends ffz_1 {
    public static final double usd = 1.5707963267948966;
    public static final double use = 0.7853981633974483;
    private Entity3D bRE;
    private VertexBufferPCT cdJ;
    private arq_2 cSn;
    private Insets tFf = new Insets(1, 1, 1, 1);
    private boolean tXE = true;

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
    public void setBorder(Insets insets) {
        this.tFf = insets;
    }

    @Override
    public void setClockwise(boolean bl) {
        this.tXE = bl;
    }

    private static float M(float f2, float f3, float f4) {
        return (Math.min(f2, f3) - f4) / (f3 - f4);
    }

    private float[] N(float f2, float f3, float f4) {
        double d2;
        int n;
        if (f4 <= 0.0f) {
            return new float[0];
        }
        int n2 = this.tFf.top;
        int n3 = this.tFf.right;
        int n4 = this.tFf.bottom;
        int n5 = this.tFf.left;
        float f5 = 2.0f * (f2 + f3) - (float)(n2 + n3 + n4 + n5);
        float f6 = 0.0f;
        float f7 = 0.0f + f2 / 2.0f - (float)n3;
        float f8 = f7 + (float)n3 / 2.0f + (float)n2 / 2.0f;
        float f9 = f8 + f3 - (float)(n2 + n4);
        float f10 = f9 + (float)n4 / 2.0f + (float)n3 / 2.0f;
        float f11 = f10 + f2 - (float)(n5 + n3);
        float f12 = f11 + (float)n5 / 2.0f + (float)n4 / 2.0f;
        float f13 = f12 + f3 - (float)(n2 + n4);
        float f14 = f13 + (float)n2 / 2.0f + (float)n5 / 2.0f;
        float f15 = f14 + f2 / 2.0f - (float)n5;
        float[] fArray = new float[]{0.0f, f7, f8, f9, f10, f11, f12, f13, f14, f15};
        float[] fArray2 = new float[fArray.length];
        for (n = 0; n < fArray.length; ++n) {
            fArray2[n] = fArray[n] / f5;
        }
        n = 0;
        for (float f16 : fArray2) {
            if (!(f16 <= f4)) break;
            n += 8;
        }
        float[] fArray3 = new float[n];
        double d3 = 0.0;
        double d4 = 0.0;
        if (f4 > fArray2[0]) {
            fArray3[0] = f2 / 2.0f;
            fArray3[1] = f3;
            fArray3[2] = f2 / 2.0f;
            fArray3[3] = f3 - (float)n2;
            fArray3[4] = GC.a(f2 / 2.0f, f2 - (float)n3, fgb_1.M(f4, fArray2[1], fArray2[0]));
            fArray3[5] = f3 - (float)n2;
            fArray3[6] = fArray3[4];
            fArray3[7] = f3;
            d3 = fArray3[4];
            d4 = f3 - (float)n2 / 2.0f;
        }
        if (f4 > fArray2[1]) {
            fArray3[8] = f2 - (float)n3;
            fArray3[9] = f3;
            fArray3[10] = f2 - (float)n3;
            fArray3[11] = f3 - (float)n2;
            d2 = GC.a(0.0, 1.5707963267948966, (double)fgb_1.M(f4, fArray2[2], fArray2[1]));
            if (d2 < 0.7853981633974483) {
                fArray3[12] = fArray3[10];
                fArray3[13] = fArray3[11];
                fArray3[14] = f2 + (float)n3 * ((float)Math.tan(d2) - 1.0f);
                fArray3[15] = f3;
                d3 += (double)((float)n3 / 2.0f) * d2 / 0.7853981633974483;
            } else {
                fArray3[12] = f2;
                fArray3[13] = f3 + (float)n2 * ((float)Math.tan(1.5707963267948966 - d2) - 1.0f);
                fArray3[14] = f2;
                fArray3[15] = f3;
                d3 += (double)((float)n3 / 2.0f);
                d4 -= (double)((float)n2 / 2.0f) * (d2 - 0.7853981633974483) / 0.7853981633974483;
            }
        }
        if (f4 > fArray2[2]) {
            fArray3[16] = f2;
            fArray3[17] = f3 - (float)n2;
            fArray3[18] = f2 - (float)n3;
            fArray3[19] = f3 - (float)n2;
            fArray3[20] = f2 - (float)n3;
            fArray3[21] = GC.a(f3 - (float)n2, (float)n4, fgb_1.M(f4, fArray2[3], fArray2[2]));
            fArray3[22] = f2;
            fArray3[23] = fArray3[21];
            d3 = f2 - (float)n3 / 2.0f;
            d4 = fArray3[21];
        }
        if (f4 > fArray2[3]) {
            fArray3[24] = f2;
            fArray3[25] = n4;
            fArray3[26] = f2 - (float)n3;
            fArray3[27] = n4;
            d2 = GC.a(0.0, 1.5707963267948966, (double)fgb_1.M(f4, fArray2[4], fArray2[3]));
            if (d2 < 0.7853981633974483) {
                fArray3[28] = fArray3[26];
                fArray3[29] = fArray3[27];
                fArray3[30] = f2;
                fArray3[31] = (float)n4 * (1.0f - (float)Math.tan(d2));
                d4 -= (double)((float)n4 / 2.0f) * d2 / 0.7853981633974483;
            } else {
                fArray3[28] = f2 + (float)n3 * ((float)Math.tan(1.5707963267948966 - d2) - 1.0f);
                fArray3[29] = 0.0f;
                fArray3[30] = f2;
                fArray3[31] = 0.0f;
                d3 -= (double)((float)n3 / 2.0f) * (d2 - 0.7853981633974483) / 0.7853981633974483;
                d4 -= (double)((float)n3 / 2.0f);
            }
        }
        if (f4 > fArray2[4]) {
            fArray3[32] = f2 - (float)n3;
            fArray3[33] = n4;
            fArray3[34] = f2 - (float)n3;
            fArray3[35] = 0.0f;
            fArray3[36] = GC.a(f2 - (float)n3, (float)n5, fgb_1.M(f4, fArray2[5], fArray2[4]));
            fArray3[37] = 0.0f;
            fArray3[38] = fArray3[36];
            fArray3[39] = n4;
            d3 = fArray3[36];
            d4 = (float)n4 / 2.0f;
        }
        if (f4 > fArray2[5]) {
            fArray3[40] = n5;
            fArray3[41] = 0.0f;
            fArray3[42] = n5;
            fArray3[43] = n4;
            d2 = GC.a(0.0, 1.5707963267948966, (double)fgb_1.M(f4, fArray2[6], fArray2[5]));
            if (d2 < 0.7853981633974483) {
                fArray3[44] = fArray3[42];
                fArray3[45] = fArray3[43];
                fArray3[46] = (float)n5 * (1.0f - (float)Math.tan(d2));
                fArray3[47] = 0.0f;
                d3 -= (double)((float)n3 / 2.0f) * d2 / 0.7853981633974483;
            } else {
                fArray3[44] = 0.0f;
                fArray3[45] = (float)n4 * (1.0f - (float)Math.tan(1.5707963267948966 - d2));
                fArray3[46] = 0.0f;
                fArray3[47] = 0.0f;
                d3 -= (double)((float)n3 / 2.0f);
                d4 += (double)((float)n2 / 2.0f) * (d2 - 0.7853981633974483) / 0.7853981633974483;
            }
        }
        if (f4 > fArray2[6]) {
            fArray3[48] = 0.0f;
            fArray3[49] = n4;
            fArray3[50] = n5;
            fArray3[51] = n4;
            fArray3[52] = n5;
            fArray3[53] = GC.a((float)n4, f3 - (float)n2, fgb_1.M(f4, fArray2[7], fArray2[6]));
            fArray3[54] = 0.0f;
            fArray3[55] = fArray3[53];
            d3 = (float)n5 / 2.0f;
            d4 = fArray3[53];
        }
        if (f4 > fArray2[7]) {
            fArray3[56] = 0.0f;
            fArray3[57] = f3 - (float)n2;
            fArray3[58] = n5;
            fArray3[59] = f3 - (float)n2;
            d2 = GC.a(0.0, 1.5707963267948966, (double)fgb_1.M(f4, fArray2[8], fArray2[7]));
            if (d2 < 0.7853981633974483) {
                fArray3[60] = fArray3[58];
                fArray3[61] = fArray3[59];
                fArray3[62] = 0.0f;
                fArray3[63] = f3 + (float)n2 * ((float)Math.tan(d2) - 1.0f);
                d4 += (double)((float)n2 / 2.0f) * d2 / 0.7853981633974483;
            } else {
                fArray3[60] = (float)n5 * (1.0f - (float)Math.tan(1.5707963267948966 - d2));
                fArray3[61] = f3;
                fArray3[62] = 0.0f;
                fArray3[63] = f3;
                d3 += (double)((float)n5 / 2.0f) * (d2 - 0.7853981633974483) / 0.7853981633974483;
                d4 += (double)((float)n2 / 2.0f);
            }
        }
        if (f4 > fArray2[8]) {
            fArray3[64] = n5;
            fArray3[65] = f3;
            fArray3[66] = n5;
            fArray3[67] = f3 - (float)n2;
            fArray3[68] = GC.a((float)n5, f2 / 2.0f, fgb_1.M(f4, fArray2[9], fArray2[8]));
            fArray3[69] = f3 - (float)n2;
            fArray3[70] = fArray3[68];
            fArray3[71] = f3;
            d3 = fArray3[68];
            d4 = f3 - (float)n2 / 2.0f;
        }
        this.uql = new acb_1((float)d3, (float)d4);
        return fArray3;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float f2) {
        int n5;
        float[] fArray = this.N(n3, n4, f2);
        if (!this.tXE) {
            for (n5 = 0; n5 < fArray.length; n5 += 2) {
                fArray[n5] = (float)n3 - fArray[n5];
            }
            if (this.uql != null) {
                this.uql.dv((float)n3 - this.uql.bWv());
            }
        }
        this.aaY(fArray.length / 2);
        n5 = fArray.length / 2;
        for (int i = 0; i < n5; ++i) {
            this.cdJ.c(i, (float)n + fArray[i * 2], (float)n2 + fArray[i * 2 + 1]);
        }
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

    private void c(VertexBufferPCT vertexBufferPCT, int n) {
        vertexBufferPCT.ud(n);
    }

    @Override
    public final void aVI() {
        this.bRE = (Entity3D)Entity3D.cXb.bSK();
        GeometryMesh geometryMesh = (GeometryMesh)GLGeometryMesh.dbh.bSK();
        this.cdJ = VertexBufferPCT.cWa.uf(36);
        this.cSn = arq_2.cVv;
        this.cdJ.ud(0);
        this.setColor(new awx_2(awx_2.dnG));
        geometryMesh.a(aso_1.cZT, this.cdJ, this.cSn);
        this.bRE.b(geometryMesh);
        geometryMesh.bsI();
    }

    @Override
    public final void aVH() {
        super.aVH();
        this.chO = null;
        this.cdJ.bsI();
        this.cdJ = null;
        this.cSn = null;
        this.bRE.bsI();
        this.bRE = null;
    }
}

