/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jogamp.opengl.GL
 *  org.jetbrains.annotations.NotNull
 */
import com.jogamp.opengl.GL;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from atj
 */
public abstract sealed class atj_2
extends Enum<atj_2>
permits atk_2, atl_2, atm_2, atn_2, ato_2, atp_2 {
    public static final /* enum */ atj_2 dbA = new atk_2();
    public static final /* enum */ atj_2 dbB = new atl_2();
    public static final /* enum */ atj_2 dbC = new atm_2();
    public static final /* enum */ atj_2 dbD = new atn_2();
    public static final /* enum */ atj_2 dbE = new ato_2();
    public static final /* enum */ atj_2 dbF = new atp_2();
    private static final /* synthetic */ atj_2[] dbG;

    public static atj_2[] values() {
        return (atj_2[])dbG.clone();
    }

    public static atj_2 valueOf(String string) {
        return Enum.valueOf(atj_2.class, string);
    }

    public boolean h(@NotNull GL gL) {
        String string = gL.glGetString(7936);
        String string2 = gL.glGetString(7937);
        String string3 = gL.glGetString(7938);
        return this.c(string, string2, string3);
    }

    public abstract boolean c(@NotNull String var1, @NotNull String var2, @NotNull String var3);

    private static /* synthetic */ atj_2[] bLf() {
        return new atj_2[]{dbA, dbB, dbC, dbD, dbE, dbF};
    }

    static {
        dbG = atj_2.bLf();
    }
}

