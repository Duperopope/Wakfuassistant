/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.inject.Module
 */
import com.google.common.base.Preconditions;
import com.google.inject.Module;
import java.util.function.Function;

class FM
extends FC {
    public static final Function<FM, Module> aCc = fM -> fM.aCd;
    private final Module aCd;

    public Module aLr() {
        return this.aCd;
    }

    FM(Module module) {
        this.aCd = (Module)Preconditions.checkNotNull((Object)module);
    }

    public int hashCode() {
        return FN.c(this.aCd);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        FM fM = (FM)object;
        return FN.a(this.aCd, fM.aCd);
    }

    public String toString() {
        return "M[" + this.aCd.getClass().getName() + "]";
    }
}

