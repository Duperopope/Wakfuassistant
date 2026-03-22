/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.Optional;

public class eId {
    public static final eId quO = new eId();
    private final TIntObjectHashMap<eIb> quP = new TIntObjectHashMap();
    final TIntIntHashMap quQ = new TIntIntHashMap();

    public void d(eIb eIb2) {
        this.quP.put(eIb2.d(), (Object)eIb2);
        eIb2.d(new eIe(this, eIb2));
    }

    public eIb PM(int n) {
        return (eIb)this.quP.get(n);
    }

    public void D(TObjectProcedure<eIb> tObjectProcedure) {
        this.quP.forEachValue(tObjectProcedure);
    }

    public eIb PN(int n) {
        return this.PM(this.quQ.get(n));
    }

    public Optional<eIb> pC(long l) {
        Optional<eIb> optional = this.quP.valueCollection().stream().filter(eIb2 -> eIb2.fwj().contains(l)).findAny();
        return Optional.ofNullable(optional.orElse(null));
    }
}

