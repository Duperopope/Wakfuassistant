/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from biy
 */
public abstract class biy_0
implements aeh_2 {
    public static final String ikQ = "type";
    public static final String ikR = "hovered";
    public static final String[] ikS = new String[]{"type", "hovered"};
    private final bia_0 ikT;
    private int crT;
    private boolean ikU;

    public bia_0 dqi() {
        return this.ikT;
    }

    protected biy_0(bia_0 bia_02) {
        this.ikT = bia_02;
    }

    @Override
    public String[] bxk() {
        return ikS;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        if (string.equals(ikQ)) {
            return this.ikT.aJr();
        }
        if (string.equals(ikR)) {
            return this.ikU;
        }
        return null;
    }

    public int bFT() {
        return this.crT;
    }

    public void setOffset(int n) {
        this.crT = n;
    }

    public void gk(boolean bl) {
        this.ikU = bl;
    }

    public Optional<bgy> dqj() {
        return Optional.empty();
    }
}

