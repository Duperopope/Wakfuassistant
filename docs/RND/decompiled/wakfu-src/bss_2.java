/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;

/*
 * Renamed from bSs
 */
public class bss_2
implements aeh_2 {
    public static final String lgy = "nations";
    public static final bss_2 lgz = new bss_2();
    private final Collection<bso_2> lgA = new ArrayList<bso_2>();
    private final TIntObjectHashMap<bso_2> lgB = new TIntObjectHashMap();

    private bss_2() {
        this.b(new bso_2(30));
        this.b(new bso_2(31));
        this.b(new bso_2(32));
        this.b(new bso_2(33));
    }

    private void b(bso_2 bso_22) {
        this.lgA.add(bso_22);
        this.lgB.put(bso_22.Xt(), (Object)bso_22);
    }

    public bso_2 Jt(int n) {
        return (bso_2)this.lgB.get(n);
    }

    @Override
    public String[] bxk() {
        return dGM;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(lgy)) {
            return this.lgA;
        }
        return null;
    }

    public String toString() {
        return "NationsView{m_nations=" + String.valueOf(this.lgA) + ", m_nationsById=" + String.valueOf(this.lgB) + "}";
    }
}

