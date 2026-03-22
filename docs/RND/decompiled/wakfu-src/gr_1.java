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
 * Renamed from gR
 */
class gr_1
extends AbstractParser<gq_1> {
    gr_1() {
    }

    public gq_1 dZ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new gq_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.dZ(codedInputStream, extensionRegistryLite);
    }
}

