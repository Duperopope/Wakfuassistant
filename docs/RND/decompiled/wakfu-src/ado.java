/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class ado
implements TObjectProcedure<adh> {
    ado(adk adk2) {
    }

    public boolean h(adh adh2) {
        if (adh2.ciW) {
            adk.cjc.error((Object)"Map non d\u00e9charg\u00e9e. Il faut appeler unloadDynamicDataFromAllMaps");
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.h((adh)object);
    }
}

