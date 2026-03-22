/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  com.jogamp.opengl.GL2
 */
package com.ankamagames.framework.graphics.engine.entity;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite$ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;

public final class EntitySprite
extends Entity {
    public static final EntitySprite$ObjectFactory cXk = new EntitySprite$ObjectFactory();
    public static final int cXl = 2;
    private GeometrySprite cXm;
    private awk_1 bXx;
    private awk_1 cXn;
    private awk_1 cXo;
    private Material bVn;
    private boolean cXf;

    EntitySprite() {
    }

    public void a(GeometrySprite geometrySprite) {
        if (geometrySprite == this.cXm) {
            return;
        }
        geometrySprite.bGY();
        if (this.cXm != null) {
            this.cXm.bsI();
        }
        this.cXm = geometrySprite;
    }

    public GeometrySprite bJm() {
        return this.cXm;
    }

    public void n(float f2, float f3, float f4, float f5) {
        this.cXm.o(f2, f3, f4, f5);
    }

    public void setTexture(awk_1 awk_12) {
        if (awk_12 != null) {
            awk_12.bGY();
        }
        if (this.bXx != null) {
            this.bXx.bsI();
        }
        this.bXx = awk_12;
    }

    public void b(awk_1 awk_12) {
        if (awk_12 != null) {
            awk_12.bGY();
        }
        if (this.cXn != null) {
            this.cXn.bsI();
        }
        this.cXn = awk_12;
    }

    public void c(awk_1 awk_12) {
        if (awk_12 != null) {
            awk_12.bGY();
        }
        if (this.cXo != null) {
            this.cXo.bsI();
        }
        this.cXo = awk_12;
    }

    public awk_1 bHg() {
        return this.bXx;
    }

    public Material bpt() {
        return this.bVn;
    }

    public void a(Material material) {
        if (this.bVn != null && this.bVn.g(material)) {
            return;
        }
        if (material != null) {
            material.bGY();
        }
        if (this.bVn != null) {
            this.bVn.bsI();
        }
        this.bVn = material;
        this.cXf = true;
    }

    public void bJn() {
        this.cXf = true;
    }

    public void e(float f2, float f3, int n, int n2) {
        this.cXm.f(f2, f3, n, n2);
    }

    public void aZ(float f2, float f3) {
        this.cXm.ba(f2, f3);
    }

    public void setSize(int n, int n2) {
        this.cXm.cb(n, n2);
    }

    @Override
    public void c(float f2, float f3, float f4, float f5) {
        this.cXm.c(f2, f3, f4, f5);
    }

    public void a(asg_2 asg_22, float f2, float f3, float f4, float f5) {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        this.cXm.b(asg_22, f2, f3, f4, f5);
    }

    public void a(asg_2 asg_22, axb_2 axb_22) {
        assert (this.bSV()) : "Using an item with a reference counter < 0 is forbidden";
        this.cXm.b(asg_22, axb_22.aIU(), axb_22.aIV(), axb_22.aIW(), axb_22.aIX());
    }

    public axb_2 a(asg_2 asg_22) {
        float[] fArray = this.cXm.b(asg_22);
        return new awx_2(fArray[0], fArray[1], fArray[2], fArray[3]);
    }

    public float aKq() {
        return this.cXm.bKl();
    }

    public float aKs() {
        return this.cXm.bKm();
    }

    public float aKp() {
        return this.cXm.bKn();
    }

    public float aKr() {
        return this.cXm.bKo();
    }

    public float aRY() {
        return this.cXm.bKp();
    }

    public float aRZ() {
        return this.cXm.bKq();
    }

    public int getWidth() {
        return this.cXm.bKr();
    }

    public int getHeight() {
        return this.cXm.bKs();
    }

    public float bsS() {
        return this.cXm.bKj();
    }

    public float bsT() {
        return this.cXm.bKk();
    }

    @Override
    public void ca(float f2) {
    }

    @Override
    public void d(art_1 art_12) {
        if (this.bXx != null && !this.bXx.bPe()) {
            return;
        }
        GL2 gL2 = art_12.bIq();
        ava_2 ava_22 = ava_2.bMH();
        art_12.a(this.bIS().bPu());
        if (this.cXf && this.bJb()) {
            this.cXf = false;
            this.cXm.d(this.bVn);
        }
        this.cWS.c(gL2);
        if (this.cXn != null) {
            ava_22.a((GL)gL2, 1);
            ava_22.a(gL2, 1);
            ava_22.a((GL)gL2, (ati_2)this.cXn);
        }
        if (this.cXo != null) {
            ava_22.a((GL)gL2, 2);
            ava_22.a(gL2, 2);
            ava_22.a((GL)gL2, (ati_2)this.cXo);
        }
        ava_22.a((GL)gL2, 0);
        ava_22.a(gL2, 0);
        ava_22.a((GL)gL2, (ati_2)this.bXx);
        ava_22.h(gL2);
        if (this.bVn != null) {
            ava_22.a(gL2, this.bVn);
        }
        this.cXm.b(art_12);
        this.cWT.c(gL2);
    }

    @Override
    public void brr() {
        super.brr();
        assert (this.bVn == null);
        this.bVn = (Material)Material.daL.bSK();
        this.bVn.f(Material.daH);
        this.cXf = false;
    }

    @Override
    public void brs() {
        super.brs();
        if (this.bVn != null) {
            this.bVn.bsI();
            this.bVn = null;
        }
        if (this.bXx != null) {
            this.bXx.bsI();
            this.bXx = null;
        }
        if (this.cXn != null) {
            this.cXn.bsI();
            this.cXn = null;
        }
        if (this.cXo != null) {
            this.cXo.bsI();
            this.cXo = null;
        }
        if (this.cXm != null) {
            this.cXm.bsI();
            this.cXm = null;
        }
    }

    @Override
    public boolean a(VertexBufferPCT vertexBufferPCT) {
        if (vertexBufferPCT.bIF() + this.cXm.bKd().bIF() > vertexBufferPCT.bIG()) {
            return false;
        }
        vertexBufferPCT.b(this.cXm.bKd());
        return true;
    }

    @Override
    public void a(ava_2 ava_22) {
        atg_2 atg_22 = aru_2.cVG.bIv();
        GL2 gL2 = atg_22.bIq();
        ava_2 ava_23 = ava_2.bMH();
        atg_22.a(this.bIS().bPu());
        if (this.cXf && this.bJb()) {
            this.cXf = false;
            this.cXm.d(this.bVn);
        }
        this.cWS.c(gL2);
        if (this.cXn != null) {
            ava_23.a((GL)gL2, 1);
            ava_23.a(gL2, 1);
            ava_23.a((GL)gL2, (ati_2)this.cXn);
        }
        if (this.cXo != null) {
            ava_23.a((GL)gL2, 2);
            ava_23.a(gL2, 2);
            ava_23.a((GL)gL2, (ati_2)this.cXo);
        }
        ava_23.a((GL)gL2, 0);
        ava_23.a(gL2, 0);
        ava_23.a((GL)gL2, (ati_2)this.bXx);
        ava_23.h(gL2);
        if (this.bVn != null) {
            ava_23.a(gL2, this.bVn);
        }
    }
}

