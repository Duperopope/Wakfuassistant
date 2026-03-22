/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Objects;

/*
 * Renamed from fJN
 */
public class fjn_1
extends fha_2
implements fjj_2 {
    public static final String TAG = "ValueReplacer";
    protected fjl_2 uEV;
    private fzr_0 uEW = null;
    private String axs = null;
    private Object uEX = null;
    private boolean uEY = false;
    public static final int uEZ = 111972721;
    public static final int uFa = 106079;
    public static final int uFb = 1066879900;
    public static final int uFc = -92096604;

    @Override
    public String getTag() {
        return TAG;
    }

    public fzr_0 getKey() {
        return this.uEW;
    }

    public void setKey(fzr_0 fzr_02) {
        if (this.uEW == fzr_02) {
            return;
        }
        this.uEW = fzr_02;
        this.gCL();
    }

    public String getValue() {
        return this.axs;
    }

    public void setValue(String string) {
        if (Objects.equals(this.axs, string)) {
            return;
        }
        this.axs = string;
        this.gCL();
    }

    public Object getObjectUsed() {
        return this.uEX;
    }

    public void setObjectUsed(Object object) {
        if (this.uEX == object) {
            return;
        }
        this.uEX = object;
        this.gCL();
    }

    public boolean gCM() {
        return this.uEY;
    }

    public void setWhenObjectUsedNotNull(boolean bl) {
        if (this.uEY == bl) {
            return;
        }
        this.uEY = bl;
        this.gCL();
    }

    private void gCL() {
        if (this.uEV != null) {
            this.uEV.a(this);
        }
    }

    @Override
    public void setResultProviderParent(fjl_2 fjl_22) {
        this.uEV = fjl_22;
    }

    @Override
    public Object getResult(Object object) {
        if (this.uEW == null) {
            return null;
        }
        boolean bl = this.uEX != null;
        Object object2 = bl ? this.uEX : object;
        switch (this.uEW) {
            case tKo: {
                if (this.uEY && !bl) {
                    return 0;
                }
                if (object2 instanceof Collection) {
                    return ((Collection)object2).size();
                }
                if (object2 instanceof Object[]) {
                    return ((Object[])object2).length;
                }
                return 0;
            }
            case tKp: {
                if (this.axs == null || this.uEY && !bl) {
                    return null;
                }
                return this.axs + (object2 != null ? object2.toString() : "");
            }
        }
        return null;
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fjn_1 fjn_12 = (fjn_1)fhi_22;
        fjn_12.setKey(this.uEW);
        fjn_12.setValue(this.axs);
        fjn_12.setObjectUsed(this.uEX);
        fjn_12.setWhenObjectUsedNotNull(this.uEY);
        super.a(fjn_12);
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        switch (n) {
            case 111972721: {
                this.setValue(fic_12.a(string, this.nQt));
                return true;
            }
            case 106079: {
                this.setKey(fzr_0.tz(string));
                return true;
            }
            case 1066879900: {
                this.setObjectUsed(string);
                return true;
            }
            case -92096604: {
                this.setWhenObjectUsedNotNull(Bw.aK(string));
                return true;
            }
        }
        return super.setXMLAttribute(n, string, fic_12);
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        switch (n) {
            case 111972721: {
                this.setValue(String.valueOf(object));
                return true;
            }
            case 106079: {
                if (object instanceof fzr_0) {
                    this.setKey((fzr_0)((Object)object));
                } else {
                    this.setKey(fzr_0.tz(String.valueOf(object)));
                }
                return true;
            }
            case 1066879900: {
                this.setObjectUsed(object);
                return true;
            }
            case -92096604: {
                this.setWhenObjectUsedNotNull(Bw.l(object));
                return true;
            }
        }
        return super.setPropertyAttribute(n, object);
    }
}

