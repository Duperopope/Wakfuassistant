/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bzK
 */
class bzk_0
implements TObjectProcedure<Object> {
    bzk_0() {
    }

    public boolean execute(Object object) {
        if (object instanceof adj_0) {
            adn_0.bvh().j((adj_0)object);
        }
        return true;
    }
}

