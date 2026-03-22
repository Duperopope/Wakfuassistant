/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.awt.event.KeyEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class aUl
implements aeh_2,
ffc_2 {
    public static final String gxN = "key";
    public static final String gxO = "formattedKey";
    public static final String gxP = "effect";
    public static final String gxQ = "text";
    public static final String gxR = "isBind";
    private static final String[] gxS = new String[]{"key", "formattedKey", "effect", "text", "isBind"};
    private final amc_1 gxT;

    public aUl(amc_1 amc_12) {
        this.gxT = amc_12;
    }

    @Override
    public String[] bxk() {
        return gxS;
    }

    @Override
    public Object eu(String string) {
        return switch (string) {
            case gxN -> this.cUy();
            case gxO -> this.cUz();
            case gxP -> this.cUF();
            case gxQ -> this.getText();
            case gxR -> "binding".equals(this.aWZ());
            default -> null;
        };
    }

    public static String kf(String string) {
        String string2 = aUl.e(aUm.cUI().fb(string));
        return aum_0.cWf().c("shortcuts", new Object[0]) + " " + aUl.kg(string2);
    }

    public String cUy() {
        return aUl.e(this.gxT);
    }

    public String cUz() {
        return aUl.kg(aUl.e(this.gxT));
    }

    @NotNull
    public static String e(@Nullable amc_1 amc_12) {
        Object object;
        if (amc_12 == null) {
            return "";
        }
        switch (amc_12.bCC()) {
            case -1: {
                object = aum_0.cWf().c("unassignedShortcutKey", new Object[0]);
                break;
            }
            case 0: {
                String string = amc_12.bCE();
                object = string != null ? string : aum_0.cWf().c("unknown", new Object[0]);
                break;
            }
            default: {
                object = aUl.zr(amc_12.bCC());
                Object object2 = object = ((String)object).endsWith("keyCode: 0x" + amc_12.bCC()) ? aum_0.cWf().c("unknown", new Object[0]) : object;
            }
        }
        if (amc_12.bCI()) {
            object = aUl.zr(16) + " + " + (String)object;
        }
        if (amc_12.bCH()) {
            object = aUl.zr(18) + " + " + (String)object;
        }
        if (amc_12.bCG()) {
            object = aUl.zr(17) + " + " + (String)object;
        }
        return object;
    }

    @NotNull
    public static String kg(@NotNull String string) {
        String[] stringArray = string.replaceAll("CONTROL", "CTRL").split(" \\+ ");
        StringBuilder stringBuilder = new StringBuilder(BH.bc(stringArray[0]));
        if (stringArray.length > 1) {
            for (int i = 1; i < stringArray.length; ++i) {
                stringBuilder.append(" + ").append(BH.bc(stringArray[i]));
            }
        }
        return stringBuilder.toString();
    }

    public int cUA() {
        return this.gxT.bCC();
    }

    public int cUB() {
        return this.gxT.bCD();
    }

    @Nullable
    public String cUC() {
        return this.gxT.bCE();
    }

    public String getId() {
        return this.gxT.getId();
    }

    public amc_1 cUD() {
        return this.gxT;
    }

    public int cUE() {
        return this.gxT.bCM();
    }

    public String cUF() {
        return aum_0.cWf().c("shortcutEffect." + ("binding".equals(this.aWZ()) ? "binding" : this.getId()), new Object[0]);
    }

    public String aWZ() {
        return this.gxT.aWZ();
    }

    public String getText() {
        return this.gxT.bCN();
    }

    public String toString() {
        return this.getText();
    }

    public static String zr(int n) {
        return aUl.zs(n);
    }

    private static String zs(int n) {
        return KeyEvent.getKeyText(n);
    }

    @Override
    public String cUG() {
        return this.cUy() + this.cUF();
    }

    @Override
    public boolean cUH() {
        return false;
    }
}

