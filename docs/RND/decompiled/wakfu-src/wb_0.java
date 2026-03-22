/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.set.hash.TIntHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from Wb
 */
public class wb_0 {
    private static final Logger bMc = Logger.getLogger(wb_0.class);
    private final TIntHashSet bMd = new TIntHashSet();

    public void b(String string, long l) {
        try {
            assert (this.bMd.isEmpty());
            byte[] byArray = apr_1.by(String.format(string, l));
            ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
            int n = byArray.length / 4;
            for (int i = 0; i < n; ++i) {
                this.bMd.add(byteBuffer.getInt());
            }
        }
        catch (Throwable throwable) {
            bMc.error((Object)("probl\u00e8me de lecture des coordonn\u00e9es de maps valides worldId=" + l), throwable);
        }
    }

    public boolean aI(int n, int n2) {
        return this.bMd.contains(GC.t(n, n2));
    }

    public void clear() {
        this.bMd.clear();
    }

    public void h(short s, short s2) {
        this.bMd.add(GC.t(s, s2));
    }

    public void a(TIntProcedure tIntProcedure) {
        this.bMd.forEach(tIntProcedure);
    }
}

