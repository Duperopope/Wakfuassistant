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
 * Renamed from dM
 */
public final class dm_1
extends GeneratedMessageV3
implements dp_2 {
    private static final long lf = 0L;
    int an;
    public static final int lg = 1;
    int lh;
    public static final int li = 2;
    int lj;
    private byte Y = (byte)-1;
    private static final dm_1 lk = new dm_1();
    @Deprecated
    public static final Parser<dm_1> ll = new dn_1();

    dm_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private dm_1() {
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new dm_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    dm_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.lh = codedInputStream.readInt32();
                        continue block12;
                    }
                    case 16: {
                        this.an |= 2;
                        this.lj = codedInputStream.readInt32();
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

    public static final Descriptors.Descriptor sj() {
        return df_2.jP;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return df_2.jQ.ensureFieldAccessorsInitialized(dm_1.class, do_2.class);
    }

    @Override
    public boolean sk() {
        return (this.an & 1) != 0;
    }

    @Override
    public int sl() {
        return this.lh;
    }

    @Override
    public boolean sm() {
        return (this.an & 2) != 0;
    }

    @Override
    public int sn() {
        return this.lj;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.sk()) {
            this.Y = 0;
            return false;
        }
        if (!this.sm()) {
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.lh);
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(2, this.lj);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.lh);
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.lj);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof dm_1)) {
            return super.equals(object);
        }
        dm_1 dm_12 = (dm_1)object;
        if (this.sk() != dm_12.sk()) {
            return false;
        }
        if (this.sk() && this.sl() != dm_12.sl()) {
            return false;
        }
        if (this.sm() != dm_12.sm()) {
            return false;
        }
        if (this.sm() && this.sn() != dm_12.sn()) {
            return false;
        }
        return this.unknownFields.equals((Object)dm_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + dm_1.sj().hashCode();
        if (this.sk()) {
            n = 37 * n + 1;
            n = 53 * n + this.sl();
        }
        if (this.sm()) {
            n = 37 * n + 2;
            n = 53 * n + this.sn();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static dm_1 ac(ByteBuffer byteBuffer) {
        return (dm_1)ll.parseFrom(byteBuffer);
    }

    public static dm_1 ac(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (dm_1)ll.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static dm_1 aK(ByteString byteString) {
        return (dm_1)ll.parseFrom(byteString);
    }

    public static dm_1 ac(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (dm_1)ll.parseFrom(byteString, extensionRegistryLite);
    }

    public static dm_1 ac(byte[] byArray) {
        return (dm_1)ll.parseFrom(byArray);
    }

    public static dm_1 ac(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (dm_1)ll.parseFrom(byArray, extensionRegistryLite);
    }

    public static dm_1 be(InputStream inputStream) {
        return (dm_1)GeneratedMessageV3.parseWithIOException(ll, (InputStream)inputStream);
    }

    public static dm_1 be(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dm_1)GeneratedMessageV3.parseWithIOException(ll, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dm_1 bf(InputStream inputStream) {
        return (dm_1)GeneratedMessageV3.parseDelimitedWithIOException(ll, (InputStream)inputStream);
    }

    public static dm_1 bf(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dm_1)GeneratedMessageV3.parseDelimitedWithIOException(ll, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static dm_1 ac(CodedInputStream codedInputStream) {
        return (dm_1)GeneratedMessageV3.parseWithIOException(ll, (CodedInputStream)codedInputStream);
    }

    public static dm_1 cg(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (dm_1)GeneratedMessageV3.parseWithIOException(ll, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public do_2 so() {
        return dm_1.sp();
    }

    public static do_2 sp() {
        return lk.sq();
    }

    public static do_2 a(dm_1 dm_12) {
        return lk.sq().c(dm_12);
    }

    public do_2 sq() {
        return this == lk ? new do_2() : new do_2().c(this);
    }

    protected do_2 ac(GeneratedMessageV3.BuilderParent builderParent) {
        do_2 do_22 = new do_2(builderParent);
        return do_22;
    }

    public static dm_1 sr() {
        return lk;
    }

    public static Parser<dm_1> z() {
        return ll;
    }

    public Parser<dm_1> getParserForType() {
        return ll;
    }

    public dm_1 ss() {
        return lk;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ac(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.sq();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.so();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.sq();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.so();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ss();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ss();
    }

    static /* synthetic */ boolean dM() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(dm_1 dm_12) {
        return dm_12.unknownFields;
    }
}

