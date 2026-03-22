/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class eVn
implements eVm {
    private static final Logger rzI = Logger.getLogger(eVn.class);
    private final TLongObjectHashMap<eVo> rzJ = new TLongObjectHashMap();
    private eVl rzK = null;
    @Nullable
    private rh_0 rzL = null;

    @Override
    public void a(eVl eVl2) {
        this.rzK = eVl2;
    }

    @Override
    public void d(@Nullable rh_0 rh_02) {
        this.rzL = rh_02;
    }

    @Override
    public void b(eST eST2) {
        Object object;
        if (!this.d(eST2)) {
            return;
        }
        long l = eST2.dOo();
        if (!this.rzJ.containsKey(l)) {
            object = eST2.bci();
            if (object == null) {
                rzI.error((Object)("Unable to create microbot for null owner. OriginalControllerId : " + l));
                return;
            }
            int n = object.a(exx_2.rHq) ? object.c(exx_2.rHq) : 3;
            this.rzJ.put(l, (Object)new eVo(l, n));
        }
        object = (eVo)this.rzJ.get(l);
        ((eVo)object).a(eST2, this.rzL, this.rzK);
    }

    @Override
    public void c(eST eST2) {
        if (!this.d(eST2)) {
            return;
        }
        long l = eST2.dOo();
        if (!this.rzJ.containsKey(l)) {
            return;
        }
        eVo eVo2 = (eVo)this.rzJ.get(l);
        eVo2.b(eST2, this.rzL, this.rzK);
    }

    @Override
    @Nullable
    public eVo qX(long l) {
        return (eVo)this.rzJ.get(l);
    }

    private boolean d(eST eST2) {
        if (eST2 == null) {
            rzI.error((Object)"Trying to handle a 'null' microbot", (Throwable)new RuntimeException());
            return false;
        }
        if (eST2.fIN() != 4) {
            rzI.error((Object)("Trying to handle a microbot wich is not a microbot (UserdefineID = " + eST2.fIN() + ")"), (Throwable)new RuntimeException());
            return false;
        }
        if (eST2.dOo() == 0L) {
            rzI.error((Object)("Trying to handle a microbot without owner (ownerId=0) : " + String.valueOf(eST2)), (Throwable)new RuntimeException());
            return false;
        }
        return true;
    }
}

