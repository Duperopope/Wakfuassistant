/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public final class fiY
extends Enum<fiY> {
    public static final /* enum */ fiY suy = new fiY(false);
    public static final /* enum */ fiY suz = new fiY(false);
    public static final /* enum */ fiY suA = new fiY(false);
    public static final /* enum */ fiY suB = new fiY();
    public static final /* enum */ fiY suC = new fiY();
    public static final /* enum */ fiY suD = new fiY();
    public static final /* enum */ fiY suE = new fiY();
    public static final /* enum */ fiY suF = new fiY();
    public static final /* enum */ fiY suG = new fiY();
    public static final /* enum */ fiY suH = new fiY();
    public static final /* enum */ fiY suI = new fiY();
    public static final /* enum */ fiY suJ = new fiY();
    public static final /* enum */ fiY suK = new fiY();
    public static final /* enum */ fiY suL = new fiY();
    public static final /* enum */ fiY suM = new fiY();
    public static final /* enum */ fiY suN = new fiY();
    public static final /* enum */ fiY suO = new fiY();
    public static final /* enum */ fiY suP = new fiY();
    public static final /* enum */ fiY suQ = new fiY();
    public static final /* enum */ fiY suR = new fiY();
    public static final /* enum */ fiY suS = new fiY();
    public static final /* enum */ fiY suT = new fiY();
    public static final /* enum */ fiY suU = new fiY();
    public static final /* enum */ fiY suV = new fiY();
    public static final /* enum */ fiY suW = new fiY();
    private final boolean suX;
    private static final /* synthetic */ fiY[] suY;

    public static fiY[] values() {
        return (fiY[])suY.clone();
    }

    public static fiY valueOf(String string) {
        return Enum.valueOf(fiY.class, string);
    }

    private fiY() {
        this(true);
    }

    private fiY(boolean bl) {
        this.suX = bl;
    }

    public byte aJr() {
        return (byte)this.ordinal();
    }

    public boolean aGv() {
        return !this.aHz();
    }

    public boolean aHz() {
        return this.suX;
    }

    @NotNull
    public static fiY gL(byte by) {
        for (fiY fiY2 : fiY.values()) {
            if (fiY2.aJr() != by) continue;
            return fiY2;
        }
        return suB;
    }

    private static /* synthetic */ fiY[] gaw() {
        return new fiY[]{suy, suz, suA, suB, suC, suD, suE, suF, suG, suH, suI, suJ, suK, suL, suM, suN, suO, suP, suQ, suR, suS, suT, suU, suV, suW};
    }

    static {
        suY = fiY.gaw();
    }
}

