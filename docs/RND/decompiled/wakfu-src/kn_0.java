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
 * Renamed from kn
 */
public final class kn_0
extends GeneratedMessageV3
implements kq_0 {
    private static final long Fi = 0L;
    int an;
    public static final int Fj = 1;
    volatile Object EY;
    public static final int Fk = 2;
    long Fa;
    public static final int Fl = 3;
    long Fm;
    private byte Y = (byte)-1;
    private static final kn_0 Fn = new kn_0();
    @Deprecated
    public static final Parser<kn_0> Fo = new ko_0();

    kn_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private kn_0() {
        this.EY = "";
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new kn_0();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    kn_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block13: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block13;
                    }
                    case 10: {
                        ByteString byteString = codedInputStream.readBytes();
                        this.an |= 1;
                        this.EY = byteString;
                        continue block13;
                    }
                    case 16: {
                        this.an |= 2;
                        this.Fa = codedInputStream.readInt64();
                        continue block13;
                    }
                    case 24: {
                        this.an |= 4;
                        this.Fm = codedInputStream.readInt64();
                        continue block13;
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

    public static final Descriptors.Descriptor aaU() {
        return kb.ED;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kb.EE.ensureFieldAccessorsInitialized(kn_0.class, kp_0.class);
    }

    @Override
    public boolean aau() {
        return (this.an & 1) != 0;
    }

    @Override
    public String aav() {
        Object object = this.EY;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        if (byteString.isValidUtf8()) {
            this.EY = string;
        }
        return string;
    }

    @Override
    public ByteString aaw() {
        Object object = this.EY;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.EY = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public boolean aax() {
        return (this.an & 2) != 0;
    }

    @Override
    public long aay() {
        return this.Fa;
    }

    @Override
    public boolean aaV() {
        return (this.an & 4) != 0;
    }

    @Override
    public long aaW() {
        return this.Fm;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.aau()) {
            this.Y = 0;
            return false;
        }
        if (!this.aax()) {
            this.Y = 0;
            return false;
        }
        if (!this.aaV()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)1, (Object)this.EY);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt64(2, this.Fa);
        }
        if ((this.an & 4) != 0) {
            codedOutputStream.writeInt64(3, this.Fm);
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
            n += GeneratedMessageV3.computeStringSize((int)1, (Object)this.EY);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.Fa);
        }
        if ((this.an & 4) != 0) {
            n += CodedOutputStream.computeInt64Size((int)3, (long)this.Fm);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof kn_0)) {
            return super.equals(object);
        }
        kn_0 kn_02 = (kn_0)object;
        if (this.aau() != kn_02.aau()) {
            return false;
        }
        if (this.aau() && !this.aav().equals(kn_02.aav())) {
            return false;
        }
        if (this.aax() != kn_02.aax()) {
            return false;
        }
        if (this.aax() && this.aay() != kn_02.aay()) {
            return false;
        }
        if (this.aaV() != kn_02.aaV()) {
            return false;
        }
        if (this.aaV() && this.aaW() != kn_02.aaW()) {
            return false;
        }
        return this.unknownFields.equals((Object)kn_02.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + kn_0.aaU().hashCode();
        if (this.aau()) {
            n = 37 * n + 1;
            n = 53 * n + this.aav().hashCode();
        }
        if (this.aax()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.aay());
        }
        if (this.aaV()) {
            n = 37 * n + 3;
            n = 53 * n + Internal.hashLong((long)this.aaW());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static kn_0 bB(ByteBuffer byteBuffer) {
        return (kn_0)Fo.parseFrom(byteBuffer);
    }

    public static kn_0 bx(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (kn_0)Fo.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static kn_0 cE(ByteString byteString) {
        return (kn_0)Fo.parseFrom(byteString);
    }

    public static kn_0 bx(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (kn_0)Fo.parseFrom(byteString, extensionRegistryLite);
    }

    public static kn_0 by(byte[] byArray) {
        return (kn_0)Fo.parseFrom(byArray);
    }

    public static kn_0 bx(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (kn_0)Fo.parseFrom(byArray, extensionRegistryLite);
    }

    public static kn_0 dU(InputStream inputStream) {
        return (kn_0)GeneratedMessageV3.parseWithIOException(Fo, (InputStream)inputStream);
    }

    public static kn_0 dU(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kn_0)GeneratedMessageV3.parseWithIOException(Fo, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kn_0 dV(InputStream inputStream) {
        return (kn_0)GeneratedMessageV3.parseDelimitedWithIOException(Fo, (InputStream)inputStream);
    }

    public static kn_0 dV(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kn_0)GeneratedMessageV3.parseDelimitedWithIOException(Fo, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static kn_0 bx(CodedInputStream codedInputStream) {
        return (kn_0)GeneratedMessageV3.parseWithIOException(Fo, (CodedInputStream)codedInputStream);
    }

    public static kn_0 gr(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (kn_0)GeneratedMessageV3.parseWithIOException(Fo, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public kp_0 aaX() {
        return kn_0.aaY();
    }

    public static kp_0 aaY() {
        return Fn.aaZ();
    }

    public static kp_0 b(kn_0 kn_02) {
        return Fn.aaZ().d(kn_02);
    }

    public kp_0 aaZ() {
        return this == Fn ? new kp_0() : new kp_0().d(this);
    }

    protected kp_0 bx(GeneratedMessageV3.BuilderParent builderParent) {
        kp_0 kp_02 = new kp_0(builderParent);
        return kp_02;
    }

    public static kn_0 aba() {
        return Fn;
    }

    public static Parser<kn_0> z() {
        return Fo;
    }

    public Parser<kn_0> getParserForType() {
        return Fo;
    }

    public kn_0 abb() {
        return Fn;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.bx(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.aaZ();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.aaX();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.aaZ();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.aaX();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.abb();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.abb();
    }

    static /* synthetic */ boolean ju() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet c(kn_0 kn_02) {
        return kn_02.unknownFields;
    }
}

