/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.lang.runtime.SwitchBootstraps;
import java.util.LinkedList;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bqn
 */
public class bqn_1
implements aeh_2 {
    private static final String iZt = "canGoBack";
    private static final String iZu = "canGoForward";
    public static final int iZv = 100;
    private static final int iZw = -1;
    private final LinkedList<bqp_1> iZx = new LinkedList();
    private int cxt = -1;

    public void a(bqp_1 bqp_12, boolean bl) {
        this.dEc();
        if (this.iZx.isEmpty() || !this.iZx.getLast().equals(bqp_12)) {
            if (this.iZx.size() == 100) {
                this.iZx.removeFirst();
            }
            this.iZx.add(bqp_12);
            if (bl) {
                this.cxt = this.iZx.size();
            }
            this.dEf();
        } else if (bl && this.iZx.getLast().equals(bqp_12)) {
            this.cxt = this.iZx.size();
            this.dEf();
        }
    }

    private void dEc() {
        int n = this.iZx.size() - 1 - this.cxt;
        for (int i = 0; i < n; ++i) {
            this.iZx.removeLast();
        }
    }

    public boolean dzY() {
        return !this.iZx.isEmpty() && this.cxt > 0;
    }

    public boolean dzZ() {
        return !this.iZx.isEmpty() && this.cxt < this.iZx.size() - 1;
    }

    public void dEd() {
        if (this.iZx.isEmpty()) {
            return;
        }
        if (this.cxt == 0) {
            return;
        }
        bqp_1 bqp_12 = this.iZx.get(this.cxt - 1);
        --this.cxt;
        cuj_2.eRB().b(bqp_12);
        this.dEf();
    }

    public void dEe() {
        if (this.iZx.isEmpty()) {
            return;
        }
        if (this.cxt == this.iZx.size() - 1) {
            return;
        }
        bqp_1 bqp_12 = this.iZx.get(this.cxt + 1);
        ++this.cxt;
        cuj_2.eRB().b(bqp_12);
        this.dEf();
    }

    public int aVo() {
        return this.iZx.size();
    }

    private void dEf() {
        fse_1.gFu().a((aef_2)this, iZt, iZu);
    }

    @Override
    @Nullable
    public Object eu(String string) {
        String string2 = string;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{iZt, iZu}, (Object)string2, n)) {
            case 0 -> this.dzY();
            case 1 -> this.dzZ();
            default -> null;
        };
    }

    @Override
    public String[] bxk() {
        return new String[]{iZt, iZu};
    }
}

