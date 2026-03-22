/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bNp
 */
public class bnp_0
extends bno_0<fao>
implements fgf_0 {
    public static final String kCd = "quantity";
    @Nullable
    private final ffV kCe;

    public bnp_0(fao fao2) {
        super(fao2);
        this.kCe = fga_0.w(fao2.aaA());
    }

    @Override
    public Object eu(String string) {
        Object object = super.eu(string);
        if (object != null) {
            return object;
        }
        if (string.equals(kCd)) {
            return ((fao)this.kCc).fQY();
        }
        return this.kCe != null ? this.kCe.eu(string) : null;
    }

    @Override
    @Nullable
    public ffV getItem() {
        return this.kCe;
    }

    @Override
    protected int aeV() {
        return 0;
    }
}

