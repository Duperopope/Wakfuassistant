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
 * Renamed from ij
 */
class ij_2
extends AbstractParser<ii_1> {
    ij_2() {
    }

    public ii_1 eS(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new ii_1(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.eS(codedInputStream, extensionRegistryLite);
    }
}

