/*
 * Decompiled with CFR 0.152.
 */
public final class bNN
extends Enum<bNN>
implements aoq_1 {
    public static final /* enum */ bNN kIL = new bNN(1);
    public static final /* enum */ bNN kIM = new bNN(2);
    public static final /* enum */ bNN kIN = new bNN(3);
    public static final /* enum */ bNN kIO = new bNN(4);
    private final byte kIP;
    private static final /* synthetic */ bNN[] kIQ;

    public static bNN[] values() {
        return (bNN[])kIQ.clone();
    }

    public static bNN valueOf(String string) {
        return Enum.valueOf(bNN.class, string);
    }

    private bNN(byte by) {
        this.kIP = by;
    }

    public byte egt() {
        return this.kIP;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.kIP);
    }

    @Override
    public String aXB() {
        return this.name();
    }

    @Override
    public String aXC() {
        return null;
    }

    public static bNN cE(byte by) {
        for (bNN bNN2 : bNN.values()) {
            if (bNN2.kIP != by) continue;
            return bNN2;
        }
        return null;
    }

    private static /* synthetic */ bNN[] egu() {
        return new bNN[]{kIL, kIM, kIN, kIO};
    }

    static {
        kIQ = bNN.egu();
    }
}

