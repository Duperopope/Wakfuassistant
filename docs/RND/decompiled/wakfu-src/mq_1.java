/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from MQ
 */
public class mq_1 {
    public static final mq_1 aXr = new mq_1();
    private final TIntObjectHashMap<mp_1> aXs = new TIntObjectHashMap();
    private final TIntObjectHashMap<mp_1> aXt = new TIntObjectHashMap();

    private mq_1() {
    }

    public void a(mp_1 mp_12) {
        this.aXs.put(mp_12.d(), (Object)mp_12);
        int n = mp_12.aVo();
        for (int i = 0; i < n; ++i) {
            this.aXt.put(mp_12.nL(i), (Object)mp_12);
        }
    }

    public mp_1 nM(int n) {
        return (mp_1)this.aXs.get(n);
    }

    public mp_1 nN(int n) {
        return (mp_1)this.aXt.get(n);
    }

    public String toString() {
        return "AchievementListManager{m_listsById=" + String.valueOf(this.aXs) + ", m_listsByAchievementId=" + String.valueOf(this.aXt) + "}";
    }
}

