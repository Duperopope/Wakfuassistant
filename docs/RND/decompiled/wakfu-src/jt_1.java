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
 * Renamed from jt
 */
class jt_1
extends AbstractParser<js_1> {
    jt_1() {
    }

    public js_1 fL(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new js_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.fL(codedInputStream, extensionRegistryLite);
    }
}

