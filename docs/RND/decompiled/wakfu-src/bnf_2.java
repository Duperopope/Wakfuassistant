/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Strings;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bNf
 */
public class bnf_2
implements aeh_2 {
    private boolean bWn = false;
    private final int kAs;
    private final int kAt;
    @NotNull
    private final bmq_0 kAu;
    public static final String kAv = "state";
    public static final String kAw = "stateDescription";
    public static final String kAx = "selected";
    public static final String kAy = "weight";

    public bnf_2(int n, int n2, @NotNull bmq_0 bmq_02) {
        this.kAs = n;
        this.kAt = n2;
        this.kAu = bmq_02;
    }

    @Override
    public String[] bxk() {
        return new String[]{kAx, kAv, kAy};
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "selected": {
                return this.bWn;
            }
            case "state": {
                return this.kAu;
            }
            case "weight": {
                return this.kAt;
            }
            case "stateDescription": {
                String string2 = this.kAu.getDescription();
                if (!Strings.isNullOrEmpty((String)string2)) {
                    return string2;
                }
                List<String> list = this.kAu.b(eLN.qJn);
                if (list == null) {
                    return null;
                }
                return String.join((CharSequence)System.lineSeparator(), list);
            }
        }
        return null;
    }

    public boolean bqr() {
        return this.bWn;
    }

    public int efs() {
        return this.kAs;
    }

    public int aXY() {
        return this.kAt;
    }

    public void setSelected(boolean bl) {
        if (bl == this.bWn) {
            return;
        }
        this.bWn = bl;
        fse_1.gFu().a((aef_2)this, kAx);
    }

    public bmq_0 eft() {
        return this.kAu;
    }
}

