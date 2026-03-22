/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from adN
 */
public class adn_0
extends ZB<adj_0> {
    protected static final Logger ckM = Logger.getLogger(adn_0.class);
    private static final adn_0 ckN = new adn_0();
    protected final ConcurrentHashMap<Long, adj_0> ckO;
    protected final List<adj_0> ckP;
    private final List<adj_0> ckQ = new ArrayList<adj_0>();
    private boolean ckR;
    private final ArrayList<adk_0> ckS;
    private final ArrayList<adl_0> ckT;
    private final ArrayList<adk_0> ckU;
    private final ArrayList<adl_0> ckV;

    private adn_0() {
        this.ckO = new ConcurrentHashMap();
        this.ckP = new ArrayList<adj_0>();
        this.ckS = new ArrayList();
        this.ckT = new ArrayList();
        this.ckU = new ArrayList();
        this.ckV = new ArrayList();
    }

    public static adn_0 bvh() {
        return ckN;
    }

    protected Collection<adj_0> bvi() {
        return this.ckO.values();
    }

    public void g(adj_0 adj_02) {
        ArrayList<adj_0> arrayList = adj_02.bva();
        if (arrayList != null) {
            int n = arrayList.size();
            for (int i = 0; i < n; ++i) {
                adj_0 adj_03 = arrayList.get(i);
                if (!adj_03.buT()) continue;
                this.g(adj_03);
            }
        }
        this.ckO.put(adj_02.Sn(), adj_02);
        this.ckP.remove(adj_02);
        this.h(adj_02);
    }

    private void h(adj_0 adj_02) {
        int n = this.ckU.size();
        for (int i = 0; i < n; ++i) {
            this.ckU.get(i).onMobileCreation(adj_02);
        }
    }

    public adj_0 fL(long l) {
        adj_0 adj_02 = this.ckO.remove(l);
        if (adj_02 != null) {
            this.ckP.add(adj_02);
            this.i(adj_02);
        }
        return adj_02;
    }

    private void i(adj_0 adj_02) {
        int n = this.ckV.size();
        for (int i = 0; i < n; ++i) {
            this.ckV.get(i).onMobileDestruction(adj_02);
        }
    }

    public adj_0 j(adj_0 adj_02) {
        return this.fL(adj_02.Sn());
    }

    public adj_0 k(adj_0 adj_02) {
        ArrayList<adj_0> arrayList = adj_02.bva();
        if (arrayList != null) {
            int n = arrayList.size();
            for (int i = 0; i < n; ++i) {
                adj_0 adj_03 = arrayList.get(i);
                if (!adj_03.buT()) continue;
                this.k(adj_03);
            }
        }
        adj_0 adj_04 = this.ckO.remove(adj_02.Sn());
        this.i(adj_02);
        return adj_04;
    }

    public void bvj() {
        for (adj_0 adj_02 : this.ckO.values()) {
            this.i(adj_02);
        }
        for (adj_0 adj_02 : this.ckP) {
            this.i(adj_02);
        }
        for (adj_0 adj_02 : this.ckO.values()) {
            adj_02.bpI();
        }
        this.ckO.clear();
        for (adj_0 adj_02 : this.ckP) {
            adj_02.bpI();
        }
        this.ckP.clear();
        this.bUI.clear();
        this.ckQ.clear();
        this.ckU.clear();
        this.ckU.addAll(this.ckS);
        this.ckV.clear();
        this.ckV.addAll(this.ckT);
    }

    public adj_0 fM(long l) {
        return this.ckO.get(l);
    }

    public Collection<adj_0> bvk() {
        return this.ckO.values();
    }

    public int bvl() {
        return this.ckO.size();
    }

    public void bvm() {
        this.ckP.addAll(this.ckO.values());
        for (int i = this.ckP.size(); i <= 0; --i) {
            this.ckP.get(i).bpC();
        }
    }

    @Override
    public void a(aaj_0 aaj_02, int n) {
        int n2 = this.ckP.size();
        for (int i = 0; i < n2; ++i) {
            adj_0 adj_03 = this.ckP.get(i);
            if (adj_03.buW()) {
                adj_03.buV().buY();
            }
            if (adj_03.buX()) {
                adj_03.buY();
            }
            if (adj_03.bva() != null) {
                adj_03.buZ();
            }
            if (adj_03.bvb() != null) {
                adj_03.bvb().e(adj_03);
            }
            this.bUI.remove(adj_03);
            adj_03.bpI();
        }
        this.ckP.clear();
        this.bvn();
        List<adj_0> list = List.copyOf(this.ckQ);
        list.forEach(adj_02 -> adj_02.a(aaj_02, n));
        list.forEach(adj_02 -> adj_02.b(aaj_02, n));
    }

    private List<adj_0> bvn() {
        Collection<adj_0> collection = this.ckO.values();
        this.ckQ.clear();
        for (adj_0 adj_02 : collection) {
            int n = -1;
            adj_0 adj_03 = adj_02.buV();
            if (adj_03 != null && (n = this.ckQ.indexOf(adj_03)) != -1) {
                this.ckQ.add(n + 1, adj_02);
                continue;
            }
            adj_0 adj_04 = adj_02.buU();
            if (adj_04 != null && (n = this.ckQ.indexOf(adj_04)) != -1) {
                this.ckQ.add(n, adj_02);
                continue;
            }
            adj_0 adj_05 = adj_02.bvb();
            if (adj_05 != null && !this.ckQ.contains(adj_02) && (n = this.ckQ.indexOf(adj_05)) != -1) {
                this.ckQ.add(n + 1, adj_02);
                continue;
            }
            this.ckQ.add(adj_02);
            ArrayList<adj_0> arrayList = adj_02.bva();
            if (arrayList == null) continue;
            int n2 = arrayList.size();
            for (int i = 0; i < n2; ++i) {
                adj_0 adj_06 = arrayList.get(i);
                if (!this.ckQ.remove(adj_06)) continue;
                this.ckQ.add(adj_06);
            }
        }
        return this.ckQ;
    }

    @Override
    public void a(aaj_0 aaj_02, float f2, float f3) {
        this.bUI.clear();
        for (int i = 0; i < this.ckQ.size(); ++i) {
            adj_0 adj_02 = this.ckQ.get(i);
            if (adj_02.c(aaj_02)) {
                adj_02.bF(false);
                this.a(adj_02, aaj_02);
                this.bUI.add(adj_02);
                continue;
            }
            adj_02.bF(true);
        }
    }

    public void a(adk_0 adk_02) {
        if (!this.ckS.contains(adk_02)) {
            this.ckS.add(adk_02);
        }
    }

    public void a(adl_0 adl_02) {
        if (!this.ckT.contains(adl_02)) {
            this.ckT.add(adl_02);
        }
    }

    public void b(adk_0 adk_02) {
        if (!this.ckU.contains(adk_02)) {
            this.ckU.add(adk_02);
        }
    }

    public void c(adk_0 adk_02) {
        this.ckU.remove(adk_02);
    }

    public void b(adl_0 adl_02) {
        if (!this.ckV.contains(adl_02)) {
            this.ckV.add(adl_02);
        }
    }

    public void c(adl_0 adl_02) {
        this.ckV.remove(adl_02);
    }

    @Override
    public void bpi() {
        for (adj_0 adj_02 : this.ckO.values()) {
            agX.c(adj_02);
        }
    }

    public boolean bvo() {
        return this.ckR;
    }

    public void cg(boolean bl) {
        this.ckR = bl;
    }
}

