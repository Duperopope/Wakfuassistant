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
 * Renamed from aS
 */
class as_1
extends AbstractParser<ar_1> {
    as_1() {
    }

    public ar_1 ag(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ar_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.ag(codedInputStream, extensionRegistryLite);
    }
}

