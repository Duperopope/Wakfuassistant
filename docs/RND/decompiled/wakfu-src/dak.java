/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.jetbrains.annotations.NotNull
 */
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public class dak
extends dae_0 {
    @NotNull
    private final String obV;
    private final short obW;
    private final int obX;

    public dak(@NotNull String string, short s, int n, short s2) {
        super(s2);
        this.obV = string;
        this.obW = s;
        this.obX = n;
    }

    @NotNull
    @Generated
    public String eZF() {
        return this.obV;
    }

    @Generated
    public short ewW() {
        return this.obW;
    }

    @Generated
    public int ewX() {
        return this.obX;
    }
}

