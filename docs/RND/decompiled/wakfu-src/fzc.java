/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public interface fzc
extends fkq_1 {
    public void setModulationColor(axb_2 var1);

    public axb_2 getModulationColor();

    @Nullable
    default public axb_2 getMinModulationColor() {
        return null;
    }

    @Nullable
    default public axb_2 getMaxModulationColor() {
        return null;
    }
}

