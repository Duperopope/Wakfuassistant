/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from fiG
 */
public class fig_0 {
    private static final Logger ssE = Logger.getLogger(fig_0.class);
    public static final fig_0 ssF = new fig_0();
    private final TIntObjectHashMap<fie_0> ssG = new TIntObjectHashMap();

    public void a(fie_0 fie_02) {
        this.ssG.put(fie_02.d(), (Object)fie_02);
    }

    public void a(fia_0 fia_02, boolean bl) {
        TIntObjectIterator tIntObjectIterator = this.ssG.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fia_02.a(new fid_0((fie_0)tIntObjectIterator.value()));
        }
        if (bl) {
            fia_02.a(new fid_0(fiz_0.ssq));
        }
    }

    public void b(fic_0 fic_02, int n) {
        fic_02.dmD().GE(n);
    }

    public void c(fic_0 fic_02, int n) {
        fic_02.dmD().VW(n);
    }

    public boolean Qh(int n) {
        fie_0 fie_02 = (fie_0)this.ssG.get(n);
        if (fie_02 == null) {
            ssE.warn((Object)("[LOCK] On essaye de r\u00e9cup\u00e9rer l'\u00e9tat d'un verrou inexistant id=" + n), (Throwable)new Exception());
            return false;
        }
        if (fie_02.fZQ().bjv()) {
            return false;
        }
        ux_0 ux_02 = ue_0.bjV().bjc();
        return ux_02.g(fie_02.fZQ());
    }

    public boolean VY(int n) {
        fie_0 fie_02 = (fie_0)this.ssG.get(n);
        if (fie_02 == null) {
            ssE.warn((Object)("[LOCK] On essaye de r\u00e9cup\u00e9rer l'\u00e9tat d'un verrou inexistant id=" + n), (Throwable)new Exception());
            return false;
        }
        return fie_02.fZR();
    }

    public int VZ(int n) {
        TIntObjectIterator tIntObjectIterator = this.ssG.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            fie_0 fie_02 = (fie_0)tIntObjectIterator.value();
            if (fie_02.fZN() != n) continue;
            return fie_02.d();
        }
        return -1;
    }
}

