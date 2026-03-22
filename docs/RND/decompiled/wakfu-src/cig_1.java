/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from cIg
 */
class cig_1
implements TObjectProcedure<Entity> {
    cig_1(cie_1 cie_12) {
    }

    public boolean k(Entity entity) {
        if (entity instanceof EntitySprite) {
            entity.b(cie_1.ndd);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.k((Entity)object);
    }
}

