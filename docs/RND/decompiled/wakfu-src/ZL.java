/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.EntityGroup;
import org.apache.log4j.Logger;

public abstract class ZL {
    private static final Logger bWX = Logger.getLogger(ZL.class);
    protected Entity3D bWY;

    public Entity3D bpr() {
        return this.bWY;
    }

    public void reset() {
        assert (this.bWY != null);
        this.bWY.bsI();
        this.bWY = null;
    }

    public EntityGroup b(ZC zC) {
        EntityGroup entityGroup = (EntityGroup)EntityGroup.cXh.bSK();
        entityGroup.cWR = zC;
        assert (this.bWY == null);
        this.bWY = zC.bpj();
        entityGroup.g(this.bWY);
        return entityGroup;
    }

    public abstract void bK(boolean var1);
}

