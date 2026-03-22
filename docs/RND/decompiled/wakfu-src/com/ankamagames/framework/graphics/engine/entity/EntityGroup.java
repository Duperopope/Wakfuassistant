/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
package com.ankamagames.framework.graphics.engine.entity;

import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup$ObjectFactory;
import com.jogamp.opengl.GL2;
import java.util.ArrayList;

public class EntityGroup
extends Entity {
    private static final int cXg = 2;
    public static final EntityGroup$ObjectFactory cXh = new EntityGroup$ObjectFactory();
    protected final ArrayList<Entity> cXi = new ArrayList(2);

    EntityGroup() {
    }

    @Override
    public void ca(float f2) {
        int n = this.cXi.size();
        for (int i = 0; i < n; ++i) {
            this.cXi.get(i).ca(f2);
        }
    }

    @Override
    public void b(art_1 art_12) {
        if (!this.isVisible()) {
            return;
        }
        this.d(art_12);
    }

    @Override
    public void d(art_1 art_12) {
        int n = this.cXi.size();
        if (n == 0) {
            return;
        }
        GL2 gL2 = art_12.bIq();
        this.cWS.c(gL2);
        for (int i = 0; i < n; ++i) {
            this.cXi.get(i).b(art_12);
        }
        this.cWT.c(gL2);
    }

    @Override
    public void setVisible(boolean bl) {
        super.setVisible(bl);
        for (Entity entity : this.cXi) {
            entity.setVisible(bl);
        }
    }

    @Override
    public void c(float f2, float f3, float f4, float f5) {
        int n = this.cXi.size();
        for (int i = 0; i < n; ++i) {
            this.cXi.get(i).c(f2, f3, f4, f5);
        }
    }

    @Override
    public final ArrayList<Entity> bJd() {
        return this.cXi;
    }

    public void b(int n, Entity entity) {
        assert (entity != null) : "It's forbidden to add a null value as a child";
        entity.a(this);
        Entity entity2 = this.cXi.set(n, entity);
        entity.bGY();
        this.bJc().a(n, entity.bIS());
        if (entity2 != null) {
            this.bJc().b(entity2.bIS());
            entity2.bsI();
        }
    }

    public final void g(Entity entity) {
        assert (entity != null) : "It's forbidden to add a null value as a child";
        entity.a(this);
        this.cXi.add(entity);
        entity.bGY();
        this.bJc().a(entity.bIS());
    }

    public final void h(Entity entity) {
        assert (entity != null) : "null value can't be removed from childList";
        entity.a((EntityGroup)null);
        if (this.cXi.remove(entity)) {
            entity.bsI();
        }
        this.bJc().b(entity.bIS());
    }

    public final void bJk() {
        for (int i = this.cXi.size() - 1; i >= 0; --i) {
            Entity entity = this.cXi.get(i);
            entity.a((EntityGroup)null);
            entity.bsI();
        }
        this.cXi.clear();
        this.bJc().bPs();
    }

    @Override
    public void brs() {
        this.bJk();
        super.brs();
    }

    public void bsQ() {
        this.bro = Integer.MAX_VALUE;
        this.brp = Integer.MAX_VALUE;
        this.brq = Integer.MIN_VALUE;
        this.brr = Integer.MIN_VALUE;
        for (Entity entity : this.cXi) {
            if (entity.bro < this.bro) {
                this.bro = entity.bro;
            }
            if (entity.brp < this.brp) {
                this.brp = entity.brp;
            }
            if (entity.brq > this.brq) {
                this.brq = entity.brq;
            }
            if (entity.brr <= this.brr) continue;
            this.brr = entity.brr;
        }
    }
}

