/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

/*
 * Renamed from fJU
 */
public class fju_1
extends fjs_2
implements alw_2,
alx_2 {
    public static final String TAG = "isDialogLoaded";
    public static final String uFe = "dialogLoaded";
    private boolean ciW = false;

    @Override
    public String getTag() {
        return TAG;
    }

    private void gCN() {
        if (this.aGT == null) {
            this.ciW = false;
            return;
        }
        this.ciW = fyw_0.gqw().to(String.valueOf(this.aGT));
    }

    @Override
    public void gCJ() {
        this.gCN();
        super.gCJ();
    }

    @Override
    public boolean isValid(Object object) {
        return this.ciW;
    }

    @Override
    public void eX(String string) {
        if (!Objects.equals(string, this.aGT)) {
            return;
        }
        this.gCJ();
    }

    @Override
    public void dialogUnloaded(String string) {
        if (!Objects.equals(string, this.aGT)) {
            return;
        }
        this.gCJ();
    }

    @Override
    public void aVI() {
        super.aVI();
        this.gCN();
        fyw_0.gqw().a(this);
        fyw_0.gqw().a(this);
    }

    @Override
    public void aVH() {
        super.aVH();
        fyw_0.gqw().b(this);
        fyw_0.gqw().b(this);
    }
}

