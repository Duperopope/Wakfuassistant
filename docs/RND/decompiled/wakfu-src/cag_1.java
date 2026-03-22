/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import com.ankamagames.baseImpl.graphics.alea.display.ScreenElement;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from caG
 */
final class cag_1
extends Record {
    @NotNull
    final ScreenElement lHf;
    @NotNull
    final aaq_0 lHg;

    cag_1(@NotNull ScreenElement screenElement, @NotNull aaq_0 aaq_02) {
        this.lHf = screenElement;
        this.lHg = aaq_02;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{cag_1.class, "screenElement;map", "lHf", "lHg"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{cag_1.class, "screenElement;map", "lHf", "lHg"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{cag_1.class, "screenElement;map", "lHf", "lHg"}, this, object);
    }

    @NotNull
    public ScreenElement erA() {
        return this.lHf;
    }

    @NotNull
    public aaq_0 erB() {
        return this.lHg;
    }
}

