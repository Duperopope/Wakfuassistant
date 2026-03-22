/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Objects;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fJp
 */
public class fjp_2
extends fha_2
implements fiy_1 {
    public static final String TAG = "case";
    @Nullable
    private fjs_2 uEb;
    @Nullable
    private Object aGT;
    private boolean uEc = false;
    public static final int uEd = 111972721;
    public static final int uEe = -1793668634;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fjs_2) {
            this.setCondition((fjs_2)fhv_12);
        }
        super.d(fhv_12);
    }

    public void setCondition(fjs_2 fjs_22) {
        this.uEb = fjs_22;
        this.pg(false);
    }

    public boolean bg(Object object) {
        return this.uEb != null && this.uEb.isValid(object);
    }

    public void pg(boolean bl) {
        fjk_1 fjk_12 = this.getParentOfType(fjk_1.class);
        if (!(fjk_12 == null || bl && fjk_12.getCurrentResultProviderUsed() != this)) {
            fjk_12.gCL();
        }
    }

    @Nullable
    public Object getEvaluatedValue(Object object) {
        if (this.uEc && this.aGT == null) {
            return object;
        }
        return this.aGT;
    }

    @Nullable
    public Object getValue() {
        return this.aGT;
    }

    public void setValue(@Nullable Object object) {
        if (Objects.equals(object, this.aGT)) {
            return;
        }
        this.aGT = object;
        this.pg(true);
    }

    public boolean getReturnOriginalObjectOnNull() {
        return this.uEc;
    }

    public void setReturnOriginalObjectOnNull(boolean bl) {
        if (bl == this.uEc) {
            return;
        }
        this.uEc = bl;
        this.pg(true);
    }

    @Override
    @Nullable
    public fjs_2 getCondition() {
        return this.uEb;
    }

    @Override
    public void aVH() {
        this.uEb = null;
        this.aGT = null;
        this.uEc = false;
        super.aVH();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fjp_2 fjp_22 = (fjp_2)fhi_22;
        super.a(fhi_22);
        fjp_22.setValue(this.getValue());
        fjp_22.setReturnOriginalObjectOnNull(this.getReturnOriginalObjectOnNull());
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        return switch (n) {
            case 111972721 -> {
                this.setValue(string);
                yield true;
            }
            case -1793668634 -> {
                this.setReturnOriginalObjectOnNull(Boolean.parseBoolean(string));
                yield true;
            }
            default -> super.setXMLAttribute(n, string, fic_12);
        };
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        return switch (n) {
            case 111972721 -> {
                this.setValue(object);
                yield true;
            }
            case -1793668634 -> {
                this.setReturnOriginalObjectOnNull(object instanceof Boolean ? (Boolean)object : Boolean.parseBoolean(String.valueOf(object)));
                yield true;
            }
            default -> super.setPropertyAttribute(n, object);
        };
    }

    @Override
    public String getTag() {
        return TAG;
    }
}

