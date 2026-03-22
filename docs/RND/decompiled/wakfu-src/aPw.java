/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public class aPw
implements aeh_2,
Iterable<apc_0> {
    public static final String ezf = "name";
    public static final String ezg = "type";
    public static final String ezh = "contentList";
    public static final String ezi = "onlineContentList";
    public static final String ezj = "offlineContentList";
    public static final String[] ezk = new String[]{"name", "type", "contentList", "onlineContentList", "offlineContentList"};
    private final aPz ezl;
    private final ArrayList<apc_0> ezm = new ArrayList();

    public aPw(aPz aPz2) {
        this.ezl = aPz2;
    }

    public void a(apc_0 apc_02) {
        if (!this.ezm.contains(apc_02)) {
            this.ezm.add(apc_02);
            fse_1.gFu().a((aef_2)this, ezh, ezi, ezj);
        }
    }

    public boolean b(apc_0 apc_02) {
        if (apc_02 != null) {
            if (this.ezl == aPz.ezn) {
                apc_02.eN(false);
            }
            this.ezm.remove(apc_02);
            fse_1.gFu().a((aef_2)this, ezh, ezi, ezj);
            return true;
        }
        return false;
    }

    public boolean x(Long l) {
        return this.b(this.y(l));
    }

    public boolean c(apc_0 apc_02) {
        return this.ezm.contains(apc_02);
    }

    public apc_0 ii(long l) {
        int n = this.ezm.size();
        for (int i = 0; i < n; ++i) {
            apc_0 apc_02 = this.ezm.get(i);
            if (apc_02.Sn() != l) continue;
            return apc_02;
        }
        return null;
    }

    public apc_0 d(apc_0 apc_02) {
        if (apc_02 == null) {
            return null;
        }
        int n = this.ezm.size();
        for (int i = 0; i < n; ++i) {
            apc_0 apc_03 = this.ezm.get(i);
            if (apc_02.getName().equalsIgnoreCase(apc_03.getName())) {
                return apc_03;
            }
            if (apc_02.xO().equalsIgnoreCase(apc_03.xO())) {
                return apc_03;
            }
            if (apc_02.Sn() == -1L || apc_02.Sn() != apc_03.Sn()) continue;
            return apc_03;
        }
        return null;
    }

    public apc_0 jj(String string) {
        int n = this.ezm.size();
        for (int i = 0; i < n; ++i) {
            apc_0 apc_02 = this.ezm.get(i);
            if (!apc_02.getName().equalsIgnoreCase(string)) continue;
            return apc_02;
        }
        return null;
    }

    public apc_0 y(Long l) {
        int n = this.ezm.size();
        for (int i = 0; i < n; ++i) {
            apc_0 apc_02 = this.ezm.get(i);
            if (apc_02.Sn() != l.longValue()) continue;
            return apc_02;
        }
        return null;
    }

    public apc_0 jk(String string) {
        int n = this.ezm.size();
        for (int i = 0; i < n; ++i) {
            apc_0 apc_02 = this.ezm.get(i);
            if (!apc_02.xO().equalsIgnoreCase(string)) continue;
            return apc_02;
        }
        return null;
    }

    @Override
    public String[] bxk() {
        return ezk;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(ezf)) {
            return this.ezl.getName();
        }
        if (string.equals(ezg)) {
            return this.ezl.aIi();
        }
        if (string.equals(ezh)) {
            ArrayList<Object> arrayList = new ArrayList();
            arrayList = apd_0.cAO().cAS() ? this.ezm : this.eI(true);
            arrayList.sort(new apx_0(this));
            return arrayList;
        }
        if (string.equals(ezi)) {
            return this.eI(true);
        }
        if (string.equals(ezj)) {
            return this.eI(false);
        }
        return null;
    }

    public void clear() {
        this.ezm.clear();
        fse_1.gFu().a((aef_2)this, ezh, ezi, ezj);
    }

    @Override
    @NotNull
    public Iterator<apc_0> iterator() {
        return this.ezm.iterator();
    }

    public List<apc_0> cAE() {
        return this.ezm;
    }

    public int cAF() {
        return this.ezm.size();
    }

    public void cAG() {
        for (apc_0 apc_02 : this.ezm) {
            apc_02.eK(false);
        }
    }

    public ArrayList<apc_0> eI(boolean bl) {
        ArrayList<apc_0> arrayList = new ArrayList<apc_0>();
        for (apc_0 apc_02 : this.ezm) {
            if ((!bl || !apc_02.cBt()) && (bl || apc_02.cBt())) continue;
            arrayList.add(apc_02);
        }
        arrayList.sort(new aPy(this));
        return arrayList;
    }
}

