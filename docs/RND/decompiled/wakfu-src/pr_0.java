/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from PR
 */
public abstract class pr_0 {
    private List<pu_0> aRj = null;

    public abstract int aYB();

    public abstract int aYC();

    public abstract int aYD();

    public abstract int aYE();

    public abstract int aYF();

    public abstract int oo(int var1);

    public abstract int aYG();

    public abstract void op(int var1);

    public abstract int nt(int var1);

    public abstract int oq(int var1);

    public abstract int or(int var1);

    public abstract int os(int var1);

    public abstract void ot(int var1);

    public abstract void ou(int var1);

    public abstract void aYH();

    public boolean aYI() {
        return this.aYB() > 0;
    }

    public boolean aYJ() {
        return this.aYB() < 0;
    }

    public boolean aYK() {
        return this.aYB() == 0;
    }

    public boolean aYL() {
        return this.aYB() != 0;
    }

    public boolean aYM() {
        return this.aYC() >= this.aYD();
    }

    public boolean aYN() {
        return this.aYC() <= this.aYF();
    }

    public void aYO() {
        this.op(this.aYD());
    }

    public void aYP() {
        this.op(this.aYF());
    }

    public abstract pt_0 aYQ();

    public void i(List<pu_0> list) {
        if (list == null) {
            return;
        }
        if (this.aRj == null) {
            this.aRj = new ArrayList<pu_0>();
            this.aRj.addAll(list);
        } else {
            this.aYS();
            this.aRj.addAll(list);
        }
    }

    public void a(pu_0 pu_02) {
        if (this.aRj == null) {
            this.aRj = new ArrayList<pu_0>();
            this.aRj.add(pu_02);
        } else if (!this.aRj.contains(pu_02)) {
            this.aRj.add(pu_02);
        }
    }

    public void b(pu_0 pu_02) {
        if (this.aRj != null) {
            this.aRj.remove(pu_02);
        }
    }

    public List<pu_0> aYR() {
        return this.aRj;
    }

    public void aYS() {
        if (this.aRj != null) {
            this.aRj.clear();
        }
    }

    public void aYT() {
        if (this.aRj != null && !this.aRj.isEmpty()) {
            for (pu_0 pu_02 : this.aRj) {
                pu_02.a(this);
            }
        }
    }
}

