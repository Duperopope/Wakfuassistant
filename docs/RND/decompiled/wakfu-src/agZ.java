/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.baseImpl.graphics.isometric.particles.CellParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.FreeParticleSystem;
import com.ankamagames.baseImpl.graphics.isometric.particles.IsoParticleSystem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.log4j.Logger;

public class agZ<S extends afV>
implements acu_0,
afZ<S> {
    private static final Logger cvj = Logger.getLogger(agZ.class);
    private static final int cvk = 54;
    private static final double cvl = 0.75;
    private static final double cvm = 1.25;
    private static final double cvn = 1.25;
    private static final double cvo = 0.75;
    private static final agZ cvp = new agZ();
    protected agW cvq;
    private final Map<Integer, IsoParticleSystem> cvr = new ConcurrentHashMap<Integer, IsoParticleSystem>();
    private byte cvs;
    private volatile boolean cvt = true;
    private final ArrayList<IsoParticleSystem> cvu = new ArrayList(50);

    public static agZ bzy() {
        return cvp;
    }

    public void cr(boolean bl) {
        this.cvt = bl;
    }

    public boolean bzz() {
        return this.cvt;
    }

    public void a(CellParticleSystem cellParticleSystem) {
        if (this.a((IsoParticleSystem)cellParticleSystem)) {
            return;
        }
        this.b(cellParticleSystem);
    }

    public boolean a(IsoParticleSystem isoParticleSystem) {
        for (IsoParticleSystem isoParticleSystem2 : this.cvr.values()) {
            if (isoParticleSystem2.bLJ() != isoParticleSystem.bLJ()) continue;
            return true;
        }
        return false;
    }

    public Iterator<IsoParticleSystem> bzA() {
        return this.cvr.values().iterator();
    }

    public IsoParticleSystem sn(int n) {
        return this.cvr.get(n);
    }

    public void b(IsoParticleSystem isoParticleSystem) {
        if (!this.cvt) {
            return;
        }
        assert (!this.cvr.containsKey(isoParticleSystem.bLJ()));
        isoParticleSystem.bGY();
        this.cvr.put(isoParticleSystem.bLJ(), isoParticleSystem);
        this.a(isoParticleSystem, (int)isoParticleSystem.aSc(), (int)isoParticleSystem.aSd(), (int)isoParticleSystem.aSe());
        agr.ctK.a(isoParticleSystem);
    }

    public void so(int n) {
        this.d(n, false);
    }

    public void d(int n, boolean bl) {
        IsoParticleSystem isoParticleSystem = this.cvr.get(n);
        if (isoParticleSystem == null) {
            return;
        }
        if (bl) {
            isoParticleSystem.bLH();
        } else {
            isoParticleSystem.bLI();
        }
    }

    public void e(int n, boolean bl) {
        IsoParticleSystem isoParticleSystem = this.cvr.get(n);
        if (isoParticleSystem != null) {
            isoParticleSystem.setVisible(bl);
        }
    }

    public void bzB() {
        for (IsoParticleSystem isoParticleSystem : this.cvr.values()) {
            isoParticleSystem.bzu();
        }
        if (!this.cvt) {
            return;
        }
        Iterator<IsoParticleSystem> iterator = this.cvr.values().iterator();
        while (iterator.hasNext()) {
            IsoParticleSystem isoParticleSystem;
            isoParticleSystem = iterator.next();
            if (isoParticleSystem.bSW() > 0) continue;
            isoParticleSystem.bsI();
            iterator.remove();
        }
    }

    @Override
    public void a(S s, int n) {
        if (!this.cvt) {
            return;
        }
        float f2 = (float)n / 1000.0f;
        if (f2 > 0.066f) {
            f2 = 0.066f;
        }
        for (IsoParticleSystem isoParticleSystem : this.cvr.values()) {
            if (isoParticleSystem.bSW() == 0 || isoParticleSystem.bzt() > this.cvs) continue;
            isoParticleSystem.ca(f2);
        }
    }

    @Override
    public void a(S s, float f2, float f3) {
        if (!this.cvt) {
            return;
        }
        this.cvu.clear();
        Iterator<IsoParticleSystem> iterator = this.cvr.values().iterator();
        int n = (int)f2;
        int n2 = (int)f3;
        aci_1 aci_12 = ((afV)s).brf().byJ();
        while (iterator.hasNext()) {
            IsoParticleSystem isoParticleSystem = iterator.next();
            if (isoParticleSystem.bSW() <= 0) {
                isoParticleSystem.bsI();
                iterator.remove();
                continue;
            }
            if (isoParticleSystem.bzt() > this.cvs) continue;
            boolean bl = true;
            switch (this.a(isoParticleSystem, s, aci_12, n, n2).ordinal()) {
                case 0: {
                    if (isoParticleSystem.bzq()) {
                        bl = isoParticleSystem.f((afV)s);
                    }
                    this.cvu.add(isoParticleSystem);
                    isoParticleSystem.g((afV)s);
                    break;
                }
                case 2: {
                    try {
                        isoParticleSystem.uA(1);
                    }
                    catch (Exception exception) {
                        while (isoParticleSystem.bSW() >= 0) {
                            isoParticleSystem.bsI();
                        }
                        iterator.remove();
                        cvj.error((Object)"probl\u00e8me lors de l'arr\u00eat d'un syst\u00e8me de particule", (Throwable)exception);
                    }
                    break;
                }
            }
            if (bl) continue;
            agX.c(isoParticleSystem);
        }
    }

    private aha a(IsoParticleSystem isoParticleSystem, S s, aci_1 aci_12, int n, int n2) {
        float f2 = isoParticleSystem.aSc();
        float f3 = isoParticleSystem.aSd();
        float f4 = isoParticleSystem.aSe();
        float f5 = f2 - (float)n;
        float f6 = f3 - (float)n2;
        if (Math.abs(f5) > 54.0f || Math.abs(f6) > 54.0f) {
            return isoParticleSystem.bzv() ? aha.cvy : aha.cvx;
        }
        if (!isoParticleSystem.isVisible()) {
            return aha.cvx;
        }
        aci_1 aci_13 = new aci_1(isoParticleSystem.bty());
        float f7 = ((afV)s).aM(f2, f3);
        float f8 = ((afV)s).j(f2, f3, f4);
        aci_13.cK((int)f7, (int)f8);
        aci_1 aci_14 = new aci_1(agZ.f(aci_12.bWF(), false), agZ.f(aci_12.bWG(), true), agZ.f(aci_12.bWH(), false), agZ.f(aci_12.bWI(), true));
        if (aci_14.e(aci_13)) {
            return aha.cvw;
        }
        return aha.cvx;
    }

    public void bH(int n, int n2) {
        for (IsoParticleSystem isoParticleSystem : this.cvr.values()) {
            if ((int)isoParticleSystem.aSc() != n || (int)isoParticleSystem.aSd() != n2) continue;
            isoParticleSystem.bLI();
        }
    }

    private void a(IsoParticleSystem isoParticleSystem, int n, int n2, int n3) {
        agX.c(isoParticleSystem);
    }

    public void e(afW afW2) {
        for (IsoParticleSystem isoParticleSystem : this.cvr.values()) {
            FreeParticleSystem freeParticleSystem;
            if (!(isoParticleSystem instanceof FreeParticleSystem) || (freeParticleSystem = (FreeParticleSystem)isoParticleSystem).btr() != afW2) continue;
            this.so(isoParticleSystem.bLJ());
        }
    }

    public void av(byte by) {
        this.cvs = by;
    }

    public int bzC() {
        int n = 0;
        for (IsoParticleSystem isoParticleSystem : this.cvr.values()) {
            n += isoParticleSystem.bzs();
        }
        return n;
    }

    @Override
    public void a(agb agb2, ArrayList<acx_0> arrayList) {
        arrayList.addAll(this.cvu);
    }

    private static int f(int n, boolean bl) {
        if (n > 0) {
            return bl ? (int)((double)n * 1.25) : (int)((double)n * 0.75);
        }
        return bl ? (int)((double)n * 0.75) : (int)((double)n * 1.25);
    }
}

