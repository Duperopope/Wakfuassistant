/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 */
import java.io.Serializable;
import org.jetbrains.annotations.Contract;

public final class LP
implements Serializable {
    private static final long aRm = -938303339565219370L;
    private boolean axl;

    public LP() {
    }

    public LP(boolean bl) {
        this.axl = bl;
    }

    @Contract(pure=true)
    public boolean aTe() {
        return this.axl;
    }

    public boolean aH(boolean bl) {
        this.axl = bl;
        return this.axl;
    }

    public boolean aI(boolean bl) {
        this.axl = this.axl && bl;
        return this.axl;
    }

    public boolean aJ(boolean bl) {
        this.axl = this.axl || bl;
        return this.axl;
    }

    public boolean aK(boolean bl) {
        this.axl ^= bl;
        return this.axl;
    }

    public String toString() {
        return String.valueOf(this.axl);
    }
}

