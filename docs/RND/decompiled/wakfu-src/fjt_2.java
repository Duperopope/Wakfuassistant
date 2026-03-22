/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fJt
 */
public class fjt_2
extends fha_2
implements fiy_1,
fjj_2 {
    public static final String TAG = "Condition";
    private fjs_2 uEb;
    private Object aGT = true;
    private boolean uEm;
    private Object uEn = false;
    private boolean uEo;
    private boolean uEp = false;
    private boolean uEq = false;
    private final Collection<fjt_2> uEr = new ArrayList<fjt_2>();
    protected fjl_2 uEs;
    private boolean uEt = false;
    public static final int uEu = 111972721;
    public static final int uEv = -961646664;
    public static final int uEw = 2000384720;
    public static final int uEx = -1451711905;
    public static final int uEy = 754145004;

    @Override
    public void d(fhv_1 fhv_12) {
        if (fhv_12 instanceof fjs_2) {
            this.setCondition((fjs_2)fhv_12);
        } else if (fhv_12 instanceof fjt_2) {
            this.ao((fjt_2)fhv_12);
        }
        super.d(fhv_12);
    }

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public Object getResult(Object object) {
        Object object2;
        Iterator<fjt_2> iterator = this.uEm || !this.uEp ? this.aGT : object;
        Object object3 = object2 = this.uEo || !this.uEp ? this.uEn : object;
        if (this.uEq) {
            Iterator<fjt_2> iterator2 = iterator;
            iterator = object2;
            object2 = iterator2;
        }
        if (this.uEr.isEmpty()) {
            if (this.uEb == null) {
                uxJ.warn((Object)("Condition sans tests sur " + String.valueOf(this.uEs)));
                return iterator;
            }
            return this.uEb.isValid(object) ? iterator : object2;
        }
        for (fjt_2 fjt_22 : this.uEr) {
            if (!fjt_22.uEb.isValid(object)) continue;
            return fjt_22.isComposite() ? fjt_22.getResult(object) : fjt_22.aGT;
        }
        return object2;
    }

    @Override
    @Nullable
    public fjs_2 getCondition() {
        return this.uEb;
    }

    public void setCondition(fjs_2 fjs_22) {
        this.uEb = fjs_22;
        this.gCJ();
    }

    public Object getElseValue() {
        return this.uEn;
    }

    public void setElseValue(Object object) {
        this.uEn = object;
        this.uEo = true;
        if (this.uEt) {
            this.gCJ();
        }
    }

    public void setElseValue(String string) {
        this.setElseValue((Object)string);
    }

    public Object getValue() {
        return this.aGT;
    }

    public void setValue(Object object) {
        this.aGT = object;
        this.uEm = true;
        if (this.uEt) {
            this.gCJ();
        }
    }

    public void setValue(String string) {
        this.setValue((Object)string);
    }

    public boolean isReturnOriginalValue() {
        return this.uEp;
    }

    public void setReturnOriginalValue(boolean bl) {
        this.uEp = bl;
        if (this.uEt) {
            this.gCJ();
        }
    }

    public boolean isSwapValueAndElseValue() {
        return this.uEq;
    }

    public void setSwapValueAndElseValue(boolean bl) {
        this.uEq = bl;
        if (this.uEt) {
            this.gCJ();
        }
    }

    public boolean isInvalidateConditionOnValueParametersChange() {
        return this.uEt;
    }

    public void setInvalidateConditionOnValueParametersChange(boolean bl) {
        this.uEt = bl;
    }

    public void gCJ() {
        if (this.uEs != null) {
            this.uEs.a(this);
        }
        this.gCK();
    }

    public void gCK() {
        fhv_1 fhv_12 = this.getParent();
        while (fhv_12 instanceof fjk_2) {
            fhv_12 = fhv_12.getParent();
        }
        if (fhv_12 instanceof fje_2) {
            fje_2 fje_22 = (fje_2)fhv_12;
            fje_22.getManager().gCF();
        }
    }

    @Override
    public void setResultProviderParent(fjl_2 fjl_22) {
        this.uEs = fjl_22;
    }

    public void ao(fjt_2 fjt_22) {
        this.uEr.add(fjt_22);
    }

    public boolean isComposite() {
        return !this.uEr.isEmpty();
    }

    @Override
    public void a(fhi_2 fhi_22) {
        fjt_2 fjt_22 = (fjt_2)fhi_22;
        super.a(fjt_22);
        if (this.uEm) {
            fjt_22.setValue(this.aGT);
        }
        if (this.uEo) {
            fjt_22.setElseValue(this.uEn);
        }
        fjt_22.uEp = this.uEp;
        fjt_22.uEq = this.uEq;
        fjt_22.uEt = this.uEt;
    }

    @Override
    public boolean setXMLAttribute(int n, String string, fic_1 fic_12) {
        if (n == -961646664) {
            this.setElseValue(fic_12.a(string, this.nQt));
        } else if (n == 111972721) {
            this.setValue(fic_12.a(string, this.nQt));
        } else if (n == 2000384720) {
            this.setReturnOriginalValue(Bw.aK(string));
        } else if (n == -1451711905) {
            this.setSwapValueAndElseValue(Bw.aK(string));
        } else if (n == 754145004) {
            this.setInvalidateConditionOnValueParametersChange(Bw.aK(string));
        } else {
            return super.setXMLAttribute(n, string, fic_12);
        }
        return true;
    }

    @Override
    public boolean setPropertyAttribute(int n, Object object) {
        if (n == -961646664) {
            this.setElseValue(object);
        } else if (n == 111972721) {
            this.setValue(object);
        } else if (n == 2000384720) {
            this.setReturnOriginalValue(Bw.l(object));
        } else if (n == -1451711905) {
            this.setSwapValueAndElseValue(Bw.l(object));
        } else if (n == 754145004) {
            this.setInvalidateConditionOnValueParametersChange(Bw.l(object));
        } else {
            return super.setPropertyAttribute(n, object);
        }
        return true;
    }
}

