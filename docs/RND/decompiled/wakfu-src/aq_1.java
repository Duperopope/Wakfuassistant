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
 * Renamed from aq
 */
class aq_1
extends AbstractParser<ap_2> {
    aq_1() {
    }

    public ap_2 O(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ap_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.O(codedInputStream, extensionRegistryLite);
    }
}

