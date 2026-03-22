/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 */
import java.io.Serializable;
import org.jetbrains.annotations.Contract;

public final class LR
implements Serializable {
    private static final long aRo = -2650481458108160738L;
    private char aRp;

    public LR() {
    }

    public LR(char c2) {
        this.aRp = c2;
    }

    @Contract(pure=true)
    public char aTk() {
        return this.aRp;
    }

    public char b(char c2) {
        this.aRp = c2;
        return this.aRp;
    }

    public String toString() {
        return String.valueOf(this.aRp);
    }
}

