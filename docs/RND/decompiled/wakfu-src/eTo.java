/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TLongObjectHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public class eTo {
    protected static final Logger rnV = Logger.getLogger(eTo.class);
    private static eTo rnW = new eTo();
    private final TLongObjectHashMap<eSZ> rnX = new TLongObjectHashMap();
    private final TLongObjectHashMap<eSN> rnY = new TLongObjectHashMap();
    private final TLongObjectHashMap<eSM> rnZ = new TLongObjectHashMap();
    private final TLongObjectHashMap<eSW> roa = new TLongObjectHashMap();
    private final TLongObjectHashMap<eta_0> rob = new TLongObjectHashMap();
    private final TLongObjectHashMap<eSK> roc = new TLongObjectHashMap();
    private final TLongObjectHashMap<eSV> rod = new TLongObjectHashMap();
    private final TLongObjectHashMap<etb_0> roe = new TLongObjectHashMap();
    private final TLongObjectHashMap<eSP> rof = new TLongObjectHashMap();
    private final TLongObjectHashMap<eSL> rog = new TLongObjectHashMap();
    private final TLongObjectHashMap<eSR> roh = new TLongObjectHashMap();
    private final TLongObjectHashMap<eSX> roi = new TLongObjectHashMap();
    private final TLongObjectHashMap<etc_0> roj = new TLongObjectHashMap();
    private final TLongObjectHashMap<eST> rok = new TLongObjectHashMap();
    private final TLongObjectHashMap<eSO> rol = new TLongObjectHashMap();
    private final TLongObjectHashMap<eSU> rom = new TLongObjectHashMap();
    private final TLongObjectHashMap<eSJ> ron = new TLongObjectHashMap();
    private final TLongObjectHashMap<eSS> roo = new TLongObjectHashMap();

    public static eTo fIZ() {
        return rnW;
    }

    public void e(eSS eSS2) {
        if (eSS2 instanceof eSZ) {
            this.a((eSZ)eSS2);
        } else if (eSS2 instanceof eSV) {
            this.a((eSV)eSS2);
        } else if (eSS2 instanceof eSN) {
            this.a((eSN)eSS2);
        } else if (eSS2 instanceof eSK) {
            this.a((eSK)eSS2);
        } else if (eSS2 instanceof eSW) {
            this.a((eSW)eSS2);
        } else if (eSS2 instanceof eta_0) {
            this.a((eta_0)eSS2);
        } else if (eSS2 instanceof eSM) {
            this.b((eSM)eSS2);
        } else if (eSS2 instanceof etb_0) {
            this.a((etb_0)eSS2);
        } else if (eSS2 instanceof eSP) {
            this.b((eSP)eSS2);
        } else if (eSS2 instanceof eSY) {
            this.a((eSY)eSS2);
        } else if (eSS2 instanceof eSR) {
            this.a((eSR)eSS2);
        } else if (eSS2 instanceof eSX) {
            this.a((eSX)eSS2);
        } else if (eSS2 instanceof etc_0) {
            this.a((etc_0)eSS2);
        } else if (eSS2 instanceof eST) {
            this.a((eST)eSS2);
        } else if (eSS2 instanceof eSL) {
            this.a((eSL)eSS2);
        } else if (eSS2 instanceof eSO) {
            this.a((eSO)eSS2);
        } else if (eSS2 instanceof eSU) {
            this.a((eSU)eSS2);
        } else if (eSS2 instanceof eSJ) {
            this.a((eSJ)eSS2);
        } else {
            rnV.error((Object)("Type de zone d'effet inconnue du manager " + eSS2.getClass().getSimpleName()));
        }
    }

    private void a(eSJ eSJ2) {
        this.roo.put(eSJ2.bcw(), (Object)eSJ2);
        this.ron.put(eSJ2.bcw(), (Object)eSJ2);
    }

    private void a(eSU eSU2) {
        this.roo.put(eSU2.bcw(), (Object)eSU2);
        this.rom.put(eSU2.bcw(), (Object)eSU2);
    }

    private void a(etc_0 etc_02) {
        this.roo.put(etc_02.bcw(), (Object)etc_02);
        this.roj.put(etc_02.bcw(), (Object)etc_02);
    }

    private void a(eST eST2) {
        this.roo.put(eST2.bcw(), (Object)eST2);
        this.rok.put(eST2.bcw(), (Object)eST2);
    }

    private void a(eSO eSO2) {
        this.roo.put(eSO2.bcw(), (Object)eSO2);
        this.rol.put(eSO2.bcw(), (Object)eSO2);
    }

    private void a(eSX eSX2) {
        this.roo.put(eSX2.bcw(), (Object)eSX2);
        this.roi.put(eSX2.bcw(), (Object)eSX2);
    }

    private void a(eSR eSR2) {
        this.roo.put(eSR2.bcw(), (Object)eSR2);
        this.roh.put(eSR2.bcw(), (Object)eSR2);
    }

    private void a(eSY eSY2) {
        this.roo.put(eSY2.bcw(), (Object)eSY2);
    }

    private void b(eSP eSP2) {
        this.rof.put(eSP2.bcw(), (Object)eSP2);
        this.roo.put(eSP2.bcw(), (Object)eSP2);
    }

    private void a(eSL eSL2) {
        this.rog.put(eSL2.bcw(), (Object)eSL2);
        this.roo.put(eSL2.bcw(), (Object)eSL2);
    }

    private void a(etb_0 etb_02) {
        this.roe.put(etb_02.bcw(), (Object)etb_02);
        this.roo.put(etb_02.bcw(), (Object)etb_02);
    }

    private void a(eSZ eSZ2) {
        this.rnX.put(eSZ2.bcw(), (Object)eSZ2);
        this.roo.put(eSZ2.bcw(), (Object)eSZ2);
    }

    public eSZ iP(long l) {
        return (eSZ)this.rnX.get(l);
    }

    private void a(eSV eSV2) {
        this.rod.put(eSV2.bcw(), (Object)eSV2);
        this.roo.put(eSV2.bcw(), (Object)eSV2);
    }

    public eSV iR(long l) {
        return (eSV)this.rod.get(l);
    }

    private void a(eSN eSN2) {
        this.rnY.put(eSN2.bcw(), (Object)eSN2);
        this.roo.put(eSN2.bcw(), (Object)eSN2);
    }

    public eSN iS(long l) {
        return (eSN)this.rnY.get(l);
    }

    private void a(eSK eSK2) {
        this.roc.put(eSK2.bcw(), (Object)eSK2);
        this.roo.put(eSK2.bcw(), (Object)eSK2);
    }

    public eSK iT(long l) {
        return (eSK)this.roc.get(l);
    }

    private void b(eSM eSM2) {
        this.rnZ.put(eSM2.bcw(), (Object)eSM2);
        this.roo.put(eSM2.bcw(), (Object)eSM2);
    }

    public eSM iU(long l) {
        return (eSM)this.rnZ.get(l);
    }

    public eSM fJa() {
        return (eSM)this.rnZ.get(this.rnZ.keys()[GC.mR(this.rnZ.size())]);
    }

    private void a(eSW eSW2) {
        this.roa.put(eSW2.bcw(), (Object)eSW2);
        this.roo.put(eSW2.bcw(), (Object)eSW2);
    }

    public eSW iV(long l) {
        return (eSW)this.roa.get(l);
    }

    public Iterator<eSW> fJb() {
        return new azs_1<eSW>(this.roa);
    }

    private void a(eta_0 eta_02) {
        this.rob.put(eta_02.bcw(), (Object)eta_02);
        this.roo.put(eta_02.bcw(), (Object)eta_02);
    }

    public eta_0 iW(long l) {
        return (eta_0)this.rob.get(l);
    }

    public etb_0 iX(long l) {
        return (etb_0)this.roe.get(l);
    }

    public eSS iY(long l) {
        return (eSS)this.roo.get(l);
    }

    public eSP iZ(long l) {
        return (eSP)this.rof.get(l);
    }

    public eSJ ja(long l) {
        return (eSJ)this.ron.get(l);
    }

    public List<eSR> fJc() {
        Object[] objectArray = new eSR[this.roh.size()];
        this.roh.values(objectArray);
        return Arrays.asList(objectArray);
    }

    public static void a(eTo eTo2) {
        rnW = eTo2;
    }
}

