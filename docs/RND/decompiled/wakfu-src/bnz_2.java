/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

/*
 * Renamed from bnz
 */
class bnz_2
implements aeh_2 {
    public static final String iIR = "id";
    public static final String iIS = "name";
    public static final String iIT = "granted";
    private final long iIU;
    private final String iIV;
    private final String[] iIW = new String[]{"id", "name", "granted"};
    final /* synthetic */ bny_2 iIX;

    bnz_2(bny_2 bny_22, fnD fnD2) {
        this.iIX = bny_22;
        this.iIV = fnD2.getName();
        this.iIU = fnD2.Sn();
    }

    @Override
    public String[] bxk() {
        return this.iIW;
    }

    @Override
    public Object eu(String string) {
        if (string.equals(iIS)) {
            return this.iIV;
        }
        if (string.equals(iIR)) {
            return this.iIU;
        }
        if (string.equals(iIT)) {
            return this.iIX.iIP.us(this.iIU).b(fnB.Xq(this.iIX.iIO));
        }
        return null;
    }

    public void dzp() {
        fse_1.gFu().a((aef_2)this, iIT);
    }

    public String toString() {
        return "IndividualPermissionView{m_id=" + this.iIU + ", m_name='" + this.iIV + "', FIELDS=" + Arrays.toString(this.iIW) + "}";
    }
}

