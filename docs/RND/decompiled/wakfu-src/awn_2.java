/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;

/*
 * Renamed from awn
 */
public final class awn_2
extends Enum<awn_2> {
    public static final /* enum */ awn_2 dkN = new awn_2();
    public static final /* enum */ awn_2 dkO = new awn_2();
    public static final /* enum */ awn_2 dkP = new awn_2();
    public static final /* enum */ awn_2 dkQ = new awn_2();
    private static final Pattern dkR;
    private static final awn_2[] dkS;
    private static final /* synthetic */ awn_2[] dkT;

    public static awn_2[] values() {
        return (awn_2[])dkT.clone();
    }

    public static awn_2 valueOf(String string) {
        return Enum.valueOf(awn_2.class, string);
    }

    private awh_2 a(awi_2 awi_22, String string, boolean bl) {
        switch (this.ordinal()) {
            case 0: {
                try {
                    avo_2 avo_22 = new avo_2();
                    avo_22.x(awi_22.bOm(), string);
                    avo_22.cc(awi_22.getDeltaX(), awi_22.getDeltaY());
                    return avo_22;
                }
                catch (IOException iOException) {
                    break;
                }
            }
            case 1: {
                try {
                    awy_1 awy_12 = new awy_1();
                    awy_12.x(awi_22.bOm(), string);
                    awy_12.cc(awi_22.getDeltaX(), awi_22.getDeltaY());
                    return awy_12;
                }
                catch (IOException iOException) {
                    break;
                }
            }
            case 2: {
                if (!bl) break;
                try {
                    URL uRL = fo_0.bA(string + awi_22.getName() + ".ttf");
                    if (bl_0.a(uRL)) {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(uRL.openStream());
                        Font font = Font.createFont(0, bufferedInputStream);
                        ((InputStream)bufferedInputStream).close();
                        Font font2 = Font.decode(awi_22.bOm());
                        font = font.deriveFont(font2.getStyle(), font2.getSize());
                        avn_2 avn_22 = new avn_2(font, true, awi_22.bNj());
                        avn_22.cc(awi_22.getDeltaX(), awi_22.getDeltaY());
                        return avn_22;
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
                break;
            }
            case 3: {
                if (!bl) break;
                avn_2 avn_23 = new avn_2(Font.decode(awi_22.bOm()), true, awi_22.bNj());
                avn_23.cc(awi_22.getDeltaX(), awi_22.getDeltaY());
                return avn_23;
            }
        }
        return null;
    }

    public static awh_2 b(awi_2 awi_22, String string, boolean bl) {
        int n = dkS.length;
        for (int i = 0; i < n; ++i) {
            awh_2 awh_22 = dkS[i].a(awi_22, string, bl);
            if (awh_22 == null) continue;
            return awh_22;
        }
        return null;
    }

    public static void a(Comparator<awn_2> comparator) {
        Arrays.sort(dkS, comparator);
    }

    private static /* synthetic */ awn_2[] bOq() {
        return new awn_2[]{dkN, dkO, dkP, dkQ};
    }

    static {
        dkT = awn_2.bOq();
        dkR = Pattern.compile("-");
        dkS = new awn_2[awn_2.values().length];
        for (awn_2 awn_2.dkS[var1_1] : awn_2.values()) {
        }
    }
}

