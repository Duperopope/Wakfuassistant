/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.BasePoolableObjectFactory
 */
import org.apache.commons.pool.BasePoolableObjectFactory;

/*
 * Renamed from ayT
 */
class ayt_2
extends BasePoolableObjectFactory<ayq_2> {
    final /* synthetic */ ays_2 duu;

    ayt_2(ays_2 ays_22) {
        this.duu = ays_22;
    }

    public ayq_2 bSR() {
        try {
            Object t = this.duu.dus.bru();
            ((ayq_2)t).b(this.duu);
            return t;
        }
        catch (Exception exception) {
            ays_2.dup.error((Object)"Failed to create object", (Throwable)exception);
            return null;
        }
    }

    public /* synthetic */ Object makeObject() {
        return this.bSR();
    }
}

