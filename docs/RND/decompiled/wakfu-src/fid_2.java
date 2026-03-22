/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fId
 */
public class fid_2 {
    public static final String uAq = "MRU";
    private final HashSet<String> uAr = new HashSet();
    private final LinkedList<String> uAs = new LinkedList();
    private final ArrayList<fig_2> uAt = new ArrayList();

    public void vs(String string) {
        this.uAr.add(string);
    }

    public void vt(String string) {
        this.uAr.remove(string);
    }

    public void vu(String string) {
        this.vt(string);
        this.uAs.remove(string);
    }

    public void a(fig_2 fig_22) {
        if (fig_22 != null) {
            this.uAt.add(fig_22);
        }
    }

    public void b(fig_2 fig_22) {
        if (fig_22 != null) {
            this.uAt.remove(fig_22);
        }
    }

    public void M(String string, boolean bl) {
        if (string == null || this.vv(string)) {
            return;
        }
        if (bl || !this.uAs.contains(string)) {
            this.uAs.addFirst(string);
        }
        this.bnM();
    }

    private void bnM() {
        ArrayList<String> arrayList = new ArrayList<String>(this.uAs.size());
        Iterator<fes_2> iterator = fbj_1.getInstance().getLayeredContainer().getAllWidgetIterator();
        while (iterator.hasNext()) {
            String string;
            fes_2 fes_22 = iterator.next();
            if (fes_22.getElementMap() == null || !this.uAs.contains(string = fes_22.getElementMap().getId()) || arrayList.contains(string)) continue;
            arrayList.add(string);
        }
        this.uAs.clear();
        this.uAs.addAll(arrayList);
    }

    public int aVo() {
        return this.uAs.size();
    }

    public fif_2 eJH() {
        int n;
        for (int i = n = this.uAs.size() - 1; i >= 0; --i) {
            String string = this.uAs.remove(i);
            if (string == null || !fyw_0.gqw().to(string)) continue;
            boolean bl = false;
            block5: for (int j = this.uAt.size() - 1; j >= 0; --j) {
                fif_2 fif_22 = this.uAt.get(j).onDialogCloseRequest(string);
                switch (fif_22) {
                    case uAv: {
                        continue block5;
                    }
                    case uAw: {
                        bl = true;
                        this.uAs.addLast(string);
                        continue block5;
                    }
                    default: {
                        this.uAs.addFirst(string);
                        return fif_22;
                    }
                }
            }
            if (bl || this.vv(string)) continue;
            fyw_0.gqw().tl(string);
            return fif_2.uAv;
        }
        return fif_2.uAx;
    }

    public boolean vv(String string) {
        return string.startsWith(uAq) || this.uAr.contains(string);
    }

    @Nullable
    public String gBt() {
        if (this.uAs.isEmpty()) {
            return null;
        }
        return this.uAs.getLast();
    }

    @Nullable
    public String gBu() {
        if (this.uAs.isEmpty()) {
            return null;
        }
        return this.uAs.getFirst();
    }
}

