/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class adn
implements TObjectProcedure<adh> {
    final /* synthetic */ adk cjp;

    adn(adk adk2) {
        this.cjp = adk2;
    }

    public boolean h(adh adh2) {
        try {
            this.cjp.f(adh2);
        }
        catch (Exception exception) {
            adk.cjc.error((Object)"", (Throwable)exception);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.h((adh)object);
    }
}

