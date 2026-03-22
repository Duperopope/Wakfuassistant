/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from bEM
 */
public interface bem_0
extends bdz_0 {
    public static final String jRp = "collapsedView";

    public aeb_1 bCh();

    public String dbL();

    default public Optional<Boolean> dSJ() {
        aeb_1 aeb_12 = this.bCh();
        if (aeb_12 != null) {
            return Optional.of(aeb_12.aK(this.dbL()));
        }
        return Optional.empty();
    }

    default public void dSK() {
        aeb_1 aeb_12 = this.bCh();
        if (aeb_12 != null) {
            aeb_12.d(this.dbL(), this.dbK());
        }
    }
}

