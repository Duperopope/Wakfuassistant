/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fgm
 */
public class fgm_0
implements eNl {
    public static final short sje = 0;
    public static final short sjf = 0;
    public static final short sjg = 0;
    private final ArrayList<enk_0> sjh = new ArrayList();
    private final short sji;
    private final short sjj;

    public fgm_0(short s, short s2) {
        this.sjj = s;
        this.sji = s2;
    }

    public short fWY() {
        return this.sjj;
    }

    @Override
    public short cmL() {
        return 0;
    }

    @Override
    public int bab() {
        return 14;
    }

    @Override
    public long QF() {
        return this.sji;
    }

    @Override
    @NotNull
    public Iterator<enk_0> iterator() {
        return this.sjh.iterator();
    }

    public void v(enk_0 enk_02) {
        this.sjh.add(enk_02);
    }

    public int fWZ() {
        return this.sjh.size();
    }

    @Override
    public short fvT() {
        return 0;
    }

    @Override
    public short fvU() {
        return 0;
    }

    @Override
    public short fvV() {
        return 0;
    }
}

