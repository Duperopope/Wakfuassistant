/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aDU
 */
public final class adu_1 {
    private static final int dEr;
    private static final String[] dEs;
    private static final String[] dEt;
    public static boolean dEu;

    private adu_1() {
    }

    public static String a(Throwable throwable) {
        return adu_1.a(throwable, Integer.MAX_VALUE);
    }

    public static String a(Throwable throwable, int n) {
        if (throwable == null) {
            return " [null Throwable in ExceptionFormatter.toString()]";
        }
        StackTraceElement[] stackTraceElementArray = throwable.getStackTrace();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(' ').append(throwable.toString());
        if (stackTraceElementArray.length == 0) {
            stringBuilder.append("emptyStacktrace, current is ").append(adu_1.xg(n));
        } else {
            stringBuilder.append(adu_1.a(stackTraceElementArray, 0, n));
        }
        if (throwable.getCause() != null) {
            stringBuilder.append(" caused by ").append(adu_1.a(throwable.getCause(), n));
        }
        return stringBuilder.toString();
    }

    public static String bYT() {
        return adu_1.cN(1, Integer.MAX_VALUE);
    }

    public static String xg(int n) {
        return adu_1.cN(1, n);
    }

    public static String cN(int n, int n2) {
        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        return adu_1.a(stackTraceElementArray, 2 + dEr + n, n2);
    }

    private static String a(StackTraceElement[] stackTraceElementArray, int n, int n2) {
        StringBuilder stringBuilder = new StringBuilder("stackTrace=");
        adu_1.a(stringBuilder, stackTraceElementArray, n, n2, ' ');
        return stringBuilder.toString();
    }

    private static void a(StringBuilder stringBuilder, StackTraceElement[] stackTraceElementArray, int n, int n2, char c2) {
        for (int i = n; i < stackTraceElementArray.length && i - n < n2; ++i) {
            adu_1.a(stringBuilder, stackTraceElementArray[i], c2);
        }
    }

    private static StringBuilder a(StringBuilder stringBuilder, StackTraceElement stackTraceElement, char c2) {
        return stringBuilder.append(' ').append(adu_1.hl(stackTraceElement.getClassName())).append('.').append(stackTraceElement.getMethodName()).append('(').append(stackTraceElement.getFileName()).append(':').append(stackTraceElement.getLineNumber()).append(')').append(c2);
    }

    static String hl(String string) {
        if (!dEu) {
            return string;
        }
        Object object = adu_1.hm(string);
        for (int i = 0; i < dEs.length; ++i) {
            String string2 = dEs[i];
            if (!string.startsWith(string2)) continue;
            object = "[" + dEt[i] + "]" + (String)object;
            break;
        }
        return object;
    }

    private static String hm(String string) {
        int n = string.lastIndexOf(46);
        return n == -1 ? string : string.substring(n + 1);
    }

    static {
        String string = Thread.currentThread().getStackTrace()[0].getMethodName();
        dEr = "getStackTrace".equals(string) ? 0 : 1;
        dEs = new String[]{"com.ankamagames.wakfu.server.game", "com.ankamagames.wakfu.server.ia", "com.ankamagames.wakfu.server", "com.ankamagames.wakfu.client", "com.ankamagames.wakfu.common", "com.ankamagames.baseImpl", "com.ankamagames.framework"};
        dEt = new String[]{"GAME", "IA", "SRV", "CLI", "COMM", "BIMP", "FWK"};
        dEu = true;
    }
}

