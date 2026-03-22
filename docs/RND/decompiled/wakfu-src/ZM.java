/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ZM
extends ZA<ZC> {
    private static final ZM bXa = new ZM();
    protected final ConcurrentHashMap<Long, ZC> bXb = new ConcurrentHashMap();
    protected final List<ZC> bXc = new ArrayList<ZC>();

    public static ZM bqw() {
        return bXa;
    }

    public void c(ZC zC) {
        this.bXb.put(zC.Sn(), zC);
        this.a(zC, zC.bcC(), zC.bcD(), (int)zC.getAltitude());
    }

    public ZC fC(long l) {
        ZC zC = this.bXb.remove(l);
        if (zC != null) {
            this.bXc.add(zC);
        }
        return zC;
    }

    public ZC d(ZC zC) {
        return this.fC(zC.Sn());
    }

    public void bqx() {
        this.bXc.addAll(this.bXb.values());
        this.bXb.clear();
    }

    public ZC fD(long l) {
        return this.bXb.get(l);
    }

    @Override
    public void a(aaj_0 aaj_02, int n) {
        this.bqy();
        for (ZC zC : this.bXb.values()) {
            zC.b(aaj_02, n);
        }
    }

    private void bqy() {
        int n = this.bXc.size();
        for (int i = 0; i < n; ++i) {
            ZC zC = this.bXc.get(i);
            zC.setSelected(false);
            this.bUI.remove(zC);
            zC.bpI();
        }
        this.bXc.clear();
    }

    @Override
    public void a(aaj_0 aaj_02, float f2, float f3) {
        this.bUI.clear();
        for (ZC zC : this.bXb.values()) {
            if (zC.c(aaj_02)) {
                zC.bF(false);
                ZM.a(zC, aaj_02);
                this.bUI.add(zC);
                continue;
            }
            zC.bF(true);
        }
    }

    private static void a(ZC zC, aaj_0 aaj_02) {
        if (!zC.bql()) {
            return;
        }
        int n = agi.a((afV)aaj_02, zC.bpX());
        acb_1 acb_12 = agi.b(aaj_02, zC);
        int n2 = GC.A(acb_12.aPY);
        int n3 = GC.A(acb_12.aPZ);
        if (n2 != zC.getScreenX() || n3 != zC.getScreenY() || n != zC.bng()) {
            zC.qu(n2);
            zC.qv(n3);
            zC.qw(n);
            zC.bqm();
        }
    }

    public void clear() {
        for (ZC zC : this.bXb.values()) {
            zC.bpI();
        }
        this.bXb.clear();
        this.bUI.clear();
    }

    @Override
    public void bpi() {
        for (ZC zC : this.bXb.values()) {
            agX.c(zC);
        }
    }
}

