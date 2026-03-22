/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
package com.ankamagames.framework.graphics.engine.entity;

import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D$ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.Geometry;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.jogamp.opengl.GL2;
import java.util.ArrayList;

public class Entity3D
extends Entity {
    public static final Entity3D$ObjectFactory cXb = new Entity3D$ObjectFactory();
    private final ArrayList<asf_2> cXc = new ArrayList(2);

    public void clear() {
        int n = this.cXc.size();
        for (int i = 0; i < n; ++i) {
            this.cXc.get(i).bJh();
        }
        this.cXc.clear();
    }

    public final int bJf() {
        return this.cXc.size();
    }

    public final int b(Geometry geometry) {
        this.cXc.add(new asf_2(geometry, null, null));
        return this.cXc.size() - 1;
    }

    public final int a(Geometry geometry, awk_1 awk_12, Material material) {
        this.cXc.add(new asf_2(geometry, awk_12, material));
        return this.cXc.size() - 1;
    }

    public final void c(Geometry geometry) {
        int n = this.cXc.size();
        for (int i = 0; i < n; ++i) {
            asf_2 asf_22 = this.cXc.get(i);
            if (asf_22.bJi() != geometry) continue;
            asf_22.bJh();
            this.cXc.remove(asf_22);
            break;
        }
    }

    public final Geometry uh(int n) {
        return this.cXc.get(n).bJi();
    }

    public final void a(int n, awk_1 awk_12) {
        assert (n < this.cXc.size());
        this.cXc.get(n).setTexture(awk_12);
    }

    public final awk_1 ui(int n) {
        return this.cXc.get(n).bHg();
    }

    public final void c(Material material) {
        int n = this.cXc.size();
        for (int i = 0; i < n; ++i) {
            asf_2 asf_22 = this.cXc.get(i);
            if (asf_22.bpt() != material) continue;
            asf_22.bJj();
        }
    }

    public final Material uj(int n) {
        return this.cXc.get(n).bpt();
    }

    @Override
    public final void c(float f2, float f3, float f4, float f5) {
        for (asf_2 asf_22 : this.cXc) {
            Geometry geometry = asf_22.bJi();
            if (geometry == null) continue;
            geometry.c(f2, f3, f4, f5);
        }
    }

    @Override
    public void ca(float f2) {
    }

    @Override
    public void d(art_1 art_12) {
        if (this.bJf() == 0) {
            return;
        }
        atg_2 atg_22 = (atg_2)art_12;
        GL2 gL2 = art_12.bIq();
        art_12.a(this.bIS().bPu());
        boolean bl = this.bJb();
        this.cWS.c(gL2);
        int n = this.cXc.size();
        for (int i = 0; i < n; ++i) {
            this.cXc.get(i).a(atg_22, bl);
        }
        this.cWT.c(gL2);
    }

    @Override
    public void brs() {
        super.brs();
        this.clear();
        this.cXc.trimToSize();
    }
}

