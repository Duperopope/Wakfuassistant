/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class VO
extends aho_2 {
    private static final Logger bKr = Logger.getLogger(VO.class);

    public VO(int n, int n2) {
        super(n, n2);
    }

    @Override
    public final int bkR() {
        return this.getWidth() * this.getHeight();
    }

    @Override
    public final int au(int n, int n2) {
        if (n < 0 || n >= this.getWidth() || n2 < 0 || n2 >= this.getHeight()) {
            return -1;
        }
        return n + n2 * this.getWidth();
    }

    @Override
    public int qa(int n) {
        return n % this.getWidth();
    }

    @Override
    public int qb(int n) {
        return n / this.getWidth();
    }

    @Override
    public final ahl_2 av(int n, int n2) {
        int n3 = GC.B((float)n / (float)this.getWidth());
        int n4 = GC.B((float)n2 / (float)this.getHeight());
        return new ahl_2(n3, n4);
    }

    @Override
    public int aw(int n, int n2) {
        return GC.B((float)n / (float)this.getWidth());
    }

    @Override
    public int ax(int n, int n2) {
        return GC.B((float)n2 / (float)this.getHeight());
    }

    @Override
    public final ahl_2 ay(int n, int n2) {
        return new ahl_2(n * this.getWidth(), n2 * this.getHeight());
    }

    @Override
    public int az(int n, int n2) {
        return n * this.getWidth();
    }

    @Override
    public int aA(int n, int n2) {
        return n2 * this.getHeight();
    }

    @Override
    public byte bkS() {
        return 105;
    }
}

