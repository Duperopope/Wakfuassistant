/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.Comparator;

/*
 * Renamed from fGf
 */
class fgf_1
implements Comparator<Entity> {
    fgf_1() {
    }

    public int c(Entity entity, Entity entity2) {
        return (int)(entity.cWM - entity2.cWM);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.c((Entity)object, (Entity)object2);
    }
}

