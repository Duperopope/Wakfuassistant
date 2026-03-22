/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from fTu
 */
public class ftu_2 {
    public static String h(String string, String string2, String string3) {
        return string + "." + string2 + "." + string3;
    }

    public static String ah(float[] fArray) {
        int n = (int)(fArray[0] * 255.0f);
        int n2 = (int)(fArray[1] * 255.0f);
        int n3 = (int)(fArray[2] * 255.0f);
        return ftu_2.aB(n, n2, n3);
    }

    public static String G(axb_2 axb_22) {
        int n = axb_22.bPW();
        int n2 = axb_22.bPX();
        int n3 = axb_22.bPY();
        return ftu_2.aB(n, n2, n3);
    }

    @NotNull
    private static String aB(int n, int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n < 16) {
            stringBuilder.append('0');
        }
        stringBuilder.append(Integer.toHexString(n));
        if (n2 < 16) {
            stringBuilder.append('0');
        }
        stringBuilder.append(Integer.toHexString(n2));
        if (n3 < 16) {
            stringBuilder.append('0');
        }
        stringBuilder.append(Integer.toHexString(n3));
        return stringBuilder.toString();
    }

    public static void G(fes_2 fes_22) {
        int n = (int)(fyw_0.gqw().gqD().bRq() - (float)fes_22.getWidth());
        int n2 = (int)(fyw_0.gqw().gqD().bRr() - (float)fes_22.getHeight());
        int n3 = GC.a(fes_22.getX(), 0, n);
        int n4 = GC.a(fes_22.getY(), 0, n2);
        fes_22.setPosition(n3, n4);
    }
}

