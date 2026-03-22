/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/*
 * Renamed from aGO
 */
public class ago_1
extends agk_1 {
    private static final byte dMD = 8;
    private final LinkedList<ahk_1> dME = new LinkedList();
    private final Object dMF = new Object();
    private final ArrayList<ahk_1> dMG = new ArrayList(5);
    private final ArrayList<ahk_1> dMH = new ArrayList(5);
    private agi_1 dMI = null;
    private final byte dMJ = (byte)8;

    public ago_1(String string) {
        super(string);
    }

    public ago_1(String string, byte by) {
        super(string, by);
    }

    public ago_1(String string, byte by, byte by2) {
        super(string, by, by2);
    }

    @Override
    public Collection<ahk_1> cbQ() {
        return this.dME;
    }

    @Override
    public ahk_1 a(ahz_1 ahz_12, boolean bl, boolean bl2, boolean bl3, long l, long l2) {
        ahk_1 ahk_12 = this.a(ahz_12, l, -1L);
        if (ahk_12 == null) {
            dMl.debug((Object)("Impossible d'initialiser une source audio : " + ahz_12.getDescription()));
            return null;
        }
        if (this.a(ahk_12, true, true, bl3)) {
            return ahk_12;
        }
        return null;
    }

    @Override
    public void a(ahk_1 ahk_12) {
        this.a(ahk_12, true, true, ahk_12.bBD());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private synchronized boolean a(ahk_1 ahk_12, boolean bl, boolean bl2, boolean bl3) {
        if (ahk_12 == null) {
            dMl.error((Object)"On ne peut pas jouer une source nulle");
            return false;
        }
        ahk_12.dM(this.bBt());
        ahk_12.dO(this.cbN());
        ahk_12.cy(bl3);
        if (this.dMw != 0) {
            ahk_12.ye(this.dMw);
        }
        if (avh_2.dhF.a(avg_2.dhs)) {
            ahk_12.dX(true);
            ahk_12.yg(0);
        }
        Object object = this.dMF;
        synchronized (object) {
            if (this.dME.size() > 8) {
                ahu_1.e(ahk_12);
                return false;
            }
            try {
                ahk_12.ccA();
            }
            catch (Exception exception) {
                dMl.error((Object)"Erreur durant la lecture de la source", (Throwable)exception);
                ahu_1.e(ahk_12);
                return false;
            }
            this.dMG.add(ahk_12);
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void cbR() {
        Object object = this.dMF;
        synchronized (object) {
            int n = this.dMG.size();
            for (int i = 0; i < n; ++i) {
                ahk_1 ahk_12 = this.dMG.get(i);
                this.dME.add(ahk_12);
            }
            this.dMG.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void dR(float f2) {
        Object object = this.dMF;
        synchronized (object) {
            float f3 = this.bBt();
            for (ahk_1 ahk_12 : this.dME) {
                ahk_12.dM(f3);
            }
        }
    }

    @Override
    public void bs(float f2, float f3) {
    }

    @Override
    public void bt(float f2, float f3) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void g(boolean bl, boolean bl2) {
        Object object = this.dMF;
        synchronized (object) {
            for (ahk_1 ahk_12 : this.dME) {
                ahk_12.dO(bl2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public synchronized void hD(long l) {
        super.hD(l);
        Object object = this.dMF;
        synchronized (object) {
            int n;
            int n2 = 0;
            if (this.dMt != null) {
                n2 = this.dMt.bqG();
            }
            int n3 = this.dME.size();
            for (n = 0; n < n3; ++n) {
                ahk_1 ahk_12 = this.dME.get(n);
                switch (ahk_12.hG(l)) {
                    case dPD: 
                    case dPF: {
                        this.dMH.add(ahk_12);
                        ahu_1.e(ahk_12);
                    }
                }
            }
            n = this.dMH.size();
            for (int i = 0; i < n; ++i) {
                this.dME.remove(this.dMH.get(i));
            }
            if (n > 0 && this.dME.size() == 0 && this.dMI != null) {
                this.dMI.cbz();
            }
            this.dMH.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void bhk() {
        Object object = this.dMF;
        synchronized (object) {
            int n = this.dME.size();
            for (int i = 0; i < n; ++i) {
                ahu_1.e(this.dME.get(i));
            }
            this.dME.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(ahk_1 ahk_12) {
        Object object = this.dMF;
        synchronized (object) {
            boolean bl = this.dME.remove(ahk_12);
            if (bl) {
                ahu_1.e(ahk_12);
            }
        }
    }

    @Override
    public synchronized boolean ya(int n) {
        int n2;
        if (!super.ya(n)) {
            return false;
        }
        int n3 = this.dME.size();
        for (n2 = 0; n2 < n3; ++n2) {
            this.dME.get(n2).ye(n);
        }
        n3 = this.dMG.size();
        for (n2 = 0; n2 < n3; ++n2) {
            this.dMG.get(n2).ye(n);
        }
        return true;
    }

    public void a(agi_1 agi_12) {
        this.dMI = agi_12;
    }

    public void dS(float f2) {
        if (this.dMI != null) {
            this.dMI.dK(f2);
        }
    }

    public void dT(float f2) {
        if (this.dMI != null) {
            this.dMI.dL(f2);
        }
    }

    public void bBl() {
        if (this.dMI != null) {
            this.dMI.cbA();
            this.dMI.cbB();
        }
    }
}

