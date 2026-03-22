/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.xulor2.graphics.XulorParticleSystem;
import java.util.Comparator;

/*
 * Renamed from fFr
 */
public class ffr_2
implements Comparator<Entity> {
    public static final ffr_2 upF = new ffr_2();

    public int c(Entity entity, Entity entity2) {
        if (entity instanceof XulorParticleSystem) {
            return -1;
        }
        if (entity2 instanceof XulorParticleSystem) {
            return 1;
        }
        float f2 = ((EntitySprite)entity).bsT();
        float f3 = ((EntitySprite)entity2).bsT();
        return (int)(f3 - f2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.c((Entity)object, (Entity)object2);
    }
}

