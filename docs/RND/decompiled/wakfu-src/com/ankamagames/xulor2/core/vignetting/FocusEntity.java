/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
package com.ankamagames.xulor2.core.vignetting;

import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.xulor2.core.vignetting.FocusEntity$FocusEntityFactory;
import com.jogamp.opengl.GL2;

public class FocusEntity
extends Entity3D {
    private float brL;
    private float cej;
    private float nNC;
    private float nND;
    private float nNE;
    private float nNF;
    private float axp;
    private float axq;
    private float axr;
    private float ayP;
    public static final ayr_2<FocusEntity> uFw = new FocusEntity$FocusEntityFactory();

    public void aG(float f2, float f3) {
        this.brL = f2;
        this.cej = f3;
    }

    public void setCenter(float f2, float f3, float f4, float f5) {
        this.nNC = f2;
        this.nND = f3;
        this.nNE = f4;
        this.nNF = f5;
    }

    public void setColor(float f2, float f3, float f4) {
        this.axp = f2;
        this.axq = f3;
        this.axr = f4;
    }

    public void setAlpha(float f2) {
        this.ayP = f2;
    }

    public void reset() {
        this.axp = 0.0f;
        this.axq = 0.0f;
        this.axr = 0.0f;
        this.ayP = 0.75f;
    }

    @Override
    public void d(art_1 art_12) {
        GL2 gL2 = art_12.bIq();
        gL2.glBegin(5);
        gL2.glColor4f(this.axp, this.axq, this.axr, this.ayP);
        gL2.glVertex2f(0.0f, 0.0f);
        gL2.glVertex2f(this.nNC, this.nND);
        gL2.glVertex2f(this.brL, 0.0f);
        gL2.glVertex2f(this.nNE, this.nND);
        gL2.glVertex2f(this.brL, this.cej);
        gL2.glVertex2f(this.nNE, this.nNF);
        gL2.glVertex2f(0.0f, this.cej);
        gL2.glVertex2f(this.nNC, this.nNF);
        gL2.glVertex2f(0.0f, 0.0f);
        gL2.glVertex2f(this.nNC, this.nND);
        gL2.glEnd();
        super.d(art_12);
    }
}

