/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fDy
 */
public class fdy_1
extends faj_1 {
    public static final String TAG = "TextView";
    protected String ueO;

    @Override
    public fzq getAppearance() {
        return (fzq)this.uki;
    }

    public void tO(String string) {
        if (string == null) {
            string = "";
        }
        if (this.ugL != null) {
            this.ugL = this.ugL + string;
        } else {
            if (this.ueO == null) {
                this.ueO = "";
            }
            this.ueO = this.ueO + string;
        }
        this.setNeedsToPreProcess();
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public String getStyleTag() {
        return "textWidget";
    }

    @Override
    @Nullable
    public String setText(@Nullable Object object) {
        String string = super.setText(object);
        this.ueO = null;
        return string;
    }

    protected void guE() {
        if (this.ueO != null) {
            this.getTextBuilder().ua(this.ueO);
            this.guW();
            this.ueO = null;
        }
    }

    @Override
    public boolean LZ(int n) {
        this.guE();
        return super.LZ(n);
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fdy_1 fdy_12 = (fdy_1)fhi_22;
        if (this.ueO != null) {
            fdy_12.ueO = this.ueO;
        }
        super.a(fhi_22);
    }

    @Override
    public void aVI() {
        super.aVI();
        fzq fzq2 = fzq.checkOut();
        fzq2.setWidget(this);
        this.d(fzq2);
        this.setTextBuilder(new fgx_1(new fgh_2()));
        this.getTextBuilder().b(this);
        this.setMultiline(true);
    }

    @Override
    public boolean a(int n, String string, fic_1 fic_12) {
        if (n == 3556653) {
            this.tO(fic_12.a(string, this.nQt));
            return true;
        }
        return super.a(n, string, fic_12);
    }

    @Override
    public boolean g(int n, Object object) {
        if (n == 3556653) {
            this.tO(String.valueOf(object));
            return true;
        }
        return super.g(n, object);
    }
}

