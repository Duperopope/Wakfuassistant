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
 *  com.google.protobuf.Internal$IntList
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from fs
 */
public final class fs_1
extends GeneratedMessageV3
implements fv_2 {
    private static final long qk = 0L;
    public static final int ql = 1;
    List<fb_2> qm;
    public static final int qn = 3;
    Internal.IntList qo;
    private int qp = -1;
    private byte Y = (byte)-1;
    private static final fs_1 qq = new fs_1();
    @Deprecated
    public static final Parser<fs_1> qr = new ft_2();

    fs_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private fs_1() {
        this.qm = Collections.emptyList();
        this.qo = fs_1.emptyIntList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new fs_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    fs_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    case 10: {
                        if ((n & 1) == 0) {
                            this.qm = new ArrayList<fb_2>();
                            n |= 1;
                        }
                        this.qm.add((fb_2)codedInputStream.readMessage(fb_2.qH, extensionRegistryLite));
                        continue block13;
                    }
                    case 24: {
                        if ((n & 2) == 0) {
                            this.qo = fs_1.newIntList();
                            n |= 2;
                        }
                        this.qo.addInt(codedInputStream.readInt32());
                        continue block13;
                    }
                    case 26: {
                        int n3 = codedInputStream.readRawVarint32();
                        int n4 = codedInputStream.pushLimit(n3);
                        if ((n & 2) == 0 && codedInputStream.getBytesUntilLimit() > 0) {
                            this.qo = fs_1.newIntList();
                            n |= 2;
                        }
                        while (codedInputStream.getBytesUntilLimit() > 0) {
                            this.qo.addInt(codedInputStream.readInt32());
                        }
                        codedInputStream.popLimit(n4);
                        continue block13;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
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
            if (n & true) {
                this.qm = Collections.unmodifiableList(this.qm);
            }
            if ((n & 2) != 0) {
                this.qo.makeImmutable();
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor zQ() {
        return fl_1.pi;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fl_1.pj.ensureFieldAccessorsInitialized(fs_1.class, fu_2.class);
    }

    @Override
    public List<fb_2> zR() {
        return this.qm;
    }

    @Override
    public List<? extends fe_2> zS() {
        return this.qm;
    }

    @Override
    public int zT() {
        return this.qm.size();
    }

    @Override
    public fb_2 cl(int n) {
        return this.qm.get(n);
    }

    @Override
    public fe_2 cm(int n) {
        return this.qm.get(n);
    }

    @Override
    public List<Integer> zU() {
        return this.qo;
    }

    @Override
    public int zV() {
        return this.qo.size();
    }

    @Override
    public int cn(int n) {
        return this.qo.getInt(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.zT(); ++i) {
            if (this.cl(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        this.getSerializedSize();
        for (n = 0; n < this.qm.size(); ++n) {
            codedOutputStream.writeMessage(1, (MessageLite)this.qm.get(n));
        }
        if (this.zU().size() > 0) {
            codedOutputStream.writeUInt32NoTag(26);
            codedOutputStream.writeUInt32NoTag(this.qp);
        }
        for (n = 0; n < this.qo.size(); ++n) {
            codedOutputStream.writeInt32NoTag(this.qo.getInt(n));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        for (n = 0; n < this.qm.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.qm.get(n)));
        }
        n = 0;
        for (int i = 0; i < this.qo.size(); ++i) {
            n += CodedOutputStream.computeInt32SizeNoTag((int)this.qo.getInt(i));
        }
        n2 += n;
        if (!this.zU().isEmpty()) {
            ++n2;
            n2 += CodedOutputStream.computeInt32SizeNoTag((int)n);
        }
        this.qp = n;
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fs_1)) {
            return super.equals(object);
        }
        fs_1 fs_12 = (fs_1)object;
        if (!this.zR().equals(fs_12.zR())) {
            return false;
        }
        if (!this.zU().equals(fs_12.zU())) {
            return false;
        }
        return this.unknownFields.equals((Object)fs_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + fs_1.zQ().hashCode();
        if (this.zT() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.zR().hashCode();
        }
        if (this.zV() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.zU().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static fs_1 av(ByteBuffer byteBuffer) {
        return (fs_1)qr.parseFrom(byteBuffer);
    }

    public static fs_1 at(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (fs_1)qr.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static fs_1 bl(ByteString byteString) {
        return (fs_1)qr.parseFrom(byteString);
    }

    public static fs_1 at(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (fs_1)qr.parseFrom(byteString, extensionRegistryLite);
    }

    public static fs_1 au(byte[] byArray) {
        return (fs_1)qr.parseFrom(byArray);
    }

    public static fs_1 at(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (fs_1)qr.parseFrom(byArray, extensionRegistryLite);
    }

    public static fs_1 bM(InputStream inputStream) {
        return (fs_1)GeneratedMessageV3.parseWithIOException(qr, (InputStream)inputStream);
    }

    public static fs_1 bM(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fs_1)GeneratedMessageV3.parseWithIOException(qr, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fs_1 bN(InputStream inputStream) {
        return (fs_1)GeneratedMessageV3.parseDelimitedWithIOException(qr, (InputStream)inputStream);
    }

    public static fs_1 bN(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fs_1)GeneratedMessageV3.parseDelimitedWithIOException(qr, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fs_1 at(CodedInputStream codedInputStream) {
        return (fs_1)GeneratedMessageV3.parseWithIOException(qr, (CodedInputStream)codedInputStream);
    }

    public static fs_1 df(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fs_1)GeneratedMessageV3.parseWithIOException(qr, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fu_2 zW() {
        return fs_1.zX();
    }

    public static fu_2 zX() {
        return qq.zY();
    }

    public static fu_2 a(fs_1 fs_12) {
        return qq.zY().c(fs_12);
    }

    public fu_2 zY() {
        return this == qq ? new fu_2() : new fu_2().c(this);
    }

    protected fu_2 at(GeneratedMessageV3.BuilderParent builderParent) {
        fu_2 fu_22 = new fu_2(builderParent);
        return fu_22;
    }

    public static fs_1 zZ() {
        return qq;
    }

    public static Parser<fs_1> z() {
        return qr;
    }

    public Parser<fs_1> getParserForType() {
        return qr;
    }

    public fs_1 Aa() {
        return qq;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.at(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.zY();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.zW();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.zY();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.zW();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Aa();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Aa();
    }

    static /* synthetic */ boolean fa() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ Internal.IntList Ab() {
        return fs_1.emptyIntList();
    }

    static /* synthetic */ boolean bg() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(fs_1 fs_12) {
        return fs_12.unknownFields;
    }

    static /* synthetic */ Internal.IntList Ac() {
        return fs_1.emptyIntList();
    }

    static /* synthetic */ Internal.IntList b(Internal.IntList intList) {
        return fs_1.mutableCopy((Internal.IntList)intList);
    }

    static /* synthetic */ Internal.IntList Ad() {
        return fs_1.emptyIntList();
    }
}

