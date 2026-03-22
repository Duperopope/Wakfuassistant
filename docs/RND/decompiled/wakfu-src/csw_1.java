/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cSW
 */
class csw_1
extends bfo_2 {
    public csw_1(csv_2 csv_22) {
        super(null);
    }

    @Override
    public Object eu(String string) {
        if (string.equals("id")) {
            return -1;
        }
        if (string.equals("name")) {
            return aum_0.cWf().c("randomBreed", new Object[0]);
        }
        if (string.equals("maleFemalePortraitIllustration")) {
            try {
                String string2 = String.format(auc_0.cVq().bS("breedPortraitIllustrationPath"), "aleat");
                String[] stringArray = new String[]{string2, string2};
                return stringArray;
            }
            catch (fu_0 fu_02) {
                hSo.error((Object)"PropertyException during getFieldValue for MALE_FEMALE_PORTRAIT_ILLUSTRATION_FIELD", (Throwable)fu_02);
            }
        }
        return null;
    }
}

