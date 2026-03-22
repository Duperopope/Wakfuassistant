/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;

/*
 * Renamed from fFP
 */
public class ffp_1
extends ffz_1 {
    private Entity3D bRE;
    private VertexBufferPCT cdJ;
    private arq_2 cSn;

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

    private static float e(float f2, float f3, float f4, float f5, float f6) {
        return (f4 - f3) / (f6 - f5) * (f2 - f5) + f3;
    }

    private float[] fQ(float f2) {
        float f3;
        float f4;
        if (f2 == 0.0f) {
            return new float[0];
        }
        float f5 = f2 * 1.0f;
        float f6 = 0.0f;
        float f7 = 0.2f;
        float f8 = 0.373333f;
        float f9 = 0.586667f;
        float f10 = 0.786667f;
        float f11 = 0.853333f;
        float f12 = 0.946667f;
        float f13 = 0.5f;
        float f14 = 0.25f;
        float f15 = 0.107143f;
        float f16 = 0.02381f;
        float f17 = 0.02381f;
        float f18 = 0.166667f;
        float[] fArray = null;
        fArray = f5 <= 0.2f ? new float[8] : (f5 <= 0.373333f ? new float[16] : (f5 <= 0.586667f ? new float[24] : (f5 <= 0.786667f ? new float[32] : (f5 <= 0.853333f ? new float[48] : new float[64]))));
        if (f5 > 0.0f) {
            f4 = Math.min(f5, 0.2f);
            f3 = ffp_1.e(f4, 0.5f, 0.25f, 0.0f, 0.2f);
            fArray[0] = 0.5f;
            fArray[1] = 0.0f;
            fArray[2] = 0.5f;
            fArray[3] = 0.0f;
            fArray[4] = f3;
            fArray[5] = f4;
            fArray[6] = 1.0f - f3;
            fArray[7] = f4;
        }
        if (f5 > 0.2f) {
            f4 = Math.min(f5, 0.373333f);
            f3 = ffp_1.e(f4, 0.25f, 0.107143f, 0.2f, 0.373333f);
            fArray[8] = 0.25f;
            fArray[9] = 0.2f;
            fArray[10] = 0.75f;
            fArray[11] = 0.2f;
            fArray[12] = 1.0f - f3;
            fArray[13] = f4;
            fArray[14] = f3;
            fArray[15] = f4;
        }
        if (f5 > 0.373333f) {
            f4 = Math.min(f5, 0.586667f);
            f3 = ffp_1.e(f4, 0.107143f, 0.02381f, 0.373333f, 0.586667f);
            fArray[16] = 0.107143f;
            fArray[17] = 0.373333f;
            fArray[18] = 0.892857f;
            fArray[19] = 0.373333f;
            fArray[20] = 1.0f - f3;
            fArray[21] = f4;
            fArray[22] = f3;
            fArray[23] = f4;
        }
        if (f5 > 0.586667f) {
            f4 = Math.min(f5, 0.786667f);
            f3 = ffp_1.e(f4, 0.02381f, 0.02381f, 0.586667f, 0.786667f);
            fArray[24] = 0.02381f;
            fArray[25] = 0.586667f;
            fArray[26] = 0.97619f;
            fArray[27] = 0.586667f;
            fArray[28] = 1.0f - f3;
            fArray[29] = f4;
            fArray[30] = f3;
            fArray[31] = f4;
        }
        if (f5 > 0.786667f) {
            f4 = Math.min(f5, 0.853333f);
            f3 = ffp_1.e(f4, 0.02381f, 0.166667f, 0.786667f, 0.946667f);
            fArray[32] = 0.02381f;
            fArray[33] = 0.786667f;
            fArray[34] = 0.5f;
            fArray[35] = 0.786667f;
            fArray[36] = 0.5f;
            fArray[37] = f4;
            fArray[38] = f3;
            fArray[39] = f4;
            fArray[40] = 0.5f;
            fArray[41] = 0.786667f;
            fArray[42] = 0.97619f;
            fArray[43] = 0.786667f;
            fArray[44] = 1.0f - f3;
            fArray[45] = f4;
            fArray[46] = 0.5f;
            fArray[47] = f4;
        }
        if (f5 > 0.853333f) {
            f4 = Math.min(f5, 0.946667f);
            f3 = ffp_1.e(f4, 0.02381f, 0.166667f, 0.786667f, 0.946667f);
            float f19 = 0.5f - ffp_1.e(f4, 0.02381f, 0.166667f, 0.853333f, 0.946667f);
            fArray[48] = fArray[38];
            fArray[49] = 0.853333f;
            fArray[50] = 0.5f;
            fArray[51] = 0.853333f;
            fArray[52] = f19;
            fArray[53] = f4;
            fArray[54] = f3;
            fArray[55] = f4;
            fArray[56] = 0.5f;
            fArray[57] = 0.853333f;
            fArray[58] = fArray[44];
            fArray[59] = 0.853333f;
            fArray[60] = 1.0f - f3;
            fArray[61] = f4;
            fArray[62] = 1.0f - f19;
            fArray[63] = f4;
        }
        return fArray;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float f2) {
        float[] fArray = this.fQ(f2);
        this.aaY(fArray.length / 2);
        int n5 = fArray.length / 2;
        for (int i = 0; i < n5; ++i) {
            float f3 = (float)n + (float)n3 * fArray[i * 2];
            float f4 = (float)n2 + (float)n4 * fArray[i * 2 + 1];
            this.cdJ.c(i, f3, f4);
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
        this.cdJ = VertexBufferPCT.cWa.uf(32);
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

