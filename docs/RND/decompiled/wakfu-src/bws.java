/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 *  org.jetbrains.annotations.Unmodifiable
 */
import java.util.List;
import java.util.stream.IntStream;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

public abstract class bws
implements aeh_2 {
    public static final String jyv = "windowTitle";
    public static final String jyw = "defaultBuildName";
    public static final String jyx = "levels";
    public static final String jyy = "defaultSelectedLevel";
    public static final String jyz = "iconsList";
    public static final String jyA = "defaultSelectedIcon";
    public static final String jyB = "levelComboboxHelpText";
    public static final String jyC = "canChangeLevel";
    private static final String[] jyD = new String[]{"windowTitle", "defaultBuildName", "levels", "defaultSelectedLevel", "iconsList", "defaultSelectedIcon", "levelComboboxHelpText", "canChangeLevel"};
    static final @Unmodifiable List<bfB> jyE = IntStream.range(1, 41).mapToObj(bfB::new).toList();

    @Override
    @Nullable
    public Object eu(String string) {
        switch (string) {
            case "windowTitle": {
                return this.dMl();
            }
            case "defaultBuildName": {
                return this.dMm();
            }
            case "levels": {
                return this.dMn();
            }
            case "defaultSelectedLevel": {
                return this.dMo();
            }
            case "iconsList": {
                return this.dMp();
            }
            case "defaultSelectedIcon": {
                return this.dMq();
            }
            case "levelComboboxHelpText": {
                return this.dMr();
            }
            case "canChangeLevel": {
                return this.dMt();
            }
        }
        return null;
    }

    abstract String dMl();

    abstract String dMm();

    abstract @Unmodifiable List<bfC> dMn();

    abstract bfC dMo();

    public List<bfB> dMp() {
        return jyE;
    }

    @Nullable
    abstract bfB dMq();

    @Nullable
    abstract String dMr();

    public abstract short dMs();

    public boolean dMt() {
        return true;
    }

    @Override
    public String[] bxk() {
        return jyD;
    }
}

