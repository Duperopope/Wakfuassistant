/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/*
 * Renamed from Xd
 */
public class xd_0
implements afZ<aaj_0> {
    private static final xd_0 bQR = new xd_0();
    private int bQS = 0;
    private final Map<anz_1, HashSet<xa_0>> bQT;
    private final TIntObjectHashMap<xa_0> bQU;
    private final ArrayList<xa_0> bQV;
    private final ArrayList<Xe> bQW = new ArrayList(5);

    private xd_0() {
        this.bQT = new HashMap<anz_1, HashSet<xa_0>>();
        this.bQU = new TIntObjectHashMap();
        this.bQV = new ArrayList();
    }

    public static xd_0 bnv() {
        return bQR;
    }

    public int bnw() {
        return ++this.bQS;
    }

    public void a(Xe xe) {
        if (xe == null) {
            return;
        }
        this.bQW.add(xe);
    }

    public void b(Xe xe) {
        if (xe == null) {
            return;
        }
        this.bQW.remove(xe);
    }

    private void a(xa_0 xa_02, Xc xc) {
        if (xa_02 == null || xc == null) {
            return;
        }
        int n = this.bQW.size();
        if (n == 0) {
            return;
        }
        xb_0 xb_02 = new xb_0(xa_02, xc);
        for (int i = 0; i < n; ++i) {
            this.bQW.get(i).a(xb_02);
        }
    }

    public int a(xa_0 xa_02) {
        anz_1 anz_12 = xa_02.bnp();
        HashSet<xa_0> hashSet = this.bQT.get(anz_12);
        if (hashSet == null) {
            hashSet = new HashSet();
            this.bQT.put(anz_12, hashSet);
        }
        if (!hashSet.contains(xa_02)) {
            xa_02.lK(this.bnw());
            hashSet.add(xa_02);
            this.bQU.put(xa_02.d(), (Object)xa_02);
            this.bQV.add(xa_02);
            this.a(xa_02, Xc.bQO);
        }
        return xa_02.d();
    }

    public final HashSet<xa_0> b(anz_1 anz_12) {
        return this.bQT.get(anz_12);
    }

    public boolean a(anz_1 anz_12, int n) {
        HashSet<xa_0> hashSet = this.bQT.get(anz_12);
        if (hashSet == null) {
            return false;
        }
        for (xa_0 xa_02 : hashSet) {
            if (xa_02.aHp() != n) continue;
            return true;
        }
        return false;
    }

    public int b(anz_1 anz_12, int n) {
        HashSet<xa_0> hashSet = this.bQT.get(anz_12);
        if (hashSet == null) {
            return 0;
        }
        Iterator<xa_0> iterator = hashSet.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            xa_0 xa_02 = iterator.next();
            if (xa_02.aHp() != n) continue;
            ++n2;
        }
        return n2;
    }

    public final void bnx() {
        TIntObjectIterator tIntObjectIterator = this.bQU.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            ((xa_0)tIntObjectIterator.value()).bmX();
        }
        this.bQT.clear();
        this.bQV.clear();
        this.bQU.clear();
    }

    public final xa_0 qz(int n) {
        return (xa_0)this.bQU.get(n);
    }

    public void qA(int n) {
        TIntObjectIterator tIntObjectIterator = this.bQU.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            xa_0 xa_02 = (xa_0)tIntObjectIterator.value();
            if (xa_02.aHp() != n) continue;
            HashSet<xa_0> hashSet = this.bQT.get(xa_02.bnp());
            assert (hashSet != null);
            hashSet.remove(xa_02);
            this.bQV.remove(xa_02);
            tIntObjectIterator.remove();
            xa_02.bmX();
            this.a(xa_02, Xc.bQP);
        }
    }

    public void c(anz_1 anz_12, int n) {
        HashSet<xa_0> hashSet = this.bQT.get(anz_12);
        if (hashSet != null) {
            Iterator<xa_0> iterator = hashSet.iterator();
            while (iterator.hasNext()) {
                xa_0 xa_02 = iterator.next();
                if (xa_02.aHp() != n) continue;
                this.bQU.remove(xa_02.d());
                this.bQV.remove(xa_02);
                iterator.remove();
                xa_02.bmX();
                this.a(xa_02, Xc.bQP);
            }
        }
    }

    public void d(anz_1 anz_12, int n) {
        HashSet<xa_0> hashSet = this.bQT.get(anz_12);
        if (hashSet != null) {
            Iterator<xa_0> iterator = hashSet.iterator();
            while (iterator.hasNext()) {
                xa_0 xa_02 = iterator.next();
                if (xa_02.aHp() != n) continue;
                this.bQU.remove(xa_02.d());
                this.bQV.remove(xa_02);
                iterator.remove();
                xa_02.bmX();
                this.a(xa_02, Xc.bQP);
                return;
            }
        }
    }

    public final void c(anz_1 anz_12) {
        HashSet<xa_0> hashSet = this.bQT.remove(anz_12);
        if (hashSet != null) {
            for (xa_0 xa_02 : hashSet) {
                this.bQU.remove(xa_02.d());
                this.bQV.remove(xa_02);
                xa_02.bmX();
                this.a(xa_02, Xc.bQP);
            }
        }
    }

    public final void b(xa_0 xa_02) {
        assert (xa_02 != null);
        this.qB(xa_02.d());
    }

    public void qB(int n) {
        xa_0 xa_02 = (xa_0)this.bQU.remove(n);
        if (xa_02 != null) {
            this.bQV.remove(xa_02);
            HashSet<xa_0> hashSet = this.bQT.get(xa_02.bnp());
            assert (hashSet != null);
            hashSet.remove(xa_02);
            if (hashSet.isEmpty()) {
                this.bQT.remove(xa_02.bnp());
            }
            xa_02.bmX();
            this.a(xa_02, Xc.bQP);
        }
    }

    @Override
    public void a(aaj_0 aaj_02, float f2, float f3) {
        int n = this.bQV.size();
        for (int i = 0; i < n; ++i) {
            adj_0 adj_02;
            xa_0 xa_02 = this.bQV.get(i);
            if (xa_02.bnp() instanceof adj_0 && (adj_02 = (adj_0)xa_02.bnp()) != null && !adj_02.isVisible()) continue;
            float f4 = xa_02.getWorldX();
            float f5 = xa_02.getWorldY();
            float f6 = xa_02.getAltitude();
            float f7 = aaj_02.aM(f4, f5);
            float f8 = aaj_02.j(f4, f5, f6);
            xa_02.b(f7, f8, xa_02.getXOffset(), xa_02.getYOffset());
            Entity entity = xa_02.getEntity();
            if (entity == null) continue;
            entity.cWN = f4;
            entity.cWO = f5;
            aaj_02.a(entity, false);
        }
    }

    @Override
    public void a(aaj_0 aaj_02, int n) {
        int n2;
        TIntArrayList tIntArrayList = new TIntArrayList();
        int n3 = this.bQV.size();
        for (n2 = 0; n2 < n3; ++n2) {
            xa_0 xa_02 = this.bQV.get(n2);
            if (!xa_02.bnq()) {
                tIntArrayList.add(xa_02.d());
                continue;
            }
            xa_02.a(aaj_02, n);
        }
        for (n2 = tIntArrayList.size() - 1; n2 >= 0; --n2) {
            this.qB(tIntArrayList.getQuick(n2));
        }
    }
}

