/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

public final class US
extends Enum<US> {
    public static final /* enum */ US bxd = new US('%', "");
    public static final /* enum */ US bxe = new US('y', "0*[0-9]{2}");
    public static final /* enum */ US bxf = new US('Y', "0*[0-9]{4}");
    public static final /* enum */ US bxg = new US('M', "0*[0-9]{1,2}");
    public static final /* enum */ US bxh = new US('d', "0*[0-9]{1,2}");
    public static final /* enum */ US bxi = new US('h', "0*[0-9]{1,2}");
    public static final /* enum */ US bxj = new US('m', "0*[0-9]{1,2}");
    public static final /* enum */ US bxk = new US('s', "0*[0-9]{1,2}");
    public static final HashMap<Character, US> bxl;
    public static String bxm;
    private final char bxn;
    private final String bxo;
    private static final /* synthetic */ US[] bxp;

    public static US[] values() {
        return (US[])bxp.clone();
    }

    public static US valueOf(String string) {
        return Enum.valueOf(US.class, string);
    }

    private US(char c2, String string2) {
        this.bxn = c2;
        this.bxo = string2;
    }

    public char bkg() {
        return this.bxn;
    }

    public String bkh() {
        return this.bxo;
    }

    private static /* synthetic */ US[] bki() {
        return new US[]{bxd, bxe, bxf, bxg, bxh, bxi, bxj, bxk};
    }

    static {
        bxp = US.bki();
        bxl = new HashMap();
        bxm = "";
        for (int i = 0; i < US.values().length; ++i) {
            US uS = US.values()[i];
            char c2 = uS.bxn;
            bxl.put(Character.valueOf(c2), uS);
            if (uS == bxd) continue;
            bxm = bxm + c2;
        }
    }
}

