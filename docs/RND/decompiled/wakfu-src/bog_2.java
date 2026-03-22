/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bOg
 */
public class bog_2
implements aeh_2,
cyg_1 {
    public static final String kJP = "name";
    public static final String kJQ = "isNew";
    public static final String kJR = "isLaunched";
    private final bqt_0 kJS;
    private boolean iwO;

    public bog_2(bqt_0 bqt_02) {
        this.kJS = bqt_02;
    }

    @Override
    public String[] bxk() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(kJP)) {
            return this.getName();
        }
        if (string.equals(kJQ)) {
            return this.iwO;
        }
        if (string.equals(kJR)) {
            return this.dil();
        }
        return null;
    }

    public String getName() {
        return this.kJS.bAD();
    }

    public void gw(boolean bl) {
        this.iwO = bl;
    }

    public void egG() {
        cye_1.eYk().a(this);
        this.kJS.bGy();
    }

    public boolean dil() {
        bok_2 bok_22 = (bok_2)fse_1.gFu().vY("tutorialMessageView");
        return this.a(bok_22);
    }

    private boolean a(bok_2 bok_22) {
        return bok_22 != null && bok_22.bAD().equals(this.getName());
    }

    @Override
    public void b(bok_2 bok_22) {
        if (!this.a(bok_22)) {
            return;
        }
        fse_1.gFu().a((aef_2)this, kJR);
        cye_1.eYk().b(this);
    }

    @Override
    public void c(bok_2 bok_22) {
        if (!this.a(bok_22)) {
            return;
        }
        fse_1.gFu().a((aef_2)this, kJR);
    }
}

