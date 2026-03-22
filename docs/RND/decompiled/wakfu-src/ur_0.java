/*
 * Decompiled with CFR 0.152.
 */
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.regex.Pattern;

/*
 * Renamed from Ur
 */
public interface ur_0 {
    public static final long buM = Duration.of(1L, ChronoUnit.HOURS).toMillis();
    public static final Pattern buN = Pattern.compile("[^%]*%[yYMdhms]([^%]+%[yYMdhms])*[^%]*");
    public static final Pattern buO = Pattern.compile("%");
    public static final int buP = 4;
    public static final int buQ = 12;
    public static final int buR = 30;
    public static final int buS = 7;
    public static final int buT = 24;
    public static final int buU = 60;
    public static final int buV = 60;
    public static final int buW = 3600;
    public static final int buX = 86400;
    public static final int buY = 1000;
    public static final long buZ = 60000L;
    public static final long bva = 3600000L;
    public static final long bvb = 86400000L;
    public static final long bvc = 604800000L;
    public static final long bvd = 2592000000L;
    public static final long bve = 31104000000L;
    public static final long bvf = 1000000L;
    public static final int bvg = 360;
    public static final short bvh = 1970;
    public static final int bvi = 1;
    public static final int bvj = 2;
    public static final int bvk = 3;
    public static final int bvl = 4;
}

