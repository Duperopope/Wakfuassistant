/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.material;

import com.ankamagames.framework.graphics.engine.material.Material$ObjectFactory;

public final class Material
extends ayq_2 {
    private static final int daB = 0;
    private static final int daC = 4;
    private static final int daD = 4;
    private static final int daE = 3;
    private static final int daF = 7;
    public static final Material daG;
    public static final Material daH;
    public static final Material daI;
    private static final float[] daJ;
    private static final azk_2 daK;
    private static float[] ayR;
    public static final Material$ObjectFactory daL;
    private final Object daM = new Object();
    private int cxt;
    private final float[] daN = new float[4];
    private final float[] daO = new float[3];

    Material() {
    }

    @Deprecated
    public float[] bKT() {
        this.K(this.daN);
        return this.daN;
    }

    @Deprecated
    public float[] bKU() {
        this.P(this.daO);
        return this.daO;
    }

    public void f(Material material) {
        System.arraycopy(ayR, material.cxt, ayR, this.cxt, 7);
    }

    public void K(float[] fArray) {
        System.arraycopy(ayR, 0 + this.cxt, fArray, 0, 4);
    }

    public boolean L(float[] fArray) {
        int n = 0 + this.cxt;
        return ayR[n] == fArray[0] && ayR[n + 1] == fArray[1] && ayR[n + 2] == fArray[2] && ayR[n + 3] == fArray[3];
    }

    public void M(float[] fArray) {
        System.arraycopy(ayR, 0 + this.cxt, fArray, 0, 4);
    }

    public void N(float[] fArray) {
        System.arraycopy(fArray, 0, ayR, 0 + this.cxt, 4);
    }

    public void O(float[] fArray) {
        System.arraycopy(fArray, 0, ayR, 0 + this.cxt, 3);
    }

    public void p(float f2, float f3, float f4, float f5) {
        int n = 0 + this.cxt;
        Material.ayR[n] = f2;
        Material.ayR[n + 1] = f3;
        Material.ayR[n + 2] = f4;
        Material.ayR[n + 3] = f5;
    }

    public void w(float f2, float f3, float f4) {
        int n;
        int n2 = n = 0 + this.cxt;
        ayR[n2] = ayR[n2] * f2;
        int n3 = n + 1;
        ayR[n3] = ayR[n3] * f3;
        int n4 = n + 2;
        ayR[n4] = ayR[n4] * f4;
    }

    public void P(float[] fArray) {
        System.arraycopy(ayR, 4 + this.cxt, fArray, 0, 3);
    }

    public boolean Q(float[] fArray) {
        int n = 4 + this.cxt;
        return ayR[n] == fArray[0] && ayR[n + 1] == fArray[1] && ayR[n + 2] == fArray[2];
    }

    public void R(float[] fArray) {
        System.arraycopy(ayR, 4 + this.cxt, fArray, 0, 3);
    }

    public void S(float[] fArray) {
        System.arraycopy(fArray, 0, ayR, 4 + this.cxt, 3);
    }

    public void x(float f2, float f3, float f4) {
        int n = 4 + this.cxt;
        Material.ayR[n] = f2;
        Material.ayR[n + 1] = f3;
        Material.ayR[n + 2] = f4;
    }

    public boolean g(Material material) {
        if (material.cxt == this.cxt) {
            return true;
        }
        int n = this.cxt;
        int n2 = material.cxt;
        for (int i = 0; i < 7; ++i) {
            if (ayR[i + n] == ayR[i + n2]) continue;
            return false;
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void brr() {
        Object object = this.daM;
        synchronized (object) {
            int n = daK.bTk();
            if (n == -1) {
                Material.bKV();
                n = daK.bTk();
            }
            this.cxt = n * 7;
            System.arraycopy(daJ, 0, ayR, this.cxt, 7);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void brs() {
        Object object = this.daM;
        synchronized (object) {
            daK.vI(this.cxt / 7);
        }
    }

    private static void bKV() {
        daK.vJ(daK.bTo() + 1000);
        float[] fArray = ayR;
        ayR = new float[7 * daK.bTo()];
        System.arraycopy(fArray, 0, ayR, 0, fArray.length);
    }

    static {
        daJ = new float[]{1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};
        daK = new azk_2(15000);
        ayR = new float[7 * daK.bTo()];
        daL = new Material$ObjectFactory();
        daG = (Material)daL.bSJ();
        daG.p(1.0f, 1.0f, 1.0f, 1.0f);
        daG.x(1.0f, 1.0f, 1.0f);
        daH = (Material)daL.bSJ();
        daH.p(1.0f, 1.0f, 1.0f, 1.0f);
        daH.x(0.0f, 0.0f, 0.0f);
        daI = (Material)daL.bSJ();
        daI.p(0.0f, 0.0f, 0.0f, 1.0f);
        daI.x(0.0f, 0.0f, 0.0f);
    }
}

