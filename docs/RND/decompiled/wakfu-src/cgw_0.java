/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cgW
 */
public class cgw_0
implements aaq_2<crq_0> {
    @Override
    public boolean a(crq_0 crq_02) {
        fan_0 fan_02 = crq_02.eAu();
        String string = aum_0.cWf().c(switch (fan_02) {
            case fan_0.rPW -> "notification.havenWorld.not.guild.member";
            case fan_0.rPX -> "notification.havenWorld.unknown.world";
            case fan_0.rPY -> "notification.havenWorld.already.opening.world";
            case fan_0.rPZ -> "notification.havenWorld.already.opened.world";
            case fan_0.rQa -> "notification.havenWorld.too.many.opened.world";
            case fan_0.rQc -> "notification.havenWorld.openingText";
            default -> "notification.havenWorld.unknown.opening.error";
        }, new Object[0]);
        cwy_2.nUc.y(string, 8);
        return false;
    }

    @Override
    public int bkq() {
        return 15914;
    }
}

