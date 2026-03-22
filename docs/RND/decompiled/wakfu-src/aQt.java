/*
 * Decompiled with CFR 0.152.
 */
public class aQt
extends aRY {
    private final long eCJ;

    public aQt(long l) {
        this.eCJ = l;
    }

    public aQt(String string) {
        this.eCJ = aQt.jO(string);
    }

    private static long jO(String string) {
        int n;
        if (string == null) {
            return 0L;
        }
        String string2 = string.trim();
        boolean bl = string2.startsWith("-");
        long l = 0L;
        Object object = "";
        int n2 = n = bl ? 1 : 0;
        while (n < string2.length()) {
            char c2 = string2.charAt(n);
            if ('0' <= c2 && c2 <= '9') {
                object = (String)object + c2;
            } else {
                l += (switch (c2) {
                    case 'k' -> 1000L;
                    case 'm' -> 1000000L;
                    case 'b' -> 1000000000L;
                    case 't' -> 1000000000000L;
                    default -> throw new IllegalArgumentException("Invalid number: " + string2);
                }) * Long.parseLong((String)object);
                object = "";
            }
            ++n;
        }
        if (!((String)object).isEmpty()) {
            l += Long.parseLong((String)object);
        }
        return l * (long)(bl ? -1 : 1);
    }

    @Override
    public boolean isValid() {
        return this.eCJ != 0L;
    }

    @Override
    public void bGy() {
        ayf_2 ayf_22 = aue_0.cVJ().etu();
        if (ayf_22 == null) {
            aqh_0.cBI().jI("Pour acc\u00e9der \u00e0 ces commandes il faut \u00eatre connect\u00e9 !");
            return;
        }
        ns_0 ns_02 = new ns_0();
        ns_02.C((byte)3);
        ns_02.Q((short)330);
        ns_02.cX(this.eCJ);
        ayf_22.d(ns_02);
    }
}

