/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bvX
 */
public class bvx_0
implements aeh_2 {
    public static final String jvP = "name";
    private static final String jvQ = "guildBlazon";
    private static final String jvR = "isOpen";
    private static final String jvS = "isGuildOnly";
    public static final String[] jvT = new String[]{"name", "guildBlazon", "isOpen", "isGuildOnly"};
    private buJ jvU;
    private faa_0 jvV;

    public bvx_0(faa_0 faa_02) {
        this.jvV = faa_02;
        this.jvU = new buJ(new ezb(this.jvV.HP()));
    }

    @Override
    public String[] bxk() {
        return jvT;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (jvQ.equals(string)) {
            return buK.dJw().a(this.jvU);
        }
        if (jvP.equals(string)) {
            return this.getName();
        }
        if (jvR.equals(string)) {
            return this.bVe();
        }
        if (jvS.equals(string)) {
            return this.dLd();
        }
        return null;
    }

    public String getName() {
        return this.jvV.HR();
    }

    public long Ya() {
        return this.jvV.Ya();
    }

    public long aqZ() {
        return this.jvV.aqZ();
    }

    public long dLc() {
        return this.jvV.HP();
    }

    public boolean bVe() {
        return this.jvV.bVe();
    }

    public boolean dLd() {
        return this.jvV.dLd();
    }
}

