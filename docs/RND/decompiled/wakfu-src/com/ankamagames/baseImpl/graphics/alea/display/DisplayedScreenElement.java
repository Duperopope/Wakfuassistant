/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.util.texture.TextureCoords
 *  org.apache.log4j.Logger
 */
package com.ankamagames.baseImpl.graphics.alea.display;

import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement$ObjectFactory;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.baseImpl.graphics.isometric.highlight.HighLightEntity;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.jogamp.opengl.util.texture.TextureCoords;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class DisplayedScreenElement
extends ayq_2
implements aaG,
acx_0,
agf_0,
agV {
    public static final DisplayedScreenElement$ObjectFactory bYT = new DisplayedScreenElement$ObjectFactory();
    public ScreenElement bYU;
    protected byte bYV;
    public EntitySprite bYW;
    boolean bYX = true;
    boolean bYY = false;
    public boolean bYZ = false;
    private short bZa = 0;
    private final float[] bZb = new float[4];
    private float[] bZc;
    private int bVD = 0;
    private int bXO = 0;
    private short bZd = 0;
    private byte bZe = (byte)3;
    private long bZf;
    private static final float[] bZg = new float[4];
    private static final Logger bZh = Logger.getLogger(DisplayedScreenElement.class);

    public float aIX() {
        return this.bZb[3];
    }

    public void a(ScreenElement screenElement) {
        if (this.bYU != null) {
            this.bLe();
        }
        this.bYU = screenElement;
        this.bYV = this.bYU.cbP.brR();
        this.bYU.bGY();
        this.bZf = agx_0.E(this.bYU.bsu(), this.bYU.bsv(), this.bYU.bst());
        this.bVD = this.bYU.bsA();
        this.bZd = this.bYU.bsB();
        this.bXO = this.bYU.vD();
        this.bri();
    }

    public void bri() {
        int n;
        int n2;
        awk_1 awk_12;
        aeS aeS2 = this.bYU.cbP;
        int n3 = aeS2.aVt();
        float f2 = this.bYU.cbN;
        float f3 = this.bYU.cbO;
        if (abk.cdg.ar(aeS2.bsX())) {
            this.bYX = false;
            awk_12 = aai.bqJ().qW(19067);
            if (this.bYX && awk_12 != null) {
                n2 = awk_12.bQs().bWx();
                n = awk_12.bQs().bWy();
                f3 = (float)aau_0.bj(this.bYU.cbL, this.bYU.cbM) - (float)n2 * 0.5f;
                f2 = (float)aau_0.o(this.bYU.cbL, this.bYU.cbM, this.bYU.cbK) + (float)n * 0.5f;
            } else {
                n2 = 1;
                n = 1;
            }
        } else {
            awk_12 = aai.bqJ().qW(n3);
            n2 = aeS2.bwU();
            n = aeS2.bwV();
        }
        if ((this.bYU.cbL + this.bYU.cbM) % 2 != 0) {
            f2 += this.bYU.cbM > -this.bYU.cbL ? -0.5f : 0.5f;
        }
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.dbk.bSK();
        gLGeometrySprite.c(auw_2.dfI, auw_2.dfM);
        gLGeometrySprite.f(f2, f3, n2, n);
        this.brj();
        if (this.bYW != null) {
            this.bYW.bsI();
        }
        this.bYW = (EntitySprite)EntitySprite.cXk.bSK();
        this.d(this.bYW);
        this.bYW.a(gLGeometrySprite);
        this.bYW.setTexture(awk_12);
        this.bYW.c(this.bZb[0], this.bZb[1], this.bZb[2], this.bZb[3]);
        this.bYW.bro = this.bYU.cbO;
        this.bYW.brq = this.bYU.cbO + n2;
        this.bYW.brp = this.bYU.cbN - n;
        this.bYW.brr = this.bYU.cbN;
        this.ar((short)GC.mR(Integer.MAX_VALUE));
        gLGeometrySprite.bsI();
    }

    protected final void brj() {
        this.bZb[0] = 0.5f;
        this.bZb[1] = 0.5f;
        this.bZb[2] = 0.5f;
        this.bZb[3] = 1.0f;
    }

    protected final void d(Entity entity) {
        entity.cWR = this;
        if (this.bYU.bsr()) {
            entity.cWQ |= 2;
        }
        entity.bIZ();
        entity.cWN = this.bYU.cbL;
        entity.cWO = this.bYU.cbM;
        entity.cWP = this.bYU.cbK - this.bYU.aXR;
        entity.cej = this.bYU.aXR;
        int n = this.bYU.cbQ;
        if (this.bYU.cbP.bxb()) {
            entity.cWN += 0.9f;
            entity.cWO += 0.9f;
            n += afX.csv - 1;
        }
        entity.cWM = afX.a(this.bYU.cbL, this.bYU.cbM, n, afX.csh.byy());
    }

    public void rd(int n) {
        int n2 = this.bYU.cbL;
        int n3 = this.bYU.cbM;
        if (n < 0) {
            --n2;
            --n3;
            n += afX.csv;
        }
        this.bYW.cWM = afX.a(n2, n3, this.bYU.cbQ, n);
    }

    public void ar(short s) {
        this.bZa = (short)(this.bZa + s);
        TextureCoords textureCoords = this.bYU.cbP.ax(this.bZa);
        this.bYW.bJm().o(textureCoords.top(), textureCoords.left(), textureCoords.bottom(), textureCoords.right());
    }

    public final void re(int n) {
        aeS aeS2 = aeT.sc(n);
        if (aeS2 == null) {
            bZh.error((Object)("Unable to replace element gfxId : " + n + " unknown"));
            return;
        }
        this.bYU.cbN -= this.bYU.cbP.bwT();
        this.bYU.cbO += this.bYU.cbP.bwS();
        this.bYU.cbP = aeS2;
        this.bYU.cbN += aeS2.bwT();
        this.bYU.cbO -= aeS2.bwS();
        this.bri();
    }

    public final void a(aav aav2) {
        aav2.a(this);
    }

    private boolean a(agb agb2) {
        Entity entity = this.brl();
        return entity != null && agb2.m(entity.brr, entity.bro, entity.brp, entity.brq);
    }

    public void a(afV afV2, ArrayList<DisplayedScreenElement> arrayList, agb agb2) {
        float f2;
        float[] fArray;
        if (!this.bYX) {
            return;
        }
        if (!this.a(agb2)) {
            this.bYY = true;
            return;
        }
        if (this.bYZ) {
            return;
        }
        if (this.bZc == null) {
            fArray = afV2.a(this);
        } else {
            this.bZc[3] = afV2.a(this)[3];
            this.bZc[3] = this.bZc[3] * 0.5f;
            this.bZc[0] = this.bZc[0] * this.bZc[3];
            this.bZc[1] = this.bZc[1] * this.bZc[3];
            this.bZc[2] = this.bZc[2] * this.bZc[3];
            fArray = this.bZc;
        }
        assert (fArray != null);
        System.arraycopy(fArray, 0, bZg, 0, 4);
        aai_0 aai_02 = aah_0.brY().fH(this.bZf);
        if (aai_02 != null) {
            f2 = aai_02.ayP;
            bZg[0] = bZg[0] * (aai_02.axp * f2);
            bZg[1] = bZg[1] * (aai_02.axq * f2);
            bZg[2] = bZg[2] * (aai_02.axr * f2);
            bZg[3] = bZg[3] * f2;
        }
        if ((aai_02 = aah_0.brY().as(this.bZd)) != null) {
            f2 = aai_02.ayP;
            bZg[0] = bZg[0] * (aai_02.axp * f2);
            bZg[1] = bZg[1] * (aai_02.axq * f2);
            bZg[2] = bZg[2] * (aai_02.axr * f2);
            bZg[3] = bZg[3] * f2;
        }
        if (fArray[3] < 0.004f) {
            this.bYY = true;
            return;
        }
        this.bZe = aal_0.a(this.bZe, bZg);
        this.bYY = false;
        this.s(bZg);
        agx_0.bze().a(afV2, this, this.bZb[3]);
        this.bYZ = true;
        arrayList.add(this);
    }

    public boolean be(int n, int n2) {
        assert (this.brn());
        awk_1 awk_12 = this.bYW.bHg();
        if (awk_12 == null) {
            return false;
        }
        int n3 = n2 - this.bYW.brp;
        axj_2 axj_22 = awk_12.ve(0);
        if (n3 >= axj_22.getHeight() || n3 < 0) {
            return false;
        }
        int n4 = n - this.bYW.bro;
        if (n4 >= axj_22.getWidth() || n4 < 0) {
            return false;
        }
        if (this.bYU.cbP.bwW()) {
            n4 = axj_22.getWidth() - n4 - 1;
        }
        int n5 = GC.B((float)n4 * this.bYU.cbP.aRH());
        int n6 = Math.abs(GC.B((float)n3 * this.bYU.cbP.aRI()) - 1);
        try {
            return axj_22.bQL().ci(n5, n6);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            return false;
        }
    }

    public final ScreenElement brk() {
        return this.bYU;
    }

    public Entity brl() {
        return this.bYW;
    }

    public final long brm() {
        return this.bYU.cbS;
    }

    public final boolean brn() {
        return this.bYX && this.bZe == 3 && !this.bYY;
    }

    final boolean bro() {
        return this.bYX && this.bZe == 3;
    }

    public final void bT(boolean bl) {
        this.bYX = bl;
    }

    @Override
    public final void bG(boolean bl) {
        this.bZe = (byte)(bl ? 0 : 2);
    }

    public int vD() {
        return this.bXO;
    }

    @Override
    public final int bqh() {
        return this.bVD;
    }

    @Override
    public final void a(int n, short s) {
        throw new UnsupportedOperationException("");
    }

    @Override
    public final short bqi() {
        return this.bZd;
    }

    @Override
    public long brp() {
        return this.bZf;
    }

    @Override
    public boolean brq() {
        if (this.bYU == null || this.bYU.cbP == null) {
            return false;
        }
        return this.bYU.cbP.bwZ();
    }

    @Override
    public void a(afV afV2, HighLightEntity highLightEntity, float f2, acc_1 acc_12, int n, agb_0 agb_02, int n2) {
        if (highLightEntity == null) {
            return;
        }
        byte by = this.bYU.cbP.bwX();
        float f3 = this.brq() ? 0.0f : (float)this.bYU.cbP.bwY();
        float f4 = by == 0 ? f3 : f3 * 0.5f;
        int n3 = this.bYU.cbK - this.bYU.aXR;
        int n4 = this.bYU.cbL;
        int n5 = this.bYU.cbM;
        float f5 = f4 + (float)n3;
        float f6 = afV2.aM(n4, n5);
        float f7 = afV2.j(n4, n5, f5);
        highLightEntity.bIS().uU(0);
        highLightEntity.bIS().d(0, f6, f7);
        highLightEntity.cWN = n4;
        highLightEntity.cWO = n5;
        highLightEntity.cWP = n3;
        highLightEntity.cej = 0.0f;
        this.a(highLightEntity);
        agb_02.a(highLightEntity, by, f3 * (float)n, f2, (float)acc_12.bWx() * 0.5f, (float)acc_12.bWy() * 0.5f);
    }

    @Override
    public void a(HighLightEntity highLightEntity) {
        long l;
        Entity entity = this.brl();
        long l2 = l = entity != null ? entity.cWM : 0L;
        if ((l += (long)afX.csi.byy()) >= highLightEntity.cWM) {
            highLightEntity.cWM = l;
        }
    }

    public void r(float[] fArray) {
        this.bZc = fArray;
    }

    @Override
    public void brr() {
        this.bZe = (byte)3;
        this.bYZ = false;
        this.bYY = false;
        this.bZa = 0;
        this.bVD = 0;
        this.bXO = 0;
        this.bZd = 0;
        this.bZf = 0L;
    }

    @Override
    public void brs() {
        this.bYU.bsI();
        this.bYU = null;
        this.bYV = 0;
        this.bYX = true;
        this.bZc = null;
        if (this.bYW != null) {
            this.bYW.bsI();
            this.bYW = null;
        }
    }

    private void s(float[] fArray) {
        if (!this.bYU.bsC()) {
            this.t(fArray);
        }
    }

    protected void t(float[] fArray) {
        this.bYU.v(fArray);
        if (fArray[0] < 0.0f) {
            fArray[0] = 0.0f;
        } else if (fArray[0] > 1.0f) {
            fArray[0] = 1.0f;
        }
        if (fArray[1] < 0.0f) {
            fArray[1] = 0.0f;
        } else if (fArray[1] > 1.0f) {
            fArray[1] = 1.0f;
        }
        if (fArray[2] < 0.0f) {
            fArray[2] = 0.0f;
        } else if (fArray[2] > 1.0f) {
            fArray[2] = 1.0f;
        }
        if (fArray[3] < 0.0f) {
            fArray[3] = 0.0f;
        } else if (fArray[3] > 1.0f) {
            fArray[3] = 1.0f;
        }
        if (this.bZb[0] == fArray[0] && this.bZb[1] == fArray[1] && this.bZb[2] == fArray[2] && this.bZb[3] == fArray[3]) {
            return;
        }
        this.bZb[0] = fArray[0];
        this.bZb[1] = fArray[1];
        this.bZb[2] = fArray[2];
        this.bZb[3] = fArray[3];
        this.u(fArray);
    }

    protected void u(float[] fArray) {
        this.bYW.c(fArray[0], fArray[1], fArray[2], fArray[3]);
        this.bYW.bJn();
    }

    @Override
    public int bcC() {
        return this.bYU.cbL;
    }

    @Override
    public int bcD() {
        return this.bYU.cbM;
    }

    @Override
    public short bcE() {
        return this.bYU.cbK;
    }

    @Override
    public void p(float[] fArray) {
        if (this.bYW != null && this.bYU != null) {
            DisplayedScreenElement.a(this.bYW, fArray);
        }
    }

    protected static void a(EntitySprite entitySprite, float[] fArray) {
        Material material = entitySprite.bpt();
        float[] fArray2 = material.bKT();
        if (fArray[0] == fArray2[0] && fArray[1] == fArray2[1] && fArray[2] == fArray2[2]) {
            return;
        }
        material.O(fArray);
        entitySprite.bJn();
    }

    public String toString() {
        return "DisplayScreenElement (" + (String)(this.bYU != null ? this.bYU.cbL + ", " + this.bYU.cbM + ", " + this.bYU.cbK : "m_element=null") + ")";
    }

    public final boolean al(byte by) {
        return (this.bYV & by) == this.bYV;
    }
}

