/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.text;

import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import java.util.ArrayList;

public abstract class GeometryText
extends Geometry {
    protected awh_2 dln;
    protected final awx_2 dlo;
    protected ArrayList<char[]> dka;
    protected int cVt;
    protected final acr_1 dlp = new acr_1(0.0f, 0.0f, 0.0f, 1.0f);
    protected float aAx = 0.0f;
    protected float aAy = 0.0f;
    protected float dlq;
    protected float dlr;
    protected float azQ = 1.0f;

    public GeometryText() {
        this.dlo = new awx_2(awx_2.dnG);
    }

    public void b(fs_0 fs_02) {
        assert (false) : "Currently not implemented";
    }

    public void a(apl_1 apl_12) {
        assert (false) : "Currently not implemented";
    }

    public abstract int gj(String var1);

    public abstract int gk(String var1);

    public abstract acc_1 gl(String var1);

    public float getScale() {
        return this.azQ;
    }

    public void setScale(float f2) {
        this.azQ = f2;
    }

    public float bOE() {
        return this.dlq;
    }

    public void dd(float f2) {
        this.dlq = f2;
    }

    public float bOF() {
        return this.dlr;
    }

    public void de(float f2) {
        this.dlr = f2;
    }

    public void a(awh_2 awh_22) {
        this.dln = awh_22;
    }

    public final void uQ(int n) {
        this.dlo.op(n);
    }

    @Override
    public final void c(float f2, float f3, float f4, float f5) {
        this.dlo.v(f2, f3, f4, f5);
    }

    public final awx_2 bOG() {
        return this.dlo;
    }

    public final void p(ArrayList<char[]> arrayList) {
        this.dka = arrayList;
    }

    public final void setLineHeight(int n) {
        this.cVt = n;
    }

    public final void b(acr_1 acr_12) {
        this.dlp.a(acr_12);
    }

    public final float bOH() {
        return this.aAx;
    }

    public final void df(float f2) {
        this.aAx = f2;
    }

    public final float bOI() {
        return this.aAy;
    }

    public final void dg(float f2) {
        this.aAy = f2;
    }

    public final void be(float f2, float f3) {
        this.aAx = f2;
        this.aAy = f3;
    }
}

