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
 * Renamed from au
 */
class au_1
extends AbstractParser<at_1> {
    au_1() {
    }

    public at_1 R(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new at_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.R(codedInputStream, extensionRegistryLite);
    }
}

