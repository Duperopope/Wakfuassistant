/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from Ni
 */
public abstract class ni_1
extends RH
implements rx_0 {
    private static final Logger aXV = Logger.getLogger(ni_1.class);
    private static final String aXW = "ie_actions";
    private final ArrayList<ng_1> aXX = new ArrayList(1);
    final EnumMap<rw_0, Integer> aXY = new EnumMap(rw_0.class);
    protected boolean aXZ;
    private final fi_1 aYa = new nj_0(this);

    public final Collection<ng_1> aVG() {
        return this.aXX;
    }

    @Override
    public boolean a(rw_0 rw_02, RG rG) {
        if (!this.isUsable()) {
            return false;
        }
        boolean bl = this.b(rw_02, rG);
        if (!bl) {
            aXV.warn((Object)("Action non prise en compte par le ModelControler (ClientMapInteractiveElement) : " + String.valueOf(rw_02)));
        }
        return bl;
    }

    @Override
    public void aVH() {
        super.aVH();
        this.aXX.clear();
        this.aXY.clear();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.aXZ = false;
        assert (this.aXX.isEmpty());
        assert (this.aXY.isEmpty());
    }

    public boolean a(ng_1 ng_12) {
        ng_12.a(this);
        this.a((rz_0)ng_12);
        return this.aXX.add(ng_12);
    }

    public final void aVJ() {
        for (ng_1 ng_12 : this.aXX) {
            this.b((rz_0)ng_12);
        }
        this.aXX.clear();
    }

    public abstract List<acd_1> aVK();

    @Override
    protected fi_1 aVL() {
        return this.aYa;
    }

    @Override
    protected final fi_1 aVM() {
        return fi_1.oX;
    }

    @Override
    protected final fi_1 aVN() {
        return fi_1.oX;
    }

    @Override
    public wy_0 aVO() {
        acd_1 acd_12 = this.aZw();
        return wa_0.aQ(acd_12.getX(), acd_12.getY());
    }

    public abstract boolean aVP();

    public final void aVQ() {
        for (ng_1 ng_12 : this.aXX) {
            this.b(ng_12);
        }
    }

    protected void b(ng_1 ng_12) {
        ng_12.aPc();
    }

    public void aVR() {
        this.aXZ = true;
    }

    public void aVS() {
        this.aXZ = false;
    }

    public abstract void c(ng_1 var1);

    public boolean d(ng_1 ng_12) {
        this.b((rz_0)ng_12);
        return this.aXX.remove(ng_12);
    }

    protected final void b(rw_0 rw_02) {
        Integer n = this.aXY.get(rw_02);
        if (n != null && n != 0) {
            Map<String, Object> map = Collections.singletonMap("elementId", this.aXv);
            assert (afs_1.can().bYf() != null);
            String string = String.format("%s/%d%s", aXW, n, afs_1.can().bLX());
            afs_1.can().a(string, null, map, null, false);
        }
    }
}

