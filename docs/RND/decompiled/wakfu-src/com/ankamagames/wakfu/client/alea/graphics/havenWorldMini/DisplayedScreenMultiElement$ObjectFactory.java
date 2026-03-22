/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.alea.graphics.havenWorldMini;

import com.ankamagames.wakfu.client.alea.graphics.havenWorldMini.DisplayedScreenMultiElement;

public final class DisplayedScreenMultiElement$ObjectFactory
extends ayr_2<DisplayedScreenMultiElement> {
    public DisplayedScreenMultiElement$ObjectFactory() {
        super(DisplayedScreenMultiElement.class);
    }

    public DisplayedScreenMultiElement cim() {
        return new DisplayedScreenMultiElement();
    }

    public DisplayedScreenMultiElement b(cav_2 cav_22, int n, int n2, int n3, int n4) {
        DisplayedScreenMultiElement displayedScreenMultiElement = (DisplayedScreenMultiElement)this.bSK();
        displayedScreenMultiElement.a(cav_22, n, n2, n3, n4);
        return displayedScreenMultiElement;
    }

    @Override
    public /* synthetic */ ayq_2 bru() {
        return this.cim();
    }
}

