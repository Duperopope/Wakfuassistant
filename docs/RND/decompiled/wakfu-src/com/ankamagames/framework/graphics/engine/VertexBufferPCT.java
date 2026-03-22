/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.common.nio.Buffers
 */
package com.ankamagames.framework.graphics.engine;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT$ObjectFactory;
import com.jogamp.common.nio.Buffers;
import java.nio.FloatBuffer;

public final class VertexBufferPCT
extends ayq_2 {
    public static final int cVX = 2;
    public static final int cVY = 4;
    public static final int cVZ = 2;
    public static final VertexBufferPCT$ObjectFactory cWa = new VertexBufferPCT$ObjectFactory();
    private float[] cWb;
    private float[] ayR;
    private float[] cWc;
    private int cWd;
    private int cWe;
    private int cWf;
    private FloatBuffer cWg;
    private FloatBuffer cWh;
    private FloatBuffer cWi;
    private int cWj;
    private int cWk;

    VertexBufferPCT() {
    }

    void tZ(int n) {
        this.cWk = 0;
        this.cWj = 0;
        this.ua(n);
        assert (n <= arq_2.cVv.bIj());
    }

    private void ua(int n) {
        this.cWk = n;
        int n2 = 4 * this.cWk;
        this.cWg = Buffers.newDirectFloatBuffer((int)(n2 * 2));
        this.cWh = Buffers.newDirectFloatBuffer((int)(n2 * 4));
        this.cWi = Buffers.newDirectFloatBuffer((int)(n2 * 2));
    }

    public void ub(int n) {
        this.cWd = 0;
        this.cWe = 0;
        this.cWf = 0;
        this.cWb = null;
        this.ayR = null;
        this.cWc = null;
        this.cWj = 0;
        this.ua(n);
    }

    public void clear() {
        this.cWj = 0;
    }

    public FloatBuffer bIy() {
        this.cWg.rewind();
        return this.cWg;
    }

    public FloatBuffer bIz() {
        this.cWh.rewind();
        return this.cWh;
    }

    public FloatBuffer bIA() {
        this.cWi.rewind();
        return this.cWi;
    }

    public void bIB() {
        this.cWg.rewind();
    }

    public void D(float[] fArray) {
        this.cWg.put(fArray);
    }

    public void E(float[] fArray) {
        this.cWg.rewind();
        this.cWg.put(fArray);
    }

    public void a(float[] fArray, int n) {
        assert (n <= fArray.length);
        this.cWg.position(this.cWj * 2);
        this.cWg.put(fArray, 0, n);
    }

    public void b(float[] fArray, int n) {
        this.cWg.rewind();
        this.cWg.put(fArray, 0, n);
    }

    public void c(float[] fArray, int n) {
        assert (n <= fArray.length);
        this.cWh.position(this.cWj * 4);
        this.cWh.put(fArray, 0, n);
    }

    public void bIC() {
        this.cWh.rewind();
    }

    public void F(float[] fArray) {
        this.cWh.put(fArray);
    }

    public void G(float[] fArray) {
        this.cWh.rewind();
        this.cWh.put(fArray);
    }

    public void d(float[] fArray, int n) {
        this.cWh.rewind();
        this.cWh.put(fArray, 0, n);
    }

    public void e(float[] fArray, int n) {
        assert (n <= fArray.length);
        this.cWi.position(this.cWj * 2);
        this.cWi.put(fArray, 0, n);
    }

    public void H(float[] fArray) {
        this.cWi.rewind();
        this.cWi.put(fArray);
    }

    public void f(float[] fArray, int n) {
        this.cWi.rewind();
        this.cWi.put(fArray, 0, n);
    }

    public void a(int n, float f2, float f3, float f4, float f5) {
        this.cWh.position(n * 4);
        this.cWh.put(f2);
        this.cWh.put(f3);
        this.cWh.put(f4);
        this.cWh.put(f5);
    }

    public float[] uc(int n) {
        int n2 = this.cWh.position();
        this.cWh.position(n * 4);
        float[] fArray = new float[4];
        this.cWh.get(fArray);
        this.cWh.position(n2);
        return fArray;
    }

    public void d(int n, float[] fArray) {
        this.cWh.position(n * 4);
        this.cWh.put(fArray);
    }

    public void I(float[] fArray) {
        this.cWh.rewind();
        this.cWh.put(fArray);
    }

    public void bID() {
        this.cWi.rewind();
    }

    public void J(float[] fArray) {
        this.cWi.put(fArray);
    }

    public void b(int n, float f2, float f3) {
        this.cWi.position(n * 2);
        this.cWi.put(f2);
        this.cWi.put(f3);
    }

    public void c(int n, float f2, float f3) {
        this.cWg.position(n * 2);
        this.cWg.put(f2);
        this.cWg.put(f3);
    }

    public void bIE() {
        this.cWg.limit(this.cWj * 2);
        this.cWh.limit(this.cWj * 4);
        this.cWi.limit(this.cWj * 2);
        this.cWk = this.cWj;
    }

    public void ud(int n) {
        assert (this.cWj <= this.cWk);
        this.cWj = n;
    }

    public int bIF() {
        return this.cWj;
    }

    public int bIG() {
        return this.cWk;
    }

    @Override
    public void brr() {
        this.cWk = 0;
        this.cWj = 0;
    }

    @Override
    public void brs() {
        this.cWh = null;
        this.cWg = null;
        this.cWi = null;
        this.cWd = 0;
        this.cWe = 0;
        this.cWf = 0;
        this.cWb = null;
        this.ayR = null;
        this.cWc = null;
    }

    public void bIH() {
        if (this.cWb == null) {
            assert (this.ayR == null);
            assert (this.cWc == null);
            this.cWb = new float[this.cWk * 2];
            this.ayR = new float[this.cWk * 4];
            this.cWc = new float[this.cWk * 2];
        }
        this.cWj = 0;
        this.cWg.rewind();
        this.cWh.rewind();
        this.cWi.rewind();
        this.cWd = 0;
        this.cWe = 0;
        this.cWf = 0;
    }

    public void a(float f2, float f3, float f4, float f5, float[] fArray) {
        this.a(f2, f3, f4, f5, fArray[0], fArray[1], fArray[2], fArray[3]);
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.cWb[this.cWd++] = f2;
        this.cWb[this.cWd++] = f3;
        this.ayR[this.cWe++] = f6;
        this.ayR[this.cWe++] = f7;
        this.ayR[this.cWe++] = f8;
        this.ayR[this.cWe++] = f9;
        this.cWc[this.cWf++] = f4;
        this.cWc[this.cWf++] = f5;
        ++this.cWj;
        assert (this.cWj <= this.cWk);
    }

    public void bIi() {
        this.cWg.put(this.cWb, 0, this.cWd);
        this.cWh.put(this.ayR, 0, this.cWe);
        this.cWi.put(this.cWc, 0, this.cWf);
        assert (this.cWg.position() % 2 == 0);
        assert (this.cWg.position() / 2 == this.cWj);
        assert (this.cWh.position() % 4 == 0);
        assert (this.cWh.position() / 4 == this.cWj);
        assert (this.cWi.position() % 2 == 0);
        assert (this.cWi.position() / 2 == this.cWj);
    }

    public void bII() {
        this.cWg.rewind();
        this.cWh.rewind();
        this.cWi.rewind();
        this.cWj = 0;
    }

    public void b(VertexBufferPCT vertexBufferPCT) {
        int n = vertexBufferPCT.cWj;
        assert (this.cWj + n <= this.cWk);
        vertexBufferPCT.cWg.flip();
        this.cWg.put(vertexBufferPCT.cWg);
        vertexBufferPCT.cWh.flip();
        this.cWh.put(vertexBufferPCT.cWh);
        vertexBufferPCT.cWi.flip();
        this.cWi.put(vertexBufferPCT.cWi);
        this.cWj += n;
    }
}

