/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Optional;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from biz
 */
public class biz_1
extends biy_0 {
    public static final String ikV = "character";
    public static final String[] ikW = new String[]{"character"};
    public static final String[] ikX = new String[biy_0.ikS.length + ikW.length];
    private final bgy ikY;

    protected biz_1(bgy bgy2) {
        super(bia_0.ikZ);
        this.ikY = bgy2;
        if (this.ikY != null) {
            this.ikY.ddI().a(abi_1.dzm);
        }
    }

    @Override
    public String[] bxk() {
        return ikX;
    }

    @Override
    @Nullable
    public Object eu(String string) {
        return switch (string) {
            case ikV -> this.ikY;
            default -> super.eu(string);
        };
    }

    public bgy dcP() {
        return this.ikY;
    }

    @Override
    public Optional<bgy> dqj() {
        return Optional.ofNullable(this.ikY);
    }

    static {
        System.arraycopy(ikW, 0, ikX, 0, ikW.length);
        System.arraycopy(biy_0.ikS, 0, ikX, ikW.length, biy_0.ikS.length);
    }
}

