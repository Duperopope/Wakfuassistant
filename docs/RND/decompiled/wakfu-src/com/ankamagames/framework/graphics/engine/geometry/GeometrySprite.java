/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.geometry;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.material.Material;
import java.util.Arrays;

public abstract class GeometrySprite
extends GeometryMesh {
    private static final float[] cZX = new float[16];
    private static final float[] cZY = new float[8];
    private static final float[] cZZ = new float[8];
    private int brs;
    private int brt;
    private float aAr;
    private float aAs;
    private boolean daa;

    public GeometrySprite() {
        this.cSn = arq_2.cVu;
        this.cZJ = aso_1.cZR;
        this.ur(4);
    }

    public final void o(float f2, float f3, float f4, float f5) {
        this.a(f2, f3, f4, f5, asp_1.dac);
    }

    public final void a(float f2, float f3, float f4, float f5, asp_1 asp_12) {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        this.cdJ.bID();
        GeometrySprite.a(this.cdJ, f2, f3, f4, f5, asp_12);
    }

    public static void a(VertexBufferPCT vertexBufferPCT, float f2, float f3, float f4, float f5, asp_1 asp_12) {
        switch (asp_12.ordinal()) {
            case 0: {
                GeometrySprite.cZY[0] = f3;
                GeometrySprite.cZY[1] = f4;
                GeometrySprite.cZY[2] = f3;
                GeometrySprite.cZY[3] = f2;
                GeometrySprite.cZY[4] = f5;
                GeometrySprite.cZY[5] = f2;
                GeometrySprite.cZY[6] = f5;
                GeometrySprite.cZY[7] = f4;
                break;
            }
            case 1: {
                GeometrySprite.cZY[0] = f5;
                GeometrySprite.cZY[1] = f4;
                GeometrySprite.cZY[2] = f3;
                GeometrySprite.cZY[3] = f4;
                GeometrySprite.cZY[4] = f3;
                GeometrySprite.cZY[5] = f2;
                GeometrySprite.cZY[6] = f5;
                GeometrySprite.cZY[7] = f2;
                break;
            }
            case 2: {
                GeometrySprite.cZY[0] = f5;
                GeometrySprite.cZY[1] = f2;
                GeometrySprite.cZY[2] = f5;
                GeometrySprite.cZY[3] = f4;
                GeometrySprite.cZY[4] = f3;
                GeometrySprite.cZY[5] = f4;
                GeometrySprite.cZY[6] = f3;
                GeometrySprite.cZY[7] = f2;
                break;
            }
            case 3: {
                GeometrySprite.cZY[0] = f3;
                GeometrySprite.cZY[1] = f2;
                GeometrySprite.cZY[2] = f5;
                GeometrySprite.cZY[3] = f2;
                GeometrySprite.cZY[4] = f5;
                GeometrySprite.cZY[5] = f4;
                GeometrySprite.cZY[6] = f3;
                GeometrySprite.cZY[7] = f4;
            }
        }
        vertexBufferPCT.J(cZY);
    }

    public final void ba(float f2, float f3) {
        if (this.aAr != f2 || this.aAs != f3) {
            this.aAr = f2;
            this.aAs = f3;
            this.bnK();
        }
    }

    public final void cb(int n, int n2) {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        if (this.brs != n || this.brt != n2) {
            this.brs = n;
            this.brt = n2;
            this.bnK();
        }
    }

    public final void f(float f2, float f3, int n, int n2) {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        if (this.aAr != f2 || this.aAs != f3 || this.brs != n || this.brt != n2) {
            this.aAr = f2;
            this.aAs = f3;
            this.brs = n;
            this.brt = n2;
            this.bnK();
        }
    }

    @Override
    public final void c(float f2, float f3, float f4, float f5) {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        for (int i = 0; i < 4; ++i) {
            this.ayR[i * 4] = f2;
            this.ayR[i * 4 + 1] = f3;
            this.ayR[i * 4 + 2] = f4;
            this.ayR[i * 4 + 3] = f5;
        }
        this.cdJ.bIC();
        GeometrySprite.a(this.cdJ, f2, f3, f4, f5);
        this.daa = true;
    }

    public static void a(VertexBufferPCT vertexBufferPCT, float f2, float f3, float f4, float f5) {
        GeometrySprite.cZX[8] = GeometrySprite.cZX[12] = f2;
        GeometrySprite.cZX[4] = GeometrySprite.cZX[12];
        GeometrySprite.cZX[0] = GeometrySprite.cZX[12];
        GeometrySprite.cZX[9] = GeometrySprite.cZX[13] = f3;
        GeometrySprite.cZX[5] = GeometrySprite.cZX[13];
        GeometrySprite.cZX[1] = GeometrySprite.cZX[13];
        GeometrySprite.cZX[10] = GeometrySprite.cZX[14] = f4;
        GeometrySprite.cZX[6] = GeometrySprite.cZX[14];
        GeometrySprite.cZX[2] = GeometrySprite.cZX[14];
        GeometrySprite.cZX[11] = GeometrySprite.cZX[15] = f5;
        GeometrySprite.cZX[7] = GeometrySprite.cZX[15];
        GeometrySprite.cZX[3] = GeometrySprite.cZX[15];
        vertexBufferPCT.F(cZX);
    }

    public final void b(asg_2 asg_22, float f2, float f3, float f4, float f5) {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        int n = asg_22.ordinal();
        this.ayR[n * 4] = f2;
        this.ayR[n * 4 + 1] = f3;
        this.ayR[n * 4 + 2] = f4;
        this.ayR[n * 4 + 3] = f5;
        this.cdJ.a(asg_22.ordinal(), f2, f3, f4, f5);
        this.daa = false;
    }

    public final float[] b(asg_2 asg_22) {
        return this.cdJ.uc(asg_22.ordinal());
    }

    @Override
    public final void d(Material material) {
        if (!this.daa) {
            this.a(asg_2.cXr, material);
            this.a(asg_2.cXq, material);
            this.a(asg_2.cXt, material);
            this.a(asg_2.cXs, material);
        } else {
            this.e(material);
        }
    }

    private void e(Material material) {
        float[] fArray = material.bKT();
        float[] fArray2 = material.bKU();
        float f2 = this.ayR[0] * fArray[0] + fArray2[0];
        float f3 = this.ayR[1] * fArray[1] + fArray2[1];
        float f4 = this.ayR[2] * fArray[2] + fArray2[2];
        float f5 = this.ayR[3] * fArray[3];
        GeometrySprite.cZX[8] = GeometrySprite.cZX[12] = f2;
        GeometrySprite.cZX[4] = GeometrySprite.cZX[12];
        GeometrySprite.cZX[0] = GeometrySprite.cZX[12];
        GeometrySprite.cZX[9] = GeometrySprite.cZX[13] = f3;
        GeometrySprite.cZX[5] = GeometrySprite.cZX[13];
        GeometrySprite.cZX[1] = GeometrySprite.cZX[13];
        GeometrySprite.cZX[10] = GeometrySprite.cZX[14] = f4;
        GeometrySprite.cZX[6] = GeometrySprite.cZX[14];
        GeometrySprite.cZX[2] = GeometrySprite.cZX[14];
        GeometrySprite.cZX[11] = GeometrySprite.cZX[15] = f5;
        GeometrySprite.cZX[7] = GeometrySprite.cZX[15];
        GeometrySprite.cZX[3] = GeometrySprite.cZX[15];
        this.cdJ.I(cZX);
    }

    public void a(asg_2 asg_22, Material material) {
        int n = asg_22.ordinal();
        float[] fArray = material.bKT();
        float[] fArray2 = material.bKU();
        float f2 = this.ayR[n * 4] * fArray[0] + fArray2[0];
        float f3 = this.ayR[n * 4 + 1] * fArray[1] + fArray2[1];
        float f4 = this.ayR[n * 4 + 2] * fArray[2] + fArray2[2];
        float f5 = this.ayR[n * 4 + 3] * fArray[3];
        this.cdJ.a(n, f2, f3, f4, f5);
    }

    public final float bKj() {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        return this.aAs + (float)this.brs * 0.5f;
    }

    public final float bKk() {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        return this.aAr - (float)this.brt * 0.5f;
    }

    public final float bKl() {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        return this.aAs;
    }

    public final float bKm() {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        return this.aAs + (float)this.brs;
    }

    public final float bKn() {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        return this.aAr;
    }

    public final float bKo() {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        return this.aAr - (float)this.brt;
    }

    public final float bKp() {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        return (float)this.brs * 0.5f;
    }

    public final float bKq() {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        return (float)this.brt * 0.5f;
    }

    public final int bKr() {
        return this.brs;
    }

    public final int bKs() {
        return this.brt;
    }

    @Override
    public abstract void b(art_1 var1);

    @Override
    public void brr() {
        super.brr();
        this.brt = 0;
        this.brs = 0;
        this.aAs = 0.0f;
        this.aAr = 0.0f;
        if (this.ayR != null) {
            Arrays.fill(this.ayR, 1.0f);
        }
        this.daa = true;
        assert (this.cdJ == null);
        this.cdJ = VertexBufferPCT.cWa.uf(4);
    }

    @Override
    public void brs() {
        this.cdJ.bsI();
        this.cdJ = null;
    }

    private void bnK() {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        this.cdJ.bIB();
        GeometrySprite.b(this.cdJ, this.aAr, this.aAs, this.brs, this.brt);
    }

    public static void b(VertexBufferPCT vertexBufferPCT, float f2, float f3, float f4, float f5) {
        float f6 = f2 - f5;
        float f7 = f3 + f4;
        GeometrySprite.cZZ[0] = f3;
        GeometrySprite.cZZ[1] = f6;
        GeometrySprite.cZZ[2] = f3;
        GeometrySprite.cZZ[3] = f2;
        GeometrySprite.cZZ[4] = f7;
        GeometrySprite.cZZ[5] = f2;
        GeometrySprite.cZZ[6] = f7;
        GeometrySprite.cZZ[7] = f6;
        vertexBufferPCT.D(cZZ);
    }
}

