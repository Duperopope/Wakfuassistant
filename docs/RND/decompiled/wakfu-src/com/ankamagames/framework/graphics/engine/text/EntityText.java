/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
package com.ankamagames.framework.graphics.engine.text;

import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.text.EntityText$ObjectFactory;
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;
import com.ankamagames.framework.graphics.engine.text.GeometryText;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.jogamp.opengl.GL2;
import java.util.ArrayList;

public class EntityText
extends Entity {
    public static final EntityText$ObjectFactory djS = new EntityText$ObjectFactory();
    private static final Matrix44 djT = (Matrix44)Matrix44.dAb.bSJ();
    private static final Matrix44 djU = (Matrix44)Matrix44.dAb.bSJ();
    protected String bKP;
    protected int djV;
    protected int djW;
    protected int djX;
    protected int djY;
    protected int djZ;
    protected final ArrayList<char[]> dka;
    protected int dkb;
    protected int dkc;
    protected int dkd;
    private int dke;
    private GeometryText dkf;
    private GeometryBackground dkg;
    private boolean dkh;
    private float aXn = 1.0f;
    private awv_1 dki = awv_1.dlR;

    EntityText() {
        this.dka = new ArrayList(32);
    }

    public final void a(GeometryText geometryText) {
        geometryText.bGY();
        if (this.dkf != null) {
            this.dkf.bsI();
        }
        this.dkf = geometryText;
    }

    public final void a(GeometryBackground geometryBackground) {
        if (geometryBackground != null) {
            geometryBackground.bGY();
        }
        if (this.dkg != null) {
            this.dkg.bsI();
        }
        this.dkg = geometryBackground;
    }

    public final void s(float f2, float f3, float f4, float f5) {
        if (this.dkg == null) {
            return;
        }
        this.dkg.c(f2, f3, f4, f5);
    }

    public final GeometryText bOd() {
        return this.dkf;
    }

    public final GeometryBackground bOe() {
        return this.dkg;
    }

    @Override
    public final void ca(float f2) {
    }

    @Override
    public final void d(art_1 art_12) {
        if (!this.isVisible()) {
            return;
        }
        GL2 gL2 = art_12.bIq();
        if (this.dkh) {
            this.gu(this.bKP);
            this.dkh = false;
        }
        art_12.a(this.bIS().bPu());
        this.cWS.c(gL2);
        int n = 0;
        int n2 = 0;
        ava_2.bMH().db(false);
        if (this.dkg != null) {
            int n3 = Math.max(this.djY, this.djW);
            int n4 = Math.max(this.djZ, this.djX);
            this.dkg.uO(n3);
            this.dkg.uP(n4);
            this.dkg.da(this.dkc + this.dki.uS(n3));
            this.dkg.db(this.dkd + this.dki.uT(n4));
            this.dkg.b(art_12);
            n = (int)((float)n + this.dkg.bOw());
            n2 = (int)((float)n2 + this.dkg.bOz());
        }
        this.dkf.be(this.dkc, this.dkd);
        this.dkf.dd(this.dki.uS(this.djY) + n);
        this.dkf.de(this.dki.uT(this.djZ) + n2);
        this.dkf.p(this.dka);
        this.dkf.setLineHeight(this.dkb);
        this.dkf.setScale(this.aXn);
        this.dkf.b(art_12);
        this.cWT.c(gL2);
    }

    public final void a(acr_1 acr_12) {
        awp_1 awp_12 = (awp_1)this.bIS().uW(0);
        awp_12.c(acr_12);
        this.bIS().bPv();
        this.dkf.b(acr_12);
    }

    public final void ce(int n, int n2) {
        this.dkc = n;
        this.dkd = n2;
    }

    public void a(awh_2 awh_22) {
        this.dkf.a(awh_22);
        this.dkh = true;
    }

    public final void gt(String string) {
        this.bKP = string;
        this.dkh = true;
    }

    public final String bOf() {
        return this.bKP;
    }

    @Override
    public final void c(float f2, float f3, float f4, float f5) {
        this.dkf.c(f2, f3, f4, f5);
    }

    public final awx_2 bOg() {
        return this.dkf.bOG();
    }

    public final void uL(int n) {
        if (n < 0) {
            n = Integer.MAX_VALUE;
        }
        this.djV = n;
        this.dkh = true;
    }

    public final int bOh() {
        return this.djY;
    }

    public final int bOi() {
        return this.djZ;
    }

    public final int bOj() {
        return this.djW;
    }

    public int getMaxWidth() {
        return this.djV;
    }

    public final void uM(int n) {
        this.djW = n;
    }

    public final int bOk() {
        return this.djX;
    }

    public final void uN(int n) {
        this.djX = n;
    }

    public float getZoom() {
        return this.aXn;
    }

    public void setZoom(float f2) {
        this.aXn = f2;
    }

    @Override
    public void brr() {
        super.brr();
        this.djV = Integer.MAX_VALUE;
        this.djW = 0;
        this.djX = 0;
        this.djY = 0;
        this.dkc = 0;
        this.dkd = 0;
        this.dke = 2;
        this.dkh = false;
        this.aXn = 1.0f;
        this.dki = awv_1.dlR;
        awp_1 awp_12 = new awp_1();
        awp_12.bPx();
        this.bIS().a(awp_12);
    }

    @Override
    public void brs() {
        super.brs();
        this.dka.clear();
        if (this.dkf != null) {
            this.dkf.bsI();
            this.dkf = null;
        }
        if (this.dkg != null) {
            this.dkg.bsI();
            this.dkg = null;
        }
    }

    protected void gu(String string) {
        this.dka.clear();
        this.djY = 0;
        this.djZ = 0;
        if (string == null || string.length() == 0) {
            this.dkb = 0;
            return;
        }
        if (this.djV == 0) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(128);
        StringBuilder stringBuilder2 = new StringBuilder(128);
        char[] cArray = string.toCharArray();
        int n = 0;
        while (n < cArray.length) {
            String string2;
            StringBuilder stringBuilder3 = new StringBuilder(128);
            acc_1 acc_12 = new acc_1(0, 0);
            boolean bl = false;
            boolean bl2 = false;
            while (acc_12.bWx() < this.djV && n < cArray.length && !bl) {
                char c2;
                char c3 = cArray[n++];
                boolean bl3 = true;
                if (n < cArray.length && ((c2 = cArray[n]) == '.' || c2 == '?' || c2 == '!' || c2 == ':' || c2 == ';' || c2 == ',')) {
                    bl3 = false;
                }
                if (c3 == ' ' && bl3) {
                    stringBuilder3.append(stringBuilder2.toString()).append(' ');
                    stringBuilder2 = new StringBuilder(128);
                    bl2 = true;
                } else if (c3 == '\n') {
                    bl = true;
                    stringBuilder3.append(stringBuilder2.toString());
                    stringBuilder2 = new StringBuilder(128);
                    bl2 = true;
                } else {
                    stringBuilder2.append(c3);
                }
                if (bl) continue;
                stringBuilder.append(c3);
                acc_12 = this.dkf.gl(stringBuilder.toString());
            }
            if (!bl2) {
                stringBuilder3.append(stringBuilder2.toString());
                stringBuilder2 = new StringBuilder(128);
            }
            if (n >= cArray.length) {
                stringBuilder3.append(stringBuilder2.toString());
            }
            stringBuilder = new StringBuilder(128);
            if (stringBuilder2.length() != 0) {
                stringBuilder.append((CharSequence)stringBuilder2);
            }
            if ((string2 = stringBuilder3.toString()).length() < 0) continue;
            acc_12 = this.dkf.gl(string2);
            this.dka.add(stringBuilder3.toString().toCharArray());
            this.djY = Math.max(this.djY, acc_12.bWx());
            this.djZ += acc_12.bWy();
        }
        this.dkb = this.djZ / this.dka.size() + this.dke;
        this.djZ = this.dkb * this.dka.size();
    }

    public void a(awv_1 awv_12) {
        this.dki = awv_12;
    }
}

