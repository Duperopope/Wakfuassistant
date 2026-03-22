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
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/*
 * Renamed from fiA
 */
public class fia_0 {
    private static final Logger ssr = Logger.getLogger(fia_0.class);
    private final TIntObjectHashMap<fid_0> sss = new TIntObjectHashMap();
    private final List<fib_0> sst = new ArrayList<fib_0>();
    private final uw_0 ssu = new uw_0(0, 0, 0, 0, 0, 0);
    private static List<Long> ssv;

    public static void fZS() {
        ssv = ewo_0.oBF.o(ewr_0.oDf);
    }

    public static boolean VN(int n) {
        return ssv != null && ssv.contains(n);
    }

    public void a(fid_0 fid_02) {
        this.sss.put(fid_02.d(), (Object)fid_02);
    }

    public void VO(int n) {
        this.sss.remove(n);
    }

    public boolean VP(int n) {
        return this.sss.containsKey(n);
    }

    public void a(fib_0 fib_02) {
        if (!this.sst.contains(fib_02)) {
            this.sst.add(fib_02);
        }
    }

    public void b(fib_0 fib_02) {
        this.sst.remove(fib_02);
    }

    public fif_0 VQ(int n) {
        return (fif_0)this.sss.get(n);
    }

    public void fW(int n, int n2) {
        fid_0 fid_02 = (fid_0)this.sss.get(n);
        if (fid_02 == null) {
            ssr.warn((Object)("[LOCK] On essaye de modifier un Lock inconnu id=" + n));
            return;
        }
        fid_02.VX(n2);
    }

    public void e(int n, ux_0 ux_02) {
        fid_0 fid_02 = (fid_0)this.sss.get(n);
        if (fid_02 == null) {
            ssr.warn((Object)("[LOCK] On essaye de modifier un Lock inconnu id=" + n));
            return;
        }
        fid_02.Y(ux_02);
    }

    public void f(int n, ux_0 ux_02) {
        fid_0 fid_02 = (fid_0)this.sss.get(n);
        if (fid_02 == null) {
            ssr.warn((Object)("[LOCK] On essaye de modifier un Lock inconnu id=" + n));
            return;
        }
        fid_02.W(ux_02);
    }

    public void a(int n, ux_0 ux_02, ux_0 ux_03) {
        fid_0 fid_02 = (fid_0)this.sss.get(n);
        if (fid_02 == null) {
            ssr.warn((Object)("[LOCK] On essaye de modifier un Lock inconnu id=" + n));
            return;
        }
        fid_02.W(ux_02);
        fid_02.X(ux_03);
    }

    public boolean Qh(int n) {
        fif_0 fif_02 = (fif_0)this.sss.get(n);
        if (fif_02 == null) {
            ssr.warn((Object)("[LOCK] On essaye de v\u00e9rifier qu'un Lock inconnu est actif id=" + n));
            return false;
        }
        ux_0 ux_02 = ue_0.bjV().bjc();
        if (fia_0.a(fif_02, ux_02)) {
            return true;
        }
        if (this.VS(n)) {
            return true;
        }
        return this.a(fif_02, ux_02);
    }

    public boolean VR(int n) {
        fif_0 fif_02 = (fif_0)this.sss.get(n);
        if (fif_02 == null) {
            ssr.warn((Object)("[LOCK] On essaye de v\u00e9rifier qu'un Lock inconnu est actif id=" + n));
            return false;
        }
        ux_0 ux_02 = ue_0.bjV().bjc();
        return this.a(fif_02, ux_02);
    }

    public boolean VS(int n) {
        return this.fZT() && !fia_0.VN(n);
    }

    private boolean fZT() {
        fid_0 fid_02 = (fid_0)this.sss.get(-1);
        if (fid_02 == null) {
            return false;
        }
        ux_0 ux_02 = ue_0.bjV().bjc();
        return this.a(fid_02, ux_02);
    }

    private boolean a(fif_0 fif_02, ux_0 ux_02) {
        if (!fif_02.fZO().aYI()) {
            return false;
        }
        if (fif_02.eBR().bjv()) {
            return false;
        }
        ux_0 ux_03 = ux_02.a(fif_02.fZP(), fif_02.fZO());
        this.ssu.f(fif_02.eBR());
        return ux_03.h(this.ssu);
    }

    public boolean VT(int n) {
        fif_0 fif_02 = (fif_0)this.sss.get(n);
        if (fif_02 == null) {
            ssr.warn((Object)("[LOCK] On essaye de v\u00e9rifier qu'un Lock inconnu est actif id=" + n));
            return false;
        }
        ux_0 ux_02 = ue_0.bjV().bjc();
        return fia_0.a(fif_02, ux_02);
    }

    private static boolean a(fie_0 fie_02, ux_0 ux_02) {
        return !fie_02.fZQ().bjv() && ux_02.g(fie_02.fZQ());
    }

    public ux_0 VU(int n) {
        fif_0 fif_02 = (fif_0)this.sss.get(n);
        if (fif_02 == null) {
            ssr.warn((Object)("[LOCK] On essaye de v\u00e9rifier qu'un Lock inconnu est actif id=" + n));
            return uw_0.bju();
        }
        ux_0 ux_02 = ue_0.bjV().bjc();
        return ux_02.a(fif_02.fZP(), fif_02.fZO(), true);
    }

    public int VV(int n) {
        fif_0 fif_02 = (fif_0)this.sss.get(n);
        if (fif_02 == null) {
            ssr.warn((Object)("[LOCK] On essaye de v\u00e9rifier qu'un Lock inconnu est actif id=" + n));
            return 0;
        }
        if (fif_02.cqm() == 0) {
            return 0;
        }
        uw_0 uw_02 = ue_0.bjV().bjm();
        if (fif_02.fZO().aYI() && !fif_02.fZU().bjv()) {
            ux_0 ux_02 = uw_02.a(fif_02.fZP(), fif_02.fZO());
            this.ssu.f(fif_02.fZU());
            if (!ux_02.h(this.ssu)) {
                return 0;
            }
        }
        return fif_02.eBS();
    }

    public void GE(int n) {
        fid_0 fid_02 = (fid_0)this.sss.get(n);
        if (fid_02 == null) {
            ssr.warn((Object)("[LOCK] On essaye de verrouiller un Lock inconnu id=" + n));
            return;
        }
        uw_0 uw_02 = ue_0.bjV().bjm();
        fid_02.W(uw_02);
        int n2 = this.sst.size();
        for (int i = 0; i < n2; ++i) {
            this.sst.get(i).c(n, uw_02);
        }
    }

    public void VW(int n) {
        fid_0 fid_02 = (fid_0)this.sss.get(n);
        if (fid_02 == null) {
            ssr.warn((Object)("[LOCK] On essaye de verrouiller un Lock inconnu id=" + n));
            return;
        }
        this.b(fid_02);
    }

    private void b(fid_0 fid_02) {
        int n = fid_02.d();
        uw_0 uw_02 = ue_0.bjV().bjm();
        if (fid_02.fZO().aYI() && !fid_02.fZU().bjv()) {
            ux_0 ux_02 = uw_02.a(fid_02.fZP(), fid_02.fZO());
            this.ssu.f(fid_02.fZU());
            if (!ux_02.h(this.ssu)) {
                fid_02.fZW();
            }
        }
        fid_02.fZV();
        fid_02.Y(uw_02);
        int n2 = this.sst.size();
        for (int i = 0; i < n2; ++i) {
            this.sst.get(i).a(n, fid_02.eBS(), fid_02.fZU());
        }
        if (fid_02.eBS() >= fid_02.cqm()) {
            this.GE(n);
        }
    }

    public TIntObjectIterator<fid_0> ekN() {
        return this.sss.iterator();
    }

    public void bmX() {
        this.sss.clear();
        this.sst.clear();
    }

    static {
        fia_0.fZS();
        ewo_0.oBF.a((ewr_0 ewr_02, Object object) -> {
            if (ewr_02 != ewr_0.oDf) {
                return;
            }
            fia_0.fZS();
        });
    }
}

