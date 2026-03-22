/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import org.apache.log4j.Logger;

class acN
extends ZL {
    private static final Logger chC = Logger.getLogger(acN.class);
    private Entity3D chD;

    acN() {
    }

    @Override
    public void reset() {
        super.reset();
        this.chD.bsI();
        this.chD = null;
    }

    @Override
    public EntityGroup b(ZC zC) {
        EntityGroup entityGroup = super.b(zC);
        GLGeometrySprite gLGeometrySprite = (GLGeometrySprite)GLGeometrySprite.dbk.bSK();
        int n = 48 + zC.bpX() * 8;
        gLGeometrySprite.f(n - 16, -24.0f, 48, n);
        gLGeometrySprite.c(0.5f, 0.5f, 0.5f, 1.0f);
        gLGeometrySprite.o(0.0f, 0.0f, 1.0f, 1.0f);
        assert (this.chD == null);
        this.chD = (Entity3D)Entity3D.cXb.bSK();
        this.chD.a(gLGeometrySprite, arn_2.bIc().cVc, Material.daH);
        gLGeometrySprite.bsI();
        this.chD.a(ast_1.bJG().bJH(), asa_1.cYC, asa_1.cZg);
        this.chD.a(acQ.chL);
        this.chD.b(acM.chB);
        this.chD.setVisible(false);
        entityGroup.g(this.chD);
        return entityGroup;
    }

    @Override
    public void bK(boolean bl) {
        if (bl) {
            asr_1 asr_12 = ast_1.bJG().bJH();
            this.chD.setVisible(!asr_12.un(asa_1.cYD));
        } else {
            this.chD.setVisible(false);
        }
    }
}

