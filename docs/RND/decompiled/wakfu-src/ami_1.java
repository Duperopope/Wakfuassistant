/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ami
 */
public abstract class ami_1
extends amh_1 {
    @Override
    public String bCT() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(').append("(\"([^\"\\\\]|\\\\(.|\n))*\")").append('|').append("([a-zA-Z]+)").append('|').append("([0-9]+)");
        for (amp_2 amp_22 : this.cHt) {
            String string = amp_22.bDd();
            if (string == null || string == null || string.isEmpty()) continue;
            stringBuilder.append('|').append(string);
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

