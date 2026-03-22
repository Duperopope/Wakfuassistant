/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
package com.ankamagames.framework.graphics.engine.opengl.text;

import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.opengl.text.GLGeometryBackground$ObjectFactory;
import com.ankamagames.framework.graphics.engine.text.GeometryBackground;
import com.jogamp.opengl.GL2;
import java.nio.Buffer;

public class GLGeometryBackground
extends GeometryBackground {
    public static final GLGeometryBackground$ObjectFactory dbH = new GLGeometryBackground$ObjectFactory();

    GLGeometryBackground() {
    }

    @Override
    public void b(art_1 art_12) {
        atg_2 atg_22 = (atg_2)art_12;
        GL2 gL2 = art_12.bIq();
        aro_2.bIf().a(this);
        this.bOB();
        ava_2 ava_22 = ava_2.bMH();
        ava_22.a(this.cZH, this.cZI);
        ava_22.h(gL2);
        atg_22.dbl.uu(13);
        this.a(gL2, 7, this.cdJ, this.cSn);
        float f2 = this.getBorderWidth();
        if (f2 > 0.0f) {
            ava_22.cN(f2);
            ava_22.h(gL2);
            this.a(gL2, 3, this.dkY, this.dkZ);
        }
    }

    private void a(GL2 gL2, int n, VertexBufferPCT vertexBufferPCT, arq_2 arq_22) {
        gL2.glVertexPointer(2, 5126, 0, (Buffer)vertexBufferPCT.bIy());
        gL2.glColorPointer(4, 5126, 0, (Buffer)vertexBufferPCT.bIz());
        gL2.glTexCoordPointer(2, 5126, 0, (Buffer)vertexBufferPCT.bIA());
        gL2.glDrawElements(n, arq_22.bIk(), 5123, (Buffer)arq_22.bIl());
    }
}

