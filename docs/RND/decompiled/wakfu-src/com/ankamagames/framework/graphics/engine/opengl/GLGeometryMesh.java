/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL2
 */
package com.ankamagames.framework.graphics.engine.opengl;

import com.ankamagames.framework.graphics.engine.geometry.GeometryMeshLine;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh$ObjectFactory;
import com.jogamp.opengl.GL2;
import java.nio.Buffer;

public class GLGeometryMesh
extends GeometryMeshLine {
    public static final GLGeometryMesh$ObjectFactory dbh = new GLGeometryMesh$ObjectFactory();

    GLGeometryMesh() {
    }

    @Override
    public void b(art_1 art_12) {
        atg_2 atg_22 = (atg_2)art_12;
        GL2 gL2 = atg_22.bIq();
        aro_2.bIf().a(this);
        ava_2 ava_22 = ava_2.bMH();
        ava_22.cN(this.cZV);
        ava_22.dd(this.cZW);
        ava_22.a(this.cZH, this.cZI);
        ava_22.h(gL2);
        atg_22.dbl.uu(13);
        gL2.glVertexPointer(2, 5126, 0, (Buffer)this.cdJ.bIy());
        gL2.glColorPointer(4, 5126, 0, (Buffer)this.cdJ.bIz());
        gL2.glTexCoordPointer(2, 5126, 0, (Buffer)this.cdJ.bIA());
        aso_1 aso_12 = this.bKe();
        switch (aso_12) {
            case cZQ: {
                gL2.glDrawElements(4, this.cSn.bIk(), 5123, (Buffer)this.cSn.bIl());
                break;
            }
            case cZR: {
                gL2.glDrawElements(5, this.cdJ.bIF(), 5123, (Buffer)this.cSn.bIl());
                break;
            }
            case cZT: {
                gL2.glDrawElements(7, this.cdJ.bIF(), 5123, (Buffer)this.cSn.bIl());
                break;
            }
            case cZP: {
                gL2.glDrawElements(3, this.cdJ.bIF(), 5123, (Buffer)this.cSn.bIl());
                break;
            }
            case cZO: {
                gL2.glDrawElements(1, this.cdJ.bIF(), 5123, (Buffer)this.cSn.bIl());
                break;
            }
            case cZN: {
                gL2.glDrawElements(0, this.cdJ.bIF(), 5123, (Buffer)this.cSn.bIl());
                break;
            }
            default: {
                assert (false) : "Unimplemented mesh type";
                break;
            }
        }
    }

    @Override
    public void bsI() {
        super.bsI();
    }
}

