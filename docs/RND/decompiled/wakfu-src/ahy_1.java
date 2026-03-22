/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aHy
 */
public class ahy_1
extends azs_2<String, ahx_1> {
    public static final ahy_1 dQT = new ahy_1();

    private ahy_1() {
        super(20);
    }

    public long cdP() {
        long l = 0L;
        for (ahx_1 ahx_12 : this.dvy.values()) {
            l += ((ahe_1)ahx_12).yr(-1);
        }
        return l / 0x100000L;
    }
}

