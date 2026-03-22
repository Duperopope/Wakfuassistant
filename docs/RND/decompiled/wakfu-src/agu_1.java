/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Unmodifiable
 */
import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Unmodifiable;

/*
 * Renamed from aGU
 */
public class agu_1
extends agk_1 {
    protected static final Logger dNe = Logger.getLogger(agu_1.class);
    private final ArrayList<agw_1> dNf = new ArrayList();
    private final ArrayList<agw_1> dNg = new ArrayList();
    private static final int[][] dNh = new int[][]{{-1, -1}, {0, -1}, {1, -1}, {-1, 0}, {0, 0}, {1, 0}, {-1, 1}, {0, 1}, {1, 1}};
    private final TIntArrayList dNi = new TIntArrayList();
    private float dNj = 1.0f;
    private boolean dNk = true;

    public agu_1(String string) {
        super(string);
    }

    public agu_1(String string, byte by) {
        super(string, by);
    }

    public agu_1(String string, byte by, byte by2) {
        super(string, by, by2);
    }

    @Override
    public ahk_1 a(ahz_1 ahz_12, boolean bl, boolean bl2, boolean bl3, long l, long l2) {
        return null;
    }

    @Override
    public void a(ahk_1 ahk_12) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized agw_1 a(ahz_1 ahz_12, float f2, float f3, agn_1 agn_12, float f4, float f5, float f6, int n, int n2, boolean bl, boolean bl2, boolean bl3, float f7, long l, long l2) {
        ahk_1 ahk_12 = this.a(ahz_12, l, l2);
        if (ahk_12 == null) {
            dNe.debug((Object)("le son " + ahz_12.getDescription() + " ne peut pas \u00eatre pr\u00e9par\u00e9"));
            return null;
        }
        ahk_12.cy(bl && n2 == 0);
        ahk_12.ea(f4);
        ahk_12.eb(f5);
        ahk_12.ec(f6 != 0.0f ? f6 : 1.0f);
        ahk_12.dQ(f2);
        ahk_12.dZ(f3);
        ahk_12.dM(this.bBt());
        ahk_12.dO(this.cbN());
        if (this.dMw != 0) {
            ahk_12.ye(this.dMw);
        }
        if (avh_2.dhF.a(avg_2.dhs)) {
            ahk_12.dX(true);
        }
        ahk_12.ccx();
        agw_1 agw_12 = agw_1.a(ahk_12, agn_12, f5 + 5.0f, bl2, bl3, f7);
        if (bl && n2 > 0) {
            agw_12.cR(n, n2);
        }
        ArrayList<agw_1> arrayList = this.dNf;
        synchronized (arrayList) {
            this.dNg.add(agw_12);
        }
        return agw_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void cbR() {
        ArrayList<agw_1> arrayList = this.dNf;
        synchronized (arrayList) {
            int n = this.dNg.size();
            for (int i = 0; i < n; ++i) {
                agw_1 agw_12 = this.dNg.get(i);
                this.dNf.add(agw_12);
            }
            this.dNg.clear();
        }
    }

    public void dQ(boolean bl) {
        this.dNk = bl;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void dR(float f2) {
        ArrayList<agw_1> arrayList = this.dNf;
        synchronized (arrayList) {
            float f3 = this.bBt();
            for (agw_1 agw_12 : this.dNf) {
                agw_12.dM(f3);
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
        ArrayList<agw_1> arrayList = this.dNf;
        synchronized (arrayList) {
            for (agw_1 agw_12 : this.dNf) {
                agw_12.dR(bl2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public synchronized void hD(long l) {
        super.hD(l);
        acp_1 acp_12 = this.dMt != null ? this.dMt.byU() : acp_1.dAX;
        float f2 = this.dMt != null ? this.dMt.byV() : 1.0f;
        int n = this.dMt != null ? this.dMt.bqG() : 0;
        this.dNj = f2;
        this.dNi.resetQuick();
        ArrayList<agw_1> arrayList = this.dNf;
        synchronized (arrayList) {
            int n2;
            int n3 = this.dNf.size();
            for (n2 = 0; n2 < n3; ++n2) {
                agw_1 agw_12 = this.dNf.get(n2);
                agw_12.a(l, acp_12, f2, this.dNk, n);
                if (!agw_12.bYs()) continue;
                this.dNi.add(n2);
                ahu_1.e(agw_12.ccc());
            }
            n2 = this.dNi.size();
            if (n2 > 0) {
                for (n3 = n2 - 1; n3 >= 0; --n3) {
                    this.dNf.remove(this.dNi.getQuick(n3));
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void bhk() {
        ArrayList<agw_1> arrayList = this.dNf;
        synchronized (arrayList) {
            for (agw_1 agw_12 : this.dNf) {
                ahu_1.e(agw_12.ccc());
            }
            this.dNf.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(ahk_1 ahk_12) {
        ArrayList<agw_1> arrayList = this.dNf;
        synchronized (arrayList) {
            for (int i = this.dNf.size() - 1; i >= 0; --i) {
                agw_1 agw_12 = this.dNf.get(i);
                if (agw_12.ccc() != ahk_12) continue;
                this.dNf.remove(i);
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
        int n3 = this.dNf.size();
        for (n2 = 0; n2 < n3; ++n2) {
            this.dNf.get(n2).ccc().ye(n);
        }
        n3 = this.dNg.size();
        for (n2 = 0; n2 < n3; ++n2) {
            this.dNg.get(n2).ccc().ye(n);
        }
        return true;
    }

    @Override
    public @Unmodifiable Collection<ahk_1> cbQ() {
        return this.dNf.stream().map(agw_1::ccc).toList();
    }

    public int cca() {
        return this.dNf.size();
    }

    public String ccb() {
        StringBuilder stringBuilder = new StringBuilder();
        for (agw_1 agw_12 : this.dNf) {
            stringBuilder.append(agw_12.ccc().getDescription()).append("\n");
        }
        return stringBuilder.toString();
    }

    public String toString() {
        return "[FieldSourceGroup-" + this.getName() + "] " + this.dNf.size() + " + " + this.dNg.size() + " sources en cours de lecture.";
    }
}

