/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.THashMap
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import gnu.trove.map.hash.THashMap;

/*
 * Renamed from cIi
 */
class cii_1<T extends fsd_0> {
    private final THashMap<Entity, T> ndr = new THashMap();
    final THashMap<T, Entity> nds = new THashMap();
    static final /* synthetic */ boolean ndt;

    cii_1() {
    }

    public Entity b(Entity entity, T t) {
        Entity entity2 = (Entity)this.nds.put(t, (Object)entity);
        if (entity2 != null) {
            this.ndr.remove((Object)entity2);
        }
        this.ndr.put((Object)entity, t);
        return entity2;
    }

    public Entity j(T t) {
        return (Entity)this.nds.get(t);
    }

    public T c(EntitySprite entitySprite) {
        return (T)((fsd_0)this.ndr.get((Object)entitySprite));
    }

    public Entity k(T t) {
        Entity entity = (Entity)this.nds.remove(t);
        this.ndr.remove((Object)entity);
        if (!ndt && this.nds.size() != this.ndr.size()) {
            throw new AssertionError();
        }
        return entity;
    }

    public T l(Entity entity) {
        fsd_0 fsd_02 = (fsd_0)this.ndr.remove((Object)entity);
        this.nds.remove((Object)fsd_02);
        if (!ndt && this.nds.size() != this.ndr.size()) {
            throw new AssertionError();
        }
        return (T)fsd_02;
    }

    public void clear() {
        this.ndr.clear();
        this.nds.clear();
    }

    static {
        ndt = !cie_1.class.desiredAssertionStatus();
    }
}

