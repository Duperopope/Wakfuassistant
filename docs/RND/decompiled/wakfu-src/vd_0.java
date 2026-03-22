/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from VD
 */
public class vd_0<O>
implements Iterable<vc_0<O>> {
    private final TIntObjectHashMap<vc_0<O>> bJo = new TIntObjectHashMap();

    public void a(vc_0<O> vc_02) {
        this.bJo.put(vc_02.d(), vc_02);
    }

    public final vc_0<O> pT(int n) {
        return (vc_0)this.bJo.get(n);
    }

    public final O pU(int n) {
        vc_0 vc_02 = (vc_0)this.bJo.get(n);
        if (vc_02 != null) {
            return (O)vc_02.bkx();
        }
        return null;
    }

    @Override
    @NotNull
    public Iterator<vc_0<O>> iterator() {
        return new azr_2<vc_0<O>>(this.bJo);
    }
}

