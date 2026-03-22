/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from ftz
 */
public interface ftz_0 {
    public int gmf();

    @NotNull
    @Contract(value="_ -> param1")
    public azg_1 j(@NotNull azg_1 var1);

    default public byte[] apI() {
        return this.j(new azg_1(this.gmf())).bTe();
    }
}

