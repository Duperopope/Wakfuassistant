/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.baseImpl.graphics.alea.display.occlusion.shadow;

import com.ankamagames.framework.graphics.engine.entity.Entity;

public class RedrawEntity
extends Entity {
    final Entity chN;
    final axb_2 chO;

    public RedrawEntity(Entity entity, axb_2 axb_22) {
        assert (entity.bSV());
        this.chN = entity;
        this.chO = axb_22;
        this.setVisible(true);
    }

    @Override
    public void ca(float f2) {
    }

    @Override
    public boolean isVisible() {
        return this.chN.isVisible();
    }

    @Override
    public boolean btV() {
        return this.chN.btV();
    }

    @Override
    public int btW() {
        return this.chN.btW();
    }

    @Override
    public void c(float f2, float f3, float f4, float f5) {
    }

    @Override
    public void d(art_1 art_12) {
        this.chN.a(new acT(true));
        this.chN.b(acM.dgN);
        asr_1 asr_12 = this.chN.bIW();
        int n = this.chN.bIY();
        asl_1 asl_12 = this.chN.bIX();
        this.chN.b(new awx_2(0.5f, 0.0f, 0.0f, 1.0f));
        this.chN.a(ast_1.bJG().bJH(), asa_1.cYQ, null);
        this.chN.d(art_12);
        this.chN.a(asr_12, n, asl_12);
        this.chN.b(awx_2.dnQ);
    }
}

