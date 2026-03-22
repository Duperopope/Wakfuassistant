/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import com.ankamagames.baseImpl.graphics.isometric.highlight.HighLightEntity;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from agw
 */
class agw_0
implements TObjectProcedure<HighLightEntity> {
    static final /* synthetic */ boolean cuc;

    agw_0() {
    }

    public boolean b(HighLightEntity highLightEntity) {
        highLightEntity.bsI();
        highLightEntity.ctT = false;
        if (!cuc && highLightEntity.bSW() >= 0) {
            throw new AssertionError();
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((HighLightEntity)object);
    }

    static {
        cuc = !agu_0.class.desiredAssertionStatus();
    }
}

