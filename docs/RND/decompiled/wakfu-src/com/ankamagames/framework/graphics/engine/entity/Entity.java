/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.framework.graphics.engine.entity;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;

public abstract class Entity
extends ayq_2
implements ars_2 {
    private static final avc_2 cWJ = new avc_2();
    private static final avc_2 cWK = new avc_2();
    protected static asr_1 cWL = null;
    public long cWM;
    public float cWN;
    public float cWO;
    public float cWP;
    public float azR;
    public float cej;
    public int cWQ;
    public int bro;
    public int brq;
    public int brp;
    public int brr;
    public Object cWR;
    protected avc_2 cWS;
    protected avc_2 cWT;
    protected asr_1 cWU;
    protected int cWV;
    protected asl_1 cWW;
    private EntityGroup cWX;
    private boolean bYX;
    private BatchTransformer cWY;
    public static ase_2 cWZ = null;

    public void aA(byte by) {
        this.azR = by;
    }

    public boolean isVisible() {
        return this.bYX;
    }

    public void setVisible(boolean bl) {
        this.bYX = bl;
    }

    public final Entity bIR() {
        return this.cWX;
    }

    public final BatchTransformer bIS() {
        return this.cWY;
    }

    @Override
    public void b(art_1 art_12) {
        if (this.bJe() || !this.bYX) {
            return;
        }
        if (this.bSW() < 0) {
            return;
        }
        if (this.cWU != null) {
            cWL = this.cWU;
            this.cWU.um(this.cWV);
            this.cWU.a(art_12, this, this.cWW);
        } else {
            if (cWL != null) {
                cWL.reset();
                cWL = null;
            }
            this.d(art_12);
        }
    }

    public abstract void ca(float var1);

    public abstract void d(art_1 var1);

    public final Matrix44 bIT() {
        return this.bIS().bPu();
    }

    public avc_2 bIU() {
        return this.cWT;
    }

    public avc_2 bIV() {
        return this.cWS;
    }

    public final void a(avc_2 avc_22) {
        this.cWS = avc_22;
    }

    public final void b(avc_2 avc_22) {
        this.cWT = avc_22;
    }

    public final asr_1 bIW() {
        return this.cWU;
    }

    public final asl_1 bIX() {
        return this.cWW;
    }

    public final int bIY() {
        return this.cWV;
    }

    public void a(asr_1 asr_12, int n, asl_1 asl_12) {
        this.cWU = asr_12;
        this.cWV = n;
        this.cWW = asl_12;
    }

    public final void bIZ() {
        this.a(ast_1.bJG().bJH(), asa_1.cYC, asa_1.cZg);
    }

    public final void bJa() {
        this.a(ast_1.bJG().bJH(), asa_1.cYC, asa_1.cZh);
    }

    protected final boolean bJb() {
        return this.cWU == null || this.cWU.bJC();
    }

    @Override
    public void brr() {
        this.cWM = 0L;
        this.cWN = 0.0f;
        this.cWO = 0.0f;
        this.cWP = 0.0f;
        this.azR = 0.0f;
        this.cej = 0.0f;
        this.cWQ = 0;
        this.bro = Integer.MAX_VALUE;
        this.brq = Integer.MIN_VALUE;
        this.brp = Integer.MAX_VALUE;
        this.brr = Integer.MIN_VALUE;
        this.cWS = cWJ;
        this.cWT = cWK;
        this.cWV = asa_1.cYC;
        assert (this.cWY == null);
        this.cWY = (BatchTransformer)BatchTransformer.dnd.bSK();
        this.bYX = true;
    }

    @Override
    public void brs() {
        this.cWS = null;
        this.cWT = null;
        this.cWU = null;
        this.cWW = null;
        if (this.cWX != null) {
            this.cWX.h(this);
            this.cWX = null;
        }
        this.cWY.bsI();
        this.cWY = null;
    }

    protected final void a(EntityGroup entityGroup) {
        this.cWX = entityGroup;
    }

    protected final BatchTransformer bJc() {
        return this.cWY;
    }

    public ArrayList<Entity> bJd() {
        return null;
    }

    @Override
    public boolean a(VertexBufferPCT vertexBufferPCT) {
        return true;
    }

    @Override
    public void a(ava_2 ava_22) {
    }

    @Override
    public int btW() {
        return 7;
    }

    @Override
    public boolean btV() {
        return this.bYX && this.bSW() >= 0;
    }

    @Override
    public void e(art_1 art_12) {
        throw new UnsupportedOperationException("");
    }

    public final void b(axb_2 axb_22) {
        this.c(axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), axb_22.aIX());
    }

    public abstract void c(float var1, float var2, float var3, float var4);

    private boolean bJe() {
        if (cWZ == null) {
            return false;
        }
        return cWZ.J(this.cWR);
    }
}

