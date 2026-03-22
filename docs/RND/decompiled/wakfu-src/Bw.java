/*
 * Decompiled with CFR 0.152.
 */
public class Bw {
    public static String k(Object object) {
        return object == null ? "null" : object.toString();
    }

    public static boolean b(String string, boolean bl) {
        if (string == null) {
            return bl;
        }
        return string.equalsIgnoreCase("true");
    }

    public static boolean aK(String string) {
        return string != null && string.equalsIgnoreCase("true");
    }

    public static boolean l(Object object) {
        return object != null && Bw.aK(object.toString());
    }

    public static int m(Object object) {
        return Bw.b(object, 0);
    }

    public static int b(Object object, int n) {
        long l = Bw.b(object, (long)n);
        if (l < Integer.MIN_VALUE || l > Integer.MAX_VALUE) {
            return n;
        }
        return (int)l;
    }

    public static double n(Object object) {
        return Bw.a(object, 0.0);
    }

    public static double a(Object object, double d2) {
        try {
            if (object instanceof Number) {
                return ((Number)object).doubleValue();
            }
            if (object instanceof String) {
                return Double.parseDouble((String)object);
            }
        }
        catch (Exception exception) {
            return d2;
        }
        return d2;
    }

    public static float o(Object object) {
        return Bw.a(object, 0.0f);
    }

    public static float a(Object object, float f2) {
        try {
            if (object instanceof Number) {
                return ((Number)object).floatValue();
            }
            if (object instanceof String) {
                return Float.parseFloat((String)object);
            }
        }
        catch (Exception exception) {
            return f2;
        }
        return f2;
    }

    public static long p(Object object) {
        return Bw.a(object, 0L);
    }

    public static long a(Object object, long l) {
        return Bw.b(object, l);
    }

    public static byte q(Object object) {
        return Bw.a(object, (byte)0);
    }

    public static byte a(Object object, byte by) {
        long l = Bw.b(object, (long)by);
        if (l < -128L || l > 127L) {
            return by;
        }
        return (byte)l;
    }

    public static short r(Object object) {
        return Bw.a(object, (short)0);
    }

    public static short a(Object object, short s) {
        long l = Bw.b(object, (long)s);
        if (l < -32768L || l > 32767L) {
            return s;
        }
        return (short)l;
    }

    private static long b(Object object, long l) {
        if (object == null) {
            return l;
        }
        String string = object.toString();
        int n = string.length();
        long l2 = 0L;
        int n2 = 0;
        boolean bl = false;
        if (n == 0) {
            return l;
        }
        char c2 = string.charAt(0);
        if (c2 < '0' || c2 > '9') {
            if (c2 == '-') {
                bl = true;
            } else if (c2 == '+') {
                bl = false;
            } else {
                return l;
            }
            ++n2;
        }
        if ((c2 = string.charAt(n2)) < '0' || c2 > '9') {
            return l;
        }
        while (true) {
            l2 += (long)(48 - c2);
            if (++n2 == n) {
                return bl ? l2 : -l2;
            }
            c2 = string.charAt(n2);
            if (c2 < '0' || c2 > '9') {
                return l;
            }
            l2 *= 10L;
        }
    }

    public static void main(String[] stringArray) {
        long l = Bw.b((Object)"+1000", 1L);
        long l2 = Bw.b((Object)"-1000", 1L);
        long l3 = Bw.b((Object)"1000", 1L);
        System.out.println(l);
    }
}

