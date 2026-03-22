/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.List;

/*
 * Renamed from akB
 */
public class akb_1 {
    private final int cDt;
    private final int cDu;
    private final int cDv;
    private final int cDw;
    private final int cDx;
    private final boolean cDy;
    private final List<alq_1> cDz;

    public akb_1(int n, int n2, int n3, int n4, int n5, boolean bl) {
        this(n, n2, n3, n4, n5, bl, Collections.emptyList());
    }

    public akb_1(int n, int n2, int n3, int n4, int n5, boolean bl, List<alq_1> list) {
        this.cDt = n;
        this.cDu = n2;
        this.cDv = n3;
        this.cDw = n4;
        this.cDx = n5;
        this.cDy = bl;
        this.cDz = list;
    }

    public int bha() {
        return this.cDt;
    }

    public int bBE() {
        return this.cDu;
    }

    public int getDuration() {
        return this.cDv;
    }

    public int bBF() {
        return this.cDw;
    }

    public int bBG() {
        return this.cDx;
    }

    public boolean bBD() {
        return this.cDy;
    }

    public List<alq_1> bBH() {
        return this.cDz;
    }
}

