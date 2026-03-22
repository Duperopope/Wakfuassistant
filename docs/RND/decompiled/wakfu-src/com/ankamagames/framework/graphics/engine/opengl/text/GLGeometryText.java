/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.opengl.text;

import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryText$ObjectFactory;
import com.ankamagames.framework.graphics.engine.text.GeometryText;

public class GLGeometryText
extends GeometryText {
    public static final GLGeometryText$ObjectFactory dbI = new GLGeometryText$ObjectFactory();
    private awx_1 dbJ;

    GLGeometryText() {
    }

    @Override
    public int gj(String string) {
        return this.dbJ.gj(string);
    }

    @Override
    public int gk(String string) {
        return this.dbJ.gk(string);
    }

    @Override
    public acc_1 gl(String string) {
        return new acc_1(this.gj(string), this.gk(string));
    }

    @Override
    public void a(awh_2 awh_22) {
        if (awh_22 == this.dln) {
            return;
        }
        this.dbJ = awa_1.c(awh_22);
        super.a(awh_22);
    }

    @Override
    public void ca(float f2) {
    }

    @Override
    public void b(art_1 art_12) {
        if (this.dbJ == null) {
            return;
        }
        int n = this.dka.size();
        if (n == 0) {
            return;
        }
        aro_2.bIf().a(this);
        this.dbJ.c(this.dlo.aIU(), this.dlo.aIV(), this.dlo.aIW(), this.dlo.aIX());
        float f2 = this.dlq * this.azQ + this.aAx;
        float f3 = (this.dlr + (float)(n * this.cVt)) * this.azQ + this.aAy;
        this.dbJ.cd(0, 0);
        for (int i = 0; i < n; ++i) {
            char[] cArray = (char[])this.dka.get(i);
            this.dbJ.a(cArray, f2, f3 -= (float)this.cVt * this.azQ, this.azQ);
        }
        this.dbJ.bNz();
    }

    @Override
    public void brs() {
    }
}

