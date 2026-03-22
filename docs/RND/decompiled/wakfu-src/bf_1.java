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
 * Renamed from bf
 */
class bf_1
extends AbstractParser<be_2> {
    bf_1() {
    }

    public be_2 ap(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new be_2(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ap(codedInputStream, extensionRegistryLite);
    }
}

