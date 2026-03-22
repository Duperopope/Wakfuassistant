/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from alP
 */
public class alp_1<SoundParam extends alq_1> {
    public static final int cGj = -1;
    private final int cGk;
    private final boolean cGl;
    private final List<SoundParam> cGm;

    public alp_1(boolean bl, List<SoundParam> list) {
        this(-1, bl, list);
    }

    public alp_1(int n, List<SoundParam> list) {
        this(n, true, list);
    }

    public alp_1(int n, boolean bl, List<SoundParam> list) {
        this.cGk = n;
        this.cGl = bl;
        this.cGm = list;
    }

    public int bCe() {
        return this.cGk;
    }

    public boolean bBY() {
        return this.cGl;
    }

    public List<SoundParam> bBH() {
        return this.cGm;
    }
}

