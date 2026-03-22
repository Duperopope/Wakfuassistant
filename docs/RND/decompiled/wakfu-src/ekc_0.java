/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 */
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eKC
 */
public class ekc_0<Value> {
    final boolean qDt;
    @Nullable
    final ekb_0 qDu;
    @Nullable
    final Value qDv;

    @Generated
    public ekc_0(boolean bl, @Nullable ekb_0 ekb_02, @Nullable Value Value) {
        this.qDt = bl;
        this.qDu = ekb_02;
        this.qDv = Value;
    }

    @Generated
    public boolean fyB() {
        return this.qDt;
    }

    @Nullable
    @Generated
    public ekb_0 fyC() {
        return this.qDu;
    }

    @Nullable
    @Generated
    public Value getValue() {
        return this.qDv;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ekc_0)) {
            return false;
        }
        ekc_0 ekc_02 = (ekc_0)object;
        if (!ekc_02.C(this)) {
            return false;
        }
        if (this.fyB() != ekc_02.fyB()) {
            return false;
        }
        ekb_0 ekb_02 = this.fyC();
        ekb_0 ekb_03 = ekc_02.fyC();
        if (ekb_02 == null ? ekb_03 != null : !((Object)((Object)ekb_02)).equals((Object)ekb_03)) {
            return false;
        }
        Value Value = this.getValue();
        Value Value2 = ekc_02.getValue();
        return !(Value == null ? Value2 != null : !Value.equals(Value2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof ekc_0;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        n2 = n2 * 59 + (this.fyB() ? 79 : 97);
        ekb_0 ekb_02 = this.fyC();
        n2 = n2 * 59 + (ekb_02 == null ? 43 : ((Object)((Object)ekb_02)).hashCode());
        Value Value = this.getValue();
        n2 = n2 * 59 + (Value == null ? 43 : Value.hashCode());
        return n2;
    }

    @Generated
    public String toString() {
        return "CraftStepEnum.StepFallthroughResult(m_hasFallthrough=" + this.fyB() + ", m_valueFromStep=" + String.valueOf((Object)this.fyC()) + ", m_value=" + String.valueOf(this.getValue()) + ")";
    }
}

