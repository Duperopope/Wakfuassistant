/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
package com.ankamagames.framework.graphics.engine.opengl;

import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite$ObjectFactory;
import com.jogamp.opengl.GL2;
import java.nio.Buffer;

public class GLGeometrySprite
extends GeometrySprite {
    public static final GLGeometrySprite$ObjectFactory dbk = new GLGeometrySprite$ObjectFactory();

    GLGeometrySprite() {
    }

    @Override
    public void b(art_1 art_12) {
        atg_2 atg_22 = (atg_2)art_12;
        GL2 gL2 = art_12.bIq();
        aro_2.bIf().a(this);
        ava_2 ava_22 = ava_2.bMH();
        ava_22.a(this.cZH, this.cZI);
        ava_22.h(gL2);
        atg_22.dbl.uu(13);
        gL2.glVertexPointer(2, 5126, 0, (Buffer)this.cdJ.bIy());
        gL2.glColorPointer(4, 5126, 0, (Buffer)this.cdJ.bIz());
        gL2.glTexCoordPointer(2, 5126, 0, (Buffer)this.cdJ.bIA());
        gL2.glDrawArrays(7, 0, 4);
    }
}

