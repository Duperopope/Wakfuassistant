/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.geometry;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import com.ankamagames.framework.graphics.engine.material.Material;
import java.nio.FloatBuffer;

public abstract class GeometryMesh
extends Geometry {
    protected arq_2 cSn;
    protected VertexBufferPCT cdJ;
    protected aso_1 cZJ = aso_1.cZQ;
    protected float[] ayR;
    protected int cZK;
    private static final float[] cZL = new float[4];

    protected GeometryMesh() {
    }

    public void a(aso_1 aso_12, int n, arq_2 arq_22) {
        this.cZJ = aso_12;
        if (this.cdJ != null) {
            this.cdJ.bsI();
        }
        assert (n <= arq_22.bIj());
        this.cSn = arq_22;
        this.cdJ = VertexBufferPCT.cWa.uf(n);
        this.d(this.cdJ);
    }

    public void a(aso_1 aso_12, VertexBufferPCT vertexBufferPCT, arq_2 arq_22) {
        this.cZJ = aso_12;
        vertexBufferPCT.bGY();
        if (this.cdJ != null) {
            this.cdJ.bsI();
        }
        this.cdJ = vertexBufferPCT;
        this.cSn = arq_22;
        this.d(this.cdJ);
    }

    public void a(aso_1 aso_12, VertexBufferPCT vertexBufferPCT, arq_2 arq_22, float[] fArray) {
        this.cZJ = aso_12;
        assert (this.cdJ == null);
        assert (this.cSn == null);
        this.cdJ = vertexBufferPCT;
        this.cSn = arq_22;
        this.cdJ.bGY();
        this.bKf();
        int n = vertexBufferPCT.bIF();
        if (n != 0) {
            this.g(fArray, n);
        }
    }

    public final VertexBufferPCT bKd() {
        return this.cdJ;
    }

    public final aso_1 bKe() {
        return this.cZJ;
    }

    @Override
    public void c(float f2, float f3, float f4, float f5) {
        if (this.cdJ == null) {
            return;
        }
        if (this.cdJ.bIz() == null) {
            return;
        }
        GeometryMesh.cZL[0] = f2;
        GeometryMesh.cZL[1] = f3;
        GeometryMesh.cZL[2] = f4;
        GeometryMesh.cZL[3] = f5;
        for (int i = 0; i < this.cdJ.bIF(); ++i) {
            this.cdJ.d(i, cZL);
        }
        this.d(this.cdJ);
    }

    @Override
    public void d(Material material) {
        int n = this.cdJ.bIF();
        if (this.cZK != n) {
            return;
        }
        float[] fArray = material.bKT();
        float[] fArray2 = material.bKU();
        this.cdJ.bIC();
        for (int i = 0; i < n; ++i) {
            GeometryMesh.cZL[0] = this.ayR[i * 4] * fArray[0] + fArray2[0];
            GeometryMesh.cZL[1] = this.ayR[i * 4 + 1] * fArray[1] + fArray2[1];
            GeometryMesh.cZL[2] = this.ayR[i * 4 + 2] * fArray[2] + fArray2[2];
            GeometryMesh.cZL[3] = this.ayR[i * 4 + 3] * fArray[3];
            this.cdJ.F(cZL);
        }
    }

    @Override
    public void ca(float f2) {
    }

    @Override
    public abstract void b(art_1 var1);

    public static int a(aso_1 aso_12, int n) {
        switch (aso_12.ordinal()) {
            case 1: {
                return n * 2;
            }
            case 2: {
                return 2 + (n - 1);
            }
            case 0: {
                return n;
            }
            case 6: {
                return n * 4;
            }
            case 3: {
                return n * 3;
            }
            case 4: 
            case 5: {
                return 3 + (n - 1);
            }
        }
        return 0;
    }

    @Override
    public void brr() {
        super.brr();
        this.cZJ = aso_1.cZQ;
    }

    @Override
    public void brs() {
        if (this.cdJ != null) {
            this.cdJ.bsI();
            this.cdJ = null;
        }
        this.cSn = null;
        this.bKf();
        this.ayR = null;
    }

    private void d(VertexBufferPCT vertexBufferPCT) {
        int n = vertexBufferPCT.bIF();
        if (n == 0) {
            this.bKf();
            return;
        }
        this.bKf();
        FloatBuffer floatBuffer = vertexBufferPCT.bIz();
        this.ur(n);
        floatBuffer.get(this.ayR);
    }

    private void bKf() {
        this.cZK = 0;
    }

    protected void ur(int n) {
        int n2 = n * 4;
        this.cZK = n;
        if (this.ayR != null && this.ayR.length == n2) {
            return;
        }
        float[] fArray = new float[n2];
        if (this.ayR != null) {
            System.arraycopy(this.ayR, 0, fArray, 0, Math.min(this.ayR.length, fArray.length));
        }
        this.ayR = fArray;
    }

    public final void g(float[] fArray, int n) {
        this.cZK = n;
        this.ayR = fArray;
    }
}

