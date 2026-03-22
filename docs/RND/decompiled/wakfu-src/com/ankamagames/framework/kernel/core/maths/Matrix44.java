/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.framework.kernel.core.maths;

import com.ankamagames.framework.kernel.core.maths.Matrix44$ObjectFactory;
import org.apache.log4j.Logger;

public final class Matrix44
extends ayq_2 {
    public static final Matrix44$ObjectFactory dAb = new Matrix44$ObjectFactory();
    private static final Logger dAc = Logger.getLogger(Matrix44.class);
    private static final float[] dAd = new float[16];
    public static final Matrix44 dAe = Matrix44.bWp();
    private final float[] dAf = new float[16];
    private boolean dAg;

    Matrix44() {
    }

    public Matrix44(Matrix44 matrix44) {
        this.c(matrix44);
    }

    public Matrix44(float[] fArray) {
        this.Y(fArray);
    }

    public Matrix44(ach_1 ach_12) {
        this.c(ach_12);
    }

    public Matrix44(ach_1 ach_12, acr_1 acr_12) {
        this.a(ach_12, acr_12);
    }

    public Matrix44(acr_1 acr_12, acr_1 acr_13, acr_1 acr_14, acr_1 acr_15) {
        this.a(acr_12, acr_13, acr_14, acr_15);
    }

    public static Matrix44 bWp() {
        Matrix44 matrix44 = new Matrix44();
        matrix44.bPx();
        return matrix44;
    }

    public void a(apl_1 apl_12) {
        for (int i = 0; i < this.dAf.length; ++i) {
            this.dAf[i] = apl_12.aIB();
        }
        this.dAg = false;
    }

    public void b(fs_0 fs_02) {
        for (int i = 0; i < this.dAf.length; ++i) {
            fs_02.b(this.dAf[i]);
        }
    }

    public void c(Matrix44 matrix44) {
        this.dAg = matrix44.dAg;
        System.arraycopy(matrix44.dAf, 0, this.dAf, 0, this.dAf.length);
    }

    public void Y(float[] fArray) {
        assert (fArray.length >= 16) : "Buffer length must be at least of 16 float";
        System.arraycopy(fArray, 0, this.dAf, 0, 16);
        this.dAg = false;
    }

    public void c(ach_1 ach_12) {
        float f2 = ach_12.bVA();
        float f3 = ach_12.bVB();
        float f4 = ach_12.bVC();
        float f5 = ach_12.bVD();
        float f6 = f2 + f2;
        float f7 = f3 + f3;
        float f8 = f4 + f4;
        float f9 = f2 * f6;
        float f10 = f2 * f7;
        float f11 = f2 * f8;
        float f12 = f3 * f7;
        float f13 = f3 * f8;
        float f14 = f4 * f8;
        float f15 = f5 * f6;
        float f16 = f5 * f7;
        float f17 = f5 * f8;
        this.dAf[0] = 1.0f - (f12 + f14);
        this.dAf[1] = f10 + f17;
        this.dAf[2] = f11 - f16;
        this.dAf[3] = 0.0f;
        this.dAf[4] = f10 - f17;
        this.dAf[5] = 1.0f - (f9 + f14);
        this.dAf[6] = f13 + f15;
        this.dAf[7] = 0.0f;
        this.dAf[8] = f11 + f16;
        this.dAf[9] = f13 - f15;
        this.dAf[10] = 1.0f - (f9 + f12);
        this.dAf[11] = 0.0f;
        this.dAf[12] = 0.0f;
        this.dAf[13] = 0.0f;
        this.dAf[14] = 0.0f;
        this.dAf[15] = 1.0f;
        this.dAg = false;
    }

    public void a(ach_1 ach_12, acr_1 acr_12) {
        this.c(ach_12);
        this.c(acr_12);
        this.bWr();
        this.dAg = false;
    }

    public void a(ach_1 ach_12, acr_1 acr_12, acr_1 acr_13) {
        this.c(ach_12);
        this.c(acr_12);
        this.bWr();
        float f2 = acr_13.bVA();
        float f3 = acr_13.bVB();
        float f4 = acr_13.bVC();
        if (f2 != 1.0f || f3 != 1.0f || f4 != 1.0f) {
            this.dAf[0] = this.dAf[0] * f2;
            this.dAf[1] = this.dAf[1] * f2;
            this.dAf[2] = this.dAf[2] * f2;
            this.dAf[4] = this.dAf[4] * f3;
            this.dAf[5] = this.dAf[5] * f3;
            this.dAf[6] = this.dAf[6] * f3;
            this.dAf[8] = this.dAf[8] * f4;
            this.dAf[9] = this.dAf[9] * f4;
            this.dAf[10] = this.dAf[10] * f4;
        }
        this.dAg = false;
    }

    public void a(acr_1 acr_12, acr_1 acr_13, acr_1 acr_14, acr_1 acr_15) {
        this.g(acr_12);
        this.h(acr_13);
        this.i(acr_14);
        this.c(acr_15);
        this.dAg = false;
    }

    public void g(acr_1 acr_12) {
        this.dAf[0] = acr_12.bVA();
        this.dAf[1] = acr_12.bVB();
        this.dAf[2] = acr_12.bVC();
        this.dAg = false;
    }

    public void h(acr_1 acr_12) {
        this.dAf[4] = acr_12.bVA();
        this.dAf[5] = acr_12.bVB();
        this.dAf[6] = acr_12.bVC();
        this.dAg = false;
    }

    public void i(acr_1 acr_12) {
        this.dAf[8] = acr_12.bVA();
        this.dAf[9] = acr_12.bVB();
        this.dAf[10] = acr_12.bVC();
        this.dAg = false;
    }

    public void c(acr_1 acr_12) {
        this.dAf[12] = acr_12.bVA();
        this.dAf[13] = acr_12.bVB();
        this.dAf[14] = acr_12.bVC();
        this.dAg = false;
    }

    public void A(float f2, float f3, float f4) {
        this.dAf[12] = f2;
        this.dAf[13] = f3;
        this.dAf[14] = f4;
        this.dAg = false;
    }

    public void d(acr_1 acr_12) {
        this.dAf[12] = this.dAf[12] + acr_12.bVA();
        this.dAf[13] = this.dAf[13] + acr_12.bVB();
        this.dAf[14] = this.dAf[14] + acr_12.bVC();
        this.dAg = false;
    }

    public void B(float f2, float f3, float f4) {
        this.bWr();
        if (f2 == 1.0f && f3 == 1.0f && f4 == 1.0f) {
            return;
        }
        this.dAf[0] = this.dAf[0] * f2;
        this.dAf[1] = this.dAf[1] * f2;
        this.dAf[2] = this.dAf[2] * f2;
        this.dAf[4] = this.dAf[4] * f3;
        this.dAf[5] = this.dAf[5] * f3;
        this.dAf[6] = this.dAf[6] * f3;
        this.dAf[8] = this.dAf[8] * f4;
        this.dAf[9] = this.dAf[9] * f4;
        this.dAf[10] = this.dAf[10] * f4;
    }

    public void e(acr_1 acr_12) {
        this.B(acr_12.bVA(), acr_12.bVB(), acr_12.bVC());
    }

    public void bPx() {
        try {
            System.arraycopy(dAd, 0, this.dAf, 0, 16);
        }
        catch (Exception exception) {
            dAc.error((Object)"Exception during setIdentity", (Throwable)exception);
        }
        this.dAf[15] = 1.0f;
        this.dAf[10] = 1.0f;
        this.dAf[5] = 1.0f;
        this.dAf[0] = 1.0f;
        this.dAg = true;
    }

    public void a(acr_1 acr_12, acr_1 acr_13) {
        float f2 = acr_12.bVA();
        float f3 = acr_12.bVB();
        float f4 = acr_12.bVC();
        acr_13.y(f2 * this.dAf[0] + f3 * this.dAf[4] + f4 * this.dAf[8], f2 * this.dAf[1] + f3 * this.dAf[5] + f4 * this.dAf[9], f2 * this.dAf[2] + f3 * this.dAf[6] + f4 * this.dAf[10], 0.0f);
    }

    public void b(acr_1 acr_12, acr_1 acr_13) {
        float f2 = acr_12.bVA();
        float f3 = acr_12.bVB();
        float f4 = acr_12.bVC();
        float f5 = acr_12.bVD();
        acr_13.y(f2 * this.dAf[0] + f3 * this.dAf[4] + f4 * this.dAf[8] + f5 * this.dAf[12], f2 * this.dAf[1] + f3 * this.dAf[5] + f4 * this.dAf[9] + f5 * this.dAf[13], f2 * this.dAf[2] + f3 * this.dAf[6] + f4 * this.dAf[10] + f5 * this.dAf[14], f2 * this.dAf[3] + f3 * this.dAf[7] + f4 * this.dAf[11] + f5 * this.dAf[15]);
    }

    public void du(float f2) {
        this.dAg = false;
        this.dAf[0] = this.dAf[0] * f2;
        this.dAf[1] = this.dAf[1] * f2;
        this.dAf[2] = this.dAf[2] * f2;
        this.dAf[3] = this.dAf[3] * f2;
        this.dAf[4] = this.dAf[4] * f2;
        this.dAf[5] = this.dAf[5] * f2;
        this.dAf[6] = this.dAf[6] * f2;
        this.dAf[7] = this.dAf[7] * f2;
        this.dAf[8] = this.dAf[8] * f2;
        this.dAf[9] = this.dAf[9] * f2;
        this.dAf[10] = this.dAf[10] * f2;
        this.dAf[11] = this.dAf[11] * f2;
        this.dAf[12] = this.dAf[12] * f2;
        this.dAf[13] = this.dAf[13] * f2;
        this.dAf[14] = this.dAf[14] * f2;
        this.dAf[15] = this.dAf[15] * f2;
    }

    public void d(Matrix44 matrix44) {
        if (this.dAg) {
            matrix44.c(this);
        } else {
            matrix44.dAf[0] = this.dAf[0];
            matrix44.dAf[1] = this.dAf[4];
            matrix44.dAf[2] = this.dAf[8];
            matrix44.dAf[3] = this.dAf[12];
            matrix44.dAf[4] = this.dAf[1];
            matrix44.dAf[5] = this.dAf[5];
            matrix44.dAf[6] = this.dAf[9];
            matrix44.dAf[7] = this.dAf[13];
            matrix44.dAf[8] = this.dAf[2];
            matrix44.dAf[9] = this.dAf[6];
            matrix44.dAf[10] = this.dAf[10];
            matrix44.dAf[11] = this.dAf[14];
            matrix44.dAf[12] = this.dAf[3];
            matrix44.dAf[13] = this.dAf[7];
            matrix44.dAf[14] = this.dAf[11];
            matrix44.dAf[15] = this.dAf[15];
            matrix44.dAg = false;
        }
    }

    public void e(Matrix44 matrix44) {
        this.dAg = false;
        float f2 = this.dAf[0];
        float f3 = this.dAf[1];
        float f4 = this.dAf[2];
        float f5 = this.dAf[3];
        float f6 = this.dAf[4];
        float f7 = this.dAf[5];
        float f8 = this.dAf[6];
        float f9 = this.dAf[7];
        float f10 = this.dAf[8];
        float f11 = this.dAf[9];
        float f12 = this.dAf[10];
        float f13 = this.dAf[11];
        float f14 = this.dAf[12];
        float f15 = this.dAf[13];
        float f16 = this.dAf[14];
        float f17 = this.dAf[15];
        float f18 = matrix44.dAf[0];
        float f19 = matrix44.dAf[1];
        float f20 = matrix44.dAf[2];
        float f21 = matrix44.dAf[3];
        float f22 = matrix44.dAf[4];
        float f23 = matrix44.dAf[5];
        float f24 = matrix44.dAf[6];
        float f25 = matrix44.dAf[7];
        float f26 = matrix44.dAf[8];
        float f27 = matrix44.dAf[9];
        float f28 = matrix44.dAf[10];
        float f29 = matrix44.dAf[11];
        float f30 = matrix44.dAf[12];
        float f31 = matrix44.dAf[13];
        float f32 = matrix44.dAf[14];
        float f33 = matrix44.dAf[15];
        this.dAf[0] = f2 * f18 + f3 * f22 + f4 * f26 + f5 * f30;
        this.dAf[1] = f2 * f19 + f3 * f23 + f4 * f27 + f5 * f31;
        this.dAf[2] = f2 * f20 + f3 * f24 + f4 * f28 + f5 * f32;
        this.dAf[3] = f2 * f21 + f3 * f25 + f4 * f29 + f5 * f33;
        this.dAf[4] = f6 * f18 + f7 * f22 + f8 * f26 + f9 * f30;
        this.dAf[5] = f6 * f19 + f7 * f23 + f8 * f27 + f9 * f31;
        this.dAf[6] = f6 * f20 + f7 * f24 + f8 * f28 + f9 * f32;
        this.dAf[7] = f6 * f21 + f7 * f25 + f8 * f29 + f9 * f33;
        this.dAf[8] = f10 * f18 + f11 * f22 + f12 * f26 + f13 * f30;
        this.dAf[9] = f10 * f19 + f11 * f23 + f12 * f27 + f13 * f31;
        this.dAf[10] = f10 * f20 + f11 * f24 + f12 * f28 + f13 * f32;
        this.dAf[11] = f10 * f21 + f11 * f25 + f12 * f29 + f13 * f33;
        this.dAf[12] = f14 * f18 + f15 * f22 + f16 * f26 + f17 * f30;
        this.dAf[13] = f14 * f19 + f15 * f23 + f16 * f27 + f17 * f31;
        this.dAf[14] = f14 * f20 + f15 * f24 + f16 * f28 + f17 * f32;
        this.dAf[15] = f14 * f21 + f15 * f25 + f16 * f29 + f17 * f33;
    }

    public void a(Matrix44 matrix44, Matrix44 matrix442) {
        this.dAg = false;
        float f2 = matrix44.dAf[0];
        float f3 = matrix44.dAf[1];
        float f4 = matrix44.dAf[2];
        float f5 = matrix44.dAf[3];
        float f6 = matrix44.dAf[4];
        float f7 = matrix44.dAf[5];
        float f8 = matrix44.dAf[6];
        float f9 = matrix44.dAf[7];
        float f10 = matrix44.dAf[8];
        float f11 = matrix44.dAf[9];
        float f12 = matrix44.dAf[10];
        float f13 = matrix44.dAf[11];
        float f14 = matrix44.dAf[12];
        float f15 = matrix44.dAf[13];
        float f16 = matrix44.dAf[14];
        float f17 = matrix44.dAf[15];
        float f18 = matrix442.dAf[0];
        float f19 = matrix442.dAf[1];
        float f20 = matrix442.dAf[2];
        float f21 = matrix442.dAf[3];
        float f22 = matrix442.dAf[4];
        float f23 = matrix442.dAf[5];
        float f24 = matrix442.dAf[6];
        float f25 = matrix442.dAf[7];
        float f26 = matrix442.dAf[8];
        float f27 = matrix442.dAf[9];
        float f28 = matrix442.dAf[10];
        float f29 = matrix442.dAf[11];
        float f30 = matrix442.dAf[12];
        float f31 = matrix442.dAf[13];
        float f32 = matrix442.dAf[14];
        float f33 = matrix442.dAf[15];
        this.dAf[0] = f2 * f18 + f3 * f22 + f4 * f26 + f5 * f30;
        this.dAf[1] = f2 * f19 + f3 * f23 + f4 * f27 + f5 * f31;
        this.dAf[2] = f2 * f20 + f3 * f24 + f4 * f28 + f5 * f32;
        this.dAf[3] = f2 * f21 + f3 * f25 + f4 * f29 + f5 * f33;
        this.dAf[4] = f6 * f18 + f7 * f22 + f8 * f26 + f9 * f30;
        this.dAf[5] = f6 * f19 + f7 * f23 + f8 * f27 + f9 * f31;
        this.dAf[6] = f6 * f20 + f7 * f24 + f8 * f28 + f9 * f32;
        this.dAf[7] = f6 * f21 + f7 * f25 + f8 * f29 + f9 * f33;
        this.dAf[8] = f10 * f18 + f11 * f22 + f12 * f26 + f13 * f30;
        this.dAf[9] = f10 * f19 + f11 * f23 + f12 * f27 + f13 * f31;
        this.dAf[10] = f10 * f20 + f11 * f24 + f12 * f28 + f13 * f32;
        this.dAf[11] = f10 * f21 + f11 * f25 + f12 * f29 + f13 * f33;
        this.dAf[12] = f14 * f18 + f15 * f22 + f16 * f26 + f17 * f30;
        this.dAf[13] = f14 * f19 + f15 * f23 + f16 * f27 + f17 * f31;
        this.dAf[14] = f14 * f20 + f15 * f24 + f16 * f28 + f17 * f32;
        this.dAf[15] = f14 * f21 + f15 * f25 + f16 * f29 + f17 * f33;
    }

    public void a(Matrix44 matrix44, Matrix44 matrix442, Matrix44 matrix443) {
        Matrix44 matrix444 = new Matrix44();
        matrix444.a(matrix442, matrix443);
        this.a(matrix44, matrix444);
        this.dAg = false;
    }

    public void a(Matrix44 matrix44, Matrix44 matrix442, Matrix44 matrix443, Matrix44 matrix444) {
        Matrix44 matrix445 = new Matrix44();
        matrix445.a(matrix442, matrix443, matrix444);
        this.a(matrix44, matrix445);
        this.dAg = false;
    }

    public float[] bQE() {
        return this.dAf;
    }

    public void d(int n, float f2) {
        this.dAg = false;
        this.dAf[n] = f2;
    }

    public boolean bWq() {
        return this.dAg;
    }

    public boolean f(Matrix44 matrix44) {
        if (matrix44 == this) {
            return true;
        }
        for (int i = 0; i < this.dAf.length; ++i) {
            if (this.dAf[i] == matrix44.dAf[i]) continue;
            return false;
        }
        return true;
    }

    @Override
    public void brr() {
        this.dAg = false;
    }

    @Override
    public void brs() {
    }

    private void bWr() {
        this.dAf[3] = 0.0f;
        this.dAf[7] = 0.0f;
        this.dAf[11] = 0.0f;
        this.dAf[15] = 1.0f;
    }

    static {
        for (int i = 0; i < 16; ++i) {
            Matrix44.dAd[i] = 0.0f;
        }
    }
}

