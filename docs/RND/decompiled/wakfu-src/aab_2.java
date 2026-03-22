/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from aAB
 */
public class aab_2<L> {
    private final ArrayList<L> dwI = new ArrayList();
    private final ArrayList<L> dwJ = new ArrayList();
    private final aac_2<L> dwK;

    public aab_2(aac_2<L> aac_22) {
        this.dwK = aac_22;
    }

    public void bUe() {
        this.dwI.removeAll(this.dwJ);
        this.dwJ.clear();
        int n = this.dwI.size();
        for (int i = 0; i < n; ++i) {
            this.dwK.notify(this.dwI.get(i));
        }
    }

    public boolean aa(L l) {
        this.dwJ.remove(l);
        return !this.dwI.contains(l) && this.dwI.add(l);
    }

    public boolean ab(L l) {
        return !this.dwJ.contains(l) && this.dwJ.add(l);
    }

    public boolean contains(L l) {
        return this.dwI.contains(l) && !this.dwJ.contains(l);
    }

    public void clear() {
        this.dwI.clear();
        this.dwJ.clear();
    }

    public String toString() {
        return "ListenerHandler{m_listeners=" + this.dwI.size() + ", m_listenerToRemove=" + this.dwJ.size() + ", m_notifier=" + String.valueOf(this.dwK) + "}";
    }
}

