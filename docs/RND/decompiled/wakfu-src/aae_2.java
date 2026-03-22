/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TObjectLongHashMap
 *  gnu.trove.procedure.TObjectIntProcedure
 */
import gnu.trove.map.hash.TObjectLongHashMap;
import gnu.trove.procedure.TObjectIntProcedure;

/*
 * Renamed from aAE
 */
class aae_2
implements TObjectIntProcedure<String> {
    final /* synthetic */ StringBuilder dwO;
    final /* synthetic */ TObjectLongHashMap dwP;
    final /* synthetic */ TObjectLongHashMap dwQ;
    final /* synthetic */ TObjectLongHashMap dwR;
    final /* synthetic */ String dwS;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    aae_2(aad_2 aad_22, StringBuilder stringBuilder, TObjectLongHashMap tObjectLongHashMap, TObjectLongHashMap tObjectLongHashMap2, TObjectLongHashMap tObjectLongHashMap3, String string) {
        this.dwO = stringBuilder;
        this.dwP = tObjectLongHashMap;
        this.dwQ = tObjectLongHashMap2;
        this.dwR = tObjectLongHashMap3;
        this.dwS = string;
    }

    public boolean j(String string, int n) {
        this.dwO.append(n).append(" x ").append(string).append(" - ").append(this.dwP.get((Object)string)).append(" / ").append(this.dwQ.get((Object)string) / (long)n).append(" / ").append(this.dwR.get((Object)string)).append(this.dwS);
        return true;
    }

    public /* synthetic */ boolean execute(Object object, int n) {
        return this.j((String)object, n);
    }
}

