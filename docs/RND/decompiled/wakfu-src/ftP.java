/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class ftP
implements eNl {
    protected static final Logger tgF = Logger.getLogger(ftP.class);
    private final int tgG;
    private final long tgH;
    private final ang_2 tgI;
    private final ArrayList<enk_0> tgJ = new ArrayList();

    public ftP(int n, long l, ang_2 ang_22) {
        this.tgG = n;
        this.tgH = l;
        this.tgI = ang_22;
    }

    @Override
    public final int bab() {
        return 18;
    }

    @Override
    public final long QF() {
        return this.tgG;
    }

    public final int gmD() {
        return this.tgG;
    }

    public final long gmE() {
        return this.tgH;
    }

    public final boolean gmF() {
        return this.tgH <= 0L;
    }

    public final ang_2 gmG() {
        return this.tgI;
    }

    public final void C(enk_0 enk_02) {
        this.tgJ.add(enk_02);
    }

    @Override
    public final Iterator<enk_0> iterator() {
        return this.tgJ.iterator();
    }

    @Override
    public final short cmL() {
        return 0;
    }

    @Override
    public final short fvT() {
        return 0;
    }

    @Override
    public final short fvU() {
        return 0;
    }

    @Override
    public final short fvV() {
        return 0;
    }
}

