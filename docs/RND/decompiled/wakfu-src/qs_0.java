/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;
import org.apache.log4j.Logger;

/*
 * Renamed from Qs
 */
public class qs_0
implements ayx_2 {
    private static final Logger bfv = Logger.getLogger(qs_0.class);
    private final BitSet bfw = new BitSet();
    private final HashSet<qu_0> bfx = new HashSet();
    private int bfy = 0;
    private static final ayv_2 bfz = new ayv_2(new qt_0());

    public static qs_0 baq() {
        qs_0 qs_02;
        try {
            qs_02 = (qs_0)bfz.borrowObject();
        }
        catch (Exception exception) {
            qs_02 = new qs_0();
            bfv.error((Object)("Erreur de checkout : " + exception.getMessage()));
        }
        return qs_02;
    }

    public void a(BitSet bitSet) {
        this.bfw.or(bitSet);
    }

    public void b(Collection<qu_0> collection) {
        this.bfx.addAll(collection);
    }

    public void a(qu_0 qu_02) {
        this.bfx.add(qu_02);
    }

    public void bar() {
        ++this.bfy;
    }

    public BitSet bas() {
        return this.bfw;
    }

    public HashSet<qu_0> bat() {
        return this.bfx;
    }

    public void a(qs_0 qs_02) {
        if (qs_02 == null) {
            return;
        }
        this.a(qs_02.bas());
        this.b(qs_02.bat());
        this.bfy += qs_02.bau();
    }

    public int bau() {
        return this.bfy;
    }

    public void clear() {
        this.bfy = 0;
        this.bfx.clear();
        this.bfw.clear();
    }

    public void aZp() {
        if (bfz != null) {
            try {
                bfz.returnObject(this);
            }
            catch (Exception exception) {
                bfv.error((Object)("Impossible de retourner l'\u00e9v\u00e9nement " + String.valueOf(this) + " au pool"), (Throwable)exception);
            }
        } else {
            this.aVH();
        }
    }

    @Override
    public void aVI() {
        this.bfy = 0;
    }

    @Override
    public void aVH() {
        this.bfw.clear();
        this.bfx.clear();
    }
}

