/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from bbI
 */
public abstract class bbi_0
implements aeh_2 {
    public static final String hAZ = "iconUrl";
    public static final String hBa = "description";
    public static final String hBb = "isKnown";
    public static final String hBc = "usable";
    public static final String[] hBd = new String[]{"iconUrl", "description", "isKnown", "usable"};
    protected boolean hBe;
    protected final int hBf;
    protected final String hBg;
    private boolean hBh;

    protected bbi_0(int n, String string) {
        this.hBf = n;
        this.hBg = string;
    }

    public int d() {
        return this.hBf;
    }

    public abstract String getName();

    public abstract String dah();

    public String bkG() {
        return this.hBg;
    }

    public String getDescription() {
        ahv_2 ahv_22 = new ahv_2();
        String string = Optional.ofNullable(this.getName()).orElse("");
        return ahv_22.ceu().c(string).cev().c(" (" + this.bkG() + ")").ceL();
    }

    public String dak() {
        ahv_2 ahv_22 = new ahv_2();
        String string = Optional.ofNullable(this.dah()).orElse("");
        return ahv_22.ceu().c(string).cev().c(" (" + this.bkG() + ")").ceL();
    }

    public abstract String byf();

    public void fj(boolean bl) {
        this.hBh = bl;
    }

    public boolean dal() {
        return this.hBh;
    }

    public boolean dam() {
        return this.hBe;
    }

    protected boolean isUsable() {
        return true;
    }

    @Override
    public String[] bxk() {
        return hBd;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(hAZ)) {
            return this.byf();
        }
        if (string.equals(hBa)) {
            return this.getDescription();
        }
        if (string.equals(hBb)) {
            return this.hBh;
        }
        if (string.equals(hBc)) {
            return this.isUsable();
        }
        return null;
    }
}

