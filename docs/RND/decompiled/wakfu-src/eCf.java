/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import com.ankama.wakfu.utils.criterion.doc.Criterion;
import com.ankama.wakfu.utils.criterion.doc.Parameter;
import com.ankama.wakfu.utils.criterion.doc.Signature;
import com.ankama.wakfu.utils.criterion.doc.VarType;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

@Criterion(description="Return a global variable value related to the key, returns -1 if an error occurs", signatures={@Signature(description="Return the global variable value (as specified type)", params={@Parameter(name="type (see GlobalVariableType enum for available types)", type=VarType.NUMBER), @Parameter(name="key (see GlobalVariable enum for available keys)", type=VarType.STRING)}), @Signature(description="Return the global variable value (as its associed type)", params={@Parameter(name="key (see GlobalVariable enum for available keys)", type=VarType.STRING)})})
public class eCf
extends eak_0 {
    private static final ArrayList<amz_1[]> pyG = new ArrayList();
    @Nullable
    private final ext_1 pyH;
    @Nullable
    private final exp_1 pyI;

    public eCf(ArrayList<amx_1> arrayList) {
        if (arrayList.size() == 1) {
            String string = ((anh_2)arrayList.get(0)).getValue();
            this.pyI = exp_1.ss(string).orElse(null);
            if (this.pyI == null) {
                pwx.error((Object)String.format("Unknown %s with following key : %s", exp_1.class, string));
                this.pyH = null;
            } else {
                this.pyH = this.pyI.fOX();
            }
        } else if (arrayList.size() == 2) {
            byte by = (byte)((amu_1)arrayList.get(0)).d(null, null, null, null);
            this.pyH = ext_1.fQ(by).orElse(null);
            if (this.pyH == null) {
                pwx.error((Object)String.format("Unknown %s with following id : %s", ext_1.class, by));
            }
            String string = ((anh_2)arrayList.get(1)).getValue();
            this.pyI = exp_1.ss(string).orElse(null);
            if (this.pyI == null) {
                pwx.error((Object)String.format("Unknown %s with following key : %s", exp_1.class, string));
            }
        } else {
            pwx.error((Object)String.format("No enough arguments specified for this %s. Defaulting without %s & %s", eak_0.class, exp_1.class, ext_1.class));
            this.pyI = null;
            this.pyH = null;
        }
    }

    @Override
    protected List<amz_1[]> bDC() {
        return pyG;
    }

    @Override
    public boolean bDo() {
        return true;
    }

    @Override
    public long d(Object object, Object object2, Object object3, Object object4) {
        if (this.pyI == null) {
            return -1L;
        }
        ext_1 ext_12 = this.pyH;
        int n = 0;
        return switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"BOOLEAN", "BYTE", "SHORT", "INTEGER", "LONG"}, (ext_1)ext_12, n)) {
            default -> throw new MatchException(null, null);
            case 0 -> {
                if (exu_1.rJd.a(this.pyI).booleanValue()) {
                    yield 1L;
                }
                yield 0L;
            }
            case 1 -> exu_1.rJd.b(this.pyI).byteValue();
            case 2 -> exu_1.rJd.c(this.pyI).shortValue();
            case 3 -> exu_1.rJd.d(this.pyI).intValue();
            case 4 -> exu_1.rJd.e(this.pyI);
            case -1 -> -1L;
        };
    }

    @Override
    public Enum bDq() {
        return ehq_0.pHz;
    }

    static {
        pyG.add(new amz_1[]{amz_1.cJx});
        pyG.add(new amz_1[]{amz_1.cJy, amz_1.cJx});
    }
}

