/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.text;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.geometry.Geometry;

public abstract class GeometryBackground
extends Geometry {
    protected float dkU;
    protected float dkV;
    protected short[] dkW;
    protected short[] dkX;
    protected VertexBufferPCT cdJ;
    protected arq_2 cSn;
    protected VertexBufferPCT dkY;
    protected arq_2 dkZ;
    private int brs;
    private int brt;
    private final awx_2 dla = new awx_2(1.0f, 1.0f, 1.0f, 0.7f);
    private float dlb;
    private float dlc;
    private float dld;
    private float dle;
    private float dlf;
    private final awx_2 dlg = new awx_2(0.06f, 0.04f, 0.03f, 0.4f);
    private float dlh;
    private float dli;
    private float[][] dlj;
    private float[][] dlk;
    private boolean dll;

    public void b(fs_0 fs_02) {
        assert (false) : "Currently not implemented";
    }

    public void a(apl_1 apl_12) {
        assert (false) : "Currently not implemented";
    }

    @Override
    public void ca(float f2) {
    }

    public final int bOr() {
        return this.brs;
    }

    public final void uO(int n) {
        if (n == this.brs) {
            return;
        }
        this.brs = n;
        this.bOA();
    }

    public final int bOs() {
        return this.brt;
    }

    public final void uP(int n) {
        if (n == this.brt) {
            return;
        }
        this.brt = n;
        this.bOA();
    }

    public float bOt() {
        return this.dlh;
    }

    public void da(float f2) {
        if (this.dlh == f2) {
            return;
        }
        this.dlh = f2;
        this.bOA();
    }

    public float bOu() {
        return this.dli;
    }

    public void db(float f2) {
        if (this.dli == f2) {
            return;
        }
        this.dli = f2;
        this.bOA();
    }

    public final float getBorderWidth() {
        return this.dlf;
    }

    public final void dc(float f2) {
        if (this.dlf == f2) {
            return;
        }
        this.dlf = f2;
        this.bOA();
    }

    public final axb_2 getColor() {
        return this.dla;
    }

    @Override
    public final void c(float f2, float f3, float f4, float f5) {
        this.dla.v(f2, f3, f4, f5);
        this.bOA();
    }

    public final axb_2 bOv() {
        return this.dlg;
    }

    public final void t(float f2, float f3, float f4, float f5) {
        this.dlg.v(f2, f3, f4, f5);
        this.bOA();
    }

    public final void bd(float f2, float f3) {
        this.dkU = f2;
        this.dkV = f3;
        this.bOA();
    }

    public final void a(float[][] fArray, float[][] fArray2) {
        assert (fArray != null) : "positionOffsets can't be null";
        assert (fArray2 != null) : "sizeMultipliers can't be null";
        assert (fArray.length == fArray2.length) : "positionOffsets and sizeMultipliers must have the same size";
        assert (fArray.length > 0) : "positionOffsets must be greater than zero";
        assert (fArray2.length > 0) : "sizeMultipliers must be greater than zero";
        this.dlj = fArray;
        this.dlk = fArray2;
        this.bOA();
    }

    public final void a(arq_2 arq_22) {
        this.dkZ = arq_22;
        this.bOA();
    }

    public final void b(arq_2 arq_22) {
        this.cSn = arq_22;
        this.bOA();
    }

    public final void u(float f2, float f3, float f4, float f5) {
        if (this.dlb == f2 && this.dlc == f3 && this.dld == f4 && this.dle == f5) {
            return;
        }
        this.dlb = f2;
        this.dlc = f3;
        this.dld = f4;
        this.dle = f5;
        this.bOA();
    }

    public final float bOw() {
        return this.dlb;
    }

    public final float bOx() {
        return this.dlc;
    }

    public final float bOy() {
        return this.dld;
    }

    public final float bOz() {
        return this.dle;
    }

    protected final void bOA() {
        this.dll = true;
    }

    protected void bOB() {
        if (!this.dll) {
            return;
        }
        this.dll = false;
        this.bOC();
        float f2 = (float)this.brs / this.dkU;
        float f3 = (float)this.brt / this.dkV;
        float f4 = f2 + this.dlb + this.dlc;
        float f5 = f3 + this.dld + this.dle;
        float f6 = this.dla.aIU();
        float f7 = this.dla.aIV();
        float f8 = this.dla.aIW();
        float f9 = this.dla.aIX();
        float f10 = this.dla.aIU();
        float f11 = this.dla.aIV();
        float f12 = this.dla.aIW();
        float f13 = this.dla.aIX();
        this.cdJ.bIH();
        this.dkY.bIH();
        for (int i = 0; i < this.dlj.length; ++i) {
            float f14 = this.dlj[i][0] + this.dlk[i][0] * f4 + this.dlh;
            float f15 = this.dlj[i][1] + this.dlk[i][1] * f5 + this.dli;
            this.cdJ.a(f14, f15, 0.0f, 0.0f, f6, f7, f8, f9);
            this.dkY.a(f14, f15, 0.0f, 0.0f, f10, f11, f12, f13);
        }
        this.cdJ.bIi();
        this.dkY.bIi();
    }

    private void bOC() {
        this.cdJ = GeometryBackground.b(this.cdJ, this.dlj.length);
        this.dkY = GeometryBackground.b(this.dkY, this.dlj.length);
    }

    private static VertexBufferPCT b(VertexBufferPCT vertexBufferPCT, int n) {
        if (vertexBufferPCT == null) {
            return VertexBufferPCT.cWa.uf(n);
        }
        if (vertexBufferPCT.bIG() < n) {
            vertexBufferPCT.bsI();
            return VertexBufferPCT.cWa.uf(n);
        }
        return vertexBufferPCT;
    }

    @Override
    public void brr() {
        super.brr();
        if (this.dla != null) {
            this.dla.v(1.0f, 1.0f, 1.0f, 0.7f);
        }
        if (this.dlg != null) {
            this.dlg.v(0.06f, 0.04f, 0.03f, 0.4f);
        }
        this.dlb = 0.0f;
        this.dlc = 0.0f;
        this.dld = 0.0f;
        this.dle = 0.0f;
        this.dkU = 1.0f;
        this.dkV = 1.0f;
        this.dlf = 1.0f;
        this.bOA();
    }

    @Override
    public void brs() {
        this.bOD();
        this.dlj = null;
        this.dlk = null;
        this.dkW = null;
        this.dkX = null;
    }

    private void bOD() {
        if (this.cdJ != null) {
            this.cdJ.bsI();
            this.cdJ = null;
        }
        this.cSn = null;
        if (this.dkY != null) {
            this.dkY.bsI();
            this.dkY = null;
        }
        this.dkZ = null;
    }
}

