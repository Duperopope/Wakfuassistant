/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
import lombok.Generated;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * Renamed from fHl
 */
public class fhl_2
implements axb_2 {
    private static final Logger uwy = LoggerFactory.getLogger(fhl_2.class);
    private final String uwz;
    private final Float uwA;

    public fhl_2(fhz_1 fhz_12) {
        this(fhz_12.getName());
    }

    public fhl_2(String string) {
        this.uwz = string;
        this.uwA = null;
    }

    public fhl_2(fhz_1 fhz_12, float f2) {
        this(fhz_12.getName(), f2);
    }

    public fhl_2(String string, float f2) {
        this.uwz = string;
        this.uwA = Float.valueOf(f2);
    }

    public axb_2 getColor() {
        axb_2 axb_22;
        axb_2 axb_23 = axb_22 = this.uwA != null ? fhm_2.uwB.f(this.uwz, this.uwA.floatValue()) : fhm_2.uwB.uy(this.uwz);
        if (axb_22 == null) {
            uwy.error("Unable to retrieve color with following name {} in {}", (Object)this.uwz, fhm_2.class);
        }
        return axb_22;
    }

    @Override
    public int bPU() {
        return this.getColor().bPU();
    }

    @Override
    public int bPV() {
        return this.getColor().bPV();
    }

    @Override
    public int bPW() {
        return this.getColor().bPW();
    }

    @Override
    public int bPX() {
        return this.getColor().bPX();
    }

    @Override
    public int bPY() {
        return this.getColor().bPY();
    }

    @Override
    public boolean bPZ() {
        return true;
    }

    @Override
    @Nullable
    public String bQa() {
        return this.uwz;
    }

    public String toString() {
        return this.bQk();
    }

    public String getName() {
        return this.uwz;
    }

    public Float gzQ() {
        return this.uwA;
    }

    @Generated
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fhl_2)) {
            return false;
        }
        fhl_2 fhl_22 = (fhl_2)object;
        if (!fhl_22.C(this)) {
            return false;
        }
        Float f2 = this.uwA;
        Float f3 = fhl_22.uwA;
        if (f2 == null ? f3 != null : !((Object)f2).equals(f3)) {
            return false;
        }
        String string = this.getName();
        String string2 = fhl_22.getName();
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    @Generated
    protected boolean C(Object object) {
        return object instanceof fhl_2;
    }

    @Generated
    public int hashCode() {
        int n = 59;
        int n2 = 1;
        Float f2 = this.uwA;
        n2 = n2 * 59 + (f2 == null ? 43 : ((Object)f2).hashCode());
        String string = this.getName();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }
}

