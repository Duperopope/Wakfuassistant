/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.xulor.property;

import java.util.ArrayList;

public class ValueCommand
implements aQm {
    @Override
    public void a(aUf aUf2, ArrayList<String> arrayList) {
        String string = arrayList.get(2);
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.append(" = ");
        fsf_1 fsf_12 = fyw_0.gqw().gqC().gAx().getProperty(string);
        if (fsf_12 != null) {
            Object object = fsf_12.getValue();
            if (object instanceof aef_2) {
                this.a((aef_2)object, stringBuilder);
            } else {
                this.a(object, stringBuilder);
            }
        }
        aqh_0.cBI().jG(stringBuilder.toString());
    }

    @Override
    public boolean cAW() {
        return false;
    }

    private void a(Object object, StringBuilder stringBuilder) {
        if (object instanceof Object[]) {
            for (Object object2 : (Object[])object) {
                if (object2 instanceof aef_2) {
                    this.a((aef_2)object2, stringBuilder);
                } else {
                    stringBuilder.append(object2);
                }
                stringBuilder.append(',').append('\n');
            }
        } else {
            stringBuilder.append(object);
        }
    }

    private void a(aef_2 aef_22, StringBuilder stringBuilder) {
        String[] stringArray;
        for (String string : stringArray = aef_22.bxk()) {
            stringBuilder.append('\n').append(string).append(" = ");
            this.a(aef_22.eu(string), stringBuilder);
        }
    }
}

