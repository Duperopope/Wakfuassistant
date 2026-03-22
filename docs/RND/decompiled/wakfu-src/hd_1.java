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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from hd
 */
public final class hd_1
extends GeneratedMessageV3
implements hg_1 {
    private static final long tM = 0L;
    public static final int tN = 1;
    List<gz_0> tO;
    private byte Y = (byte)-1;
    private static final hd_1 tP = new hd_1();
    @Deprecated
    public static final Parser<hd_1> tQ = new he_1();

    hd_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private hd_1() {
        this.tO = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new hd_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    hd_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.tO = new ArrayList<gz_0>();
                            bl |= true;
                        }
                        this.tO.add((gz_0)codedInputStream.readMessage(gz_0.tL, extensionRegistryLite));
                        continue block11;
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
            if (bl & true) {
                this.tO = Collections.unmodifiableList(this.tO);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor Ha() {
        return gy_0.tC;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return gy_0.tD.ensureFieldAccessorsInitialized(hd_1.class, hf_1.class);
    }

    @Override
    public List<gz_0> Hb() {
        return this.tO;
    }

    @Override
    public List<? extends hc_1> Hc() {
        return this.tO;
    }

    @Override
    public int Hd() {
        return this.tO.size();
    }

    @Override
    public gz_0 dp(int n) {
        return this.tO.get(n);
    }

    @Override
    public hc_1 dq(int n) {
        return this.tO.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.Hd(); ++i) {
            if (this.dp(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.tO.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.tO.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.tO.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.tO.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof hd_1)) {
            return super.equals(object);
        }
        hd_1 hd_12 = (hd_1)object;
        if (!this.Hb().equals(hd_12.Hb())) {
            return false;
        }
        return this.unknownFields.equals((Object)hd_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + hd_1.Ha().hashCode();
        if (this.Hd() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.Hb().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static hd_1 aP(ByteBuffer byteBuffer) {
        return (hd_1)tQ.parseFrom(byteBuffer);
    }

    public static hd_1 aL(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (hd_1)tQ.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static hd_1 bE(ByteString byteString) {
        return (hd_1)tQ.parseFrom(byteString);
    }

    public static hd_1 aL(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (hd_1)tQ.parseFrom(byteString, extensionRegistryLite);
    }

    public static hd_1 aM(byte[] byArray) {
        return (hd_1)tQ.parseFrom(byArray);
    }

    public static hd_1 aL(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (hd_1)tQ.parseFrom(byArray, extensionRegistryLite);
    }

    public static hd_1 cw(InputStream inputStream) {
        return (hd_1)GeneratedMessageV3.parseWithIOException(tQ, (InputStream)inputStream);
    }

    public static hd_1 cw(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hd_1)GeneratedMessageV3.parseWithIOException(tQ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hd_1 cx(InputStream inputStream) {
        return (hd_1)GeneratedMessageV3.parseDelimitedWithIOException(tQ, (InputStream)inputStream);
    }

    public static hd_1 cx(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hd_1)GeneratedMessageV3.parseDelimitedWithIOException(tQ, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static hd_1 aL(CodedInputStream codedInputStream) {
        return (hd_1)GeneratedMessageV3.parseWithIOException(tQ, (CodedInputStream)codedInputStream);
    }

    public static hd_1 eh(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (hd_1)GeneratedMessageV3.parseWithIOException(tQ, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public hf_1 He() {
        return hd_1.Hf();
    }

    public static hf_1 Hf() {
        return tP.Hg();
    }

    public static hf_1 a(hd_1 hd_12) {
        return tP.Hg().c(hd_12);
    }

    public hf_1 Hg() {
        return this == tP ? new hf_1() : new hf_1().c(this);
    }

    protected hf_1 aL(GeneratedMessageV3.BuilderParent builderParent) {
        hf_1 hf_12 = new hf_1(builderParent);
        return hf_12;
    }

    public static hd_1 Hh() {
        return tP;
    }

    public static Parser<hd_1> z() {
        return tQ;
    }

    public Parser<hd_1> getParserForType() {
        return tQ;
    }

    public hd_1 Hi() {
        return tP;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.aL(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Hg();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.He();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Hg();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.He();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.Hi();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.Hi();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(hd_1 hd_12) {
        return hd_12.unknownFields;
    }
}

