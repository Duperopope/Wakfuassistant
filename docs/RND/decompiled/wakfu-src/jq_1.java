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
 * Renamed from jq
 */
class jq_1
extends AbstractParser<jp_1> {
    jq_1() {
    }

    public jp_1 fI(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new jp_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fI(codedInputStream, extensionRegistryLite);
    }
}

