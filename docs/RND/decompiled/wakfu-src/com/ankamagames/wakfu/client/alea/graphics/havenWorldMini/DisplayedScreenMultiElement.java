/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.alea.graphics.havenWorldMini;

import com.ankamagames.baseImpl.graphics.alea.display.DisplayedScreenElement;
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.wakfu.client.alea.graphics.havenWorldMini.DisplayedScreenMultiElement$ObjectFactory;
import org.apache.log4j.Logger;

public class DisplayedScreenMultiElement
extends DisplayedScreenElement {
    private static final Logger ecu = Logger.getLogger(DisplayedScreenMultiElement.class);
    private static final aeS ecv = aeS.a(0, false, false);
    public static final DisplayedScreenMultiElement$ObjectFactory ecw = new DisplayedScreenMultiElement$ObjectFactory();
    public EntityGroup bVe;
    private cav_2 ecx;
    public cal_1 ecy;
    public int bpd;
    public int bpe;
    public int brs;
    public int brt;

    protected DisplayedScreenMultiElement() {
    }

    public void a(cal_1 cal_12) {
        this.ecy = cal_12;
    }

    public void a(int n, int n2, short s, int n3) {
        ScreenElement screenElement = (ScreenElement)ScreenElement.cbJ.bSK();
        screenElement.J(n, n2, s);
        screenElement.a(ecv);
        screenElement.ro((byte)(n3 + 1));
        this.a(screenElement);
        screenElement.bsI();
    }

    void a(cav_2 cav_22, int n, int n2, int n3, int n4) {
        this.ecx = cav_22;
        this.bpd = n;
        this.bpe = n2;
        this.brs = n3;
        this.brt = n4;
    }

    @Override
    public Entity brl() {
        return this.bVe;
    }

    @Override
    public void bri() {
        if (this.bVe != null) {
            this.bVe.bsI();
        }
        this.bVe = (EntityGroup)EntityGroup.cXh.bSK();
        this.bVe.cWR = this;
        this.brj();
        this.d(this.bVe);
        this.cil();
        this.bVe.bsQ();
    }

    private void cil() {
        float f2 = (float)this.brk().bst() * 10.0f;
        for (int i = 0; i < this.brt; ++i) {
            for (int j = 0; j < this.brs; ++j) {
                short s = this.ecx.gt(this.bpd + j, this.bpe + i);
                aJU.a(this.bVe, s, j, i, f2, this.ecy.Ka(s));
            }
        }
        this.ecx.y(new ajt_0(this, f2));
    }

    @Override
    public boolean be(int n, int n2) {
        return false;
    }

    @Override
    public void p(float[] fArray) {
        if (this.bVe == null) {
            return;
        }
        for (Entity entity : this.bVe.bJd()) {
            DisplayedScreenMultiElement.a((EntitySprite)entity, fArray);
        }
    }

    @Override
    public void u(float[] fArray) {
        for (Entity entity : this.bVe.bJd()) {
            EntitySprite entitySprite = (EntitySprite)entity;
            entitySprite.c(fArray[0], fArray[1], fArray[2], fArray[3]);
            entitySprite.bJn();
        }
    }

    @Override
    public void brs() {
        super.brs();
        if (this.bVe != null) {
            this.bVe.bsI();
            this.bVe = null;
        }
    }
}

