/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.isometric.highlight.HighLightEntity;

/*
 * Renamed from agy
 */
class agy_0
extends agz_0 {
    static final /* synthetic */ boolean cuk;

    agy_0() {
    }

    public boolean b(HighLightEntity highLightEntity) {
        if (!cuk && this.crl == null) {
            throw new AssertionError();
        }
        this.crl.c(highLightEntity, true);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((HighLightEntity)object);
    }

    static {
        cuk = !agx_0.class.desiredAssertionStatus();
    }
}

