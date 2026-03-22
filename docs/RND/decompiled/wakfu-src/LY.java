/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.io.Serializable;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LY
implements Serializable {
    private static final long aRy = -8955078144857658687L;
    @NotNull
    private String axs;

    public LY() {
        this("");
    }

    @Contract(value="null -> fail")
    public LY(String string) {
        if (string == null) {
            throw new IllegalArgumentException("FinalString cannot be null, use FinalObject<String> instead");
        }
        this.axs = string;
    }

    @Contract(pure=true)
    @NotNull
    public String aTD() {
        return this.axs;
    }

    @NotNull
    @Contract(value="null -> fail")
    public String cD(String string) {
        if (string == null) {
            throw new IllegalArgumentException("FinalString cannot be null, use FinalObject<String> instead");
        }
        this.axs = string;
        return this.axs;
    }

    public String cE(@Nullable String string) {
        this.axs = this.axs + string;
        return this.axs;
    }

    @NotNull
    public String toString() {
        return this.axs;
    }
}

