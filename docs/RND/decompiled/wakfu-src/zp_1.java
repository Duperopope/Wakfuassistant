/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractParser
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.ExtensionRegistryLite
 */
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

/*
 * Renamed from zP
 */
class zp_1
extends AbstractParser<zo_2> {
    zp_1() {
    }

    public zo_2 jK(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new zo_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.jK(codedInputStream, extensionRegistryLite);
    }
}

