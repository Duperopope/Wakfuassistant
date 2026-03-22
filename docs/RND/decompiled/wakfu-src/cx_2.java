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
 * Renamed from cx
 */
public final class cx_2
extends GeneratedMessageV3
implements ca_2 {
    private static final long ik = 0L;
    public static final int il = 1;
    long fG;
    public static final int im = 2;
    volatile Object bs;
    private byte Y = (byte)-1;
    private static final cx_2 in = new cx_2();
    static final Parser<cx_2> io = new cy_2();

    cx_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private cx_2() {
        this.bs = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new cx_2();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    cx_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 18: {
                        String string = codedInputStream.readStringRequireUtf8();
                        this.bs = string;
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

    public static final Descriptors.Descriptor mT() {
        return ae_1.fi;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ae_1.fj.ensureFieldAccessorsInitialized(cx_2.class, cz_2.class);
    }

    @Override
    public long fD() {
        return this.fG;
    }

    @Override
    public String getName() {
        Object object = this.bs;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.bs = string;
        return string;
    }

    @Override
    public ByteString bW() {
        Object object = this.bs;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.bs = byteString;
            return byteString;
        }
        return (ByteString)object;
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
        if (!GeneratedMessageV3.isStringEmpty((Object)this.bs)) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.bs);
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
        if (!GeneratedMessageV3.isStringEmpty((Object)this.bs)) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.bs);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof cx_2)) {
            return super.equals(object);
        }
        cx_2 cx_22 = (cx_2)object;
        if (this.fD() != cx_22.fD()) {
            return false;
        }
        if (!this.getName().equals(cx_22.getName())) {
            return false;
        }
        return this.unknownFields.equals((Object)cx_22.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + cx_2.mT().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.fD());
        n = 37 * n + 2;
        n = 53 * n + this.getName().hashCode();
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static cx_2 O(ByteBuffer byteBuffer) {
        return (cx_2)io.parseFrom(byteBuffer);
    }

    public static cx_2 O(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (cx_2)io.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static cx_2 au(ByteString byteString) {
        return (cx_2)io.parseFrom(byteString);
    }

    public static cx_2 O(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (cx_2)io.parseFrom(byteString, extensionRegistryLite);
    }

    public static cx_2 O(byte[] byArray) {
        return (cx_2)io.parseFrom(byArray);
    }

    public static cx_2 O(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (cx_2)io.parseFrom(byArray, extensionRegistryLite);
    }

    public static cx_2 aC(InputStream inputStream) {
        return (cx_2)GeneratedMessageV3.parseWithIOException(io, (InputStream)inputStream);
    }

    public static cx_2 aC(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cx_2)GeneratedMessageV3.parseWithIOException(io, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cx_2 aD(InputStream inputStream) {
        return (cx_2)GeneratedMessageV3.parseDelimitedWithIOException(io, (InputStream)inputStream);
    }

    public static cx_2 aD(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cx_2)GeneratedMessageV3.parseDelimitedWithIOException(io, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cx_2 O(CodedInputStream codedInputStream) {
        return (cx_2)GeneratedMessageV3.parseWithIOException(io, (CodedInputStream)codedInputStream);
    }

    public static cx_2 bq(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cx_2)GeneratedMessageV3.parseWithIOException(io, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public cz_2 mU() {
        return cx_2.mV();
    }

    public static cz_2 mV() {
        return in.mW();
    }

    public static cz_2 a(cx_2 cx_22) {
        return in.mW().c(cx_22);
    }

    public cz_2 mW() {
        return this == in ? new cz_2() : new cz_2().c(this);
    }

    protected cz_2 O(GeneratedMessageV3.BuilderParent builderParent) {
        cz_2 cz_22 = new cz_2(builderParent);
        return cz_22;
    }

    public static cx_2 mX() {
        return in;
    }

    public static Parser<cx_2> z() {
        return io;
    }

    public Parser<cx_2> getParserForType() {
        return io;
    }

    public cx_2 mY() {
        return in;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.O(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.mW();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.mU();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.mW();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.mU();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.mY();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.mY();
    }

    static /* synthetic */ boolean mZ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(cx_2 cx_22) {
        return cx_22.unknownFields;
    }

    static /* synthetic */ void av(ByteString byteString) {
        cx_2.checkByteStringIsUtf8((ByteString)byteString);
    }
}

