/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from att
 */
public abstract class att_2 {
    private ArrayList<atq_1> dbN;
    private ArrayList<atq_1> dbO;

    public final boolean bLj() {
        return this.dbO != null;
    }

    public final int bLk() {
        return this.dbO.size();
    }

    public final atq_1 uv(int n) {
        return this.dbO.get(n);
    }

    public final boolean bLl() {
        return this.dbN != null;
    }

    public final int bLm() {
        return this.dbN.size();
    }

    public final atq_1 uw(int n) {
        return this.dbN.get(n);
    }

    public final void a(atq_1 atq_12) {
        if (this.dbN == null) {
            this.dbN = new ArrayList(1);
        }
        this.dbN.add(atq_12);
    }

    public final void b(atq_1 atq_12) {
        if (this.dbN == null) {
            return;
        }
        this.dbN.remove(atq_12);
    }

    public final void c(atq_1 atq_12) {
        if (this.dbO == null) {
            this.dbO = new ArrayList(1);
        }
        this.dbO.add(atq_12);
    }

    public final void d(atq_1 atq_12) {
        if (this.dbO == null) {
            return;
        }
        this.dbO.remove(atq_12);
    }

    protected final void bLn() {
        if (this.dbN != null) {
            this.dbN.clear();
            this.dbN = null;
        }
        if (this.dbO != null) {
            this.dbO.clear();
            this.dbO = null;
        }
    }
}

