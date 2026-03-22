/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.jetbrains.annotations.NotNull
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

public final class TimeCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        String string = TimeCommand.cBa();
        aPh.czg().iZ(string);
    }

    @NotNull
    public static String cBa() {
        ux_0 ux_02 = ue_0.bjV().bjc();
        int n = ux_02.bjD();
        int n2 = ux_02.bjG();
        String string = String.valueOf(ux_02.bjI());
        boolean bl = ue_0.bjV().bjr();
        float f2 = ue_0.bjV().bjX();
        StringBuilder stringBuilder = new StringBuilder();
        Locale locale = aum_0.cWf().aUXX().aUJ();
        DateFormat dateFormat = DateFormat.getTimeInstance(3, locale);
        dateFormat.setTimeZone(uw_0.bvG);
        String string2 = dateFormat.format(ux_02.bjC());
        if (f2 < 10.0f) {
            stringBuilder.append(aum_0.cWf().c(bl ? "calendar.day.starting" : "calendar.night.starting", new Object[0]));
        } else if (f2 > 90.0f) {
            stringBuilder.append(aum_0.cWf().c(bl ? "calendar.day.ending" : "calendar.night.ending", new Object[0]));
        } else {
            stringBuilder.append(aum_0.cWf().c(bl ? "calendar.day.during" : "calendar.night.during", new Object[0]));
        }
        stringBuilder.append(", ");
        stringBuilder.append(aum_0.cWf().c("calendar.timeNotice", n, aum_0.cWf().c("calendar.month." + n2, new Object[0]), 977, n < 10 ? "0" + n : Integer.valueOf(n), n2 < 10 ? "0" + n2 : Integer.valueOf(n2), StringUtils.substring((String)string, (int)2, (int)string.length()), string2));
        return stringBuilder.toString();
    }

    @Override
    public boolean cAW() {
        return false;
    }
}

