/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from arp
 */
public final class arp_1
extends Enum<arp_1> {
    public static final /* enum */ arp_1 cSS = new arp_1();
    public static final /* enum */ arp_1 cST = new arp_1();
    public static final /* enum */ arp_1 cSU = new arp_1();
    public static final /* enum */ arp_1 cSV = new arp_1();
    public static final /* enum */ arp_1 cSW = new arp_1();
    public static final /* enum */ arp_1 cSX = new arp_1();
    private static final /* synthetic */ arp_1[] cSY;

    public static arp_1[] values() {
        return (arp_1[])cSY.clone();
    }

    public static arp_1 valueOf(String string) {
        return Enum.valueOf(arp_1.class, string);
    }

    private static /* synthetic */ arp_1[] bHE() {
        return new arp_1[]{cSS, cST, cSU, cSV, cSW, cSX};
    }

    static {
        cSY = arp_1.bHE();
    }
}

