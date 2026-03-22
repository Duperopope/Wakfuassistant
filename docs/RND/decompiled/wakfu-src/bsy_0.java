/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bsy
 */
public class bsy_0
implements aeh_2,
bek_0 {
    public static final String jhd = "iconUrl";
    public static final String jhe = "quantity";
    public static final String jhf = "name";
    public static final String jhg = "item";
    private bgv_2 iDU;
    private int ejM;
    public static final String[] jhh = new String[]{"iconUrl"};

    @Override
    public bgv_2 duo() {
        return this.iDU;
    }

    public void o(bgv_2 bgv_22) {
        this.iDU = bgv_22;
    }

    public void Fq(int n) {
        this.ejM = n;
    }

    public bsy_0(bgv_2 bgv_22, int n) {
        this.iDU = bgv_22;
        this.ejM = n;
    }

    public bsy_0() {
    }

    @Override
    public String[] bxk() {
        return jhh;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "iconUrl": {
                return auc_0.cVq().zx(this.iDU.aVt());
            }
            case "quantity": {
                return this.ejM;
            }
            case "item": {
                return this.iDU;
            }
            case "name": {
                return this.iDU.getName();
            }
        }
        return null;
    }
}

