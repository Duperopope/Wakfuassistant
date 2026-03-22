/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from eA
 */
public final class ea_2
extends GeneratedMessageV3
implements ed_2 {
    private static final long ng = 0L;
    int an;
    public static final int nh = 1;
    int ni;
    public static final int nj = 2;
    boolean nk;
    private byte Y = (byte)-1;
    private static final ea_2 nl = new ea_2();
    @Deprecated
    public static final Parser<ea_2> nm = new eb_2();

    ea_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ea_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new ea_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ea_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        this.an |= 1;
                        this.ni = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 16: {
                        this.an |= 2;
                        this.nk = codedInputStream.readBool();
                        continue block12;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor vW() {
        return ej_2.mF;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ej_2.mG.ensureFieldAccessorsInitialized(ea_2.class, ec_2.class);
    }

    @Override
    public boolean vX() {
        return (this.an & 1) != 0;
    }

    @Override
    public int vY() {
        return this.ni;
    }

    @Override
    public boolean vZ() {
        return (this.an & 2) != 0;
    }

    @Override
    public boolean wa() {
        return this.nk;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.vX()) {
            this.Y = 0;
            return false;
        }
        if (!this.vZ()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.ni);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeBool(2, this.nk);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.ni);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeBoolSize((int)2, (boolean)this.nk);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ea_2)) {
            return super.equals(object);
        }
        ea_2 ea_22 = (ea_2)object;
        if (this.vX() != ea_22.vX()) {
            return false;
        }
        if (this.vX() && this.vY() != ea_22.vY()) {
            return false;
        }
        if (this.vZ() != ea_22.vZ()) {
            return false;
        }
        if (this.vZ() && this.wa() != ea_22.wa()) {
            return false;
        }
        return this.unknownFields.equals((Object)ea_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ea_2.vW().hashCode();
        if (this.vX()) {
            n = 37 * n + 1;
            n = 53 * n + this.vY();
        }
        if (this.vZ()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashBoolean((boolean)this.wa());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ea_2 al(ByteBuffer byteBuffer) {
        return (ea_2)nm.parseFrom(byteBuffer);
    }

    public static ea_2 al(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ea_2)nm.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ea_2 aW(ByteString byteString) {
        return (ea_2)nm.parseFrom(byteString);
    }

    public static ea_2 al(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ea_2)nm.parseFrom(byteString, extensionRegistryLite);
    }

    public static ea_2 al(byte[] byArray) {
        return (ea_2)nm.parseFrom(byArray);
    }

    public static ea_2 al(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ea_2)nm.parseFrom(byArray, extensionRegistryLite);
    }

    public static ea_2 bw(InputStream inputStream) {
        return (ea_2)GeneratedMessageV3.parseWithIOException(nm, (InputStream)inputStream);
    }

    public static ea_2 bw(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ea_2)GeneratedMessageV3.parseWithIOException(nm, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ea_2 bx(InputStream inputStream) {
        return (ea_2)GeneratedMessageV3.parseDelimitedWithIOException(nm, (InputStream)inputStream);
    }

    public static ea_2 bx(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ea_2)GeneratedMessageV3.parseDelimitedWithIOException(nm, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ea_2 al(CodedInputStream codedInputStream) {
        return (ea_2)GeneratedMessageV3.parseWithIOException(nm, (CodedInputStream)codedInputStream);
    }

    public static ea_2 cH(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ea_2)GeneratedMessageV3.parseWithIOException(nm, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ec_2 wb() {
        return ea_2.wc();
    }

    public static ec_2 wc() {
        return nl.wd();
    }

    public static ec_2 a(ea_2 ea_22) {
        return nl.wd().c(ea_22);
    }

    public ec_2 wd() {
        return this == nl ? new ec_2() : new ec_2().c(this);
    }

    protected ec_2 al(GeneratedMessageV3.BuilderParent builderParent) {
        ec_2 ec_22 = new ec_2(builderParent);
        return ec_22;
    }

    public static ea_2 we() {
        return nl;
    }

    public static Parser<ea_2> z() {
        return nm;
    }

    public Parser<ea_2> getParserForType() {
        return nm;
    }

    public ea_2 wf() {
        return nl;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.al(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.wd();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.wb();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.wd();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.wb();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.wf();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.wf();
    }

    static /* synthetic */ boolean gG() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ea_2 ea_22) {
        return ea_22.unknownFields;
    }
}

