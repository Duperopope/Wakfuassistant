/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from eUS
 */
public final class eus_0
implements eur_0,
eUU {
    private static final Logger ryj = Logger.getLogger(eus_0.class);
    public static final int ryk = 2;
    private final List<List<eSP>> ryl = new ArrayList<List<eSP>>();
    private eUT rym;
    private boolean ryn = false;

    @Override
    public void c(eSP eSP2) {
        this.f(eSP2);
    }

    void f(eSP eSP2) {
        if (eSP2 == null) {
            return;
        }
        if (this.ryl.isEmpty()) {
            this.i(eSP2);
            return;
        }
        if (this.g(eSP2)) {
            return;
        }
        List<eSP> list = this.h(eSP2);
        if (list == null) {
            this.i(eSP2);
        } else {
            this.aQ(list);
        }
    }

    private void aQ(List<eSP> list) {
        Iterator<List<eSP>> iterator = this.ryl.iterator();
        while (iterator.hasNext()) {
            List<eSP> list2 = iterator.next();
            if (list2 == list || !this.d(list, list2)) continue;
            iterator.remove();
        }
    }

    private boolean d(List<eSP> list, List<eSP> list2) {
        for (eSP eSP2 : list2) {
            for (eSP eSP3 : list) {
                if (!this.a(eSP3, eSP2)) continue;
                list.addAll(list2);
                this.aR(list);
                return true;
            }
        }
        return false;
    }

    public boolean g(eSP eSP2) {
        for (List<eSP> list : this.ryl) {
            if (!list.contains(eSP2)) continue;
            return true;
        }
        return false;
    }

    private List<eSP> h(eSP eSP2) {
        for (List<eSP> list : this.ryl) {
            for (eSP eSP3 : list) {
                if (!this.a(eSP2, eSP3)) continue;
                list.add(eSP2);
                this.aR(list);
                return list;
            }
        }
        return null;
    }

    boolean a(eSP eSP2, eSP eSP3) {
        if (eSP2.bci() != eSP3.bci()) {
            return false;
        }
        if (eSP2.bcC() != eSP3.bcC() && eSP2.bcD() != eSP3.bcD()) {
            return false;
        }
        return eSP2.aZw().A(eSP3.aZw()) <= 2;
    }

    private void i(eSP eSP2) {
        ArrayList<eSP> arrayList = new ArrayList<eSP>();
        arrayList.add(eSP2);
        this.ryl.add(arrayList);
    }

    @Override
    public void j(eSP eSP2) {
        this.k(eSP2);
        this.f(eSP2);
        this.zp();
    }

    void k(eSP eSP2) {
        List<eSP> list;
        Iterator<List<eSP>> iterator = this.ryl.iterator();
        Object object = null;
        while (iterator.hasNext()) {
            list = iterator.next();
            if (!list.contains(eSP2)) continue;
            object = list;
            this.aR(list);
            list.remove(eSP2);
            iterator.remove();
        }
        if (object == null) {
            return;
        }
        list = object.iterator();
        while (list.hasNext()) {
            eSP eSP3 = (eSP)list.next();
            this.f(eSP3);
        }
        this.zp();
    }

    private void aR(List<eSP> list) {
        if (list.size() >= 3) {
            this.ryn = true;
        }
    }

    @Override
    public List<List<eSP>> fMK() {
        return this.ryl;
    }

    @Override
    public void d(eSP eSP2) {
        this.f(eSP2);
        this.zp();
    }

    @Override
    public void e(eSP eSP2) {
        this.k(eSP2);
        this.zp();
    }

    @Override
    public void a(eUT eUT2) {
        this.rym = eUT2;
    }

    private void zp() {
        try {
            if (this.rym != null && this.ryn) {
                this.rym.a(this);
            }
        }
        catch (Exception exception) {
            ryj.error((Object)"Exception levee", (Throwable)exception);
        }
        finally {
            this.ryn = false;
        }
    }
}

