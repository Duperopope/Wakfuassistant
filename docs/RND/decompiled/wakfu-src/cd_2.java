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
 * Renamed from cd
 */
public final class cd_2
extends GeneratedMessageV3
implements cg_1 {
    private static final long hJ = 0L;
    public static final int hK = 1;
    long fG;
    public static final int hL = 2;
    long fI;
    private byte Y = (byte)-1;
    private static final cd_2 hM = new cd_2();
    static final Parser<cd_2> hN = new ce_2();

    cd_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private cd_2() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new cd_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    cd_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    case 8: {
                        this.fG = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 16: {
                        this.fI = codedInputStream.readInt64();
                        continue block12;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl = true;
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

    public static final Descriptors.Descriptor lt() {
        return ae_1.fm;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fn.ensureFieldAccessorsInitialized(cd_2.class, cf_2.class);
    }

    @Override
    public long fD() {
        return this.fG;
    }

    @Override
    public long fE() {
        return this.fI;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.fG != 0L) {
            codedOutputStream.writeInt64(1, this.fG);
        }
        if (this.fI != 0L) {
            codedOutputStream.writeInt64(2, this.fI);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.fG != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.fG);
        }
        if (this.fI != 0L) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.fI);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof cd_2)) {
            return super.equals(object);
        }
        cd_2 cd_22 = (cd_2)object;
        if (this.fD() != cd_22.fD()) {
            return false;
        }
        if (this.fE() != cd_22.fE()) {
            return false;
        }
        return this.unknownFields.equals((Object)cd_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + cd_2.lt().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        n = 37 * n + 2;
        n = 53 * n + Internal.hashLong((long)this.fE());
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static cd_2 J(ByteBuffer byteBuffer) {
        return (cd_2)hN.parseFrom(byteBuffer);
    }

    public static cd_2 J(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (cd_2)hN.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static cd_2 ap(ByteString byteString) {
        return (cd_2)hN.parseFrom(byteString);
    }

    public static cd_2 J(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (cd_2)hN.parseFrom(byteString, extensionRegistryLite);
    }

    public static cd_2 J(byte[] byArray) {
        return (cd_2)hN.parseFrom(byArray);
    }

    public static cd_2 J(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (cd_2)hN.parseFrom(byArray, extensionRegistryLite);
    }

    public static cd_2 as(InputStream inputStream) {
        return (cd_2)GeneratedMessageV3.parseWithIOException(hN, (InputStream)inputStream);
    }

    public static cd_2 as(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cd_2)GeneratedMessageV3.parseWithIOException(hN, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cd_2 at(InputStream inputStream) {
        return (cd_2)GeneratedMessageV3.parseDelimitedWithIOException(hN, (InputStream)inputStream);
    }

    public static cd_2 at(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cd_2)GeneratedMessageV3.parseDelimitedWithIOException(hN, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cd_2 J(CodedInputStream codedInputStream) {
        return (cd_2)GeneratedMessageV3.parseWithIOException(hN, (CodedInputStream)codedInputStream);
    }

    public static cd_2 bb(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cd_2)GeneratedMessageV3.parseWithIOException(hN, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public cf_2 lu() {
        return cd_2.lv();
    }

    public static cf_2 lv() {
        return hM.lw();
    }

    public static cf_2 a(cd_2 cd_22) {
        return hM.lw().c(cd_22);
    }

    public cf_2 lw() {
        return this == hM ? new cf_2() : new cf_2().c(this);
    }

    protected cf_2 J(GeneratedMessageV3.BuilderParent builderParent) {
        cf_2 cf_22 = new cf_2(builderParent);
        return cf_22;
    }

    public static cd_2 lx() {
        return hM;
    }

    public static Parser<cd_2> z() {
        return hN;
    }

    public Parser<cd_2> getParserForType() {
        return hN;
    }

    public cd_2 ly() {
        return hM;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.J(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.lw();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.lu();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.lw();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.lu();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ly();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ly();
    }

    static /* synthetic */ boolean lz() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(cd_2 cd_22) {
        return cd_22.unknownFields;
    }
}

