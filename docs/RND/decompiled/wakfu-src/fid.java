/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

public class fid {
    private final TLongObjectHashMap<fif> srr = new TLongObjectHashMap();

    public void a(ffV ffV2, long l, short s) {
        long l2 = ffV2.LV();
        if (this.srr.contains(l2)) {
            throw new fic("On add l'objet " + l2 + " d\u00e9j\u00e0 pr\u00e9sent dans les sacs");
        }
        this.srr.put(l2, (Object)new fie(ffV2, l, s));
    }

    public void tF(long l) {
        if (this.srr.contains(l) && this.srr.remove(l) instanceof fie) {
            return;
        }
        this.srr.put(l, (Object)new fih_0());
    }

    public void v(long l, short s) {
        fif fif2 = (fif)this.srr.get(l);
        if (fif2 == null) {
            this.srr.put(l, (Object)new fii_0(s));
            return;
        }
        if (fif2 instanceof fih_0) {
            throw new fic("On essaye de mettre \u00e0 jour l'objet " + l + " qui a d\u00e9j\u00e0 \u00e9t\u00e9 remove du sac");
        }
        ((fig)((Object)fif2)).al(s);
    }

    public void f(TLongObjectHashMap<fif> tLongObjectHashMap) {
        this.srr.putAll(tLongObjectHashMap);
    }

    public TLongObjectHashMap<fif> eAz() {
        return this.srr;
    }

    public void clean() {
        this.srr.clear();
    }
}

