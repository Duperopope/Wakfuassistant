/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eVr
 */
public class evr_0<F extends exP> {
    private final TLongObjectHashMap<eVw> rzT = new TLongObjectHashMap();
    private final TLongObjectHashMap<F> rzU = new TLongObjectHashMap();
    private static final Logger rzV = Logger.getLogger(evr_0.class);

    private eVw bu(exP exP2) {
        if (exP2 == null) {
            return new eva_0(null);
        }
        eVw eVw2 = (eVw)this.rzT.get(exP2.Sn());
        return eVw2 == null ? new eva_0(exP2) : eVw2;
    }

    public TLongObjectHashMap<eVw> fNd() {
        return new TLongObjectHashMap(this.rzT);
    }

    public void a(F f2, byte by, boolean bl, F f3) {
        if (f2 == null) {
            rzV.error((Object)("[FIGHT] fighter cannot be null - " + adu_1.bYT()));
            return;
        }
        if (!this.a(f3, "controller")) {
            return;
        }
        if (this.bz(f2)) {
            rzV.error((Object)String.format("[FIGHT] On ajoute le fighter %d d\u00e9j\u00e0 pr\u00e9sent -> r\u00e9initialisation de son \u00e9tat.", ((exP)f2).Sn()));
        }
        this.rzT.put(((exP)f2).Sn(), (Object)this.a(by, bl, f3));
        this.rzU.put(((exP)f2).Sn(), f2);
    }

    public void b(long l, eVw eVw2) {
        this.rzT.put(l, (Object)eVw2);
    }

    private eVw a(byte by, boolean bl, F f2) {
        return new eVw(by, !this.fH(by), bl, ((exP)f2).Sn());
    }

    public boolean bv(F f2) {
        return this.bu((exP)f2).a(evv_0.rAb);
    }

    public boolean bw(F f2) {
        return this.bu((exP)f2).a(evv_0.rAc);
    }

    public boolean bx(F f2) {
        return this.bu((exP)f2).a(evv_0.rAd);
    }

    public void by(F f2) {
        Collection<F> collection;
        if (!this.bz(f2)) {
            rzV.error((Object)String.format("[FIGHT] removeFighter sur un fighter absent %d - %s", ((exP)f2).Sn(), adu_1.xg(10)));
            return;
        }
        eVw eVw2 = (eVw)this.rzT.remove(((exP)f2).Sn());
        this.rzU.remove(((exP)f2).Sn());
        if (eVw2.fNk() && !(collection = this.a(evb_0.fL(eVw2.bcP()))).isEmpty()) {
            this.bu((exP)collection.iterator().next()).mK(true);
        }
    }

    public boolean ba(exP exP2) {
        return this.bu(exP2).baH();
    }

    public boolean b(exP exP2, evv_0 ... evv_0Array) {
        evv_0 evv_02 = this.bu(exP2).fNh();
        for (evv_0 evv_03 : evv_0Array) {
            if (evv_03 != evv_02) continue;
            return true;
        }
        return false;
    }

    public evv_0 bd(exP exP2) {
        return this.bu(exP2).fNh();
    }

    public boolean bb(exP exP2) {
        return this.bu(exP2).baI();
    }

    public boolean bc(exP exP2) {
        return this.bu(exP2).baM();
    }

    public F qY(long l) {
        return (F)((exP)this.rzU.get(l));
    }

    public boolean bz(F f2) {
        if (f2 == null) {
            return false;
        }
        return this.rzT.contains(((exP)f2).Sn());
    }

    public boolean bA(exP exP2) {
        return this.bu(exP2).fNj();
    }

    public void e(F f2, F f3) {
        if (!this.a(f3, "controller")) {
            return;
        }
        if (!this.a(f2, "controlled")) {
            return;
        }
        eVw eVw2 = this.bu((exP)f2);
        long l = ((exP)f3).Sn();
        eVw2.a(l, ((exP)f3).bcP());
    }

    public void bB(F f2) {
        if (!this.a(f2, "controller")) {
            return;
        }
        this.rzT.forEachValue((TObjectProcedure)new evs_0(this, (exP)f2));
    }

    public void aX(F f2) {
        if (!this.a(f2, "controlled")) {
            return;
        }
        eVw eVw2 = this.bu((exP)f2);
        if (eVw2 instanceof eva_0) {
            return;
        }
        eVw2.a(null, (byte)-1);
    }

    public void aY(F f2) {
        if (!this.a(f2, "controlled")) {
            return;
        }
        eVw eVw2 = this.bu((exP)f2);
        eVw2.a(eVw2.dOo(), eVw2.fNi());
    }

    public Collection<F> aK(F f2) {
        if (!this.a(f2, "controller")) {
            return Collections.emptySet();
        }
        return this.a(evb_0.bF(f2));
    }

    public Collection<F> bC(F f2) {
        if (!this.a(f2, "controller")) {
            return Collections.emptySet();
        }
        return this.a(evb_0.bG(f2));
    }

    public F aV(F f2) {
        if (!this.a(f2, "controlled")) {
            return null;
        }
        return this.N(this.bu((exP)f2).fNl());
    }

    public F aW(F f2) {
        if (!this.a(f2, "controlled")) {
            return null;
        }
        return this.qY(this.bu((exP)f2).dOo());
    }

    private F N(Long l) {
        return l == null ? null : (F)this.qY(l);
    }

    private boolean a(F f2, String string) {
        if (f2 == null) {
            rzV.error((Object)String.format("[FIGHT_CONTROLLERS] %s cannot be null - %s", string, adu_1.cN(1, 10)));
            return false;
        }
        return true;
    }

    public Collection<F> fG(byte by) {
        return this.a(evb_0.fL(by), evb_0.fNu());
    }

    private boolean fH(byte by) {
        return !this.a(evb_0.fL(by), evb_0.fNt()).isEmpty();
    }

    public byte aS(exP exP2) {
        return this.bu(exP2).bcP();
    }

    public byte aT(exP exP2) {
        return this.bu(exP2).fNi();
    }

    public void b(exP exP2, byte by) {
        this.bu(exP2).az(by);
    }

    public boolean bD(exP exP2) {
        return this.bu(exP2).fNk();
    }

    @Nullable
    public F b(evb_0 ... evb_0Array) {
        LW lW = new LW();
        this.rzU.forEachValue(exP2 -> {
            if (this.a(exP2, evb_0Array)) {
                lW.v(exP2);
                return false;
            }
            return true;
        });
        return (F)((exP)lW.aTx());
    }

    public Collection<F> a(evb_0 ... evb_0Array) {
        ArrayList arrayList = new ArrayList();
        this.rzU.forEachValue((TObjectProcedure)new eVt(this, evb_0Array, arrayList));
        return arrayList;
    }

    public Collection<F> fKr() {
        return this.rzU.valueCollection();
    }

    boolean a(F f2, evb_0 ... evb_0Array) {
        for (evb_0 evb_02 : evb_0Array) {
            if (evb_02.a((exP)f2, this.bu((exP)f2))) continue;
            return false;
        }
        return true;
    }

    public void clear() {
        this.rzT.clear();
        this.rzU.clear();
    }
}

