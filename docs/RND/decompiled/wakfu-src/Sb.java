/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;

public class Sb {
    protected static final Logger bnx = Logger.getLogger(Sb.class);
    private static final Sb bny = new Sb();
    private final TLongObjectHashMap<RZ> bnz = new TLongObjectHashMap();
    private final Map<Long, Long> bnA = new HashMap<Long, Long>();

    public static Sb bfy() {
        return bny;
    }

    private Sb() {
    }

    public RZ dU(long l) {
        return (RZ)this.bnz.get(l);
    }

    public boolean dV(long l) {
        if (this.dW(l)) {
            return !this.bnz.forEachValue((TObjectProcedure)new Sc(this, l));
        }
        return false;
    }

    public boolean dW(long l) {
        return this.bnA.containsKey(l);
    }

    public boolean a(RZ rZ) {
        if (this.bnz.containsKey(rZ.Sn())) {
            bnx.info((Object)("Failed to start exchange " + rZ.Sn() + " : the ID is already taken."));
            return false;
        }
        if (this.bnA.containsKey(rZ.bfl())) {
            bnx.info((Object)("Failed to start exchange " + rZ.Sn() + " : requester " + String.valueOf(rZ.bfm()) + " already has one."));
            return false;
        }
        if (this.bnA.containsKey(rZ.Qy())) {
            bnx.info((Object)("Failed to start exchange " + rZ.Sn() + " : target " + String.valueOf(rZ.bfn()) + " already has one."));
            return false;
        }
        this.bnz.put(rZ.Sn(), (Object)rZ);
        this.bnA.put(rZ.bfl(), rZ.Sn());
        this.bnA.put(rZ.Qy(), rZ.Sn());
        return true;
    }

    public void b(RZ rZ) {
        this.bnz.remove(rZ.Sn());
        this.bnA.remove(rZ.bfl());
        this.bnA.remove(rZ.Qy());
    }

    public boolean d(long l, long l2) {
        if (!this.dW(l)) {
            return false;
        }
        return ((RZ)this.bnz.get(this.bnA.get(l).longValue())).dT(l2);
    }
}

