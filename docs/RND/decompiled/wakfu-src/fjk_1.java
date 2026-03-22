/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fJK
 */
public class fjk_1
extends fha_2
implements fjj_2 {
    public static final String TAG = "switch";
    @NotNull
    private final List<fjp_2> uEQ = new ArrayList<fjp_2>();
    @Nullable
    private Object oGw = null;
    private boolean uEc = false;
    @Nullable
    private fjl_2 uEs = null;
    @Nullable
    private fjp_2 uER = null;
    public static final int uES = -659125328;
    public static final int uET = -1793668634;

    @Override
    public void d(fhv_1 fhv_12) {
        super.d(fhv_12);
        if (fhv_12 instanceof fjp_2) {
            this.uEQ.add((fjp_2)fhv_12);
        }
    }

    @Override
    public Object getResult(Object object) {
        for (fjp_2 fjp_22 : this.uEQ) {
            if (!fjp_22.bg(object)) continue;
            this.uER = fjp_22;
            return fjp_22.getEvaluatedValue(object);
        }
        this.uER = null;
        if (this.uEc && this.oGw == null) {
            return object;
        }
        return this.oGw;
    }

    protected void gCL() {
        if (this.uEs != null) {
            this.uEs.a(this);
        }
        this.gCK();
    }

    protected void gCK() {
        fhv_1 fhv_12 = this.getParent();
        while (fhv_12 instanceof fjk_2) {
            fhv_12 = fhv_12.getParent();
        }
        if (fhv_12 instanceof fje_2) {
            fje_2 fje_22 = (fje_2)fhv_12;
            fje_22.getManager().gCF();
        }
    }

    @Nullable
    public fjp_2 getCurrentResultProviderUsed() {
        return this.uER;
    }

    @Nullable
    public Object getDefaultValue() {
        return this.oGw;
    }

    public void setDefaultValue(@Nullable Object object) {
        if (Objects.equals(object, this.oGw)) {
            return;
        }
        this.oGw = object;
        if (this.uER == null) {
            this.gCL();
        }
    }

    public boolean getReturnOriginalObjectOnNull() {
        return this.uEc;
    }

    public void setReturnOriginalObjectOnNull(boolean bl) {
        if (bl == this.uEc) {
            return;
        }
        this.uEc = bl;
        if (this.uER == null && this.oGw == null) {
            this.gCL();
        }
    }

    @Override
    public void setResultProviderParent(@Nullable fjl_2 fjl_22) {
        if (this.uEs == fjl_22) {
            return;
        }
        this.uEs = fjl_22;
        this.gCL();
    }

    @Override
    public void aVH() {
        this.uEQ.clear();
        this.oGw = null;
        this.uEc = false;
        this.uEs = null;
        this.uER = null;
        super.aVH();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fjk_1 fjk_12 = (fjk_1)fhi_22;
        super.a(fhi_22);
        fjk_12.setDefaultValue(this.getDefaultValue());
        fjk_12.setReturnOriginalObjectOnNull(this.getReturnOriginalObjectOnNull());
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        return switch (n) {
            case -659125328 -> {
                this.setDefaultValue(string);
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
            case -659125328 -> {
                this.setDefaultValue(object);
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

