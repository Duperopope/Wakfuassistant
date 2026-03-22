/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.inject.Module
 */
import com.google.common.base.Preconditions;
import com.google.inject.Module;

class FO
extends FC {
    private final Class<? extends Module> aCg;

    FO(Class<? extends Module> clazz) {
        this.aCg = (Class)Preconditions.checkNotNull(clazz);
    }

    public Class<? extends Module> aLs() {
        return this.aCg;
    }

    public int hashCode() {
        int n = 442292081;
        return 442292081 + this.aCg.hashCode();
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
        FO fO = (FO)object;
        return this.aCg.equals(fO.aCg);
    }

    public String toString() {
        return "I[" + this.aCg.getName() + "]";
    }
}

