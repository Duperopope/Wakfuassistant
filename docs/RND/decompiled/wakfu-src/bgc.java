/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bgc
extends bcw_1 {
    public static final Pattern hZa = Pattern.compile("\\[(([a-z]|[A-Z]|[0-9])+)\\]");
    public static final Pattern hZb = Pattern.compile("\\[b=([0-9]+)\\]");
    public static final Pattern hZc = Pattern.compile("\\[r=([0-9]+)\\]");
    private final int hZd;
    private final int hZe;

    public bgc(int n, int n2) {
        this.hZe = n2;
        this.hZd = n;
    }

    @Override
    public String getDescription() {
        String string;
        bfT bfT2 = bgd.diV().Cr(this.hZd);
        bfU bfU2 = bgd.diV().Cs(this.hZd);
        bgb bgb2 = bfU2.Cp(this.hZe);
        long l = 0L;
        String string2 = bgb2.aGm();
        if (bfT2 != null && string2 != null && string2.length() > 0) {
            l = bfT2.lB(string2);
        }
        if (l == 0L || bfT2.dik()) {
            return bgc.b(bfU2);
        }
        if (bfT2.a(bgb2) == 1 && (string = bgc.a(bgb2, bfT2, bfU2)) != null) {
            return string;
        }
        return null;
    }

    @Override
    public String dak() {
        return BH.aT(this.getDescription());
    }

    @Override
    protected long dbv() {
        return -1L;
    }

    @Override
    protected boolean daJ() {
        bfT bfT2 = bgd.diV().Cr(this.hZd);
        bfU bfU2 = bgd.diV().Cs(this.hZd);
        bgb bgb2 = bfU2.Cp(this.hZe);
        if (bfT2 == null) {
            return true;
        }
        return bfT2.a(bgb2) == 2;
    }

    @Override
    protected boolean daI() {
        return false;
    }

    protected static String b(bfU bfU2) {
        String string = bfU2.diB();
        if (string != null && string.length() == 0) {
            return null;
        }
        return string;
    }

    public static String a(bgb bgb2, bfT bfT2, bfU bfU2) {
        Object object;
        String string = bgb2.diS();
        if (string == null || string.length() == 0) {
            return null;
        }
        string = (String)eIq.a(string, eIr.qwl, bfU2.diK());
        Matcher matcher = hZb.matcher(string);
        while (matcher.find()) {
            object = aum_0.cWf().a(7, (long)Bw.m(matcher.group(1)), new Object[0]);
            string = matcher.replaceFirst((String)object);
            matcher = hZb.matcher(string);
        }
        matcher = hZc.matcher(string);
        while (matcher.find()) {
            object = aum_0.cWf().a(12, (long)Bw.m(matcher.group(1)), new Object[0]);
            string = matcher.replaceFirst((String)object);
            matcher = hZc.matcher(string);
        }
        matcher = hZa.matcher(string);
        while (matcher.find()) {
            object = bfT2.lB(matcher.group().substring(1, matcher.group().length() - 1));
            string = matcher.replaceFirst(((Long)object).toString());
            matcher = hZa.matcher(string);
        }
        return string;
    }

    @Override
    protected boolean dbw() {
        return false;
    }

    @Override
    protected boolean dbx() {
        return false;
    }

    @Override
    protected boolean dby() {
        return false;
    }
}

