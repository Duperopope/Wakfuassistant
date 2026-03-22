/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;

public abstract class biX
extends bih_0 {
    protected final ArrayList<exf_2> imX = new ArrayList();

    public biX(exf_2 exf_22, bim_0 bim_02, exf_2 ... exf_2Array) {
        this(exf_22, bim_02, -1, exf_2Array);
    }

    public biX(exf_2 exf_22, bim_0 bim_02, byte by, exf_2 ... exf_2Array) {
        super(exf_22, by, bim_02);
        this.imX.addAll(Arrays.asList(exf_2Array));
        int n = this.imX.size();
        for (int i = 0; i < n; ++i) {
            this.imX.get(i).a(this);
        }
    }

    @Override
    protected int dqv() {
        int n = 0;
        int n2 = this.imX.size();
        for (int i = 0; i < n2; ++i) {
            n += this.imX.get(i).aYB();
        }
        return n;
    }

    @Override
    protected int dqw() {
        int n = 0;
        int n2 = this.imX.size();
        for (int i = 0; i < n2; ++i) {
            n += this.imX.get(i).aYD();
        }
        return n;
    }
}

