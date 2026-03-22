/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from axk
 */
public class axk_2
extends ayy_2 {
    private ArrayList<awx_2> dpf;

    public axk_2(int n) {
        this.dpf = new ArrayList(n);
    }

    public axk_2(axk_2 axk_22) {
        this.dpf = new ArrayList(axk_22.dpf.size());
        this.dpf.addAll(axk_22.dpf);
    }

    public final int bQN() {
        return this.dpf.size();
    }

    public final awx_2 vi(int n) {
        return this.dpf.get(n);
    }

    public final void a(int n, awx_2 awx_22) {
        try {
            this.dpf.set(n, awx_22);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            this.dpf.add(n, awx_22);
        }
    }

    public final void a(awx_2 awx_22) {
        this.dpf.add(awx_22);
    }

    @Override
    protected void bLe() {
        this.dpf.clear();
        this.dpf = null;
    }
}

