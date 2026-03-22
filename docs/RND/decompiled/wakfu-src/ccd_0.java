/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cCd
 */
public class ccd_0
extends cCs {
    public static final byte mzc = 3;
    private final cBj mzd;
    private final short mze;

    public ccd_0(cBj cBj2, short s) {
        super(cCm.mzs);
        this.mzd = cBj2;
        this.mze = s;
    }

    public ccd_0(agn_1 agn_12, cBj cBj2, short s) {
        super(cCm.mzs, agn_12);
        this.mzd = cBj2;
        this.mze = s;
    }

    public cBj eJl() {
        return this.mzd;
    }

    public short bfd() {
        return this.mze;
    }

    @Override
    public byte eJm() {
        return 3;
    }

    @Override
    public int eJn() {
        return 3;
    }

    @Override
    public String eJo() {
        return "AudioMarker - " + this.eJw().getDescription();
    }

    @Override
    public String eJp() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id = ").append(this.mzd.aXB()).append(" quantit\u00e9 = ").append(this.mze);
        agn_1 agn_12 = this.erT();
        if (agn_12 != null) {
            stringBuilder.append(" Position = [").append(agn_12.bpl()).append(",").append(agn_12.bpm()).append("]");
        }
        return stringBuilder.toString();
    }
}

